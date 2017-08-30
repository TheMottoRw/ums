app.controller("MainController", function ($scope,$location,$http) {
    $scope.login = function () {
        $scope.dataLoading = true;
        $http.post('/login/',{username:$scope.username,password:$scope.password} ).success(function (data, status, headers, config){
            if(data =="okstudent") {
                window.location='/admission/';
            }else{
                if(data =="okadmin"){
                    window.location='/setting/';
                }else {
                    if(data=="okemployee"){
                        alert("Employee Logged in");
                        window.location='/setting/';
                    }else{
                    $scope.error = 'Wrong username or password';
                    $scope.dataLoading = false;
                }
                }
            }


        });
    };
//Controllers for Main App
    $scope.registerBranch=function(){
        $http.post("/registerBranch/",{chancellor:$scope.chancellornames,branchName:$scope.branchName,branchAddress:$scope.branchAddress}).success(function(data,status,headers,config){
            if(data=='ok'){
                $scope.regbranchsuccessmsg="Branch registered success";
                $scope.chancellornames=null;$scope.branchName=null;$scope.branchAddress=null;
            }
        });


    }

    $scope.loadBranch=function(){
        $http.get("/loadBranch/").success(function(data,status,headers,config){
                $scope.branches=data;
        });
    }
    $scope.loadBranchUpdater= function (id) {
        $http.get('/loadBranchById/'+id+'/').success(function(data,status,headers,config){
            $scope.id=id;
            $scope.updbranch=data;
            $scope.viewBranch=data;
        });
    }
    $scope.searchBranch=function(){
        if($scope.branchkeyword!="") {
            $http.get("/searchBranch/" + $scope.branchkeyword + "/").success(function (data, status, headers, config) {
                $scope.branches = data;
            });
        }else{
            $scope.loadBranch();
        }
    }
    $scope.updateBranch=function(){
        $http.post("/updateBranch/"+$scope.updbranch.id+"/",{chancellor:$scope.updbranch.chancellornames,branchName:$scope.updbranch.branchName,branchAddress:$scope.updbranch.branchAddress}).success(function(data,status,headers,config){
            if(data=='ok'){
                $scope.updbranchsuccessmsg="Branch updated success";
                $scope.loadBranch();
               // $scope.updbranch={};
            }
        });
    }

    $scope.registerFaculty=function(){
        $http.post("/registerFaculty/",{facultyname:$scope.facultyname,branchid:$scope.facbranchid}).success(function(data,status,headers,config){
            if(data=='ok'){
                $scope.regfacultysuccessmsg="Faculty registered success";
                $scope.facultyname=null;$scope.facbranchid=null;
            }
        });

    }

    $scope.loadFaculty=function(){
            $http.get("/loadFaculty/").success(function (data, status, headers, config) {
                $scope.faculties = data;
            });
    }
    $scope.loadFacultyUpdater= function (id) {
        $http.get('/loadFacultyById/'+id+'/').success(function(data,status,headers,config){
            $scope.id=id;
            $scope.updfaculty=data;
        });
    }
    $scope.loadFacultyByBranch=function(){
        $http.get("/loadFacultyByBranch/"+$scope.adbranchid+"/").success(function (data, status, headers, config) {
            $scope.faculties = data;
        });
    }

    $scope.searchFaculty=function(){
        if($scope.facultykeyword!="") {
            $http.get("/searchFaculty/"+$scope.facultykeyword+"/").success(function (data, status, headers, config) {
                $scope.faculties = data;
            });
        }else{
            $scope.loadFaculty();
        }
    }

    $scope.updateFaculty=function(){
      $http.post("/updateFaculty/"+$scope.updfaculty.id+"/",{facultyname:$scope.updfaculty.facultyName,branchid:$scope.updfaculty.branchid}).success(function(data,status,headers,config){
            if(data=='ok'){
                $scope.updfacultysuccessmsg="Faculty updated success";
                $scope.loadFaculty();
             //   $scope.updfaculty={};
            }
        });
        //console.log(+$scope.updfaculty.id+"=>"+$scope.updfaculty.facultyName+"=>"+$scope.updfaculty.branchid);

    }
    $scope.registerDepartment=function(){
        $http.post("/registerDepartment/",{departmentname:$scope.departmentname,facultyid:$scope.depfacultyid}).success(function(data,status,headers,config){
            if(data=='ok'){
                $scope.regdeparmentsuccessmsg="Department registered success";
               $scope.departmentname=null;$scope.depfacultyid=null;
            }
        });

    }

    $scope.loadDepartment=function(){
        $http.get("/loadDepartment/").success(function(data,status,headers,config){
            $scope.departments=data;
        });
    }
    $scope.loadDepartmentByFaculty=function(){
        $http.get("/loadDepartmentByFaculty/"+$scope.adfacultyid+"/").success(function(data,status,headers,config){
            $scope.departments=data;
        });
    }
    $scope.loadDepartmentUpdater= function (id) {
        $http.get('/loadDepartmentById/'+id+'/').success(function(data,status,headers,config){
            $scope.id=id;
            $scope.upddepartment=data;
        });
    }
    $scope.searchDepartment=function(){
        if($scope.departmentkeyword!="") {
            $http.get("/searchDepartment/"+$scope.departmentkeyword+"/").success(function (data, status, headers, config) {
                $scope.departments = data;
            });
        }else{
            $scope.loadDepartment();
        }
    }

    $scope.updateDepartment=function(){
        $http.post("/updateDepartment/"+$scope.id+"/",{departmentname:$scope.upddepartment.departmentName,facultyid:$scope.upddepfacultyid}).success(function(data,status,headers,config){
            if(data=='ok'){
                $scope.upddepartmentsuccessmsg="Department updated success";
                $scope.loadDepartment();
                $scope.upddepartment={};
            }
        });
      //  console.log($scope.upddepartment.id+""+$scope.upddepartment.departmentName+""+$scope.upddepartment.faculty.id);
    }

    $scope.registerSection=function(){
        $http.post("/registerSection/",{sectionname:$scope.sectionname,secdepid:$scope.secdepid}).success(function(data,status,headers,config){
            if(data=='ok'){
                $scope.regsectionsuccessmsg="Section registered success";
                $scope.sectionname=null;
            }
        });

    }
    $scope.loadSection=function(){
        $http.get("/loadSection/").success(function(data,status,headers,config){
            $scope.sections=data;
        });
    }
    $scope.loadSectionUpdater= function (id) {
        $http.get('/loadSectionById/'+id+'/').success(function(data,status,headers,config){
            $scope.id=id;
            $scope.updsection=data;
        });
    }
    $scope.searchSection=function(){
        if($scope.sectionkeyword!="") {
            $http.get("/searchSection/"+$scope.sectionkeyword+"/").success(function (data, status, headers, config) {
                $scope.sections = data;
            });
        }else{
            $scope.loadSection();
        }
    }

    $scope.updateSection=function(){
        $http.post("/updateSection/"+$scope.updsection.id+"/",{sectionname:$scope.updsection.sectionName,secdepid:$scope.updsecdepid}).success(function(data,status,headers,config){
            if(data=='ok'){
                $scope.updsectionsuccessmsg="Section updated success";
                $scope.loadSection();
            }
        });
    }
    $scope.registerApplication=function(){
        $http.post("/registerApplication/",{acyear:$scope.acyear,start:$scope.start,end:$scope.end}).success(function(data,status,headers,config){
            if(data=='ok'){
                $scope.regapplicationsuccessmsg="Application registered success";
                $scope.acyear=null;$scope.start=null;$scope.end=null;
            }
        });

    }
    $scope.loadApplication=function(){
        $http.get("/loadApplication/").success(function(data,status,headers,config){
            $scope.applications=data;
        });
    }
    $scope.loadApplicationUpdater= function (id) {
        $http.get('/loadApplicationById/'+id+'/').success(function(data,status,headers,config){
            $scope.id=id;
            $scope.updapplication=data;

        });
    }
    $scope.searchApplication=function(){
        if($scope.appkeyword!="") {
            $http.get("/searchApplication/"+$scope.appkeyword+"/").success(function (data, status, headers, config) {
                $scope.applications = data;
            });
        }else{
            $scope.loadApplication();
        }
    }

    $scope.updateApplication=function(){
        $http.post("/updateApplication/"+$scope.updapplication.id+"/",{updacyear:$scope.updapplication.academicYear,updstart:$scope.updapplication.startAt,updend:$scope.updapplication.endAt}).success(function(data,status,headers,config){
            if(data=='ok'){
                $scope.updapplicationsuccessmsg="Application updated success";
                $scope.loadApplication();
                $scope.updapplication=null;
            }
        });
    }

    $scope.registerApptype=function(){
        $http.post("/registerApptype/",{apptypename:$scope.apptypename}).success(function(data,status,headers,config){
            if(data=='ok'){
                $scope.regapptypesuccessmsg="Application Type registered success";
                $scope.apptypename=null;
            }
        });

    }
    $scope.loadApptype=function(){
        $http.get("/loadApptype/").success(function(data,status,headers,config){
            $scope.apptypes=data;
        });
    }
    $scope.loadApptypeUpdater= function (id) {
        $http.get('/loadApptypeById/'+id+'/').success(function(data,status,headers,config){
            $scope.id=id;
            $scope.updapptype=data;
        });
    }
    $scope.searchApptype=function(){
        if($scope.apptypekeyword!="") {
            $http.get("/searchApptype/"+$scope.apptypekeyword+"/").success(function (data, status, headers, config) {
                $scope.apptypes = data;
            });
        }else{
            $scope.loadApptype();
        }
    }
    $scope.updateApptype=function(){
        $http.post("/updateApptype/"+$scope.updapptype.id+"/",{updapptypename:$scope.updapptype.typeName}).success(function(data,status,headers,config){
            if(data=='ok'){
                $scope.updapptypesuccessmsg="Application type updated success";
                $scope.loadApptype();
                $scope.updapptype=null;
            }
        });
    }

    $scope.registerClass=function(){
        $http.post("/registerClass/",{classname:$scope.classname,classsecid:$scope.classsecid,classdeptid:$scope.classdeptid}).success(function(data,status,headers,config){
            if(data=='ok'){
                $scope.regclasssuccessmsg="Class registered success";
                $scope.classname=null;$scope.classsecid=null;$scope.classdeptid=null;
            }
        });

    }
    $scope.loadClasses=function(){
        $http.get("/loadClasses/").success(function(data,status,headers,config){
            $scope.classes=data;
        });
    }
    $scope.loadClassesUpdater= function (id) {
        $http.get('/loadClassesById/'+id+'/').success(function(data,status,headers,config){
            $scope.id=id;
            $scope.updclasses=data;
        });
    }
    $scope.loadClassesBySection=function(){
        $http.get("/loadClassesBySection/"+$scope.adsectionid+"/").success(function(data,status,headers,config){
            $scope.classes=data;
        });
    }
    $scope.searchClass=function(){
        if($scope.classkeyword!="") {
            $http.get("/searchClass/"+$scope.classkeyword+"/").success(function (data, status, headers, config) {
                $scope.classes = data;
            });
        }else{
            $scope.loadClasses();
        }
    }
    $scope.updateClass=function(){
        $http.post("/updateClass/"+$scope.updclasses.id+"/",{classname:$scope.updclasses.classesName,classsectionid:$scope.classsecid,classdeptid:$scope.classdeptid}).success(function(data,status,headers,config){
            if(data=='ok'){
                $scope.updclasssuccessmsg="Class updated success";
                $scope.loadClasses();
                //$scope.updclasses={};
            }
        });
      //  console.log($scope.updclasses.id+"=>"+$scope.updclasses.classesName+"=>"+$scope.classsecid)
    }

    $scope.registerSponsor=function(){
        $http.post("/registerSponsor/",{sponsorName:$scope.sponsorName,sponsorPhone:$scope.sponsorPhone,sponsorEmail:$scope.sponsorEmail,sponsorAddress:$scope.sponsorAddress}).success(function(data,status,headers,config){
            if(data=='ok'){
                $scope.regsponsorsuccessmsg="Sponsor registered success";
                $scope.sponsorName=null;$scope.sponsorPhone=null;$scope.sponsorEmail=null;$scope.sponsorAddress=null;
            }
        });

    }

    $scope.loadSponsor=function(){
        $http.get("/loadSponsor/").success(function(data,status,headers,config){
                $scope.sponsors=data;
        });
    }
    $scope.loadSponsorUpdater= function (id) {
        $http.get('/loadSponsorById/'+id+'/').success(function(data,status,headers,config){
            $scope.id=id;
            $scope.updsponsor=data;
            $scope.viewSponsor=data;
        });
    }
    $scope.searchSponsor=function(){
        if($scope.sponsorkeyword!="") {
            $http.get("/searchSponsor/" + $scope.sponsorkeyword + "/").success(function (data, status, headers, config) {
                $scope.sponsors = data;
            });
        }else{
            $scope.loadSponsor();
        }
    }
    $scope.updateSponsor=function(){
        $http.post("/updateSponsor/"+$scope.updsponsor.id+"/",{sponsorName:$scope.updsponsor.sponsorName,sponsorPhone:$scope.updsponsor.sponsorPhone,sponsorEmail:$scope.updsponsor.sponsorEmail,sponsorAddress:$scope.updsponsor.sponsorAddress}).success(function(data,status,headers,config){
            if(data=='ok'){
                $scope.updsponsorsuccessmsg="Sponsor updated success";
                $scope.loadSponsor();
               // $scope.updsponsor={};
            }
        });
    }

    $scope.registerEmployee=function(){
        $scope.empDataObj={empfname:$scope.empfname,emplname:$scope.emplname,empemail:$scope.empemail,password:$scope.emppwd,empphone:$scope.empphone,emplocation:$scope.emplocation,empqualification:$scope.empqualification,empaddress:$scope.empaddress}
       if($scope.emppwd==$scope.empconfpwd){
        $http.post("/registerEmployee/",$scope.empDataObj).success(function(data,status,headers,config){
            if(data=='ok'){
                $scope.regemployeesuccessmsg="Employee registered success";
                $scope.empfname=null; $scope.empfname=null;$scope.emplname=null; $scope.empemail=null; $scope.empphone=null; $scope.emplocation=null; $scope.empqualification=null; $scope.empaddress=null;
            }
        });
       }else{
           $scope.error="Password doesn\'t maych please try again";
       }

    }

    $scope.loadEmployee=function(){
        $http.get("/loadEmployee/").success(function(data,status,headers,config){
                $scope.employee=data;
        });
    }
    $scope.loadEmployeeUpdater= function (id) {
        $http.get('/loadEmployeeById/'+id+'/').success(function(data,status,headers,config){
            $scope.id=id;
            $scope.updemp=data;
            $scope.viewEmployee=data;
        });
    }
    $scope.searchEmployee=function(){
        if($scope.employeekeyword!=""){
        $http.get("/searchEmployee/"+$scope.employeekeyword+"/").success(function(data,status,headers,config){
            $scope.employee=data;
        });
        }else{
            $scope.loadEmployee();
        }
    }
    $scope.updateEmployee=function(){
        $http.post("/updateEmployee/"+$scope.id+"/",{empfname:$scope.updemp.firstName,emplname:$scope.updemp.lastName,empemail:$scope.updemp.email,empphone:$scope.updemp.phoneNumber,emplocation:$scope.updemp.location,empqualification:$scope.updemp.qualification,empaddress:$scope.updemp.address}).success(function(data,status,headers,config){
            if(data=='ok'){
                $scope.updemployeesuccessmsg="Employee updated success";
                $scope.loadEmployee();
               // $scope.updemp={};
            }
        });
    }
    //Student applications
    $scope.registerStudent=function(){
        if($scope.studPwd==$scope.studConfPwd){

        $http.post("/registerStudent/",{studFname:$scope.studFname,studLname:$scope.studLname,studEmail:$scope.studEmail,studPwd:$scope.studPwd}).success(function(data,status,headers,config){
         $scope.regstudsuccessmsg="Student Registered Success";
            $scope.studFname=null;$scope.studLname=null;$scope.studEmail=null;$scope.studPwd=null;$scope.studConfPwd=null;
        });
        }
    }
//Delete Controllers
    $scope.delete=function(){
        if($scope.deleteReason!="" || $scope.deleteReason!=null){
            $http.post("/delete/"+$scope.cate+"/"+$scope.delid+"/"+$scope.deleteReason+"/").success(function(data,status,headers,config){
                $scope.delsuccessmsg=$scope.cate+" Deleted Success";
                $scope.delid=null;$scope.cate=null;$scope.deleteReason=null;
            });
            //calls methods for reaction
            $scope.loadBranch(); $scope.loadApplication(); $scope.loadApptype(); $scope.loadFaculty(); $scope.loadDepartment();
            $scope.loadSection(); $scope.loadClasses(); $scope.loadSponsor(); $scope.loadEmployee();
        }
        console.log($scope.cate+"=>"+$scope.delid+"=>"+$scope.deleteReason);
    }
    $scope.setCurrentCateId= function (cate,id) {
        $scope.cate=cate;
        $scope.delid=id;
    }
    //optional phase for checking
    $scope.changed= function () {
        alert($scope.depfacultyid);
    }

    //Testing phases
$scope.loadTime=function(){
    $http.get("/testDate/").success(function (data,headers,status,config) {
     //   console.log(data[0].endAt+" Testing");
console.log(data.endAt);
    })
}
    $scope.registerCandidates= function () {
      $http.post("/registercandidates/",{names:$scope.names,password:$scope.pwd,email:$scope.email,phone:$scope.phone}).success(function(data,status,headers,config){
         if(data=='ok'){
             $scope.successmsg="Candidates registered success";
             $scope.names=null;$scope.pwd=null;$scope.email=null;$scope.phone=null;
         }
      });
    }
    $scope.viewCandidates= function () {
     $http.get('/loadCandidates/').success(function(data,status,headers,config){
        $scope.candidates=data;
    });
}
    $scope.disableCandidates= function (id) {
        $http.get('/disableCandidates/'+id+'/').success(function(data,status,headers,config){
            $scope.feedmsg=data;
        });
    }
    $scope.updateCandidates= function () {
        $http.post('/updatecandidates/'+$scope.id+'/',{names:$scope.names,password:$scope.pwd,email:$scope.email,phone:$scope.phone}).success(function(data,status,headers,config){
            if(data=='ok'){
                $scope.updatesuccessmsg="Candidates updated success";
            }
        });
        alert($scope.id);
    }
    $scope.loadUpdater= function (id) {
        $http.get('/loadCandidatesById/'+id+'/').success(function(data,status,headers,config){
            $scope.id=id;
            $scope.updcand=data;
        });
    }
    $scope.searchCandidates= function () {
        if($scope.keyword!=''){
        $http.get('/searchCandidates/'+$scope.keyword+'/').success(function(data,status,headers,config){
            $scope.candidates=data;
        });
    }else{
            $scope.viewCandidates();
        }
    }
});