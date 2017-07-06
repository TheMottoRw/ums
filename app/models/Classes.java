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
public class Classes extends Model {
    @Id
    public long id;

    public String classesName="";

    public boolean deleteStatus = false;
    public String deleteReason = "";
    public String doneBy = "";
    public Timestamp doneAt = new Timestamp(new Date().getTime());

    @ManyToOne(cascade = CascadeType.ALL)
    public Section section;

    public static Model.Finder<Long,Classes> find=new Model.Finder<Long,Classes>(Long.class,Classes.class);
    public static List<Classes> all(){
        return find.where().not(Expr.eq("delete_status","1")).findList();
    }
    public static Classes finderById(long id){
        return find.ref(id);
    }
    
}
