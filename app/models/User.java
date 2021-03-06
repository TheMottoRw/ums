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
public class User extends Model {
    @Id
    public long id;
    public String firstName = "";
    public String lastName = "";
    public String role = "";
    public String phone = "";
    public String email = "";
    public String photo = "";
    public String username = "";
    public String password ="";
    public boolean active = true;

    public boolean deleteStatus = false;
    public String deleteReason = "";
    public String doneBy = "";
    public Timestamp doneAt = new Timestamp(new Date().getTime());

    public static Model.Finder<Long, User> find = new Model.Finder<Long, User>(Long.class, User.class);
    public static List<User> all(){
        return find.where().not(Expr.eq("delete_status", "1")).findList();
    }
    public static User finderById(long id){
        return find.ref(id);
    }
    public static User findByUsername(String username) {
        return find.where().eq("username", username).findUnique();
    }
    public static User findByPhone(String phone) {
        return find.where().eq("phone", phone).findUnique();
    }
    public static User findByEmail(String email) {
        return find.where().eq("email", email).findUnique();
    }
    public static User byUsername(String username) {
        return find.where().eq("username", username).findUnique();
    }
}
