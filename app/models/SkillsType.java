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
public class SkillsType extends Model {
    @Id
    public long id;
    public String skillsType="";


    public static Model.Finder<Long, SkillsType> find = new Model.Finder<Long, SkillsType>(Long.class, SkillsType.class);
    public static List<SkillsType> all(){
        return find.where().not(Expr.eq("delete_status", "1")).findList();
    }
    public static SkillsType finderById(long id){
        return find.ref(id);
    }
}
