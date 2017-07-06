package models;

import com.avaje.ebean.Expr;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * Created by BPRAdmin on 6/26/2017.
 */
@Entity
public class Lecture extends Model {
    @Id
    public long id;
    public String firstName="";
    public String lastName="";
    public long phoneNumber;
    public String location="";
    public String address="";
    public String qualification="";
    public String emailAddress="";

    public boolean deleteStatus = false;
    public String deleteReason = "";
    public String doneBy = "";
    public Timestamp doneAt = new Timestamp(new Date().getTime());

    public static Model.Finder<Long, Lecture> find = new Model.Finder<Long, Lecture>(Long.class, Lecture.class);
    public static List<Lecture> all(){
        return find.where().not(Expr.eq("delete_status", "1")).findList();
    }
    public static Lecture finderById(long id){
        return find.ref(id);
    }
    public static Lecture findByLecturename(String Lecturename) {
        return find.where().eq("firstName", Lecturename).findUnique();
    }
    public static Lecture findByPhone(String phone) {
        return find.where().eq("phoneNumber", phone).findUnique();
    }
    public static Lecture findByEmail(String email) {
        return find.where().eq("emailAddress", email).findUnique();
    }
    public static Lecture byLecturename(String Lecturename) {
        return find.where().eq("firstName", Lecturename).findUnique();
    }
    
}
