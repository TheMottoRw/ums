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
public class Payment extends Model {
    @Id
    public long id;
    public long bankslipNumber;
    public String bankSlip="";
    public long paidAmount;
    public String paymentStatus="";
    public String observation="";
    
    @ManyToOne(cascade = CascadeType.ALL)
    public Student student;
    
    public static Model.Finder<Long, Payment> find = new Model.Finder<Long, Payment>(Long.class, Payment.class);
    public static List<Payment> all(){
        return find.where().not(Expr.eq("delete_status", "1")).findList();
    }
    public static Payment finderById(long id){
        return find.ref(id);
    }
}
