// @SOURCE:F:/play/ums/conf/routes
// @HASH:33f95bff203e8d84437e67923535e5f835257f15
// @DATE:Wed Aug 30 18:58:28 EET 2017

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:97
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:77
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:97
class ReverseAssets {
    

// @LINE:97
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
class ReverseTests {
    

// @LINE:82
def loadCandidates(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "loadCandidates/")
}
                                                

// @LINE:86
def updateCandidates(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "updatecandidates/" + implicitly[PathBindable[Long]].unbind("id", id) + "/")
}
                                                

// @LINE:84
def disableCandidates(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "disableCandidates/" + implicitly[PathBindable[Long]].unbind("id", id) + "/")
}
                                                

// @LINE:81
def registCandidates(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "registercandidates/")
}
                                                

// @LINE:80
def test(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "test/")
}
                                                

// @LINE:83
def searchCandidates(name:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "searchCandidates/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)) + "/")
}
                                                

// @LINE:85
def loadCandidatesById(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "loadCandidatesById/" + implicitly[PathBindable[Long]].unbind("id", id) + "/")
}
                                                
    
}
                          

// @LINE:87
// @LINE:77
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:20
def loadFaculty(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "loadFaculty/")
}
                                                

// @LINE:58
def registerSponsor(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "registerSponsor/")
}
                                                

// @LINE:11
def viewApplicants(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "applicants/")
}
                                                

// @LINE:35
def loadSectionById(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "loadSectionById/" + implicitly[PathBindable[Long]].unbind("id", id) + "/")
}
                                                

// @LINE:72
def searchStudent(name:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "searchStudent/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)) + "/")
}
                                                

// @LINE:30
def searchDepartment(name:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "searchDepartment/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)) + "/")
}
                                                

// @LINE:29
def loadDepartmentByFaculty(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "loadDepartmentByFaculty/" + implicitly[PathBindable[Long]].unbind("id", id) + "/")
}
                                                

// @LINE:45
def registerAppType(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "registerApptype/")
}
                                                

// @LINE:24
def updateFaculty(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "updateFaculty/" + implicitly[PathBindable[Long]].unbind("id", id) + "/")
}
                                                

// @LINE:31
def updateDepartment(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "updateDepartment/" + implicitly[PathBindable[Long]].unbind("id", id) + "/")
}
                                                

// @LINE:68
def updateEmployee(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "updateEmployee/" + implicitly[PathBindable[Long]].unbind("id", id) + "/")
}
                                                

// @LINE:33
def registerSection(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "registerSection/")
}
                                                

// @LINE:71
def loadStudent(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "loadStudent/")
}
                                                

// @LINE:70
def registerStudent(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "registerStudent/")
}
                                                

// @LINE:26
def registerDepartment(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "registerDepartment/")
}
                                                

// @LINE:27
def loadDepartment(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "loadDepartment/")
}
                                                

// @LINE:13
def registerBranch(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "registerBranch/")
}
                                                

// @LINE:39
def registerApplication(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "registerApplication/")
}
                                                

// @LINE:60
def loadSponsorById(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "loadSponsorById/" + implicitly[PathBindable[Long]].unbind("id", id) + "/")
}
                                                

// @LINE:74
def loadStudentById(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "loadStudentById/" + implicitly[PathBindable[Long]].unbind("id", id) + "/")
}
                                                

// @LINE:65
def loadEmployee(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "loadEmployee/")
}
                                                

// @LINE:21
def loadFacultyById(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "loadFacultyById/" + implicitly[PathBindable[Long]].unbind("id", id) + "/")
}
                                                

// @LINE:75
def updateStudent(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "updateStudent/" + implicitly[PathBindable[Long]].unbind("id", id) + "/")
}
                                                

// @LINE:12
def setting(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "setting/")
}
                                                

// @LINE:64
def registerEmployee(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "registerEmployee/")
}
                                                

// @LINE:40
def loadApplication(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "loadApplication/")
}
                                                

// @LINE:34
def loadSection(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "loadSection/")
}
                                                

// @LINE:43
def updateApplication(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "updateApplication/" + implicitly[PathBindable[Long]].unbind("id", id) + "/")
}
                                                

// @LINE:66
def loadEmployeeById(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "loadEmployeeById/" + implicitly[PathBindable[Long]].unbind("id", id) + "/")
}
                                                

// @LINE:10
def student(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "admission/")
}
                                                

// @LINE:54
def loadClassesBySection(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "loadClassesBySection/" + implicitly[PathBindable[Long]].unbind("id", id) + "/")
}
                                                

// @LINE:19
def registerFaculty(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "registerFaculty/")
}
                                                

// @LINE:42
def searchApplication(name:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "searchApplication/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)) + "/")
}
                                                

// @LINE:49
def updateAppType(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "updateApptype/" + implicitly[PathBindable[Long]].unbind("id", id) + "/")
}
                                                

// @LINE:62
def updateSponsor(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "updateSponsor/" + implicitly[PathBindable[Long]].unbind("id", id) + "/")
}
                                                

// @LINE:16
def searchBranch(name:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "searchBranch/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)) + "/")
}
                                                

// @LINE:67
def searchEmployee(name:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "searchEmployee/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)) + "/")
}
                                                

// @LINE:9
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout/")
}
                                                

// @LINE:61
def searchSponsor(name:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "searchSponsor/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)) + "/")
}
                                                

// @LINE:7
def signin(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "signin/")
}
                                                

// @LINE:46
def loadAppType(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "loadApptype/")
}
                                                

// @LINE:15
def loadBranchById(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "loadBranchById/" + implicitly[PathBindable[Long]].unbind("id", id) + "/")
}
                                                

// @LINE:55
def searchClass(name:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "searchClass/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)) + "/")
}
                                                

// @LINE:28
def loadDepartmentById(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "loadDepartmentById/" + implicitly[PathBindable[Long]].unbind("id", id) + "/")
}
                                                

// @LINE:56
def updateClass(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "updateClass/" + implicitly[PathBindable[Long]].unbind("id", id) + "/")
}
                                                

// @LINE:87
def testDate(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "testDate/")
}
                                                

// @LINE:77
def delete(cate:String, id:Long, reason:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "delete/" + implicitly[PathBindable[String]].unbind("cate", dynamicString(cate)) + "/" + implicitly[PathBindable[Long]].unbind("id", id) + "/" + implicitly[PathBindable[String]].unbind("reason", dynamicString(reason)) + "/")
}
                                                

// @LINE:14
def loadBranch(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "loadBranch/")
}
                                                

// @LINE:37
def updateSection(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "updateSection/" + implicitly[PathBindable[Long]].unbind("id", id) + "/")
}
                                                

// @LINE:22
def loadFacultyByBranch(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "loadFacultyByBranch/" + implicitly[PathBindable[Long]].unbind("id", id) + "/")
}
                                                

// @LINE:73
def disableStudent(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "disableStudent/" + implicitly[PathBindable[Long]].unbind("id", id) + "/")
}
                                                

// @LINE:41
def loadApplicationById(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "loadApplicationById/" + implicitly[PathBindable[Long]].unbind("id", id) + "/")
}
                                                

// @LINE:48
def searchAppType(name:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "searchApptype/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)) + "/")
}
                                                

// @LINE:51
def registerClass(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "registerClass/")
}
                                                

// @LINE:59
def loadSponsor(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "loadSponsor/")
}
                                                

// @LINE:53
def loadClassesById(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "loadClassesById/" + implicitly[PathBindable[Long]].unbind("id", id) + "/")
}
                                                

// @LINE:36
def searchSection(name:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "searchSection/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)) + "/")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:52
def loadClasses(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "loadClasses/")
}
                                                

// @LINE:47
def loadAppTypeById(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "loadApptypeById/" + implicitly[PathBindable[Long]].unbind("id", id) + "/")
}
                                                

// @LINE:23
def searchFaculty(name:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "searchFaculty/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)) + "/")
}
                                                

// @LINE:17
def updateBranch(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "updateBranch/" + implicitly[PathBindable[Long]].unbind("id", id) + "/")
}
                                                

// @LINE:8
def login(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login/")
}
                                                
    
}
                          
}
                  


// @LINE:97
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:77
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:97
class ReverseAssets {
    

// @LINE:97
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
class ReverseTests {
    

// @LINE:82
def loadCandidates : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tests.loadCandidates",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loadCandidates/"})
      }
   """
)
                        

// @LINE:86
def updateCandidates : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tests.updateCandidates",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updatecandidates/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/"})
      }
   """
)
                        

// @LINE:84
def disableCandidates : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tests.disableCandidates",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "disableCandidates/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/"})
      }
   """
)
                        

// @LINE:81
def registCandidates : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tests.registCandidates",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "registercandidates/"})
      }
   """
)
                        

// @LINE:80
def test : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tests.test",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "test/"})
      }
   """
)
                        

// @LINE:83
def searchCandidates : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tests.searchCandidates",
   """
      function(name) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchCandidates/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name)) + "/"})
      }
   """
)
                        

// @LINE:85
def loadCandidatesById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tests.loadCandidatesById",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loadCandidatesById/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/"})
      }
   """
)
                        
    
}
              

// @LINE:87
// @LINE:77
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:20
def loadFaculty : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.loadFaculty",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loadFaculty/"})
      }
   """
)
                        

// @LINE:58
def registerSponsor : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.registerSponsor",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "registerSponsor/"})
      }
   """
)
                        

// @LINE:11
def viewApplicants : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.viewApplicants",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "applicants/"})
      }
   """
)
                        

// @LINE:35
def loadSectionById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.loadSectionById",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loadSectionById/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/"})
      }
   """
)
                        

// @LINE:72
def searchStudent : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.searchStudent",
   """
      function(name) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchStudent/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name)) + "/"})
      }
   """
)
                        

// @LINE:30
def searchDepartment : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.searchDepartment",
   """
      function(name) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchDepartment/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name)) + "/"})
      }
   """
)
                        

// @LINE:29
def loadDepartmentByFaculty : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.loadDepartmentByFaculty",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loadDepartmentByFaculty/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/"})
      }
   """
)
                        

// @LINE:45
def registerAppType : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.registerAppType",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "registerApptype/"})
      }
   """
)
                        

// @LINE:24
def updateFaculty : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.updateFaculty",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateFaculty/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/"})
      }
   """
)
                        

// @LINE:31
def updateDepartment : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.updateDepartment",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateDepartment/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/"})
      }
   """
)
                        

// @LINE:68
def updateEmployee : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.updateEmployee",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateEmployee/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/"})
      }
   """
)
                        

// @LINE:33
def registerSection : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.registerSection",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "registerSection/"})
      }
   """
)
                        

// @LINE:71
def loadStudent : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.loadStudent",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loadStudent/"})
      }
   """
)
                        

// @LINE:70
def registerStudent : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.registerStudent",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "registerStudent/"})
      }
   """
)
                        

// @LINE:26
def registerDepartment : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.registerDepartment",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "registerDepartment/"})
      }
   """
)
                        

// @LINE:27
def loadDepartment : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.loadDepartment",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loadDepartment/"})
      }
   """
)
                        

// @LINE:13
def registerBranch : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.registerBranch",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "registerBranch/"})
      }
   """
)
                        

// @LINE:39
def registerApplication : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.registerApplication",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "registerApplication/"})
      }
   """
)
                        

// @LINE:60
def loadSponsorById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.loadSponsorById",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loadSponsorById/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/"})
      }
   """
)
                        

// @LINE:74
def loadStudentById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.loadStudentById",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loadStudentById/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/"})
      }
   """
)
                        

// @LINE:65
def loadEmployee : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.loadEmployee",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loadEmployee/"})
      }
   """
)
                        

// @LINE:21
def loadFacultyById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.loadFacultyById",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loadFacultyById/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/"})
      }
   """
)
                        

// @LINE:75
def updateStudent : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.updateStudent",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateStudent/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/"})
      }
   """
)
                        

// @LINE:12
def setting : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.setting",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "setting/"})
      }
   """
)
                        

// @LINE:64
def registerEmployee : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.registerEmployee",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "registerEmployee/"})
      }
   """
)
                        

// @LINE:40
def loadApplication : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.loadApplication",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loadApplication/"})
      }
   """
)
                        

// @LINE:34
def loadSection : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.loadSection",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loadSection/"})
      }
   """
)
                        

// @LINE:43
def updateApplication : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.updateApplication",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateApplication/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/"})
      }
   """
)
                        

// @LINE:66
def loadEmployeeById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.loadEmployeeById",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loadEmployeeById/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/"})
      }
   """
)
                        

// @LINE:10
def student : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.student",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admission/"})
      }
   """
)
                        

// @LINE:54
def loadClassesBySection : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.loadClassesBySection",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loadClassesBySection/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/"})
      }
   """
)
                        

// @LINE:19
def registerFaculty : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.registerFaculty",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "registerFaculty/"})
      }
   """
)
                        

// @LINE:42
def searchApplication : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.searchApplication",
   """
      function(name) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchApplication/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name)) + "/"})
      }
   """
)
                        

// @LINE:49
def updateAppType : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.updateAppType",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateApptype/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/"})
      }
   """
)
                        

// @LINE:62
def updateSponsor : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.updateSponsor",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateSponsor/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/"})
      }
   """
)
                        

// @LINE:16
def searchBranch : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.searchBranch",
   """
      function(name) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchBranch/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name)) + "/"})
      }
   """
)
                        

// @LINE:67
def searchEmployee : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.searchEmployee",
   """
      function(name) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchEmployee/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name)) + "/"})
      }
   """
)
                        

// @LINE:9
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout/"})
      }
   """
)
                        

// @LINE:61
def searchSponsor : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.searchSponsor",
   """
      function(name) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchSponsor/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name)) + "/"})
      }
   """
)
                        

// @LINE:7
def signin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.signin",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signin/"})
      }
   """
)
                        

// @LINE:46
def loadAppType : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.loadAppType",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loadApptype/"})
      }
   """
)
                        

// @LINE:15
def loadBranchById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.loadBranchById",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loadBranchById/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/"})
      }
   """
)
                        

// @LINE:55
def searchClass : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.searchClass",
   """
      function(name) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchClass/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name)) + "/"})
      }
   """
)
                        

// @LINE:28
def loadDepartmentById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.loadDepartmentById",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loadDepartmentById/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/"})
      }
   """
)
                        

// @LINE:56
def updateClass : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.updateClass",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateClass/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/"})
      }
   """
)
                        

// @LINE:87
def testDate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.testDate",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "testDate/"})
      }
   """
)
                        

// @LINE:77
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.delete",
   """
      function(cate,id,reason) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "delete/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("cate", encodeURIComponent(cate)) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("reason", encodeURIComponent(reason)) + "/"})
      }
   """
)
                        

// @LINE:14
def loadBranch : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.loadBranch",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loadBranch/"})
      }
   """
)
                        

// @LINE:37
def updateSection : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.updateSection",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateSection/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/"})
      }
   """
)
                        

// @LINE:22
def loadFacultyByBranch : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.loadFacultyByBranch",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loadFacultyByBranch/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/"})
      }
   """
)
                        

// @LINE:73
def disableStudent : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.disableStudent",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "disableStudent/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/"})
      }
   """
)
                        

// @LINE:41
def loadApplicationById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.loadApplicationById",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loadApplicationById/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/"})
      }
   """
)
                        

// @LINE:48
def searchAppType : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.searchAppType",
   """
      function(name) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchApptype/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name)) + "/"})
      }
   """
)
                        

// @LINE:51
def registerClass : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.registerClass",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "registerClass/"})
      }
   """
)
                        

// @LINE:59
def loadSponsor : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.loadSponsor",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loadSponsor/"})
      }
   """
)
                        

// @LINE:53
def loadClassesById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.loadClassesById",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loadClassesById/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/"})
      }
   """
)
                        

// @LINE:36
def searchSection : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.searchSection",
   """
      function(name) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchSection/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name)) + "/"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:52
def loadClasses : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.loadClasses",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loadClasses/"})
      }
   """
)
                        

// @LINE:47
def loadAppTypeById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.loadAppTypeById",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loadApptypeById/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/"})
      }
   """
)
                        

// @LINE:23
def searchFaculty : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.searchFaculty",
   """
      function(name) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchFaculty/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name)) + "/"})
      }
   """
)
                        

// @LINE:17
def updateBranch : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.updateBranch",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateBranch/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/"})
      }
   """
)
                        

// @LINE:8
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login/"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:97
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:77
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:97
class ReverseAssets {
    

// @LINE:97
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
class ReverseTests {
    

// @LINE:82
def loadCandidates(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tests.loadCandidates(), HandlerDef(this, "controllers.Tests", "loadCandidates", Seq(), "GET", """""", _prefix + """loadCandidates/""")
)
                      

// @LINE:86
def updateCandidates(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tests.updateCandidates(id), HandlerDef(this, "controllers.Tests", "updateCandidates", Seq(classOf[Long]), "POST", """""", _prefix + """updatecandidates/$id<[^/]+>/""")
)
                      

// @LINE:84
def disableCandidates(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tests.disableCandidates(id), HandlerDef(this, "controllers.Tests", "disableCandidates", Seq(classOf[Long]), "GET", """""", _prefix + """disableCandidates/$id<[^/]+>/""")
)
                      

// @LINE:81
def registCandidates(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tests.registCandidates(), HandlerDef(this, "controllers.Tests", "registCandidates", Seq(), "POST", """""", _prefix + """registercandidates/""")
)
                      

// @LINE:80
def test(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tests.test(), HandlerDef(this, "controllers.Tests", "test", Seq(), "GET", """test for learning purpose""", _prefix + """test/""")
)
                      

// @LINE:83
def searchCandidates(name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tests.searchCandidates(name), HandlerDef(this, "controllers.Tests", "searchCandidates", Seq(classOf[String]), "GET", """""", _prefix + """searchCandidates/$name<[^/]+>/""")
)
                      

// @LINE:85
def loadCandidatesById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tests.loadCandidatesById(id), HandlerDef(this, "controllers.Tests", "loadCandidatesById", Seq(classOf[Long]), "GET", """""", _prefix + """loadCandidatesById/$id<[^/]+>/""")
)
                      
    
}
                          

// @LINE:87
// @LINE:77
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:20
def loadFaculty(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.loadFaculty(), HandlerDef(this, "controllers.Application", "loadFaculty", Seq(), "GET", """""", _prefix + """loadFaculty/""")
)
                      

// @LINE:58
def registerSponsor(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.registerSponsor(), HandlerDef(this, "controllers.Application", "registerSponsor", Seq(), "POST", """""", _prefix + """registerSponsor/""")
)
                      

// @LINE:11
def viewApplicants(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.viewApplicants(), HandlerDef(this, "controllers.Application", "viewApplicants", Seq(), "GET", """""", _prefix + """applicants/""")
)
                      

// @LINE:35
def loadSectionById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.loadSectionById(id), HandlerDef(this, "controllers.Application", "loadSectionById", Seq(classOf[Long]), "GET", """""", _prefix + """loadSectionById/$id<[^/]+>/""")
)
                      

// @LINE:72
def searchStudent(name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.searchStudent(name), HandlerDef(this, "controllers.Application", "searchStudent", Seq(classOf[String]), "GET", """""", _prefix + """searchStudent/$name<[^/]+>/""")
)
                      

// @LINE:30
def searchDepartment(name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.searchDepartment(name), HandlerDef(this, "controllers.Application", "searchDepartment", Seq(classOf[String]), "GET", """""", _prefix + """searchDepartment/$name<[^/]+>/""")
)
                      

// @LINE:29
def loadDepartmentByFaculty(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.loadDepartmentByFaculty(id), HandlerDef(this, "controllers.Application", "loadDepartmentByFaculty", Seq(classOf[Long]), "GET", """""", _prefix + """loadDepartmentByFaculty/$id<[^/]+>/""")
)
                      

// @LINE:45
def registerAppType(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.registerAppType(), HandlerDef(this, "controllers.Application", "registerAppType", Seq(), "POST", """""", _prefix + """registerApptype/""")
)
                      

// @LINE:24
def updateFaculty(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.updateFaculty(id), HandlerDef(this, "controllers.Application", "updateFaculty", Seq(classOf[Long]), "POST", """""", _prefix + """updateFaculty/$id<[^/]+>/""")
)
                      

// @LINE:31
def updateDepartment(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.updateDepartment(id), HandlerDef(this, "controllers.Application", "updateDepartment", Seq(classOf[Long]), "POST", """""", _prefix + """updateDepartment/$id<[^/]+>/""")
)
                      

// @LINE:68
def updateEmployee(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.updateEmployee(id), HandlerDef(this, "controllers.Application", "updateEmployee", Seq(classOf[Long]), "POST", """""", _prefix + """updateEmployee/$id<[^/]+>/""")
)
                      

// @LINE:33
def registerSection(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.registerSection(), HandlerDef(this, "controllers.Application", "registerSection", Seq(), "POST", """""", _prefix + """registerSection/""")
)
                      

// @LINE:71
def loadStudent(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.loadStudent(), HandlerDef(this, "controllers.Application", "loadStudent", Seq(), "GET", """""", _prefix + """loadStudent/""")
)
                      

// @LINE:70
def registerStudent(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.registerStudent(), HandlerDef(this, "controllers.Application", "registerStudent", Seq(), "POST", """""", _prefix + """registerStudent/""")
)
                      

// @LINE:26
def registerDepartment(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.registerDepartment(), HandlerDef(this, "controllers.Application", "registerDepartment", Seq(), "POST", """""", _prefix + """registerDepartment/""")
)
                      

// @LINE:27
def loadDepartment(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.loadDepartment(), HandlerDef(this, "controllers.Application", "loadDepartment", Seq(), "GET", """""", _prefix + """loadDepartment/""")
)
                      

// @LINE:13
def registerBranch(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.registerBranch(), HandlerDef(this, "controllers.Application", "registerBranch", Seq(), "POST", """""", _prefix + """registerBranch/""")
)
                      

// @LINE:39
def registerApplication(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.registerApplication(), HandlerDef(this, "controllers.Application", "registerApplication", Seq(), "POST", """""", _prefix + """registerApplication/""")
)
                      

// @LINE:60
def loadSponsorById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.loadSponsorById(id), HandlerDef(this, "controllers.Application", "loadSponsorById", Seq(classOf[Long]), "GET", """""", _prefix + """loadSponsorById/$id<[^/]+>/""")
)
                      

// @LINE:74
def loadStudentById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.loadStudentById(id), HandlerDef(this, "controllers.Application", "loadStudentById", Seq(classOf[Long]), "GET", """""", _prefix + """loadStudentById/$id<[^/]+>/""")
)
                      

// @LINE:65
def loadEmployee(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.loadEmployee(), HandlerDef(this, "controllers.Application", "loadEmployee", Seq(), "GET", """""", _prefix + """loadEmployee/""")
)
                      

// @LINE:21
def loadFacultyById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.loadFacultyById(id), HandlerDef(this, "controllers.Application", "loadFacultyById", Seq(classOf[Long]), "GET", """""", _prefix + """loadFacultyById/$id<[^/]+>/""")
)
                      

// @LINE:75
def updateStudent(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.updateStudent(id), HandlerDef(this, "controllers.Application", "updateStudent", Seq(classOf[Long]), "POST", """""", _prefix + """updateStudent/$id<[^/]+>/""")
)
                      

// @LINE:12
def setting(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.setting(), HandlerDef(this, "controllers.Application", "setting", Seq(), "GET", """""", _prefix + """setting/""")
)
                      

// @LINE:64
def registerEmployee(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.registerEmployee(), HandlerDef(this, "controllers.Application", "registerEmployee", Seq(), "POST", """""", _prefix + """registerEmployee/""")
)
                      

// @LINE:40
def loadApplication(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.loadApplication(), HandlerDef(this, "controllers.Application", "loadApplication", Seq(), "GET", """""", _prefix + """loadApplication/""")
)
                      

// @LINE:34
def loadSection(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.loadSection(), HandlerDef(this, "controllers.Application", "loadSection", Seq(), "GET", """""", _prefix + """loadSection/""")
)
                      

// @LINE:43
def updateApplication(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.updateApplication(id), HandlerDef(this, "controllers.Application", "updateApplication", Seq(classOf[Long]), "POST", """""", _prefix + """updateApplication/$id<[^/]+>/""")
)
                      

// @LINE:66
def loadEmployeeById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.loadEmployeeById(id), HandlerDef(this, "controllers.Application", "loadEmployeeById", Seq(classOf[Long]), "GET", """""", _prefix + """loadEmployeeById/$id<[^/]+>/""")
)
                      

// @LINE:10
def student(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.student(), HandlerDef(this, "controllers.Application", "student", Seq(), "GET", """""", _prefix + """admission/""")
)
                      

// @LINE:54
def loadClassesBySection(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.loadClassesBySection(id), HandlerDef(this, "controllers.Application", "loadClassesBySection", Seq(classOf[Long]), "GET", """""", _prefix + """loadClassesBySection/$id<[^/]+>/""")
)
                      

// @LINE:19
def registerFaculty(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.registerFaculty(), HandlerDef(this, "controllers.Application", "registerFaculty", Seq(), "POST", """""", _prefix + """registerFaculty/""")
)
                      

// @LINE:42
def searchApplication(name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.searchApplication(name), HandlerDef(this, "controllers.Application", "searchApplication", Seq(classOf[String]), "GET", """""", _prefix + """searchApplication/$name<[^/]+>/""")
)
                      

// @LINE:49
def updateAppType(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.updateAppType(id), HandlerDef(this, "controllers.Application", "updateAppType", Seq(classOf[Long]), "POST", """""", _prefix + """updateApptype/$id<[^/]+>/""")
)
                      

// @LINE:62
def updateSponsor(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.updateSponsor(id), HandlerDef(this, "controllers.Application", "updateSponsor", Seq(classOf[Long]), "POST", """""", _prefix + """updateSponsor/$id<[^/]+>/""")
)
                      

// @LINE:16
def searchBranch(name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.searchBranch(name), HandlerDef(this, "controllers.Application", "searchBranch", Seq(classOf[String]), "GET", """""", _prefix + """searchBranch/$name<[^/]+>/""")
)
                      

// @LINE:67
def searchEmployee(name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.searchEmployee(name), HandlerDef(this, "controllers.Application", "searchEmployee", Seq(classOf[String]), "GET", """""", _prefix + """searchEmployee/$name<[^/]+>/""")
)
                      

// @LINE:9
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout/""")
)
                      

// @LINE:61
def searchSponsor(name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.searchSponsor(name), HandlerDef(this, "controllers.Application", "searchSponsor", Seq(classOf[String]), "GET", """""", _prefix + """searchSponsor/$name<[^/]+>/""")
)
                      

// @LINE:7
def signin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.signin(), HandlerDef(this, "controllers.Application", "signin", Seq(), "POST", """""", _prefix + """signin/""")
)
                      

// @LINE:46
def loadAppType(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.loadAppType(), HandlerDef(this, "controllers.Application", "loadAppType", Seq(), "GET", """""", _prefix + """loadApptype/""")
)
                      

// @LINE:15
def loadBranchById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.loadBranchById(id), HandlerDef(this, "controllers.Application", "loadBranchById", Seq(classOf[Long]), "GET", """""", _prefix + """loadBranchById/$id<[^/]+>/""")
)
                      

// @LINE:55
def searchClass(name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.searchClass(name), HandlerDef(this, "controllers.Application", "searchClass", Seq(classOf[String]), "GET", """""", _prefix + """searchClass/$name<[^/]+>/""")
)
                      

// @LINE:28
def loadDepartmentById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.loadDepartmentById(id), HandlerDef(this, "controllers.Application", "loadDepartmentById", Seq(classOf[Long]), "GET", """""", _prefix + """loadDepartmentById/$id<[^/]+>/""")
)
                      

// @LINE:56
def updateClass(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.updateClass(id), HandlerDef(this, "controllers.Application", "updateClass", Seq(classOf[Long]), "POST", """""", _prefix + """updateClass/$id<[^/]+>/""")
)
                      

// @LINE:87
def testDate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.testDate(), HandlerDef(this, "controllers.Application", "testDate", Seq(), "GET", """""", _prefix + """testDate/""")
)
                      

// @LINE:77
def delete(cate:String, id:Long, reason:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.delete(cate, id, reason), HandlerDef(this, "controllers.Application", "delete", Seq(classOf[String], classOf[Long], classOf[String]), "POST", """""", _prefix + """delete/$cate<[^/]+>/$id<[^/]+>/$reason<[^/]+>/""")
)
                      

// @LINE:14
def loadBranch(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.loadBranch(), HandlerDef(this, "controllers.Application", "loadBranch", Seq(), "GET", """""", _prefix + """loadBranch/""")
)
                      

// @LINE:37
def updateSection(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.updateSection(id), HandlerDef(this, "controllers.Application", "updateSection", Seq(classOf[Long]), "POST", """""", _prefix + """updateSection/$id<[^/]+>/""")
)
                      

// @LINE:22
def loadFacultyByBranch(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.loadFacultyByBranch(id), HandlerDef(this, "controllers.Application", "loadFacultyByBranch", Seq(classOf[Long]), "GET", """""", _prefix + """loadFacultyByBranch/$id<[^/]+>/""")
)
                      

// @LINE:73
def disableStudent(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.disableStudent(id), HandlerDef(this, "controllers.Application", "disableStudent", Seq(classOf[Long]), "GET", """""", _prefix + """disableStudent/$id<[^/]+>/""")
)
                      

// @LINE:41
def loadApplicationById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.loadApplicationById(id), HandlerDef(this, "controllers.Application", "loadApplicationById", Seq(classOf[Long]), "GET", """""", _prefix + """loadApplicationById/$id<[^/]+>/""")
)
                      

// @LINE:48
def searchAppType(name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.searchAppType(name), HandlerDef(this, "controllers.Application", "searchAppType", Seq(classOf[String]), "GET", """""", _prefix + """searchApptype/$name<[^/]+>/""")
)
                      

// @LINE:51
def registerClass(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.registerClass(), HandlerDef(this, "controllers.Application", "registerClass", Seq(), "POST", """""", _prefix + """registerClass/""")
)
                      

// @LINE:59
def loadSponsor(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.loadSponsor(), HandlerDef(this, "controllers.Application", "loadSponsor", Seq(), "GET", """""", _prefix + """loadSponsor/""")
)
                      

// @LINE:53
def loadClassesById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.loadClassesById(id), HandlerDef(this, "controllers.Application", "loadClassesById", Seq(classOf[Long]), "GET", """""", _prefix + """loadClassesById/$id<[^/]+>/""")
)
                      

// @LINE:36
def searchSection(name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.searchSection(name), HandlerDef(this, "controllers.Application", "searchSection", Seq(classOf[String]), "GET", """""", _prefix + """searchSection/$name<[^/]+>/""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:52
def loadClasses(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.loadClasses(), HandlerDef(this, "controllers.Application", "loadClasses", Seq(), "GET", """""", _prefix + """loadClasses/""")
)
                      

// @LINE:47
def loadAppTypeById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.loadAppTypeById(id), HandlerDef(this, "controllers.Application", "loadAppTypeById", Seq(classOf[Long]), "GET", """""", _prefix + """loadApptypeById/$id<[^/]+>/""")
)
                      

// @LINE:23
def searchFaculty(name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.searchFaculty(name), HandlerDef(this, "controllers.Application", "searchFaculty", Seq(classOf[String]), "GET", """""", _prefix + """searchFaculty/$name<[^/]+>/""")
)
                      

// @LINE:17
def updateBranch(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.updateBranch(id), HandlerDef(this, "controllers.Application", "updateBranch", Seq(classOf[Long]), "POST", """""", _prefix + """updateBranch/$id<[^/]+>/""")
)
                      

// @LINE:8
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "POST", """""", _prefix + """login/""")
)
                      
    
}
                          
}
        
    