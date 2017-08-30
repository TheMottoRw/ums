package controllers;

import models.*;
import play.data.Form;
import play.libs.Json;
import play.mvc.*;

import views.html.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class Application extends Controller {
    public static Timestamp toDate(String val){
        Timestamp tymstmp= (Timestamp) new Date(val);
        return tymstmp;
    }
    public static Result index() {
//        List<User> usersList=User.find.where().eq("role","admin").findList();
//        if(usersList.size()<=0){
//            User user=new User();
//            user.active=true;
//            user.doneAt=new Timestamp(new Date().getTime());
//            user.doneBy="default";
//            user.firstName="roger";
//            user.lastName="roger";
//            user.role="admin";
//            user.email="roger@gmail.com";
//            user.password="admin";
//            user.username="admin";
//            user.phone="07883021245";
//            user.save();
//        }
        return ok(login.render());
    }
    public static Result signin(){
       Form<Student> studentVal =Form.form(Student.class).bindFromRequest();
        Student student=new Student();
        student.firstName=studentVal.field("fname").value();
        student.lastName=studentVal.field("lname").value();
        student.email=studentVal.field("email").value();
        student.password=studentVal.field("password").value();
        student.active=true;
        student.doneAt=new Timestamp(new Date().getTime());
        student.doneBy="default";
        student.save();
        return ok("ok");

    }

    public static Result login() {//applicants login
        String logged="";
        Form<User> userForm = Form.form(User.class).bindFromRequest();
        User user = userForm.get();
        Boolean Auth = false;
        session().clear();
        for (Student u : Student.find.where().like("email", user.username).findList()) {
            if (u.password.equals(user.password)) {
                Auth = true;
                System.out.println("---------------------------------------\n Student Logged in !");
                session("studId",user.username);
                logged="okstudent";
            }
        }
        //check if is standard user logging in
            for (User u : User.find.where().like("username", user.username).findList()) {
                if (u.password.equals(user.password)) {
                    Auth = true;
                    System.out.println("---------------------------------------\n Admin Logged in !");
                    session("uId", user.username);
                    logged = "okadmin";
                }
            }

                //check if is employee logging in
                for (Employee u : Employee.find.where().like("email", user.username).findList()) {
                    if (u.password.equals(user.password)) {
                        Auth = true;
                        System.out.println("---------------------------------------\n Employee Logged in !");
                        session("empId", user.username);
                        session("uId", user.username);
                        logged="okemployee";
                    }
                }

                if(Auth==false){
                    return ok("error");
        }
       return ok(logged);
        }

    public static boolean sessionCheck() {
        boolean auth = false;
        if (session("uId") == null || session("uId").equals("")) {
            if (session("studId") == null || session("studId").equals("")) {
                auth = false;
            }else{
                auth=true;
            }
        } else {
            auth = true;
        }
        return auth;
    }
    public static Result logout(){
        session().clear();
        return redirect("/");
    }
    public static Result student(){
        return sessionCheck()==false?redirect("/"):ok(views.html.admission.render());//auth==false?redirect("/"):ok(views.html.setting.render());
       // return ok(views.html.admission.render());
    }
    public static Result viewApplicants(){
        return ok(views.html.applicants.render());
    }
    public static Result setting(){
     /*   boolean auth=false;
        if(session("uId")==null ||session("uId").equals("")){
            redirect("/");
            auth=false;
        }else{
            auth=true;
        }
        */
        return sessionCheck()==false?redirect("/"):ok(views.html.setting.render());//auth==false?redirect("/"):ok(views.html.setting.render());
    }
    //User action controllers
    public static Result registerBranch(){
        Form<BranchTable> branchForm=Form.form(BranchTable.class).bindFromRequest();
        BranchTable branchTable =new BranchTable();
        branchTable.branchName=branchForm.field("branchName").value();
        branchTable.branchAddress=branchForm.field("branchAddress").value();
        branchTable.employee=Employee.finderById(Long.parseLong(branchForm.field("chancellor").value()));
        branchTable.save();
        return ok("ok");
    }
    public static Result loadBranch(){
        List<BranchTable> branchTable = BranchTable.all();
        return ok(Json.toJson(branchTable));
    }
    public static Result loadBranchById(long id){
        BranchTable branchTable = BranchTable.finderById(id);
        return ok(Json.toJson(branchTable));
    }

    public static Result searchBranch(String vals){
        List<BranchTable> branchTable = BranchTable.findByName(vals);
        return ok(Json.toJson(branchTable));
    }

    public static Result updateBranch(long id){
        Form<BranchTable> branchForm=Form.form(BranchTable.class).bindFromRequest();
        BranchTable branchTable = BranchTable.finderById(id);
        branchTable.branchName=branchForm.field("branchName").value();
        branchTable.branchAddress=branchForm.field("branchAddress").value();
        branchTable.employee=Employee.finderById(Long.parseLong(branchForm.field("chancellor").value()));
        branchTable.update();
                return ok("ok");
    }

    public static Result registerApplication(){
        Form<AcademicYear> acyearForm=Form.form(AcademicYear.class).bindFromRequest();
        AcademicYear acyear=new AcademicYear();
        acyear.academicYear=acyearForm.field("acyear").value();
        acyear.startAt= Timestamp.valueOf(acyearForm.field("start").value()+" 00:00:00");
        acyear.endAt= Timestamp.valueOf(acyearForm.field("end").value()+" 00:00:00");

        acyear.save();
        return ok("ok");
    }
    public static Result loadApplication(){
        List<AcademicYear> acyear=AcademicYear.all();
        return ok(Json.toJson(acyear));
    }
    public static Result loadApplicationById(long id){
        AcademicYear acyear=AcademicYear.finderById(id);
        return ok(Json.toJson(acyear));
    }

    public static Result searchApplication(String vals){
        List<AcademicYear> acyear=AcademicYear.findByYear(vals);
        return ok(Json.toJson(acyear));
    }

    public static Result updateApplication(long id){
        Form<AcademicYear> acyearForm=Form.form(AcademicYear.class).bindFromRequest();
        AcademicYear acyear=AcademicYear.finderById(id);
        acyear.academicYear=acyearForm.field("updacyear").value();
        acyear.startAt=Timestamp.valueOf(acyearForm.field("updstart").value()+" 00:00:00");
        acyear.endAt=Timestamp.valueOf(acyearForm.field("updend").value()+" 00:00:00");
       acyear.update();
        return ok("ok");
    }


    public static Result registerAppType(){
        Form<ApplicationType> apptypeForm=Form.form(ApplicationType.class).bindFromRequest();
        ApplicationType apptype=new ApplicationType();
        apptype.typeName=apptypeForm.field("apptypename").value();
        apptype.employee=Employee.finderById(Employee.findByEmail(session("empId")).id);
        apptype.save();
        return ok("ok");
    }
    public static Result loadAppType(){
        List<ApplicationType> apptype=ApplicationType.all();
        return ok(Json.toJson(apptype));
    }
    public static Result loadAppTypeById(long id){
        ApplicationType apptype=ApplicationType.finderById(id);
        return ok(Json.toJson(apptype));
    }

    public static Result searchAppType(String vals){
        List<ApplicationType> apptype=ApplicationType.findByName(vals);
        return ok(Json.toJson(apptype));
    }

    public static Result updateAppType(Long id){
        Form<ApplicationType> apptypeForm=Form.form(ApplicationType.class).bindFromRequest();
        ApplicationType apptype=ApplicationType.finderById(id);
        apptype.typeName=apptypeForm.field("updapptypename").value();
        apptype.update();
        return ok("ok");
    }





    public static Result registerFaculty(){
        Form<Faculty> facultyForm=Form.form(Faculty.class).bindFromRequest();
        Faculty faculty=new Faculty();
       faculty.facultyName=facultyForm.field("facultyname").value();
        faculty.branchTable = BranchTable.finderById(Long.parseLong(facultyForm.field("branchid").value()));
        faculty.save();
        return ok("ok");
    }
    public static Result loadFaculty(){
        List<Faculty> faculty=Faculty.all();
        return ok(Json.toJson(faculty));
    }
    public static Result loadFacultyById(long id){
        Faculty faculty=Faculty.finderById(id);
        return ok(Json.toJson(faculty));
    }
    public static Result loadFacultyByBranch(long id){
        List<Faculty> faculty=Faculty.findByBranch(id);
        return ok(Json.toJson(faculty));
    }

    public static Result searchFaculty(String vals){
        List<Faculty> faculty=Faculty.findByName(vals);
        return ok(Json.toJson(faculty));
    }

    public static Result updateFaculty(Long id){
        Form<Faculty> facultyForm=Form.form(Faculty.class).bindFromRequest();
        Faculty faculty=Faculty.finderById(id);
        faculty.facultyName=facultyForm.field("facultyname").value();
       faculty.branchTable = BranchTable.finderById(Long.parseLong(facultyForm.field("branchid").value()));
        faculty.update();
        return ok("ok");
    }
    public static Result registerDepartment(){
        Form<Department> departmentForm=Form.form(Department.class).bindFromRequest();
        Department department=new Department();
        department.departmentName=departmentForm.field("departmentname").value();
        department.faculty=Faculty.finderById(Long.parseLong(departmentForm.field("facultyid").value()));
        department.save();
        return ok("ok");
    }
    public static Result loadDepartment(){
        List<Department> department=Department.all();
        return ok(Json.toJson(department));
    }
    public static Result loadDepartmentById(long id){
        Department department=Department.finderById(id);
        return ok(Json.toJson(department));
    }
    public static Result loadDepartmentByFaculty(long id){
        List<Department> department=Department.findByFaculty(id);
        return ok(Json.toJson(department));
    }

    public static Result searchDepartment(String vals){
        List<Department> department=Department.findByName(vals);
        return ok(Json.toJson(department));
    }

    public static Result updateDepartment(long id){
        Form<Department> departmentForm=Form.form(Department.class).bindFromRequest();
        Department department=Department.finderById(id);
        department.departmentName=departmentForm.field("departmentname").value();
        department.faculty=Faculty.finderById(Long.parseLong(departmentForm.field("facultyid").value()));
        department.update();
        return ok("ok");
    }

    public static Result registerSection(){
        Form<Section> sectionForm=Form.form(Section.class).bindFromRequest();
        Section section=new Section();
        section.sectionName=sectionForm.field("sectionname").value();
        section.save();
        return ok("ok");
    }
    public static Result loadSection(){
        List<Section> section=Section.all();
        return ok(Json.toJson(section));
    }
    public static Result loadSectionById(long id){
        Section section=Section.finderById(id);
        return ok(Json.toJson(section));
    }

    public static Result searchSection(String vals){
        List<Section> section=Section.findByName(vals);
        return ok(Json.toJson(section));
    }

    public static Result updateSection(Long id){
        Form<Section> sectionForm=Form.form(Section.class).bindFromRequest();
        Section section=Section.finderById(id);
        section.sectionName=sectionForm.field("sectionname").value();
        section.update();
        return ok("ok");
    }

    public static Result registerClass(){
        Form<Classes> classForm=Form.form(Classes.class).bindFromRequest();
        Classes classes=new Classes();
        classes.classesName=classForm.field("classname").value();
        classes.section=Section.finderById(Long.parseLong(classForm.field("classsecid").value()));
        classes.department=Department.finderById(Long.parseLong(classForm.field("classdeptid").value()));
        classes.save();
        return ok("ok");
    }
    public static Result loadClasses(){
        List<Classes> classes=Classes.all();
        return ok(Json.toJson(classes));
    }
    public static Result loadClassesById(long id){
        Classes classes=Classes.finderById(id);
        return ok(Json.toJson(classes));
    }

    public static Result loadClassesBySection(long id){
        List<Classes> classes=Classes.findBySection(id);
        return ok(Json.toJson(classes));
    }
    public static Result searchClass(String vals){
        List<Classes> classes=Classes.findByName(vals);
        return ok(Json.toJson(classes));
    }

    public static Result updateClass(long id){
        Form<Classes> classesForm=Form.form(Classes.class).bindFromRequest();
        Classes classes=Classes.finderById(id);
        classes.classesName=classesForm.field("classname").value();
        classes.section=Section.finderById(Long.parseLong(classesForm.field("classsectionid").value()));
        classes.update();
        return ok("ok");
    }

    public static Result registerSponsor(){
        Form<Sponsor> sponsorForm=Form.form(Sponsor.class).bindFromRequest();
        Sponsor sponsor=new Sponsor();
        sponsor.sponsorName=sponsorForm.field("sponsorName").value();
        sponsor.sponsorPhone=sponsorForm.field("sponsorPhone").value();
        sponsor.sponsorEmail=sponsorForm.field("sponsorEmail").value();
        sponsor.sponsorAddress=sponsorForm.field("sponsorAddress").value();
        sponsor.save();
        return ok("ok");
    }
    public static Result loadSponsor(){
        List<Sponsor> sponsor=new Sponsor().all();
        return ok(Json.toJson(sponsor));
    }
    public static Result loadSponsorById(long id){
        Sponsor sponsor=Sponsor.finderById(id);
        return ok(Json.toJson(sponsor));
    }
    public static Result searchSponsor(String vals){
        List<Sponsor> sponsors=Sponsor.findByName(vals);
        return ok(Json.toJson(sponsors));
    }
    public static Result updateSponsor(long id){
        Form<Sponsor> sponsorForm=Form.form(Sponsor.class).bindFromRequest();
        Sponsor sponsor=Sponsor.finderById(id);
        sponsor.sponsorName=sponsorForm.field("sponsorName").value();
        sponsor.sponsorPhone=sponsorForm.field("sponsorPhone").value();
        sponsor.sponsorEmail=sponsorForm.field("sponsorEmail").value();
        sponsor.sponsorAddress=sponsorForm.field("sponsorAddress").value();
        sponsor.update();
        return ok("ok");
    }


    public static Result registerEmployee(){
        Form<Employee> employeeForm=Form.form(Employee.class).bindFromRequest();
        Employee employee=new Employee();
        employee.firstName=employeeForm.field("empfname").value();
        employee.lastName=employeeForm.field("emplname").value();
        employee.email=employeeForm.field("empemail").value();
        employee.password=employeeForm.field("password").value();
        employee.phoneNumber=Long.parseLong(employeeForm.field("empphone").value());
        employee.location=employeeForm.field("emplocation").value();
        employee.qualification=employeeForm.field("empqualification").value();
        employee.address=employeeForm.field("empaddress").value();
        employee.save();
        return ok("ok");
    }
    public static Result loadEmployee(){
        List<Employee> employee=new Employee().all();
        return ok(Json.toJson(employee));
    }
    public static Result loadEmployeeById(long id){
        Employee employee=Employee.finderById(id);
        return ok(Json.toJson(employee));
    }
    public static Result searchEmployee(String vals){
        List<Employee> employee=Employee.findByNames(vals);
        return ok(Json.toJson(employee));
    }
    public static Result updateEmployee(long id){
        Form<Employee> employeeForm=Form.form(Employee.class).bindFromRequest();
        Employee employee=Employee.finderById(id);
        employee.firstName=employeeForm.field("empfname").value();
        employee.lastName=employeeForm.field("emplname").value();
        employee.email=employeeForm.field("empemail").value();
        employee.phoneNumber=Long.parseLong(employeeForm.field("empphone").value());
        employee.location=employeeForm.field("emplocation").value();
        employee.qualification=employeeForm.field("empqualification").value();
        employee.address=employeeForm.field("empaddress").value();
        employee.update();
        return ok("ok");
    }
    //delete Controller
    public static Result delete(String cate,long id,String reason){
        switch (cate){
            case"branchTable":
                BranchTable branchTable = BranchTable.finderById(id);
                branchTable.deleteReason=reason;
                branchTable.deleteStatus=true;
                branchTable.doneBy=String.valueOf(Employee.findByEmail(session("empId")).id);
                branchTable.update();
                break;
            case"application":
                AcademicYear academicyear=AcademicYear.finderById(id);
                academicyear.deleteReason=reason;
                academicyear.deleteStatus=true;
                academicyear.doneBy=String.valueOf(Employee.findByEmail(session("empId")).id);
                academicyear.update();
                break;
            case"applicationtype":
                ApplicationType apptype=ApplicationType.finderById(id);
                apptype.deleteReason=reason;
                apptype.deleteStatus=true;
                apptype.doneBy=String.valueOf(Employee.findByEmail(session("empId")).id);
                apptype.update();
                break;
            case"faculty":
                Faculty faculty=Faculty.finderById(id);
                faculty.deleteReason=reason;
                faculty.deleteStatus=true;
                faculty.doneBy=String.valueOf(Employee.findByEmail(session("empId")).id);
                faculty.update();
                break;
            case"department":
                Department department=Department.finderById(id);
                department.deleteReason=reason;
                department.deleteStatus=true;
                department.doneBy=String.valueOf(Employee.findByEmail(session("empId")).id);
                department.update();
                break;
            case"section":
                Section section=Section.finderById(id);
                section.deleteReason=reason;
                section.deleteStatus=true;
                section.doneBy=String.valueOf(Employee.findByEmail(session("empId")).id);
                section.update();
                break;
            case"class":
                Classes classes=Classes.finderById(id);
                classes.deleteReason=reason;
                classes.deleteStatus=true;
                classes.doneBy=String.valueOf(Employee.findByEmail(session("empId")).id);
                classes.update();
                break;
            case"sponsor":
                Sponsor sponsor=Sponsor.finderById(id);
                sponsor.deleteReason=reason;
                sponsor.deleteStatus=true;
                sponsor.doneBy=String.valueOf(Employee.findByEmail(session("empId")).id);
                sponsor.update();
                break;
            case"employee":
                Employee employee=Employee.finderById(id);
                employee.deleteReason=reason;
                employee.deleteStatus=true;
                employee.doneBy=String.valueOf(Employee.findByEmail(session("empId")).id);
                employee.update();
                break;
            default:
                return ok("Unknown Category");
        }
        return ok("ok");
    }

//Applicants Phases
public static Result registerStudent(){
    Form<Student> studForm=Form.form(Student.class).bindFromRequest();
    Student student=new Student();
    student.firstName=studForm.field("studFname").value();
    student.lastName=studForm.field("studLname").value();
    student.email=studForm.field("studEmail").value();
    student.password=studForm.field("studPwd").value(); 
    student.save();
    return ok("ok");
}public static Result registerStudentApplication(){
        Form<Student> studForm=Form.form(Student.class).bindFromRequest();
        Student student=new Student();
        student.firstName=studForm.field("studFname").value();
        student.lastName=studForm.field("studname").value();
        student.email=studForm.field("studEmail").value();
        student.password=studForm.field("studPwd").value();
        student.firstName=studForm.field("studFname").value();
        student.lastName=studForm.field("studname").value();
        student.email=studForm.field("studEmail").value();
        student.password=studForm.field("studPwd").value();
        student.firstName=studForm.field("studFname").value();
        student.lastName=studForm.field("studname").value();
        student.email=studForm.field("studEmail").value();
        student.password=studForm.field("studPwd").value();
        student.update();
        return ok("ok");
    }

    public static Result loadStudent(){
        List<Student> students = Student.all();
        return ok(Json.toJson(students));
    }
    public static Result loadStudentById(long id){
        List<Student> Students = Student.filterById(id);
        return ok(Json.toJson(Students));
    }
    public static Result updateStudent(Long id){
        Form<Student> studForm=Form.form(Student.class).bindFromRequest();
        Student student=Student.finderById(id);
        student.email=studForm.field("email").value();
        student.phone=studForm.field("phone").value();
        student.update();
        return ok("ok");
    }


    public static Result searchStudent(String vals){
        List<Student> Students=Student.byName(vals);
        return ok(Json.toJson(Students));
    }
    public static Result disableStudent(long id){
        Student student= Student.finderById(id);
        student.deleteStatus=true;
        student.deleteReason="admin wishes";
        student.update();
        System.out.println("-------------------- \n Student disabled successfully");
        return ok("Student allready disabled");
    }
public static Result testDate(){
    Timestamp timestamp=Timestamp.valueOf("2017-06-23 00:00:00");
    String year=AcademicYear.finderById(1).endAt.toString();

   // return ok(Json.toJson(AcademicYear.all()));
    return ok(year);
}
    //Delete or disable some feature

}


