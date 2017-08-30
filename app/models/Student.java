package models;

import com.avaje.ebean.Expr;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * Created by BPRAdmin on 6/23/2017.
 */
@Entity
public class Student extends Model {
    @Id
    public long id;
    public String firstName = "";
    public String lastName = "";
    public String gender = "";
    public String nationality = "";
    public String dob = "";
    public long age;
    public String phone = "";
    public String email = "";
    public String password = "";
    public String role = "STUDENT";
    public String fatherName = "";
    public String motherName = "";
    public String province = "";
    public String districts = "";
    public String sector = "";
    public String cell = "";
    public String address = "";
    public String photo = "";

    public boolean active = true;

    public boolean deleteStatus = false;
    public String deleteReason = "";
    public String doneBy = "";
    public Timestamp doneAt = new Timestamp(new Date().getTime());

    public static Model.Finder<Long, Student> find = new Model.Finder<Long, Student>(Long.class, Student.class);
    public static List<Student> all(){
        return find.where().not(Expr.eq("delete_status", "1")).findList();
    }
    public static Student finderById(long id){
        return find.ref(id);
    }
    public static Student findByName(String firstname) {
        return find.where().eq("first_name", firstname).findUnique();
    }
    public static Student findByPhone(String phone) {
        return find.where().eq("phone", phone).findUnique();
    }
    public static Student findByEmail(String email) {
        return find.where().eq("email", email).findUnique();
    }
    public static List<Student> byName(String firstname) {
        return find.where().eq("first_name", firstname).findList();
    }
    public static List<Student> filterById(Long id) {
        return find.where().eq("id", id).findList();
    }
}
