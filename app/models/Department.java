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
 * Created by BPRAdmin on 6/25/2017.
 */
@Entity
public class Department extends Model {
    @Id
    public long id;
    public String departmentName="";

    public boolean deleteStatus = false;
    public String deleteReason = "";
    public String doneBy = "";
    public Timestamp doneAt = new Timestamp(new Date().getTime());

    @ManyToOne(cascade = CascadeType.ALL)
    public Faculty faculty;

    public static Model.Finder<Long,Department> find=new Model.Finder<Long,Department>(Long.class,Department.class);
    public static List<Department> all(){
        return find.where().not(Expr.eq("delete_status","1")).findList();
    }
    public static Department finderById(long id){
        return find.ref(id);
    }
}
