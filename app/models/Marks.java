package models;

import com.avaje.ebean.Expr;
import play.db.ebean.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.List;

/**
 * Created by BPRAdmin on 6/26/2017.
 */
@Entity
public class Marks extends Model {
    @Id
    public long id;
    public long obtainedMarks;
    @ManyToOne(cascade = CascadeType.ALL)
    public Semester semester;
    @ManyToOne(cascade = CascadeType.ALL)
    public Course course;

    public static Model.Finder<Long, Marks> find = new Model.Finder<Long, Marks>(Long.class, Marks.class);
    public static List<Marks> all(){
        return find.where().not(Expr.eq("delete_status", "1")).findList();
    }
    public static Marks finderById(long id){
        return find.ref(id);
    }
}
