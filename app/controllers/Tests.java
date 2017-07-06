package controllers;

import models.Test;
import models.User;
import play.*;
import play.data.Form;
import play.libs.Json;
import play.mvc.*;
import views.html.*;
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
        Form<Test> candForm=Form.form(Test.class).bindFromRequest();
        Test ntest=new Test();
        ntest.name=candForm.field("names").value();
        ntest.pwd=candForm.field("pwd").value();
        ntest.email=candForm.field("email").value();
        ntest.phone=candForm.field("phone").value();
        ntest.save();
        return ok("ok");
    }

    public static Result loadCandidates(){
        List<Test> tests = Test.all();
        return ok(Json.toJson(tests));
    }
    public static Result loadCandidatesById(Long id){
        List<Test> tests = Test.filterById(id);
        return ok(Json.toJson(tests));
    }
    public static Result updateCandidates(Long id){
        Form<Test> candForm=Form.form(Test.class).bindFromRequest();
        Test ntest=Test.finderById(id);
        ntest.name=candForm.field("names").value();
        ntest.pwd=candForm.field("pwd").value();
        ntest.email=candForm.field("email").value();
        ntest.phone=candForm.field("phone").value();
        ntest.update();
        return ok("ok");
    }

    public static Result searchCandidates(String vals){
List<Test> tests=Test.findByName(vals);
        return ok(Json.toJson(tests));
    }
    public static Result disableCandidates(Long id){
        Test tester= Test.finderById(id);
        tester.deleteStatus=true;
        tester.deleteReason="admin wishes";
        tester.update();
        System.out.println("-------------------- \n user disabled successfully");
        return ok("Candidates allready disabled");
    }
}
