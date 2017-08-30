
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object user extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/dashboardHome("User page")/*1.28*/ {_display_(Seq[Any](format.raw/*1.30*/("""
    <div ng-controller="MainController">
        """),_display_(Seq[Any](/*3.10*/inHeader())),format.raw/*3.20*/("""
        <div class="col-lg-2">
            <div style="height:36px">
            </div>
            """),_display_(Seq[Any](/*7.14*/sideBar("users"))),format.raw/*7.30*/("""
        </div>
        <div class="col-lg-8" style="margin-left: 1% ; width: 82%;">
            <div style="min-height:300px">
                <br>
                <div>
                </div>
                <div class="">
                    <ul class="nav nav-tabs">
                        <li role="presentation"><a href="" class="btn" ng-click="new = !new;getphoto='';btnSubmit=false" style="background-color: #6f000d;color:white">
                            <i ng-if="!new">Add a new user</i><i ng-if="new">View list user</i></a></li>
                        <span class="pull-right"> <h1 style="padding:0px ; margin:0px;color:#6f000d">
                            User management <i class="fa fa-user"></i></h1></span>
                    </ul>
                </div>
                <div class="row">
                    <form ng-submit="saveUser()" name="myForm" novalidate >
                        <div ng-show="new" class="panel panel-default" style="border-top-style:none">
                            <div class="panel-body">
                                <div class="panel panel-default" style="background:whitesmoke">
                                    <div class="panel-heading">
                                        <h2 style="padding:0px ; margin:0px;color:#6f000d">
                                            New user registration form <li class="glyphicon glyphicon-pencil"></li></h2>
                                    </div>
                                    <div class="panel-body">

                                        <div class="col-md-6">
                                            <label>
                                                First name
                                            </label>
                                            <input required ng-model="newUserInfo.firstName" name="firstName" placeholder="Enter user first name" class="form-control">
                                            <p style="color: maroon" ng-show="myForm.firstName.$invalid && !myForm.firstName.$pristine" class="help-block">
                                                This field is required.</p>
                                            <label>
                                                Last name
                                            </label>
                                            <input required ng-model="newUserInfo.lastName" name="lastName" placeholder="Enter user last name" class="form-control">
                                            <p style="color: maroon" ng-show="myForm.lastName.$invalid && !myForm.lastName.$pristine" class="help-block">
                                                Field is required.</p>
                                            <label>
                                                User privilege
                                            </label>
                                            <select required ng-model="newUserInfo.role" name="role" class="form-control" >
                                                <option value="admin">Admin</option>
                                                <option value="admin">HR</option>
                                                <option value="admin">Burs</option>
                                                <option value="admin">User</option>
                                                <option value="admin">User</option>
                                            </select>
                                            <p style="color: maroon" ng-show="myForm.role.$invalid && !myForm.role.$pristine" class="help-block">
                                                Field is required.</p>
                                            <label>
                                                Phone number
                                            </label>
                                            <input required ng-model="newUserInfo.phone" name="phone" placeholder="Enter phone number" class="form-control">
                                            <p style="color: maroon" ng-show="myForm.phone.$invalid && !myForm.phone.$pristine" class="help-block">
                                                Field is required.</p>
                                        </div>
                                        <div class="col-md-6">
                                            <label>
                                                Email address
                                            </label>
                                            <input type="email" required ng-model="newUserInfo.email" name="email" placeholder="Enter email" class="form-control">
                                            <p style="color: maroon" ng-show="myForm.email.$invalid && !myForm.email.$pristine" class="help-block">
                                                Invalid email.</p>
                                            <label>
                                                User name
                                            </label>
                                            <input required ng-model="newUserInfo.username" placeholder="Username" name="username" ng-change="checkUsername(newUserInfo.username)" class="form-control">
                                            <p style="color: maroon" ng-show="myForm.username.$invalid && !myForm.username.$pristine" class="help-block">
                                                Fild is required.</p>
                                            <p style="color: maroon" ng-show="errorMsg !=''" class="help-block">
                                                """),format.raw/*79.49*/("""{"""),format.raw/*79.50*/("""{"""),format.raw/*79.51*/("""errorMsg"""),format.raw/*79.59*/("""}"""),format.raw/*79.60*/("""}"""),format.raw/*79.61*/("""</p>
                                            <label>
                                                Password
                                            </label>
                                            <input type="password" required ng-model="newUserInfo.password" name="password" placeholder="Enter password" class="form-control">
                                            <p style="color: maroon" ng-show="myForm.password.$invalid && !myForm.password.$pristine" class="help-block">
                                                Field is required.</p>
                                            <label>
                                                Confirm password
                                            </label>
                                            <input type="password" required ng-model="newUserInfo.cofPassword" placeholder="Confirm password" class="form-control">
                                            <p ng-if="confirmMsg !=''" style="color: maroon">"""),format.raw/*90.94*/("""{"""),format.raw/*90.95*/("""{"""),format.raw/*90.96*/("""confirmMsg"""),format.raw/*90.106*/("""}"""),format.raw/*90.107*/("""}"""),format.raw/*90.108*/("""</p>
                                            <br>
                                            <div style="position:relative ;" class="pull-left">
                                                <a href='javascript:;'>
                                                    <li class="fa fa-upload"></li> Photo upload ....
                                                    <input type="file" ng-model="newUserInfo.photo" onchange="angular.element(this).scope().uploadPhoto(this.files)" name="photo" style='position:absolute ; z-index:2 ; top:0 ; left:0 ; filter: alpha(opacity=0) ; -ms-filter:"progid:DXImageTransform.Microsoft.Alpha(Opacity=0)" ; opacity:0 ; background-color:transparent ; color:transparent ;' name="file_source" size="40" >
                                                </a>
                                                <span ng-show="btnSubmit" ><img style="height: 50px ; width: 50px" src=""""),_display_(Seq[Any](/*97.122*/routes/*97.128*/.Assets.at("images/{{getphoto}}"))),format.raw/*97.161*/(""""></span>
                                                <div ng-if="getphoto=='Error'" class="msgcv.class">"""),format.raw/*98.100*/("""{"""),format.raw/*98.101*/("""{"""),format.raw/*98.102*/("""msgcv.message"""),format.raw/*98.115*/("""}"""),format.raw/*98.116*/("""}"""),format.raw/*98.117*/("""</div>

                                            </div>
                                            <button style="margin-left: 1% ;" type="submit" ng-disabled="myForm.$invalid||disable" class="btn btn-success pull-right">
                                                Save</button> <button ng-click="new = false" class="btn btn-default pull-right">
                                            Cancel</button>

                                        </div>
                                    </div>
                                </div>
                            </div>

                        </div>
                    </form>
                </div>
                <br>
                <form class="" role="search" style = "width:100% ;">
                    <div>
                        <div class="input-group">
                            <span class="input-group-addon" style="font-weight:bold ; font-size:20px ; padding:0px"><img src=""""),_display_(Seq[Any](/*117.128*/routes/*117.134*/.Assets.at("images/logo.jpg"))),format.raw/*117.163*/("""" style="height:45px" ></span><input ng-model="search" type="text" class="form-control" placeholder="Search " style = "height:50px">
                            <span class = "input-group-btn">
                                <button type="submit" ng-click="startsearch = true" class="btn btn-primary" style = "font-weight:bold ; font-size:20px ; height:50px;background-color: #6f000d">
                                    Search</button>
                            </span>
                        </div>

                    </div>
                </form>Select records per page :
                <select ng-model="number" style="width: 20% ; margin: 0.5% ;">
                    <option value="5">5</option>
                    <option value="10">10</option>
                    <option value="50">50</option>
                    <option value="1000000">All</option>
                </select>
                <br>
                <div style="min-height:400px ;" class="">
                    <table ng-init="loadUser();number=5" class="table table-striped" style="">
                        <tr>
                            <th style="background-color: #6f000d;color: white">Edit</th><th  style="background-color: #6f000d;color: white">photo</th>
                            <th  style="background-color: #6f000d;color: white">First name</th><th  style="background-color: #6f000d;color: white">Last name</th><th  style="background-color: #6f000d;color: white">Role</th><th  style="background-color: #6f000d;color: white">
                            Phone</th><th  style="background-color: #6f000d;color: white">email</th>
                            <th  style="background-color: #6f000d;color: white">Date</th><th  style="background-color: #6f000d;color: white">Remove</th>
                        </tr>
                        <tr dir-paginate="a in users |filter:search |itemsPerPage:number">
                            <td><button ng-click="a.edit = true" ng-hide="a.edit" class="btn btn-default"><span style="color: #3596d4 ;" class="glyphicon glyphicon-pencil"></span></button>
                                <div ng-show="a.edit" class="panel panel-default" style="z-index:1000 ; position:absolute ; width:90% ; ; background:whitesmoke">
                                    <div>
                                        <a href="" class="pull-right" ng-click="a.edit = false" style="color:#3796d3 ;"><li class="fa fa-arrow-up"></li> </a>
                                    </div>
                                    <span style="color: #3696d4 ;"> <h3>&nbsp;&nbsp;&nbsp;"""),format.raw/*147.91*/("""{"""),format.raw/*147.92*/("""{"""),format.raw/*147.93*/("""a.firstName"""),format.raw/*147.104*/("""}"""),format.raw/*147.105*/("""}"""),format.raw/*147.106*/(""" """),format.raw/*147.107*/("""{"""),format.raw/*147.108*/("""{"""),format.raw/*147.109*/("""a.lastName"""),format.raw/*147.119*/("""}"""),format.raw/*147.120*/("""}"""),format.raw/*147.121*/(""" modification form <li class="glyphicon glyphicon-pencil"></li> </h3></span>
                                    <div class="row" style="margin-top: -5% ;">
                                        <div class="panel-body">
                                            <hr>
                                            <div class="col-md-6">
                                                <label>
                                                    First name
                                                </label>
                                                <input class="form-control" ng-model="a.firstName">
                                                <label>
                                                    Last name
                                                </label>
                                                <textarea class="form-control" ng-model="a.lastName"></textarea>
                                                <label>
                                                    User privilege
                                                </label>
                                                <select class="form-control" ng-model="a.role">
                                                    <option ng-repeat=" m in users" value=""""),format.raw/*164.92*/("""{"""),format.raw/*164.93*/("""{"""),format.raw/*164.94*/("""m.role"""),format.raw/*164.100*/("""}"""),format.raw/*164.101*/("""}"""),format.raw/*164.102*/("""">"""),format.raw/*164.104*/("""{"""),format.raw/*164.105*/("""{"""),format.raw/*164.106*/("""m.role"""),format.raw/*164.112*/("""}"""),format.raw/*164.113*/("""}"""),format.raw/*164.114*/("""</option>
                                                </select>
                                                <label>
                                                    Phone number
                                                </label>
                                                <input class="form-control" ng-model="a.phone">
                                            </div>
                                            <div class="col-md-6">
                                                <label>
                                                    Email address
                                                </label>
                                                <input class="form-control" ng-model="a.email">
                                                <label>
                                                    Username
                                                </label>
                                                <input class="form-control" ng-model="a.username">
                                                <label>
                                                    Password
                                                </label>
                                                <input class="form-control" ng-model="a.password">
                                                <label>
                                                    Confirm password
                                                </label>
                                                <input class="form-control" ng-model="a.password">
                                                <br />
                                                <button ng-click="updateUser(a)" class="btn btn-success pull-right" style="margin-left: 1% ;">
                                                    Update """),format.raw/*190.60*/("""{"""),format.raw/*190.61*/("""{"""),format.raw/*190.62*/("""a.username"""),format.raw/*190.72*/("""}"""),format.raw/*190.73*/("""}"""),format.raw/*190.74*/("""</button> <button ng-click="a.edit = false" class="btn btn-default pull-right">
                                                Cancel</button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                    <!-- Modal -->
                                <div id="myModal"""),format.raw/*197.49*/("""{"""),format.raw/*197.50*/("""{"""),format.raw/*197.51*/("""a.id"""),format.raw/*197.55*/("""}"""),format.raw/*197.56*/("""}"""),format.raw/*197.57*/("""" class="modal fade" role="dialog">
                                    <div class="modal-dialog">
                                            <!-- Modal content-->
                                        <div class="modal-content">
                                            <form ng-submit="disableUser(a)" >
                                                <div class="modal-header">
                                                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                                                    <h4 class="modal-title">
                                                        Do you want to delete """),format.raw/*205.79*/("""{"""),format.raw/*205.80*/("""{"""),format.raw/*205.81*/("""a.firstName"""),format.raw/*205.92*/("""}"""),format.raw/*205.93*/("""}"""),format.raw/*205.94*/(""" """),format.raw/*205.95*/("""{"""),format.raw/*205.96*/("""{"""),format.raw/*205.97*/("""a.lastName"""),format.raw/*205.107*/("""}"""),format.raw/*205.108*/("""}"""),format.raw/*205.109*/(""" ?</h4>
                                                </div>
                                                <div class="modal-body">

                                                    <label>Delete reason</label>
                                                    <textarea class="form-control" ng-model="a.deleteReason" required></textarea>

                                                </div>
                                                <div class="modal-footer">
                                                    <button type="submit" class="btn btn-success" >
                                                        Delete</button><button type="button" class="btn btn-default" data-dismiss="modal">
                                                    Close</button>
                                                </div>
                                            </form>
                                        </div>

                                    </div>
                                </div>
                                    <!-- Modal -->
                                <div id="myModalEdit"""),format.raw/*224.53*/("""{"""),format.raw/*224.54*/("""{"""),format.raw/*224.55*/("""a.id"""),format.raw/*224.59*/("""}"""),format.raw/*224.60*/("""}"""),format.raw/*224.61*/("""" class="modal fade" role="dialog">
                                    <div class="modal-dialog">
                                            <!-- Modal content-->
                                        <div class="modal-content">
                                            <form ng-submit="updateUserImage(a)" method="post" >
                                                <div class="modal-header">
                                                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                                                    <h4 class="modal-title">
                                                        <span style="color: white ;">
                                                            Change photo for """),format.raw/*233.78*/("""{"""),format.raw/*233.79*/("""{"""),format.raw/*233.80*/("""a.firstName"""),format.raw/*233.91*/("""}"""),format.raw/*233.92*/("""}"""),format.raw/*233.93*/(""" """),format.raw/*233.94*/("""{"""),format.raw/*233.95*/("""{"""),format.raw/*233.96*/("""a.lastName"""),format.raw/*233.106*/("""}"""),format.raw/*233.107*/("""}"""),format.raw/*233.108*/(""" ?</span></h4>
                                                </div>
                                                <div class="modal-body">
                                                    <div style="position:relative ;">
                                                        <a class='btn btn-primary' href='javascript:;'>
                                                            Photo upload ....
                                                            <input type="file" ng-model="photo" onchange="angular.element(this).scope().uploadPhoto(this.files)" name="photo" style='position:absolute ; z-index:2 ; top:0 ; left:0 ; filter: alpha(opacity=0) ; -ms-filter:"progid:DXImageTransform.Microsoft.Alpha(Opacity=0)" ; opacity:0 ; background-color:transparent ; color:transparent ;' name="file_source" size="40" >
                                                        </a>
                                                            &nbsp;
                                                        <img ng-show="btnSubmit" src=""""),_display_(Seq[Any](/*242.88*/routes/*242.94*/.Assets.at("images/{{getphoto}}"))),format.raw/*242.127*/("""" style="width: 40px ; height: 40px ;" class="img-responsive img-thumbnail">
                                                        <div ng-if="getphoto=='Error'" class="msgcv.class">
                                                            """),format.raw/*244.61*/("""{"""),format.raw/*244.62*/("""{"""),format.raw/*244.63*/("""msgcv.message"""),format.raw/*244.76*/("""}"""),format.raw/*244.77*/("""}"""),format.raw/*244.78*/("""</div>
                                                    </div>
                                                </div>
                                                <div class="modal-footer">
                                                    <button type="submit" class="btn btn-success" >
                                                        Change picture</button><button type="button" class="btn btn-default" data-dismiss="modal">
                                                    Close</button>
                                                </div>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                                    <!-- Modal -->
                                <div id="myModalEdit"""),format.raw/*257.53*/("""{"""),format.raw/*257.54*/("""{"""),format.raw/*257.55*/("""a.id"""),format.raw/*257.59*/("""}"""),format.raw/*257.60*/("""}"""),format.raw/*257.61*/("""" class="modal fade" role="dialog">
                                    <div class="modal-dialog">
                                            <!-- Modal content-->
                                        <div class="modal-content">
                                            <form ng-submit="updateUserImage(a)" method="post" >
                                                <div class="modal-header">
                                                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                                                    <h4 class="modal-title">
                                                        <span style="color: white ;">
                                                            Change photo for """),format.raw/*266.78*/("""{"""),format.raw/*266.79*/("""{"""),format.raw/*266.80*/("""a.firstName"""),format.raw/*266.91*/("""}"""),format.raw/*266.92*/("""}"""),format.raw/*266.93*/(""" """),format.raw/*266.94*/("""{"""),format.raw/*266.95*/("""{"""),format.raw/*266.96*/("""a.lastName"""),format.raw/*266.106*/("""}"""),format.raw/*266.107*/("""}"""),format.raw/*266.108*/(""" ?</span></h4>
                                                </div>
                                                <div class="modal-body">
                                                    <div style="position:relative ;">
                                                        <a class='btn btn-primary' href='javascript:;'>
                                                            Photo upload ....
                                                            <input type="file" ng-model="photo" onchange="angular.element(this).scope().uploadPhoto(this.files)" name="photo" style='position:absolute ; z-index:2 ; top:0 ; left:0 ; filter: alpha(opacity=0) ; -ms-filter:"progid:DXImageTransform.Microsoft.Alpha(Opacity=0)" ; opacity:0 ; background-color:transparent ; color:transparent ;' name="file_source" size="40" >
                                                        </a>
                                                            &nbsp;
                                                        <img ng-show="btnSubmit" src=""""),_display_(Seq[Any](/*275.88*/routes/*275.94*/.Assets.at("images/{{getphoto}}"))),format.raw/*275.127*/("""" style="width: 40px ; height: 40px ;" class="img-responsive img-thumbnail">
                                                        <div ng-if="getphoto=='Error'" class="msgcv.class">
                                                            """),format.raw/*277.61*/("""{"""),format.raw/*277.62*/("""{"""),format.raw/*277.63*/("""msgcv.message"""),format.raw/*277.76*/("""}"""),format.raw/*277.77*/("""}"""),format.raw/*277.78*/("""</div>
                                                    </div>
                                                </div>
                                                <div class="modal-footer">
                                                    <button type="submit" class="btn btn-success" >
                                                        Change picture</button><button type="button" class="btn btn-default" data-dismiss="modal">
                                                    Close</button>
                                                </div>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </td><td ><a href="#" data-toggle="modal" data-target="#myModalEdit"""),format.raw/*289.96*/("""{"""),format.raw/*289.97*/("""{"""),format.raw/*289.98*/("""a.id"""),format.raw/*289.102*/("""}"""),format.raw/*289.103*/("""}"""),format.raw/*289.104*/("""" ><img ng-if="a.photo ==''" src=""""),_display_(Seq[Any](/*289.139*/routes/*289.145*/.Assets.at("images/avatar.png"))),format.raw/*289.176*/("""" style="width: 40px;height: 40px;" class="img-responsive img-thumbnail"><img ng-if="a.photo !=''" src=""""),_display_(Seq[Any](/*289.281*/routes/*289.287*/.Assets.at("images/{{a.photo}}"))),format.raw/*289.319*/("""" style="width: 40px;height: 40px;" class="img-responsive img-thumbnail"></a></td><td>
                            """),format.raw/*290.29*/("""{"""),format.raw/*290.30*/("""{"""),format.raw/*290.31*/("""a.firstName"""),format.raw/*290.42*/("""}"""),format.raw/*290.43*/("""}"""),format.raw/*290.44*/("""</td><td>"""),format.raw/*290.53*/("""{"""),format.raw/*290.54*/("""{"""),format.raw/*290.55*/("""a.lastName"""),format.raw/*290.65*/("""}"""),format.raw/*290.66*/("""}"""),format.raw/*290.67*/("""</td><td >"""),format.raw/*290.77*/("""{"""),format.raw/*290.78*/("""{"""),format.raw/*290.79*/("""a.role"""),format.raw/*290.85*/("""}"""),format.raw/*290.86*/("""}"""),format.raw/*290.87*/("""</td><td>
                            """),format.raw/*291.29*/("""{"""),format.raw/*291.30*/("""{"""),format.raw/*291.31*/("""a.phone"""),format.raw/*291.38*/("""}"""),format.raw/*291.39*/("""}"""),format.raw/*291.40*/("""</td><td >
                            """),format.raw/*292.29*/("""{"""),format.raw/*292.30*/("""{"""),format.raw/*292.31*/("""a.email"""),format.raw/*292.38*/("""}"""),format.raw/*292.39*/("""}"""),format.raw/*292.40*/("""</td><td >
                            """),format.raw/*293.29*/("""{"""),format.raw/*293.30*/("""{"""),format.raw/*293.31*/("""a.doneAt|date"""),format.raw/*293.44*/("""}"""),format.raw/*293.45*/("""}"""),format.raw/*293.46*/("""</td><td><button type="button" data-toggle="modal" data-target="#myModal"""),format.raw/*293.118*/("""{"""),format.raw/*293.119*/("""{"""),format.raw/*293.120*/("""a.id"""),format.raw/*293.124*/("""}"""),format.raw/*293.125*/("""}"""),format.raw/*293.126*/("""" class="btn btn-default pull-right" ng-if="a.active =='1'"><span style="color: red ;" class="glyphicon glyphicon-remove"></span></button></td>
                        </tr>

                    </table>
                    <div style="margin-top: -3% ;" class="pull-right">
                        <dir-pagination-controls boundary-links="true" on-page-change="pageChangeHandler(newPageNumber)" template-url="/assets/partials/tables/dirPagination.tpl.html"></dir-pagination-controls>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-lg-2"></div>
    </div>
    """),_display_(Seq[Any](/*305.6*/footer())),format.raw/*305.14*/("""
""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Aug 30 18:58:34 EET 2017
                    SOURCE: F:/play/ums/app/views/user.scala.html
                    HASH: 5c99a09164ad7ab99c750e37a3b075e5a153fca7
                    MATRIX: 863->1|897->27|936->29|1024->82|1055->92|1196->198|1233->214|6962->5915|6991->5916|7020->5917|7056->5925|7085->5926|7114->5927|8147->6932|8176->6933|8205->6934|8244->6944|8274->6945|8304->6946|9267->7872|9283->7878|9339->7911|9478->8021|9508->8022|9538->8023|9580->8036|9610->8037|9640->8038|10653->9013|10670->9019|10723->9048|13366->11662|13396->11663|13426->11664|13467->11675|13498->11676|13529->11677|13560->11678|13591->11679|13622->11680|13662->11690|13693->11691|13724->11692|15039->12978|15069->12979|15099->12980|15135->12986|15166->12987|15197->12988|15229->12990|15260->12991|15291->12992|15327->12998|15358->12999|15389->13000|17263->14845|17293->14846|17323->14847|17362->14857|17392->14858|17422->14859|17881->15289|17911->15290|17941->15291|17974->15295|18004->15296|18034->15297|18739->15973|18769->15974|18799->15975|18839->15986|18869->15987|18899->15988|18929->15989|18959->15990|18989->15991|19029->16001|19060->16002|19091->16003|20264->17147|20294->17148|20324->17149|20357->17153|20387->17154|20417->17155|21226->17935|21256->17936|21286->17937|21326->17948|21356->17949|21386->17950|21416->17951|21446->17952|21476->17953|21516->17963|21547->17964|21578->17965|22668->19018|22684->19024|22741->19057|23017->19304|23047->19305|23077->19306|23119->19319|23149->19320|23179->19321|24070->20183|24100->20184|24130->20185|24163->20189|24193->20190|24223->20191|25032->20971|25062->20972|25092->20973|25132->20984|25162->20985|25192->20986|25222->20987|25252->20988|25282->20989|25322->20999|25353->21000|25384->21001|26474->22054|26490->22060|26547->22093|26823->22340|26853->22341|26883->22342|26925->22355|26955->22356|26985->22357|27867->23210|27897->23211|27927->23212|27961->23216|27992->23217|28023->23218|28096->23253|28113->23259|28168->23290|28311->23395|28328->23401|28384->23433|28529->23549|28559->23550|28589->23551|28629->23562|28659->23563|28689->23564|28727->23573|28757->23574|28787->23575|28826->23585|28856->23586|28886->23587|28925->23597|28955->23598|28985->23599|29020->23605|29050->23606|29080->23607|29148->23646|29178->23647|29208->23648|29244->23655|29274->23656|29304->23657|29373->23697|29403->23698|29433->23699|29469->23706|29499->23707|29529->23708|29598->23748|29628->23749|29658->23750|29700->23763|29730->23764|29760->23765|29862->23837|29893->23838|29924->23839|29958->23843|29989->23844|30020->23845|30690->24479|30721->24487
                    LINES: 29->1|29->1|29->1|31->3|31->3|35->7|35->7|107->79|107->79|107->79|107->79|107->79|107->79|118->90|118->90|118->90|118->90|118->90|118->90|125->97|125->97|125->97|126->98|126->98|126->98|126->98|126->98|126->98|145->117|145->117|145->117|175->147|175->147|175->147|175->147|175->147|175->147|175->147|175->147|175->147|175->147|175->147|175->147|192->164|192->164|192->164|192->164|192->164|192->164|192->164|192->164|192->164|192->164|192->164|192->164|218->190|218->190|218->190|218->190|218->190|218->190|225->197|225->197|225->197|225->197|225->197|225->197|233->205|233->205|233->205|233->205|233->205|233->205|233->205|233->205|233->205|233->205|233->205|233->205|252->224|252->224|252->224|252->224|252->224|252->224|261->233|261->233|261->233|261->233|261->233|261->233|261->233|261->233|261->233|261->233|261->233|261->233|270->242|270->242|270->242|272->244|272->244|272->244|272->244|272->244|272->244|285->257|285->257|285->257|285->257|285->257|285->257|294->266|294->266|294->266|294->266|294->266|294->266|294->266|294->266|294->266|294->266|294->266|294->266|303->275|303->275|303->275|305->277|305->277|305->277|305->277|305->277|305->277|317->289|317->289|317->289|317->289|317->289|317->289|317->289|317->289|317->289|317->289|317->289|317->289|318->290|318->290|318->290|318->290|318->290|318->290|318->290|318->290|318->290|318->290|318->290|318->290|318->290|318->290|318->290|318->290|318->290|318->290|319->291|319->291|319->291|319->291|319->291|319->291|320->292|320->292|320->292|320->292|320->292|320->292|321->293|321->293|321->293|321->293|321->293|321->293|321->293|321->293|321->293|321->293|321->293|321->293|333->305|333->305
                    -- GENERATED --
                */
            