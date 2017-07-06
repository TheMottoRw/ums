package models;

import com.avaje.ebean.Expr;
import play.db.ebean.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.List;

/**
 * Created by BPRAdmin on 6/26/2017.
 */
@Entity
public class EmployeeSkills extends Model {
    @Id
    public long id;

    @ManyToOne(cascade = CascadeType.ALL)
    public Skills skills;
    
    @ManyToOne(cascade = CascadeType.ALL)
    public Employee employee;


    public static Model.Finder<Long, EmployeeSkills> find = new Model.Finder<Long, EmployeeSkills>(Long.class, EmployeeSkills.class);
    public static List<EmployeeSkills> all(){
        return find.where().not(Expr.eq("delete_status", "1")).findList();
    }
    public static EmployeeSkills finderById(long id){
        return find.ref(id);
    }
}
