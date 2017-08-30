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
public class Sponsor extends Model {
    @Id
    public long id;
    public String sponsorName="";
    public String sponsorAddress="";
    public String sponsorEmail="";
    public String sponsorPhone="";

    public boolean deleteStatus = false;
    public String deleteReason = "";
    public String doneBy = "";
    public Timestamp doneAt = new Timestamp(new Date().getTime());


    public static Model.Finder<Long,Sponsor> find=new Model.Finder<Long,Sponsor>(Long.class,Sponsor.class);
    public static List<Sponsor> all(){
        return find.where().not(Expr.eq("delete_status","1")).findList();
    }
    public static Sponsor finderById(long id){
        return find.ref(id);
    }
    public static List<Sponsor> findByName(String name){
            return find.where().like("sponsorName",name+"%").findList();
    }

}
