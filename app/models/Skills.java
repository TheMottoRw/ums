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
public class Skills extends Model {
    @Id
    public long id;
    public String skills="";
    public String skillsDescription="";


    public static Model.Finder<Long, Skills> find = new Model.Finder<Long, Skills>(Long.class, Skills.class);
    public static List<Skills> all(){
        return find.where().not(Expr.eq("delete_status", "1")).findList();
    }
    public static Skills finderById(long id){
        return find.ref(id);
    }
}
