package models;

import com.avaje.ebean.Expr;
import play.db.ebean.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by BPRAdmin on 6/26/2017.
 */
@Entity
public class JobAssignment extends Model {
    @Id
    public long id;
    public Timestamp startTime;
    public Timestamp endTime;
    @ManyToOne(cascade = CascadeType.ALL)
    public Employee employee;


    public static Model.Finder<Long, JobAssignment> find = new Model.Finder<Long, JobAssignment>(Long.class, JobAssignment.class);
    public static List<JobAssignment> all(){
        return find.where().not(Expr.eq("delete_status", "1")).findList();
    }
    public static JobAssignment finderById(long id){
        return find.ref(id);
    }
}
