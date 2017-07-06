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
public class Test extends Model {
    @Id
    public long id;
    public String name="";
    public String pwd="";
    public String phone="";
    public String email="";


    public boolean deleteStatus = false;
    public String deleteReason = "";
    public String doneBy = "";
    public Timestamp doneAt = new Timestamp(new Date().getTime());

    public static Model.Finder<Long, Test> find = new Model.Finder<Long, Test>(Long.class, Test.class);
    public static List<Test> all(){
        return find.where().not(Expr.eq("delete_status", "1")).findList();
    }

    public static Test finderById(long id){
        return find.ref(id);
    }
    public static Test findByPhone(String phone) {
        return find.where().eq("phone", phone).findUnique();
    }
    public static Test findByEmail(String email) {
        return find.where().eq("email", email).findUnique();
    }
    public static List<Test> findByName(String name) {
        return find.where().like("name", "%"+name+"%").findList();
    }
    public static List<Test> filterById(Long id) {
        return find.where().eq("id", id).findList();
   }
}
