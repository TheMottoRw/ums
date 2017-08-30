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
public class AcademicYear extends Model {
    @Id
    public long id;
    public  String academicYear = "";
    public Timestamp startAt = new Timestamp(new Date().getTime());
    public Timestamp endAt = new Timestamp(new Date().getTime());

    public boolean deleteStatus = false;
    public String deleteReason = "";
    public String doneBy = "";
    public Timestamp doneAt = new Timestamp(new Date().getTime());



    public static Model.Finder<Long, AcademicYear> find = new Model.Finder<Long, AcademicYear>(Long.class, AcademicYear.class);
    public static List<AcademicYear> all(){
        return find.where().not(Expr.eq("delete_status", "1")).findList();
    }
    public static AcademicYear finderById(long id){
        return find.ref(id);
    }
    public static List<AcademicYear> findByYear(String year){
        return find.where().like("academicYear",year+"%").findList();
    }
}
