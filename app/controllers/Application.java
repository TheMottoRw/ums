package controllers;

import models.Student;
import models.User;
import play.*;
import play.data.Form;
import play.mvc.*;

import views.html.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class Application extends Controller {
    public static Result index() {
        List<User> usersList=User.find.where().eq("role","admin").findList();
        if(usersList.size()<=0){
            User user=new User();
            user.active=true;
            user.doneAt=new Timestamp(new Date().getTime());
            user.doneBy="default";
            user.firstName="roger";
            user.lastName="roger";
            user.role="admin";
            user.email="roger@gmail.com";
            user.password="admin";
            user.username="admin";
            user.phone="07883021245";
            user.save();
        }
        return ok(login.render());
    }
    public static Result signin(){
       Form<Student> studentVal =Form.form(Student.class).bindFromRequest();
        Student student=new User();
        student.firstName=studentVal.field("fname").value();
        student.lastName=student.field("lname").value();
        student.email=student.field("email").value();
        student.password=student.field("password").value();
        student.active=true;
        student.doneAt=new Timestamp(new Date().getTime());
        student.doneBy="default";
        student.save();
        return ok("ok");

    }

    public static Result login(){//applicants login
        Form<User> userForm=Form.form(User.class).bindFromRequest();
        User user=userForm.get();
        Boolean Auth=false;
        session().clear();
        for (User u:User.find.where().like("username",user.username).findList()){
            if (u.password.equals(user.password)){
                Auth=true;
            }
        }
        if (Auth){
            System.out.println("---------------------------------------\n Logged in !");
            session("userId",user.username);
            return ok("ok");
        }else {
            return ok("error");
        }
    }
    public static Result user(){
        if(session("userId")==null ||session("userId").equals("") ){
            return ok(views.html.login.render());
        }
        return ok(views.html.user.render());
    }
    public static Result logout(){
        session().clear();
        return ok(views.html.login.render());
    }
    public static Result student(){
        return ok(views.html.admission.render());
    }
    public static Result viewApplicants(){
        return ok(views.html.applicants.render());
    }
    public static Result setting(){return ok(views.html.setting.render());}

}

