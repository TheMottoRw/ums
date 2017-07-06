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
public class Position extends Model {
    @Id
    public long id;
    public String positionName="";

    public boolean deleteStatus = false;
    public String deleteReason = "";
    public String doneBy = "";
    public Timestamp doneAt = new Timestamp(new Date().getTime());

    public static Model.Finder<Long, Position> find = new Model.Finder<Long, Position>(Long.class, Position.class);
    public static List<Position> all(){
        return find.where().not(Expr.eq("delete_status", "1")).findList();
    }
    public static Position finderById(long id){
        return find.ref(id);
    }
}
