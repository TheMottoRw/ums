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
public class PaymentMode extends Model {
    @Id
    public long id;
    public String installement="";
    public long paymentPercentage;

    public boolean deleteStatus = false;
    public String deleteReason = "";
    public String doneBy = "";
    public Timestamp doneAt = new Timestamp(new Date().getTime());

    public static Model.Finder<Long, PaymentMode> find = new Model.Finder<Long, PaymentMode>(Long.class, PaymentMode.class);
    public static List<PaymentMode> all(){
        return find.where().not(Expr.eq("delete_status", "1")).findList();
    }
    public static PaymentMode finderById(long id){
        return find.ref(id);
    }
}
