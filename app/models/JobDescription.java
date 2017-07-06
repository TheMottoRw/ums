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
 * Created by BPRAdmin on 6/26/2017.
 */
@Entity
public class JobDescription extends Model {
    @Id
    public long id;
    public String descriptionTitle="";
    public String attachDescription="";
    
    @ManyToOne(cascade = CascadeType.ALL)
    public JobDescription JobDescription;

    public boolean deleteStatus = false;
    public String deleteReason = "";
    public String doneBy = "";
    public Timestamp doneAt = new Timestamp(new Date().getTime());

    public static Model.Finder<Long, JobDescription> find = new Model.Finder<Long, JobDescription>(Long.class, JobDescription.class);
    public static List<JobDescription> all(){
        return find.where().not(Expr.eq("delete_status", "1")).findList();
    }
    public static JobDescription finderById(long id){
        return find.ref(id);
    }
}
