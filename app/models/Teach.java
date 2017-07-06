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
public class Teach extends Model {
    @Id
    public long id;
    public Timestamp startTime;
    public Timestamp endTime;
    public boolean deleteStatus = false;
    public String deleteReason = "";
    public String doneBy = "";
    public Timestamp doneAt = new Timestamp(new Date().getTime());

    @ManyToOne(cascade = CascadeType.ALL)
    public Lecture lecture;
    @ManyToOne(cascade = CascadeType.ALL)
    public Course course;

    public static Model.Finder<Long, Teach> find = new Model.Finder<Long, Teach>(Long.class, Teach.class);
    public static List<Teach> all(){
        return find.where().not(Expr.eq("delete_status", "1")).findList();
    }
    public static Teach finderById(long id){
        return find.ref(id);
    }
    


}
