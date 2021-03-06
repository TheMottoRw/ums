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
 * Created by BPRAdmin on 6/25/2017.
 */
@Entity
public class Section extends Model {
    @Id
    public long id;
    public String sectionName="";

    public boolean deleteStatus = false;
    public String deleteReason = "";
    public String doneBy = "";
    public Timestamp doneAt = new Timestamp(new Date().getTime());

    public static Model.Finder<Long,Section> find=new Model.Finder<Long,Section>(Long.class,Section.class);
    public static List<Section> all(){
        return find.where().not(Expr.eq("delete_status","1")).findList();
    }
    public static Section finderById(long id){
        return find.ref(id);
    }
    public static List<Section> findByName(String name){
        return find.where().like("sectionName",name+"%").findList();
    }
}
