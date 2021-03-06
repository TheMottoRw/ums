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
public class ApplicationType extends Model {
    @Id
    public long id;
    public  String typeName = "";
    public  String description="";

    public boolean deleteStatus = false;
    public String deleteReason = "";
    public String doneBy = "";
    public Timestamp doneAt = new Timestamp(new Date().getTime());


    @ManyToOne(cascade = CascadeType.ALL)
    public Employee employee;

    public static Model.Finder<Long, ApplicationType> find = new Model.Finder<Long, ApplicationType>(Long.class, ApplicationType.class);
    public static List<ApplicationType> all(){
        return find.where().not(Expr.eq("delete_status", "1")).findList();
    }
    public static ApplicationType finderById(long id){
        return find.ref(id);
    }
    public static List<ApplicationType> findByName(String name){
        return find.where().like("typeName",name+"%").findList();
    }

}
