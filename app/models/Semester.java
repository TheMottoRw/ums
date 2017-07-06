package models;

import com.avaje.ebean.Expr;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

/**
 * Created by BPRAdmin on 6/26/2017.
 */
@Entity
public class Semester extends Model {
    @Id
    public long id;
    public String semesterName="";
    public long academicYear;

    public static Model.Finder<Long, Semester> find = new Model.Finder<Long, Semester>(Long.class, Semester.class);
    public static List<Semester> all(){
        return find.where().not(Expr.eq("delete_status", "1")).findList();
    }
    public static Semester finderById(long id){
        return find.ref(id);
    }
}
