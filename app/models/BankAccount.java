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
public class BankAccount extends Model {
    @Id
    public long id;
    public String bankName="";
    public long accountNumber;

    public boolean deleteStatus = false;
    public String deleteReason = "";
    public String doneBy = "";
    public Timestamp doneAt = new Timestamp(new Date().getTime());

    public static Model.Finder<Long, BankAccount> find = new Model.Finder<Long, BankAccount>(Long.class, BankAccount.class);
    public static List<BankAccount> all(){
        return find.where().not(Expr.eq("delete_status", "1")).findList();
    }
    public static BankAccount finderById(long id){
        return find.ref(id);
    }
    public static BankAccount findByAccountNumber(String accountNumber) {
        return find.where().eq("accountNumber", accountNumber).findUnique();
    }
}
