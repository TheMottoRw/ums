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
public class Faculty extends Model {
    @Id
    public long id;
    public String facultyName="";


    public boolean deleteStatus = false;
    public String deleteReason = "";
    public String doneBy = "";
    public Timestamp doneAt = new Timestamp(new Date().getTime());

    @ManyToOne(cascade = CascadeType.ALL)
    public Branch branch;


    public static Model.Finder<Long, Faculty> find = new Model.Finder<Long, Faculty>(Long.class, Faculty.class);
    public static List<Faculty> all(){
        return find.where().not(Expr.eq("delete_status", "1")).findList();
    }
    public static Faculty finderById(long id){
        return find.ref(id);
    }
}
