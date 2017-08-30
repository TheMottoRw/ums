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
public class TestTable extends Model {
    @Id
    public long id;
    public String name="";
    public String pwd="";
    public long phone;
    public String email="";


    public boolean deleteStatus = false;
    public String deleteReason = "";
    public String doneBy = "";
    public Timestamp doneAt = new Timestamp(new Date().getTime());

    public static Model.Finder<Long, TestTable> find = new Model.Finder<Long, TestTable>(Long.class, TestTable.class);
    public static List<TestTable> all(){
        return find.where().not(Expr.eq("delete_status", "1")).findList();
    }

    public static TestTable finderById(long id){
        return find.ref(id);
    }
    public static TestTable findByPhone(String phone) {
        return find.where().eq("phone", phone).findUnique();
    }
    public static TestTable findByEmail(String email) {
        return find.where().eq("email", email).findUnique();
    }
    public static List<TestTable> findByName(String name) {
        return find.where().like("name", "%"+name+"%").findList();
    }
    public static List<TestTable> filterById(Long id) {
        return find.where().eq("id", id).findList();
   }

}
