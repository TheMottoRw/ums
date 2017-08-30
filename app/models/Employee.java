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
public class Employee extends Model {
    @Id
    public long id;
    public String firstName = "";
    public String lastName = "";
    public long phoneNumber;
    public String email = "";
    public String password="";
    public String location = "";
    public String address = "";
    public String qualification="";
    public boolean active = true;

    public boolean deleteStatus = false;
    public String deleteReason = "";
    public String doneBy = "";
    public Timestamp doneAt = new Timestamp(new Date().getTime());

    public static Model.Finder<Long, Employee> find = new Model.Finder<Long, Employee>(Long.class, Employee.class);
    public static List<Employee> all(){
        return find.where().not(Expr.eq("delete_status", "1")).findList();
    }
    public static Employee finderById(long id){
        return find.ref(id);
    }
    public static Employee findByfirstName(String firstName) {
        return find.where().eq("firstName", firstName).findUnique();
    }
    public static Employee findByPhone(String phone) {
        return find.where().eq("phone", phone).findUnique();
    }
    public static Employee findByEmail(String email) {
        return find.where().eq("email", email).findUnique();
    }
    public static Employee byfirstName(String firstName) {
        return find.where().eq("firstName", firstName).findUnique();
    }
    public static List<Employee> findByNames(String name){
         return find.where().like("firstName",name+"%").findList();
    }
    public static List<Employee> loadName(long id){
        return find.where().eq("id",id).findList();
    }
}
