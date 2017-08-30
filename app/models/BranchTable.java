package models;

import com.avaje.ebean.Expr;
import play.db.ebean.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * Created by BPRAdmin on 6/23/2017.
 */
@Entity
public class BranchTable extends Model{
    @Id
    public long id;
    public  String branchName="";
    public  String branchAddress="";

    public boolean deleteStatus = false;
    public String deleteReason = "";
    public String doneBy = "";
    public Timestamp doneAt = new Timestamp(new Date().getTime());


    @ManyToOne(cascade = CascadeType.ALL)
    public Employee employee;

    public static Model.Finder<Long, BranchTable> find = new Model.Finder<Long, BranchTable>(Long.class, BranchTable.class);
    public static List<BranchTable> all(){
        return find.where().not(Expr.eq("delete_status", "1")).findList();
    }
    public static BranchTable finderById(long id){
        return find.ref(id);
    }
    public static List<BranchTable> findByName(String name){
        return find.where().like("branchName",name+"%").findList();
    }
}
