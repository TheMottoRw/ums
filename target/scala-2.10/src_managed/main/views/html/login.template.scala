
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
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main("login page")/*1.20*/{_display_(Seq[Any](format.raw/*1.21*/("""
    <div ng-controller="MainController">
        """),_display_(Seq[Any](/*3.10*/frontHeader())),format.raw/*3.23*/("""
        <br />
        <br />
        <div class="col-lg-4"></div>
        <div class="col-lg-4 panel" style="border:2px solid lightgray;box-shadow: 2px 2px 2px rgba(0, 0, 0, .5), -2px -2px 2px rgba(0, 0, 0, .5);border-radius: 3px;padding:0% 3% 0% 3%;padding-bottom: 2%">
            <br/>
            <div ng-show="error" class="alert alert-danger alert-dismissable">
                <a href="#" class="close" data-dismiss="alert" aria-label="close">×</a>
                <center><strong>Error!</strong> """),format.raw/*11.49*/("""{"""),format.raw/*11.50*/("""{"""),format.raw/*11.51*/("""error"""),format.raw/*11.56*/("""}"""),format.raw/*11.57*/("""}"""),format.raw/*11.58*/(""".</center>
            </div>
            <form name="form" action=""method="POST">
                <center><img src=""""),_display_(Seq[Any](/*14.36*/routes/*14.42*/.Assets.at("images/logo.png"))),format.raw/*14.71*/("""" style="height: 100px;width: 200px"></center>
                <div class="form-group">
                    <label for="username">E-mail/Username</label>
                    <i class="fa fa-key"></i>
                    <input type="text" name="username" id="username" class="form-control" ng-model="username" required />
                    <span ng-show="form.username.$dirty && form.username.$error.required" class="help-block">Username is required</span>
                </div>
                <div class="form-group">
                    <label for="password">Password</label>
                    <i class="fa fa-lock"></i>
                    <input type="password" name="password" id="password" class="form-control" ng-model="password" required />
                    <span ng-show="form.password.$dirty && form.password.$error.required" class="help-block">Password is required</span>
                </div>
                <div class="form-actions">
                    <img ng-if="dataLoading" src="data:image/gif;base64,R0lGODlhEAAQAPIAAP///wAAAMLCwkJCQgAAAGJiYoKCgpKSkiH/C05FVFNDQVBFMi4wAwEAAAAh/hpDcmVhdGVkIHdpdGggYWpheGxvYWQuaW5mbwAh+QQJCgAAACwAAAAAEAAQAAADMwi63P4wyklrE2MIOggZnAdOmGYJRbExwroUmcG2LmDEwnHQLVsYOd2mBzkYDAdKa+dIAAAh+QQJCgAAACwAAAAAEAAQAAADNAi63P5OjCEgG4QMu7DmikRxQlFUYDEZIGBMRVsaqHwctXXf7WEYB4Ag1xjihkMZsiUkKhIAIfkECQoAAAAsAAAAABAAEAAAAzYIujIjK8pByJDMlFYvBoVjHA70GU7xSUJhmKtwHPAKzLO9HMaoKwJZ7Rf8AYPDDzKpZBqfvwQAIfkECQoAAAAsAAAAABAAEAAAAzMIumIlK8oyhpHsnFZfhYumCYUhDAQxRIdhHBGqRoKw0R8DYlJd8z0fMDgsGo/IpHI5TAAAIfkECQoAAAAsAAAAABAAEAAAAzIIunInK0rnZBTwGPNMgQwmdsNgXGJUlIWEuR5oWUIpz8pAEAMe6TwfwyYsGo/IpFKSAAAh+QQJCgAAACwAAAAAEAAQAAADMwi6IMKQORfjdOe82p4wGccc4CEuQradylesojEMBgsUc2G7sDX3lQGBMLAJibufbSlKAAAh+QQJCgAAACwAAAAAEAAQAAADMgi63P7wCRHZnFVdmgHu2nFwlWCI3WGc3TSWhUFGxTAUkGCbtgENBMJAEJsxgMLWzpEAACH5BAkKAAAALAAAAAAQABAAAAMyCLrc/jDKSatlQtScKdceCAjDII7HcQ4EMTCpyrCuUBjCYRgHVtqlAiB1YhiCnlsRkAAAOwAAAAAAAAAAAA=="/>
                    <button  type="submit" class="btn btn-success pull-left" ng-click="login()">Login</button>&nbsp;
                    <div style="margin-top: 2%;" class="pull-right">
                    <a  href="#"> Forgot password ?</a>  <a href="#" data-toggle="modal" data-target="#myModal"> New admission sign up</a>
                    </div>
                </div>
                <div>&nbsp;</div>
            </form>
        </div>
        <div class="col-lg-4"></div>

            <!-- Modal -->
        <div id="myModal" class="modal fade" role="dialog">
            <div class="modal-dialog">

                    <!-- Modal content-->
                <div class="modal-content" style="padding: 3%;">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        <h4 class="modal-title">New admission sign up form</h4>
                    </div>
                    <form action="" method="POST" role="form">
                        <p style="color:green;"> """),format.raw/*50.50*/("""{"""),format.raw/*50.51*/("""{"""),format.raw/*50.52*/("""regstudsuccessmsg"""),format.raw/*50.69*/("""}"""),format.raw/*50.70*/("""}"""),format.raw/*50.71*/("""</p>
                    <div class="modal-body">
                        <form action="/" method="get">
                        <div class="form-group">
                            <label>First name</label>
                            <input type="text" class="form-control" name="fname" id="fname" ng-model="studFname"/>
                        </div>
                        <div class="form-group">
                            <label>Last name</label>
                            <input type="text" class="form-control" name="lname" id="lname" ng-model="studLname"/>
                        </div>
                        <div class="form-group">
                            <label>Email address</label>
                            <input type="text" class="form-control" name="email" id="email" ng-model="studEmail"/>
                        </div>

                        <div class="form-group">
                            <label>Password</label>
                            <input type="password" class="form-control" name="password" id="password"ng-model="studPwd"/>
                        </div>
                        <div class="form-group">
                            <label>Confirm password</label>
                            <input type="password" class="form-control" name="confpassword" id="confpassword" ng-model="studConfPwd" />
                        </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-success" ng-click="registerStudent()"> Submit</button>
                                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                            </div>
                        </form>
                    </div>
                    </form>
                </div>

            </div>
        </div>

    </div>
"""),_display_(Seq[Any](/*87.2*/footer())),format.raw/*87.10*/("""

""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Aug 30 18:58:32 EET 2017
                    SOURCE: F:/play/ums/app/views/login.scala.html
                    HASH: 339f86a3fae09fa3c6db2a5f7415a1e4f207c86f
                    MATRIX: 864->1|890->19|928->20|1016->73|1050->86|1592->600|1621->601|1650->602|1683->607|1712->608|1741->609|1899->731|1914->737|1965->766|5043->3816|5072->3817|5101->3818|5146->3835|5175->3836|5204->3837|7147->5745|7177->5753
                    LINES: 29->1|29->1|29->1|31->3|31->3|39->11|39->11|39->11|39->11|39->11|39->11|42->14|42->14|42->14|78->50|78->50|78->50|78->50|78->50|78->50|115->87|115->87
                    -- GENERATED --
                */
            