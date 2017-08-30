// @SOURCE:F:/play/ums/conf/routes
// @HASH:33f95bff203e8d84437e67923535e5f835257f15
// @DATE:Wed Aug 30 18:58:28 EET 2017


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Application_signin1 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signin/"))))
        

// @LINE:8
private[this] lazy val controllers_Application_login2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login/"))))
        

// @LINE:9
private[this] lazy val controllers_Application_logout3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout/"))))
        

// @LINE:10
private[this] lazy val controllers_Application_student4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admission/"))))
        

// @LINE:11
private[this] lazy val controllers_Application_viewApplicants5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("applicants/"))))
        

// @LINE:12
private[this] lazy val controllers_Application_setting6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("setting/"))))
        

// @LINE:13
private[this] lazy val controllers_Application_registerBranch7 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("registerBranch/"))))
        

// @LINE:14
private[this] lazy val controllers_Application_loadBranch8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("loadBranch/"))))
        

// @LINE:15
private[this] lazy val controllers_Application_loadBranchById9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("loadBranchById/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"))))
        

// @LINE:16
private[this] lazy val controllers_Application_searchBranch10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchBranch/"),DynamicPart("name", """[^/]+""",true),StaticPart("/"))))
        

// @LINE:17
private[this] lazy val controllers_Application_updateBranch11 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("updateBranch/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"))))
        

// @LINE:19
private[this] lazy val controllers_Application_registerFaculty12 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("registerFaculty/"))))
        

// @LINE:20
private[this] lazy val controllers_Application_loadFaculty13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("loadFaculty/"))))
        

// @LINE:21
private[this] lazy val controllers_Application_loadFacultyById14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("loadFacultyById/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"))))
        

// @LINE:22
private[this] lazy val controllers_Application_loadFacultyByBranch15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("loadFacultyByBranch/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"))))
        

// @LINE:23
private[this] lazy val controllers_Application_searchFaculty16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchFaculty/"),DynamicPart("name", """[^/]+""",true),StaticPart("/"))))
        

// @LINE:24
private[this] lazy val controllers_Application_updateFaculty17 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("updateFaculty/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"))))
        

// @LINE:26
private[this] lazy val controllers_Application_registerDepartment18 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("registerDepartment/"))))
        

// @LINE:27
private[this] lazy val controllers_Application_loadDepartment19 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("loadDepartment/"))))
        

// @LINE:28
private[this] lazy val controllers_Application_loadDepartmentById20 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("loadDepartmentById/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"))))
        

// @LINE:29
private[this] lazy val controllers_Application_loadDepartmentByFaculty21 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("loadDepartmentByFaculty/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"))))
        

// @LINE:30
private[this] lazy val controllers_Application_searchDepartment22 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchDepartment/"),DynamicPart("name", """[^/]+""",true),StaticPart("/"))))
        

// @LINE:31
private[this] lazy val controllers_Application_updateDepartment23 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("updateDepartment/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"))))
        

// @LINE:33
private[this] lazy val controllers_Application_registerSection24 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("registerSection/"))))
        

// @LINE:34
private[this] lazy val controllers_Application_loadSection25 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("loadSection/"))))
        

// @LINE:35
private[this] lazy val controllers_Application_loadSectionById26 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("loadSectionById/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"))))
        

// @LINE:36
private[this] lazy val controllers_Application_searchSection27 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchSection/"),DynamicPart("name", """[^/]+""",true),StaticPart("/"))))
        

// @LINE:37
private[this] lazy val controllers_Application_updateSection28 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("updateSection/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"))))
        

// @LINE:39
private[this] lazy val controllers_Application_registerApplication29 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("registerApplication/"))))
        

// @LINE:40
private[this] lazy val controllers_Application_loadApplication30 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("loadApplication/"))))
        

// @LINE:41
private[this] lazy val controllers_Application_loadApplicationById31 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("loadApplicationById/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"))))
        

// @LINE:42
private[this] lazy val controllers_Application_searchApplication32 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchApplication/"),DynamicPart("name", """[^/]+""",true),StaticPart("/"))))
        

// @LINE:43
private[this] lazy val controllers_Application_updateApplication33 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("updateApplication/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"))))
        

// @LINE:45
private[this] lazy val controllers_Application_registerAppType34 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("registerApptype/"))))
        

// @LINE:46
private[this] lazy val controllers_Application_loadAppType35 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("loadApptype/"))))
        

// @LINE:47
private[this] lazy val controllers_Application_loadAppTypeById36 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("loadApptypeById/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"))))
        

// @LINE:48
private[this] lazy val controllers_Application_searchAppType37 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchApptype/"),DynamicPart("name", """[^/]+""",true),StaticPart("/"))))
        

// @LINE:49
private[this] lazy val controllers_Application_updateAppType38 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("updateApptype/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"))))
        

// @LINE:51
private[this] lazy val controllers_Application_registerClass39 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("registerClass/"))))
        

// @LINE:52
private[this] lazy val controllers_Application_loadClasses40 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("loadClasses/"))))
        

// @LINE:53
private[this] lazy val controllers_Application_loadClassesById41 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("loadClassesById/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"))))
        

// @LINE:54
private[this] lazy val controllers_Application_loadClassesBySection42 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("loadClassesBySection/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"))))
        

// @LINE:55
private[this] lazy val controllers_Application_searchClass43 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchClass/"),DynamicPart("name", """[^/]+""",true),StaticPart("/"))))
        

// @LINE:56
private[this] lazy val controllers_Application_updateClass44 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("updateClass/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"))))
        

// @LINE:58
private[this] lazy val controllers_Application_registerSponsor45 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("registerSponsor/"))))
        

// @LINE:59
private[this] lazy val controllers_Application_loadSponsor46 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("loadSponsor/"))))
        

// @LINE:60
private[this] lazy val controllers_Application_loadSponsorById47 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("loadSponsorById/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"))))
        

// @LINE:61
private[this] lazy val controllers_Application_searchSponsor48 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchSponsor/"),DynamicPart("name", """[^/]+""",true),StaticPart("/"))))
        

// @LINE:62
private[this] lazy val controllers_Application_updateSponsor49 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("updateSponsor/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"))))
        

// @LINE:64
private[this] lazy val controllers_Application_registerEmployee50 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("registerEmployee/"))))
        

// @LINE:65
private[this] lazy val controllers_Application_loadEmployee51 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("loadEmployee/"))))
        

// @LINE:66
private[this] lazy val controllers_Application_loadEmployeeById52 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("loadEmployeeById/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"))))
        

// @LINE:67
private[this] lazy val controllers_Application_searchEmployee53 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchEmployee/"),DynamicPart("name", """[^/]+""",true),StaticPart("/"))))
        

// @LINE:68
private[this] lazy val controllers_Application_updateEmployee54 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("updateEmployee/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"))))
        

// @LINE:70
private[this] lazy val controllers_Application_registerStudent55 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("registerStudent/"))))
        

// @LINE:71
private[this] lazy val controllers_Application_loadStudent56 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("loadStudent/"))))
        

// @LINE:72
private[this] lazy val controllers_Application_searchStudent57 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchStudent/"),DynamicPart("name", """[^/]+""",true),StaticPart("/"))))
        

// @LINE:73
private[this] lazy val controllers_Application_disableStudent58 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("disableStudent/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"))))
        

// @LINE:74
private[this] lazy val controllers_Application_loadStudentById59 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("loadStudentById/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"))))
        

// @LINE:75
private[this] lazy val controllers_Application_updateStudent60 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("updateStudent/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"))))
        

// @LINE:77
private[this] lazy val controllers_Application_delete61 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("delete/"),DynamicPart("cate", """[^/]+""",true),StaticPart("/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"),DynamicPart("reason", """[^/]+""",true),StaticPart("/"))))
        

// @LINE:80
private[this] lazy val controllers_Tests_test62 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("test/"))))
        

// @LINE:81
private[this] lazy val controllers_Tests_registCandidates63 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("registercandidates/"))))
        

// @LINE:82
private[this] lazy val controllers_Tests_loadCandidates64 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("loadCandidates/"))))
        

// @LINE:83
private[this] lazy val controllers_Tests_searchCandidates65 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchCandidates/"),DynamicPart("name", """[^/]+""",true),StaticPart("/"))))
        

// @LINE:84
private[this] lazy val controllers_Tests_disableCandidates66 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("disableCandidates/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"))))
        

// @LINE:85
private[this] lazy val controllers_Tests_loadCandidatesById67 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("loadCandidatesById/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"))))
        

// @LINE:86
private[this] lazy val controllers_Tests_updateCandidates68 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("updatecandidates/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"))))
        

// @LINE:87
private[this] lazy val controllers_Application_testDate69 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("testDate/"))))
        

// @LINE:97
private[this] lazy val controllers_Assets_at70 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signin/""","""controllers.Application.signin()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login/""","""controllers.Application.login()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout/""","""controllers.Application.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admission/""","""controllers.Application.student()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """applicants/""","""controllers.Application.viewApplicants()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """setting/""","""controllers.Application.setting()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """registerBranch/""","""controllers.Application.registerBranch()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """loadBranch/""","""controllers.Application.loadBranch()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """loadBranchById/$id<[^/]+>/""","""controllers.Application.loadBranchById(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchBranch/$name<[^/]+>/""","""controllers.Application.searchBranch(name:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """updateBranch/$id<[^/]+>/""","""controllers.Application.updateBranch(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """registerFaculty/""","""controllers.Application.registerFaculty()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """loadFaculty/""","""controllers.Application.loadFaculty()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """loadFacultyById/$id<[^/]+>/""","""controllers.Application.loadFacultyById(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """loadFacultyByBranch/$id<[^/]+>/""","""controllers.Application.loadFacultyByBranch(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchFaculty/$name<[^/]+>/""","""controllers.Application.searchFaculty(name:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """updateFaculty/$id<[^/]+>/""","""controllers.Application.updateFaculty(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """registerDepartment/""","""controllers.Application.registerDepartment()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """loadDepartment/""","""controllers.Application.loadDepartment()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """loadDepartmentById/$id<[^/]+>/""","""controllers.Application.loadDepartmentById(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """loadDepartmentByFaculty/$id<[^/]+>/""","""controllers.Application.loadDepartmentByFaculty(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchDepartment/$name<[^/]+>/""","""controllers.Application.searchDepartment(name:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """updateDepartment/$id<[^/]+>/""","""controllers.Application.updateDepartment(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """registerSection/""","""controllers.Application.registerSection()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """loadSection/""","""controllers.Application.loadSection()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """loadSectionById/$id<[^/]+>/""","""controllers.Application.loadSectionById(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchSection/$name<[^/]+>/""","""controllers.Application.searchSection(name:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """updateSection/$id<[^/]+>/""","""controllers.Application.updateSection(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """registerApplication/""","""controllers.Application.registerApplication()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """loadApplication/""","""controllers.Application.loadApplication()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """loadApplicationById/$id<[^/]+>/""","""controllers.Application.loadApplicationById(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchApplication/$name<[^/]+>/""","""controllers.Application.searchApplication(name:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """updateApplication/$id<[^/]+>/""","""controllers.Application.updateApplication(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """registerApptype/""","""controllers.Application.registerAppType()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """loadApptype/""","""controllers.Application.loadAppType()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """loadApptypeById/$id<[^/]+>/""","""controllers.Application.loadAppTypeById(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchApptype/$name<[^/]+>/""","""controllers.Application.searchAppType(name:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """updateApptype/$id<[^/]+>/""","""controllers.Application.updateAppType(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """registerClass/""","""controllers.Application.registerClass()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """loadClasses/""","""controllers.Application.loadClasses()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """loadClassesById/$id<[^/]+>/""","""controllers.Application.loadClassesById(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """loadClassesBySection/$id<[^/]+>/""","""controllers.Application.loadClassesBySection(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchClass/$name<[^/]+>/""","""controllers.Application.searchClass(name:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """updateClass/$id<[^/]+>/""","""controllers.Application.updateClass(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """registerSponsor/""","""controllers.Application.registerSponsor()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """loadSponsor/""","""controllers.Application.loadSponsor()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """loadSponsorById/$id<[^/]+>/""","""controllers.Application.loadSponsorById(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchSponsor/$name<[^/]+>/""","""controllers.Application.searchSponsor(name:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """updateSponsor/$id<[^/]+>/""","""controllers.Application.updateSponsor(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """registerEmployee/""","""controllers.Application.registerEmployee()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """loadEmployee/""","""controllers.Application.loadEmployee()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """loadEmployeeById/$id<[^/]+>/""","""controllers.Application.loadEmployeeById(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchEmployee/$name<[^/]+>/""","""controllers.Application.searchEmployee(name:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """updateEmployee/$id<[^/]+>/""","""controllers.Application.updateEmployee(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """registerStudent/""","""controllers.Application.registerStudent()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """loadStudent/""","""controllers.Application.loadStudent()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchStudent/$name<[^/]+>/""","""controllers.Application.searchStudent(name:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """disableStudent/$id<[^/]+>/""","""controllers.Application.disableStudent(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """loadStudentById/$id<[^/]+>/""","""controllers.Application.loadStudentById(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """updateStudent/$id<[^/]+>/""","""controllers.Application.updateStudent(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """delete/$cate<[^/]+>/$id<[^/]+>/$reason<[^/]+>/""","""controllers.Application.delete(cate:String, id:Long, reason:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """test/""","""controllers.Tests.test()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """registercandidates/""","""controllers.Tests.registCandidates()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """loadCandidates/""","""controllers.Tests.loadCandidates()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchCandidates/$name<[^/]+>/""","""controllers.Tests.searchCandidates(name:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """disableCandidates/$id<[^/]+>/""","""controllers.Tests.disableCandidates(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """loadCandidatesById/$id<[^/]+>/""","""controllers.Tests.loadCandidatesById(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """updatecandidates/$id<[^/]+>/""","""controllers.Tests.updateCandidates(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """testDate/""","""controllers.Application.testDate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Application_signin1(params) => {
   call { 
        invokeHandler(controllers.Application.signin(), HandlerDef(this, "controllers.Application", "signin", Nil,"POST", """""", Routes.prefix + """signin/"""))
   }
}
        

// @LINE:8
case controllers_Application_login2(params) => {
   call { 
        invokeHandler(controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Nil,"POST", """""", Routes.prefix + """login/"""))
   }
}
        

// @LINE:9
case controllers_Application_logout3(params) => {
   call { 
        invokeHandler(controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout/"""))
   }
}
        

// @LINE:10
case controllers_Application_student4(params) => {
   call { 
        invokeHandler(controllers.Application.student(), HandlerDef(this, "controllers.Application", "student", Nil,"GET", """""", Routes.prefix + """admission/"""))
   }
}
        

// @LINE:11
case controllers_Application_viewApplicants5(params) => {
   call { 
        invokeHandler(controllers.Application.viewApplicants(), HandlerDef(this, "controllers.Application", "viewApplicants", Nil,"GET", """""", Routes.prefix + """applicants/"""))
   }
}
        

// @LINE:12
case controllers_Application_setting6(params) => {
   call { 
        invokeHandler(controllers.Application.setting(), HandlerDef(this, "controllers.Application", "setting", Nil,"GET", """""", Routes.prefix + """setting/"""))
   }
}
        

// @LINE:13
case controllers_Application_registerBranch7(params) => {
   call { 
        invokeHandler(controllers.Application.registerBranch(), HandlerDef(this, "controllers.Application", "registerBranch", Nil,"POST", """""", Routes.prefix + """registerBranch/"""))
   }
}
        

// @LINE:14
case controllers_Application_loadBranch8(params) => {
   call { 
        invokeHandler(controllers.Application.loadBranch(), HandlerDef(this, "controllers.Application", "loadBranch", Nil,"GET", """""", Routes.prefix + """loadBranch/"""))
   }
}
        

// @LINE:15
case controllers_Application_loadBranchById9(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.loadBranchById(id), HandlerDef(this, "controllers.Application", "loadBranchById", Seq(classOf[Long]),"GET", """""", Routes.prefix + """loadBranchById/$id<[^/]+>/"""))
   }
}
        

// @LINE:16
case controllers_Application_searchBranch10(params) => {
   call(params.fromPath[String]("name", None)) { (name) =>
        invokeHandler(controllers.Application.searchBranch(name), HandlerDef(this, "controllers.Application", "searchBranch", Seq(classOf[String]),"GET", """""", Routes.prefix + """searchBranch/$name<[^/]+>/"""))
   }
}
        

// @LINE:17
case controllers_Application_updateBranch11(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.updateBranch(id), HandlerDef(this, "controllers.Application", "updateBranch", Seq(classOf[Long]),"POST", """""", Routes.prefix + """updateBranch/$id<[^/]+>/"""))
   }
}
        

// @LINE:19
case controllers_Application_registerFaculty12(params) => {
   call { 
        invokeHandler(controllers.Application.registerFaculty(), HandlerDef(this, "controllers.Application", "registerFaculty", Nil,"POST", """""", Routes.prefix + """registerFaculty/"""))
   }
}
        

// @LINE:20
case controllers_Application_loadFaculty13(params) => {
   call { 
        invokeHandler(controllers.Application.loadFaculty(), HandlerDef(this, "controllers.Application", "loadFaculty", Nil,"GET", """""", Routes.prefix + """loadFaculty/"""))
   }
}
        

// @LINE:21
case controllers_Application_loadFacultyById14(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.loadFacultyById(id), HandlerDef(this, "controllers.Application", "loadFacultyById", Seq(classOf[Long]),"GET", """""", Routes.prefix + """loadFacultyById/$id<[^/]+>/"""))
   }
}
        

// @LINE:22
case controllers_Application_loadFacultyByBranch15(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.loadFacultyByBranch(id), HandlerDef(this, "controllers.Application", "loadFacultyByBranch", Seq(classOf[Long]),"GET", """""", Routes.prefix + """loadFacultyByBranch/$id<[^/]+>/"""))
   }
}
        

// @LINE:23
case controllers_Application_searchFaculty16(params) => {
   call(params.fromPath[String]("name", None)) { (name) =>
        invokeHandler(controllers.Application.searchFaculty(name), HandlerDef(this, "controllers.Application", "searchFaculty", Seq(classOf[String]),"GET", """""", Routes.prefix + """searchFaculty/$name<[^/]+>/"""))
   }
}
        

// @LINE:24
case controllers_Application_updateFaculty17(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.updateFaculty(id), HandlerDef(this, "controllers.Application", "updateFaculty", Seq(classOf[Long]),"POST", """""", Routes.prefix + """updateFaculty/$id<[^/]+>/"""))
   }
}
        

// @LINE:26
case controllers_Application_registerDepartment18(params) => {
   call { 
        invokeHandler(controllers.Application.registerDepartment(), HandlerDef(this, "controllers.Application", "registerDepartment", Nil,"POST", """""", Routes.prefix + """registerDepartment/"""))
   }
}
        

// @LINE:27
case controllers_Application_loadDepartment19(params) => {
   call { 
        invokeHandler(controllers.Application.loadDepartment(), HandlerDef(this, "controllers.Application", "loadDepartment", Nil,"GET", """""", Routes.prefix + """loadDepartment/"""))
   }
}
        

// @LINE:28
case controllers_Application_loadDepartmentById20(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.loadDepartmentById(id), HandlerDef(this, "controllers.Application", "loadDepartmentById", Seq(classOf[Long]),"GET", """""", Routes.prefix + """loadDepartmentById/$id<[^/]+>/"""))
   }
}
        

// @LINE:29
case controllers_Application_loadDepartmentByFaculty21(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.loadDepartmentByFaculty(id), HandlerDef(this, "controllers.Application", "loadDepartmentByFaculty", Seq(classOf[Long]),"GET", """""", Routes.prefix + """loadDepartmentByFaculty/$id<[^/]+>/"""))
   }
}
        

// @LINE:30
case controllers_Application_searchDepartment22(params) => {
   call(params.fromPath[String]("name", None)) { (name) =>
        invokeHandler(controllers.Application.searchDepartment(name), HandlerDef(this, "controllers.Application", "searchDepartment", Seq(classOf[String]),"GET", """""", Routes.prefix + """searchDepartment/$name<[^/]+>/"""))
   }
}
        

// @LINE:31
case controllers_Application_updateDepartment23(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.updateDepartment(id), HandlerDef(this, "controllers.Application", "updateDepartment", Seq(classOf[Long]),"POST", """""", Routes.prefix + """updateDepartment/$id<[^/]+>/"""))
   }
}
        

// @LINE:33
case controllers_Application_registerSection24(params) => {
   call { 
        invokeHandler(controllers.Application.registerSection(), HandlerDef(this, "controllers.Application", "registerSection", Nil,"POST", """""", Routes.prefix + """registerSection/"""))
   }
}
        

// @LINE:34
case controllers_Application_loadSection25(params) => {
   call { 
        invokeHandler(controllers.Application.loadSection(), HandlerDef(this, "controllers.Application", "loadSection", Nil,"GET", """""", Routes.prefix + """loadSection/"""))
   }
}
        

// @LINE:35
case controllers_Application_loadSectionById26(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.loadSectionById(id), HandlerDef(this, "controllers.Application", "loadSectionById", Seq(classOf[Long]),"GET", """""", Routes.prefix + """loadSectionById/$id<[^/]+>/"""))
   }
}
        

// @LINE:36
case controllers_Application_searchSection27(params) => {
   call(params.fromPath[String]("name", None)) { (name) =>
        invokeHandler(controllers.Application.searchSection(name), HandlerDef(this, "controllers.Application", "searchSection", Seq(classOf[String]),"GET", """""", Routes.prefix + """searchSection/$name<[^/]+>/"""))
   }
}
        

// @LINE:37
case controllers_Application_updateSection28(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.updateSection(id), HandlerDef(this, "controllers.Application", "updateSection", Seq(classOf[Long]),"POST", """""", Routes.prefix + """updateSection/$id<[^/]+>/"""))
   }
}
        

// @LINE:39
case controllers_Application_registerApplication29(params) => {
   call { 
        invokeHandler(controllers.Application.registerApplication(), HandlerDef(this, "controllers.Application", "registerApplication", Nil,"POST", """""", Routes.prefix + """registerApplication/"""))
   }
}
        

// @LINE:40
case controllers_Application_loadApplication30(params) => {
   call { 
        invokeHandler(controllers.Application.loadApplication(), HandlerDef(this, "controllers.Application", "loadApplication", Nil,"GET", """""", Routes.prefix + """loadApplication/"""))
   }
}
        

// @LINE:41
case controllers_Application_loadApplicationById31(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.loadApplicationById(id), HandlerDef(this, "controllers.Application", "loadApplicationById", Seq(classOf[Long]),"GET", """""", Routes.prefix + """loadApplicationById/$id<[^/]+>/"""))
   }
}
        

// @LINE:42
case controllers_Application_searchApplication32(params) => {
   call(params.fromPath[String]("name", None)) { (name) =>
        invokeHandler(controllers.Application.searchApplication(name), HandlerDef(this, "controllers.Application", "searchApplication", Seq(classOf[String]),"GET", """""", Routes.prefix + """searchApplication/$name<[^/]+>/"""))
   }
}
        

// @LINE:43
case controllers_Application_updateApplication33(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.updateApplication(id), HandlerDef(this, "controllers.Application", "updateApplication", Seq(classOf[Long]),"POST", """""", Routes.prefix + """updateApplication/$id<[^/]+>/"""))
   }
}
        

// @LINE:45
case controllers_Application_registerAppType34(params) => {
   call { 
        invokeHandler(controllers.Application.registerAppType(), HandlerDef(this, "controllers.Application", "registerAppType", Nil,"POST", """""", Routes.prefix + """registerApptype/"""))
   }
}
        

// @LINE:46
case controllers_Application_loadAppType35(params) => {
   call { 
        invokeHandler(controllers.Application.loadAppType(), HandlerDef(this, "controllers.Application", "loadAppType", Nil,"GET", """""", Routes.prefix + """loadApptype/"""))
   }
}
        

// @LINE:47
case controllers_Application_loadAppTypeById36(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.loadAppTypeById(id), HandlerDef(this, "controllers.Application", "loadAppTypeById", Seq(classOf[Long]),"GET", """""", Routes.prefix + """loadApptypeById/$id<[^/]+>/"""))
   }
}
        

// @LINE:48
case controllers_Application_searchAppType37(params) => {
   call(params.fromPath[String]("name", None)) { (name) =>
        invokeHandler(controllers.Application.searchAppType(name), HandlerDef(this, "controllers.Application", "searchAppType", Seq(classOf[String]),"GET", """""", Routes.prefix + """searchApptype/$name<[^/]+>/"""))
   }
}
        

// @LINE:49
case controllers_Application_updateAppType38(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.updateAppType(id), HandlerDef(this, "controllers.Application", "updateAppType", Seq(classOf[Long]),"POST", """""", Routes.prefix + """updateApptype/$id<[^/]+>/"""))
   }
}
        

// @LINE:51
case controllers_Application_registerClass39(params) => {
   call { 
        invokeHandler(controllers.Application.registerClass(), HandlerDef(this, "controllers.Application", "registerClass", Nil,"POST", """""", Routes.prefix + """registerClass/"""))
   }
}
        

// @LINE:52
case controllers_Application_loadClasses40(params) => {
   call { 
        invokeHandler(controllers.Application.loadClasses(), HandlerDef(this, "controllers.Application", "loadClasses", Nil,"GET", """""", Routes.prefix + """loadClasses/"""))
   }
}
        

// @LINE:53
case controllers_Application_loadClassesById41(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.loadClassesById(id), HandlerDef(this, "controllers.Application", "loadClassesById", Seq(classOf[Long]),"GET", """""", Routes.prefix + """loadClassesById/$id<[^/]+>/"""))
   }
}
        

// @LINE:54
case controllers_Application_loadClassesBySection42(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.loadClassesBySection(id), HandlerDef(this, "controllers.Application", "loadClassesBySection", Seq(classOf[Long]),"GET", """""", Routes.prefix + """loadClassesBySection/$id<[^/]+>/"""))
   }
}
        

// @LINE:55
case controllers_Application_searchClass43(params) => {
   call(params.fromPath[String]("name", None)) { (name) =>
        invokeHandler(controllers.Application.searchClass(name), HandlerDef(this, "controllers.Application", "searchClass", Seq(classOf[String]),"GET", """""", Routes.prefix + """searchClass/$name<[^/]+>/"""))
   }
}
        

// @LINE:56
case controllers_Application_updateClass44(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.updateClass(id), HandlerDef(this, "controllers.Application", "updateClass", Seq(classOf[Long]),"POST", """""", Routes.prefix + """updateClass/$id<[^/]+>/"""))
   }
}
        

// @LINE:58
case controllers_Application_registerSponsor45(params) => {
   call { 
        invokeHandler(controllers.Application.registerSponsor(), HandlerDef(this, "controllers.Application", "registerSponsor", Nil,"POST", """""", Routes.prefix + """registerSponsor/"""))
   }
}
        

// @LINE:59
case controllers_Application_loadSponsor46(params) => {
   call { 
        invokeHandler(controllers.Application.loadSponsor(), HandlerDef(this, "controllers.Application", "loadSponsor", Nil,"GET", """""", Routes.prefix + """loadSponsor/"""))
   }
}
        

// @LINE:60
case controllers_Application_loadSponsorById47(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.loadSponsorById(id), HandlerDef(this, "controllers.Application", "loadSponsorById", Seq(classOf[Long]),"GET", """""", Routes.prefix + """loadSponsorById/$id<[^/]+>/"""))
   }
}
        

// @LINE:61
case controllers_Application_searchSponsor48(params) => {
   call(params.fromPath[String]("name", None)) { (name) =>
        invokeHandler(controllers.Application.searchSponsor(name), HandlerDef(this, "controllers.Application", "searchSponsor", Seq(classOf[String]),"GET", """""", Routes.prefix + """searchSponsor/$name<[^/]+>/"""))
   }
}
        

// @LINE:62
case controllers_Application_updateSponsor49(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.updateSponsor(id), HandlerDef(this, "controllers.Application", "updateSponsor", Seq(classOf[Long]),"POST", """""", Routes.prefix + """updateSponsor/$id<[^/]+>/"""))
   }
}
        

// @LINE:64
case controllers_Application_registerEmployee50(params) => {
   call { 
        invokeHandler(controllers.Application.registerEmployee(), HandlerDef(this, "controllers.Application", "registerEmployee", Nil,"POST", """""", Routes.prefix + """registerEmployee/"""))
   }
}
        

// @LINE:65
case controllers_Application_loadEmployee51(params) => {
   call { 
        invokeHandler(controllers.Application.loadEmployee(), HandlerDef(this, "controllers.Application", "loadEmployee", Nil,"GET", """""", Routes.prefix + """loadEmployee/"""))
   }
}
        

// @LINE:66
case controllers_Application_loadEmployeeById52(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.loadEmployeeById(id), HandlerDef(this, "controllers.Application", "loadEmployeeById", Seq(classOf[Long]),"GET", """""", Routes.prefix + """loadEmployeeById/$id<[^/]+>/"""))
   }
}
        

// @LINE:67
case controllers_Application_searchEmployee53(params) => {
   call(params.fromPath[String]("name", None)) { (name) =>
        invokeHandler(controllers.Application.searchEmployee(name), HandlerDef(this, "controllers.Application", "searchEmployee", Seq(classOf[String]),"GET", """""", Routes.prefix + """searchEmployee/$name<[^/]+>/"""))
   }
}
        

// @LINE:68
case controllers_Application_updateEmployee54(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.updateEmployee(id), HandlerDef(this, "controllers.Application", "updateEmployee", Seq(classOf[Long]),"POST", """""", Routes.prefix + """updateEmployee/$id<[^/]+>/"""))
   }
}
        

// @LINE:70
case controllers_Application_registerStudent55(params) => {
   call { 
        invokeHandler(controllers.Application.registerStudent(), HandlerDef(this, "controllers.Application", "registerStudent", Nil,"POST", """""", Routes.prefix + """registerStudent/"""))
   }
}
        

// @LINE:71
case controllers_Application_loadStudent56(params) => {
   call { 
        invokeHandler(controllers.Application.loadStudent(), HandlerDef(this, "controllers.Application", "loadStudent", Nil,"GET", """""", Routes.prefix + """loadStudent/"""))
   }
}
        

// @LINE:72
case controllers_Application_searchStudent57(params) => {
   call(params.fromPath[String]("name", None)) { (name) =>
        invokeHandler(controllers.Application.searchStudent(name), HandlerDef(this, "controllers.Application", "searchStudent", Seq(classOf[String]),"GET", """""", Routes.prefix + """searchStudent/$name<[^/]+>/"""))
   }
}
        

// @LINE:73
case controllers_Application_disableStudent58(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.disableStudent(id), HandlerDef(this, "controllers.Application", "disableStudent", Seq(classOf[Long]),"GET", """""", Routes.prefix + """disableStudent/$id<[^/]+>/"""))
   }
}
        

// @LINE:74
case controllers_Application_loadStudentById59(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.loadStudentById(id), HandlerDef(this, "controllers.Application", "loadStudentById", Seq(classOf[Long]),"GET", """""", Routes.prefix + """loadStudentById/$id<[^/]+>/"""))
   }
}
        

// @LINE:75
case controllers_Application_updateStudent60(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.updateStudent(id), HandlerDef(this, "controllers.Application", "updateStudent", Seq(classOf[Long]),"POST", """""", Routes.prefix + """updateStudent/$id<[^/]+>/"""))
   }
}
        

// @LINE:77
case controllers_Application_delete61(params) => {
   call(params.fromPath[String]("cate", None), params.fromPath[Long]("id", None), params.fromPath[String]("reason", None)) { (cate, id, reason) =>
        invokeHandler(controllers.Application.delete(cate, id, reason), HandlerDef(this, "controllers.Application", "delete", Seq(classOf[String], classOf[Long], classOf[String]),"POST", """""", Routes.prefix + """delete/$cate<[^/]+>/$id<[^/]+>/$reason<[^/]+>/"""))
   }
}
        

// @LINE:80
case controllers_Tests_test62(params) => {
   call { 
        invokeHandler(controllers.Tests.test(), HandlerDef(this, "controllers.Tests", "test", Nil,"GET", """test for learning purpose""", Routes.prefix + """test/"""))
   }
}
        

// @LINE:81
case controllers_Tests_registCandidates63(params) => {
   call { 
        invokeHandler(controllers.Tests.registCandidates(), HandlerDef(this, "controllers.Tests", "registCandidates", Nil,"POST", """""", Routes.prefix + """registercandidates/"""))
   }
}
        

// @LINE:82
case controllers_Tests_loadCandidates64(params) => {
   call { 
        invokeHandler(controllers.Tests.loadCandidates(), HandlerDef(this, "controllers.Tests", "loadCandidates", Nil,"GET", """""", Routes.prefix + """loadCandidates/"""))
   }
}
        

// @LINE:83
case controllers_Tests_searchCandidates65(params) => {
   call(params.fromPath[String]("name", None)) { (name) =>
        invokeHandler(controllers.Tests.searchCandidates(name), HandlerDef(this, "controllers.Tests", "searchCandidates", Seq(classOf[String]),"GET", """""", Routes.prefix + """searchCandidates/$name<[^/]+>/"""))
   }
}
        

// @LINE:84
case controllers_Tests_disableCandidates66(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Tests.disableCandidates(id), HandlerDef(this, "controllers.Tests", "disableCandidates", Seq(classOf[Long]),"GET", """""", Routes.prefix + """disableCandidates/$id<[^/]+>/"""))
   }
}
        

// @LINE:85
case controllers_Tests_loadCandidatesById67(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Tests.loadCandidatesById(id), HandlerDef(this, "controllers.Tests", "loadCandidatesById", Seq(classOf[Long]),"GET", """""", Routes.prefix + """loadCandidatesById/$id<[^/]+>/"""))
   }
}
        

// @LINE:86
case controllers_Tests_updateCandidates68(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Tests.updateCandidates(id), HandlerDef(this, "controllers.Tests", "updateCandidates", Seq(classOf[Long]),"POST", """""", Routes.prefix + """updatecandidates/$id<[^/]+>/"""))
   }
}
        

// @LINE:87
case controllers_Application_testDate69(params) => {
   call { 
        invokeHandler(controllers.Application.testDate(), HandlerDef(this, "controllers.Application", "testDate", Nil,"GET", """""", Routes.prefix + """testDate/"""))
   }
}
        

// @LINE:97
case controllers_Assets_at70(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     