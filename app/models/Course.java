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
 * Created by BPR
 * Admin on 6/26/2017.
 */
@Entity
public class Course extends Model {
    @Id
    public long id;

    public String subCourse="";
    public long courseCode;
    public long nberCredit;
    public long nberHours;
    public long maxCat;
    public long maxExam;
    public long totalMax;

    public boolean deleteStatus = false;
    public String deleteReason = "";
    public String doneBy = "";
    public Timestamp doneAt = new Timestamp(new Date().getTime());

    @ManyToOne(cascade = CascadeType.ALL)
    public Classes classes;

    public static Model.Finder<Long,Course> find=new Model.Finder<Long,Course>(Long.class,Course.class);
    public static List<Course> all(){
        return find.where().not(Expr.eq("delete_status","1")).findList();
    }
    public static Course finderById(long id){
        return find.ref(id);
    }
}
