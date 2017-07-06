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
public class StudentSponsor extends Model {
    @Id
    public long id;
    public String attachFile="";

    public boolean deleteStatus = false;
    public String deleteReason = "";
    public String doneBy = "";
    public Timestamp doneAt = new Timestamp(new Date().getTime());


    @ManyToOne(cascade = CascadeType.ALL)
    public Student student;

    @ManyToOne(cascade = CascadeType.ALL)
    public Sponsor sponsor;


    public static Model.Finder<Long,StudentSponsor> find=new Model.Finder<Long,StudentSponsor>(Long.class,StudentSponsor.class);
    public static List<StudentSponsor> all(){
        return find.where().not(Expr.eq("delete_status","1")).findList();
    }
    public static StudentSponsor finderById(long id){
        return find.ref(id);
    }
}
