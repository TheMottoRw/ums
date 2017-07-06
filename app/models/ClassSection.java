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
 * Created by BPRAdmin on 6/26/2017.
 */
@Entity
public class ClassSection extends Model {
    @Id
    public long id;
    public boolean deleteStatus = false;
    public String deleteReason = "";
    public String doneBy = "";
    public Timestamp doneAt = new Timestamp(new Date().getTime());

    @ManyToOne(cascade = CascadeType.ALL)
    public Classes classes;

    @ManyToOne(cascade = CascadeType.ALL)
    public Section section;

    public static Model.Finder<Long,ClassSection> find=new Model.Finder<Long,ClassSection>(Long.class,ClassSection.class);
    public static List<ClassSection> all(){
        return find.where().not(Expr.eq("delete_status","1")).findList();
    }
    public static ClassSection finderById(long id){
        return find.ref(id);
    }

}
