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
public class EducationBackground extends Model {
    @Id
    public long id;
    public String schoolName="";
    public String schoolAddress="";
    public String option="";
    public double marks= 0;
    public String grade= "";
    public String diplomaNo= "";
    public String endYear= "";
    public String filesUpload = "";

    public boolean deleteStatus = false;
    public String deleteReason = "";
    public String doneBy = "";
    public Timestamp doneAt = new Timestamp(new Date().getTime());

    @ManyToOne(cascade = CascadeType.ALL)
    public Student student;

    public static Model.Finder<Long,EducationBackground> find=new Model.Finder<Long,EducationBackground>(Long.class,EducationBackground.class);
    public static List<EducationBackground> all(){
        return find.where().not(Expr.eq("delete_status","1")).findList();
    }
    public static EducationBackground finderById(long id){
        return find.ref(id);
    }
}
