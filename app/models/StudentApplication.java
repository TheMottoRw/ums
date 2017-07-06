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
 * Created by BPRAdmin on 6/27/2017.
 */
@Entity
public class StudentApplication extends Model {
    @Id
    public long id;
    public String registrarStatus = "";
    public String registrarComments ="";
    public String hOdStatus = "";
    public String hoDComments ="";
    public String fnStatus = "";
    public String fnComments ="";

    public boolean deleteStatus = false;
    public String deleteReason = "";
    public String doneBy = "";
    public Timestamp doneAt = new Timestamp(new Date().getTime());

    @ManyToOne(cascade = CascadeType.ALL)
    public Student student;

    @ManyToOne(cascade = CascadeType.ALL)
    public Classes classes;

    @ManyToOne(cascade = CascadeType.ALL)
    public AcademicYear academicYear;

    @ManyToOne(cascade = CascadeType.ALL)
    public ApplicationType applicationType;

    public static Model.Finder<Long,StudentApplication> find=new Model.Finder<Long,StudentApplication>(Long.class,StudentApplication.class);
    public static List<StudentApplication> all(){
        return find.where().not(Expr.eq("delete_status","1")).findList();
    }
    public static StudentApplication finderById(long id){
        return find.ref(id);
    }
}
