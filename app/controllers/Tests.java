package controllers;

import models.TestTable;
import play.data.Form;
import play.libs.Json;
import play.mvc.*;

import java.util.List;

/**
 * Created by BPRAdmin on 7/3/2017.
 */
public class Tests extends Controller {

    //TESTING PHASE
    public static Result test(){
        return ok(views.html.test.render());
    }
    public static Result registCandidates(){
        Form<TestTable> candForm=Form.form(TestTable.class).bindFromRequest();
        TestTable ntest=new TestTable();
        ntest.name=candForm.field("names").value();
        ntest.pwd=candForm.field("pwd").value();
        ntest.email=candForm.field("email").value();
        ntest.phone=Long.parseLong(candForm.field("phone").value());
        ntest.save();
        return ok("ok");
    }

    public static Result loadCandidates(){
        List<TestTable> testTables = TestTable.all();
        return ok(Json.toJson(testTables));
    }
    public static Result loadCandidatesById(Long id){
        List<TestTable> testTables = TestTable.filterById(id);
        return ok(Json.toJson(testTables));
    }
    public static Result updateCandidates(Long id){
        Form<TestTable> candForm=Form.form(TestTable.class).bindFromRequest();
        TestTable ntest= TestTable.finderById(id);
        ntest.name=candForm.field("names").value();
        ntest.pwd=candForm.field("pwd").value();
        ntest.email=candForm.field("email").value();
        ntest.phone=Long.parseLong(candForm.field("phone").value());
        ntest.update();
        return ok("ok");
    }

    public static Result searchCandidates(String vals){
List<TestTable> testTables = TestTable.findByName(vals);
        return ok(Json.toJson(testTables));
    }
    public static Result disableCandidates(Long id){
        TestTable tester= TestTable.finderById(id);
        tester.deleteStatus=true;
        tester.deleteReason="admin wishes";
        tester.update();
        System.out.println("-------------------- \n user disabled successfully");
        return ok("Candidates allready disabled");
    }
}
