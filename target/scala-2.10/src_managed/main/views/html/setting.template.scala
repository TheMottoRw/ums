
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
object setting extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/dashboardHome("Settings")/*1.27*/{_display_(Seq[Any](format.raw/*1.28*/("""
  <div ng-controller="MainController" class="controllerCall">
    """),_display_(Seq[Any](/*3.6*/frontHeader())),format.raw/*3.19*/("""
    <br />
    <br />
    <style>
    #side-menu-1,#side-menu-2,#side-menu-3"""),format.raw/*7.43*/("""{"""),format.raw/*7.44*/("""
    background-color: ;color:;"""),format.raw/*8.31*/("""}"""),format.raw/*8.32*/("""
    .list-group-item:nth-child(1)"""),format.raw/*9.34*/("""{"""),format.raw/*9.35*/("""margin-top:5% """),format.raw/*9.49*/("""}"""),format.raw/*9.50*/("""
    .list-group-item"""),format.raw/*10.21*/("""{"""),format.raw/*10.22*/("""height:60px;padding-top: 20px; """),format.raw/*10.53*/("""}"""),format.raw/*10.54*/("""
    #side-menu-1:hover,#side-menu-2:hover,#side-menu-3:hover,#side-menu-4:hover,#side-menu-5:hover,#side-menu-6:hover,#side-menu-7:hover,#side-menu-8:hover,#side-menu-9:hover"""),format.raw/*11.175*/("""{"""),format.raw/*11.176*/("""
    background-color: #6f000d;color:white;text-decoration:no-underline;"""),format.raw/*12.72*/("""}"""),format.raw/*12.73*/("""
    #side-menu-1:focus,#side-menu-2:focus,#side-menu-3:focus,#side-menu-4:focus,#side-menu-5:focus,#side-menu-6:focus,#side-menu-7:focus,#side-menu-8:focus"""),format.raw/*13.156*/("""{"""),format.raw/*13.157*/("""
    background-color:#6f000d;color:white;"""),format.raw/*14.42*/("""}"""),format.raw/*14.43*/("""
    li"""),format.raw/*15.7*/("""{"""),format.raw/*15.8*/("""list-style-type: none;display: inline; background-color: #6f000d;color:white;padding: 1% 2% 1% 2%;border-radius:3px; color:white;font-size: 14px;"""),format.raw/*15.153*/("""}"""),format.raw/*15.154*/("""
    .srch"""),format.raw/*16.10*/("""{"""),format.raw/*16.11*/("""font-size:18px;height:40px;font-weight: normal;padding:1%;border:1px solid lightgray"""),format.raw/*16.95*/("""}"""),format.raw/*16.96*/("""
      .sbmenu:hover"""),format.raw/*17.20*/("""{"""),format.raw/*17.21*/("""text-decoration: none;"""),format.raw/*17.43*/("""}"""),format.raw/*17.44*/("""
    .sbmenu:focus"""),format.raw/*18.18*/("""{"""),format.raw/*18.19*/("""text-decoration: none;"""),format.raw/*18.41*/("""}"""),format.raw/*18.42*/("""
      .sbmenu"""),format.raw/*19.14*/("""{"""),format.raw/*19.15*/("""font-size: 18px;"""),format.raw/*19.31*/("""}"""),format.raw/*19.32*/("""
    thead tr"""),format.raw/*20.13*/("""{"""),format.raw/*20.14*/("""background: lavenderblush"""),format.raw/*20.39*/("""}"""),format.raw/*20.40*/("""
     tbody tr:nth-child(odd)"""),format.raw/*21.29*/("""{"""),format.raw/*21.30*/("""background: fixed;"""),format.raw/*21.48*/("""}"""),format.raw/*21.49*/("""
    tbody tr:nth-child(even)"""),format.raw/*22.29*/("""{"""),format.raw/*22.30*/("""background: aliceblue;"""),format.raw/*22.52*/("""}"""),format.raw/*22.53*/("""
      tbody th"""),format.raw/*23.15*/("""{"""),format.raw/*23.16*/("""font-weight: normal;"""),format.raw/*23.36*/("""}"""),format.raw/*23.37*/("""
      caption"""),format.raw/*24.14*/("""{"""),format.raw/*24.15*/("""color: lightslategrey;font-weight: normal;font-size: 16px;font-family: "Lucida Bright""""),format.raw/*24.101*/("""}"""),format.raw/*24.102*/("""
      .branchInfo,.applicationInfo,.facultyInfo,.departmentInfo,.sponsorInfo,.employeeInfo"""),format.raw/*25.91*/("""{"""),format.raw/*25.92*/("""margin-top:-1%;"""),format.raw/*25.107*/("""}"""),format.raw/*25.108*/("""
    </style>
    <div class="col-lg-3">
      <div  class="list-group success" style="width: 100%; margin-top: -20%; margin-left: -10%;background-color:">
        <a class=" list-group-item sbmenu" id="side-menu-1" href="#branches" style="">
          <span class="round-tabs">
          <i class="glyphicon glyphicon-pencil"></i>
        </span>Branches</a>
        <a class=" list-group-item sbmenu" id="side-menu-2" href="#application" style="">
          <span class="round-tabs">
            <i class="glyphicon glyphicon-pencil"></i>
          </span>Application</a>
        <a class=" list-group-item sbmenu" id="side-menu-3" href="#faculties" style="">
          <span class="round-tabs">
            <i class="glyphicon glyphicon-pencil"></i>
          </span>Faculties</a>


        <a class=" list-group-item sbmenu" id="side-menu-4" href="#departments" style="">
          <span class="round-tabs">
            <i class="glyphicon glyphicon-pencil"></i>
          </span>Departments</a>


            <a class=" list-group-item sbmenu" id="side-menu-5" href="#sections" style="">
              <span class="round-tabs">
                <i class="glyphicon glyphicon-pencil"></i>
              </span>Section</a>

                <a class=" list-group-item sbmenu" id="side-menu-6" href="#classes" style="">
                  <span class="round-tabs">
                    <i class="glyphicon glyphicon-pencil"></i>
                  </span>Classes</a>

                    <a class=" list-group-item sbmenu" id="side-menu-7" href="#sponsors" style="">
                      <span class="round-tabs">
                        <i class="glyphicon glyphicon-pencil"></i>
          </span>Sponsors</a>

        <a class=" list-group-item sbmenu" id="side-menu-8" href="#employees" style="">
          <span class="round-tabs">
            <i class="glyphicon glyphicon-pencil"></i>
          </span>Employees</a>
        <a class=" list-group-item sbmenu" id="side-menu-9" href="/logout/" style="">
          <span class="round-tabs">
            <i class="glyphicon glyphicon-log-out"></i>
          </span>Logout</a>
      </div>
    </div>
    <!--branchTable Info-->
    <div class="branchInfo">
    <nav class="tabs" style="font-color:white;" ng-init="loadEmployee()">
      <ul>
        <li><a href="#branchreg" id="" class="sbmenu" style="color:white">Add New</a></li>
          &nbsp;&nbsp;&nbsp;&nbsp;
        <li><a href="#branchview" id="" class="sbmenu" style="color:white" ng-click="loadBranch()">View Registered</a></li>
      </ul>
      </nav>
      <div class="col-lg-8 panel" id="branchTable" style="height:;border:3px solid lightgray;box-shadow:;border-radius: 3px;padding:0% 3% 0% 3%;">
        <br/>
        <div class="row" id="branchregform" style="margin-bottom:2.5% ">
          <form name="form" action=""method="POST">
            <h3 style="margin-top:-0.1%">New BranchTable Registration</h3>
            <p style="color:green;">"""),format.raw/*88.37*/("""{"""),format.raw/*88.38*/("""{"""),format.raw/*88.39*/(""" regbranchsuccessmsg """),format.raw/*88.60*/("""}"""),format.raw/*88.61*/("""}"""),format.raw/*88.62*/("""</p>
            <div class="form-group">
              <div class="col-lg-2">
                <label for="chancellornames">Chancellor</label>
              </div>
              <div class="col-lg-9">
                <select id="chancellornames" name="chancellornames" class="form-control" ng-model="chancellornames">
                  <option ng-repeat="chancellor in employee"  value=""""),format.raw/*95.70*/("""{"""),format.raw/*95.71*/("""{"""),format.raw/*95.72*/("""chancellor.id"""),format.raw/*95.85*/("""}"""),format.raw/*95.86*/("""}"""),format.raw/*95.87*/("""">"""),format.raw/*95.89*/("""{"""),format.raw/*95.90*/("""{"""),format.raw/*95.91*/(""" chancellor.firstName """),format.raw/*95.113*/("""}"""),format.raw/*95.114*/("""}"""),format.raw/*95.115*/(""" &nbsp;&nbsp; """),format.raw/*95.129*/("""{"""),format.raw/*95.130*/("""{"""),format.raw/*95.131*/(""" chancellor.lastName """),format.raw/*95.152*/("""}"""),format.raw/*95.153*/("""}"""),format.raw/*95.154*/(""" </option>
                </select>
              </div>
              <div class="col-lg-1"></div>
            </div><br/><br/>
            <div class="form-group">
              <div class="col-lg-2">
                <label for="branchname">BranchTable Name</label>
              </div>
              <div class="col-lg-9">
                <input type="text" id="branchname" name="branchname" class="form-control" ng-model="branchName">
              </div>
              <div class="col-lg-1"></div>
            </div><br/><br/>
            <div class="form-group">
              <div class="col-lg-2">
                <label for="branchaddress">Address</label>
              </div>
              <div class="col-lg-9">
                <textarea cols="50" rows="5" id="branchaddress" name="branchaddress" class="form-control" ng-model="branchAddress"></textarea>
              </div>
              <div class="col-lg-1"></div>
            </div>
            <div class="col-lg-5"></div><div class="col-lg-4" style="margin-top: -1%"><br/><button type="button" class="btn btn-success btn-lg" ng-click="registerBranch()" name="regbranch" id="regbranch"value="">  Register  </button></div><div class="col-lg-3"></div>
        </form>
        </div>
          <!--updating form-->
        <div class="row">
          <div id="branchupdform" class="modal fade" role="dialog">
            <div class="modal-dialog">
              <!-- Modal content-->
            <div class="modal-content">
              <form name="form" action="" method="POST">

                <div class="modal-header">
                  <button type="button" class="close" data-dismiss="modal">&times;</button>
                  <h4 class="modal-title">"""),format.raw/*131.43*/("""{"""),format.raw/*131.44*/("""{"""),format.raw/*131.45*/("""updbranch.branchName"""),format.raw/*131.65*/("""}"""),format.raw/*131.66*/("""}"""),format.raw/*131.67*/(""" BranchTable Updating</h4>
                </div>
                <div class="modal-body">
            <p style="color:green;">"""),format.raw/*134.37*/("""{"""),format.raw/*134.38*/("""{"""),format.raw/*134.39*/(""" updbranchsuccessmsg """),format.raw/*134.60*/("""}"""),format.raw/*134.61*/("""}"""),format.raw/*134.62*/("""</p>
            <div class="form-group">
              <div class="col-lg-2">
                <label for="updchancellornames">Chancellor</label>
              </div>
              <div class="col-lg-9">
                <select id="updchancellornames" name="updchancellornames" class="form-control" ng-model="updbranch.chancellornames" ng-init="loadEmployee()">
                  <option ng-repeat="chancellor in employee"  value=""""),format.raw/*141.70*/("""{"""),format.raw/*141.71*/("""{"""),format.raw/*141.72*/("""chancellor.id"""),format.raw/*141.85*/("""}"""),format.raw/*141.86*/("""}"""),format.raw/*141.87*/("""">"""),format.raw/*141.89*/("""{"""),format.raw/*141.90*/("""{"""),format.raw/*141.91*/(""" chancellor.id==updbranch.employee.id?updbranch.employee.firstName+"&nbsp;&nbsp;"+updbranch.employee.lastName+" (Current Chancellor) ":chancellor.firstName+"&nbsp;&nbsp;"+chancellor.lastName """),format.raw/*141.282*/("""}"""),format.raw/*141.283*/("""}"""),format.raw/*141.284*/(""" </option>
                </select>
              </div>
              <div class="col-lg-1"></div>
            </div><br/><br/>
            <div class="form-group">
              <div class="col-lg-2">
                <label for="updbranchname">BranchTable Name</label>
              </div>
              <div class="col-lg-9">
                <input type="text" id="updbranchname" name="updbranchname" class="form-control" ng-model="updbranch.branchName">
              </div>
              <div class="col-lg-1"></div>
            </div><br/><br/>
            <div class="form-group">
              <div class="col-lg-2">
                <label for="updbranchaddress">Address</label>
              </div>
              <div class="col-lg-9">
                <textarea cols="50" rows="5" id="updbranchaddress" name="updbranchaddress" class="form-control" ng-model="updbranch.branchAddress"></textarea>
              </div>
              <div class="col-lg-1"></div>
            </div><br/>
            <!--div class="col-lg-5"></div><div class="col-lg-4"><br/></div><div class="col-lg-3"></div-->
                <br> <br> <br></div>
                <div class="modal-footer">
                  <button type="button" class="btn btn-success btn-md" style="margin-top: -1%" name="updbranch" id="regbranch" ng-click="updateBranch();">Update</button>
                  <button type="button" class="btn btn-danger" data-dismiss="modal">
                  Cancel</button>
                </div>
              </form>
              </div>
            </div>
            </div>
        </div>

          <!--end update-->
          <!--registered-->
        <div class="row" id="branchviewform" ng-init="loadBranch()" style="margin-bottom:3% ">
          <form action="/search/" method="GET">
            <div class="col-lg-12 input-goup">
              <input type="text" name="srch" id="srch" placeholder="branchTable name..." ng-model="branchkeyword" ng-keyup="searchBranch()" class="form-control srch">
            </div></form><br/><br/>
          <span style="color:green">"""),format.raw/*184.37*/("""{"""),format.raw/*184.38*/("""{"""),format.raw/*184.39*/(""" branchfeedmsg """),format.raw/*184.54*/("""}"""),format.raw/*184.55*/("""}"""),format.raw/*184.56*/("""</span><br/>
          <table class="table table-bordered">
            <caption>Registered Branches</caption>
            <thead>
               <tr> <th> Names </th><th> Chancellor </th> <th colspan="3"> Modifications </th></tr>
            </thead>
            <tbody>
              <tr  ng-repeat="branchTable in branches">
                <th> """),format.raw/*192.22*/("""{"""),format.raw/*192.23*/("""{"""),format.raw/*192.24*/(""" branchTable.branchName """),format.raw/*192.48*/("""}"""),format.raw/*192.49*/("""}"""),format.raw/*192.50*/(""" </th>
              <th> """),format.raw/*193.20*/("""{"""),format.raw/*193.21*/("""{"""),format.raw/*193.22*/(""" branchTable.employee.firstName+"&nbsp;&nbsp;"+branchTable.employee.lastName """),format.raw/*193.99*/("""}"""),format.raw/*193.100*/("""}"""),format.raw/*193.101*/(""" </th>
              <th style="text-align:center;"><a href="#" id="updCands" class="btn btn-success fa fa-eye updCands" data-toggle="modal" data-target="#viewBranchModal" ng-click="loadBranchUpdater(branchTable.id)">View</th>
                <th style="text-align:center;"><a href="#" class="btn btn-warning glyphicon glyphicon-pencil"  data-toggle="modal" data-target="#branchupdform" ng-click="loadBranchUpdater(branchTable.id)">Edit</a></th>
                   <th style="text-align:center;"><a href="#" class="btn btn-danger glyphicon glyphicon-remove" data-toggle="modal" data-target="#delModal" ng-click="setCurrentCateId('branchTable',branchTable.id)">Delete</a>
                </a></th>
              </tr>
            </tbody>
            </table>
        </div><!--end branchviewform-->
      </div><!--panel 6 branchTable-->
    </div><!--end branchTable info-->

    <!--application Info-->
    <div class="applicationInfo">
      <nav class="tabs" style="font-color:white;">
        <ul>
          <li><a href="#applicationreg" id="" class="sbmenu" style="color:white">Add New</a></li>
            &nbsp;&nbsp;&nbsp;&nbsp;
          <li><a href="#appicationview" id="" class="sbmenu" style="color:white" ng-click="loadApplication()">View Registered</a></li>
            &nbsp;&nbsp;&nbsp;&nbsp;
          <li><a href="#applicationregtype" id="" class="sbmenu" style="color:white">Add Application Type</a></li>
            &nbsp;&nbsp;&nbsp;&nbsp;
          <li><a href="#applicationviewtype" id="" class="sbmenu" style="color:white" ng-click="loadBranch()">View Application Type</a></li>
        </ul>
      </nav>
      <div class="col-lg-8 panel" id="application" style="height:;border:2px solid lightgray;box-shadow:;border-radius: 3px;padding:0% 3% 0% 3%;      padding-bottom: 1%">
        <br/>
        <div class="row" id="applicationregform">
          <form name="form" action=""method="POST">
            <h3  style="margin-top:-0.1%">Application Period Registration</h3>
            <p style="color:green;">"""),format.raw/*223.37*/("""{"""),format.raw/*223.38*/("""{"""),format.raw/*223.39*/(""" regapplicationsuccessmsg """),format.raw/*223.65*/("""}"""),format.raw/*223.66*/("""}"""),format.raw/*223.67*/("""</p>
            <div class="form-group">
              <div class="col-lg-2">
                <label for="academicyear">Academic Year</label>
              </div>
              <div class="col-lg-9">
                <input type="text" id="academicyear" name="academicyear" class="form-control" ng-model="acyear">
              </div>
              <div class="col-lg-1"></div>
            </div><br/><br/>
            <div class="form-group">
              <div class="col-lg-2">
                <label for="depfacultyname">Start Time</label>
              </div>
              <div class="col-lg-9">
                <input type="text" id="starttime" name="starttime" class="form-control" ng-model="start">
              </div>
              <div class="col-lg-1"></div>
            </div><br/><br/>
            <div class="form-group">
              <div class="col-lg-2">
                <label for="depfacultyname">End Time</label>
              </div>
              <div class="col-lg-9">
                <input type="text" id="endtime" name="endtime" class="form-control" ng-model="end">
              </div>
              <div class="col-lg-1"></div>
            </div>
            <div class="col-lg-5"></div><div class="col-lg-4"><br/><button type="button" class="btn btn-success btn-lg" style="margin-top: -1%" name="btnregapplication" id="btnregapplication" ng-click="registerApplication()">Register</button></div><div class="col-lg-3"></div>
          </form>
        </div>
          <!--updating form-->
        <div class="row">
          <div  id="applicationupdform" class="modal fade" role="dialog">
          <div class="modal-dialog">
              <!-- Modal content-->
            <div class="modal-content">
              <form name="form" action=""method="POST">

                <div class="modal-header">
                  <button type="button" class="close" data-dismiss="modal">&times;</button>
                  <h3>"""),format.raw/*264.23*/("""{"""),format.raw/*264.24*/("""{"""),format.raw/*264.25*/("""updapplication.academicYear"""),format.raw/*264.52*/("""}"""),format.raw/*264.53*/("""}"""),format.raw/*264.54*/(""" Application Updating</h3>
                </div>
                <div class="modal-body">
          <form name="form" action=""method="POST">


            <p style="color:green;">"""),format.raw/*270.37*/("""{"""),format.raw/*270.38*/("""{"""),format.raw/*270.39*/(""" updappsuccessmsg """),format.raw/*270.57*/("""}"""),format.raw/*270.58*/("""}"""),format.raw/*270.59*/("""</p>
            <div class="form-group">
              <div class="col-lg-2">
                <label for="updacademicyear">Academic Year</label>
              </div>
              <div class="col-lg-9">
                <input type="text" id="updacademicyear" name="updacademicyear" class="form-control" ng-model="updapplication.academicYear">
              </div>
              <div class="col-lg-1"></div>
            </div><br/><br/>
            <div class="form-group">
              <div class="col-lg-2">
                <label for="updstarttime">Start Time</label>
              </div>
              <div class="col-lg-9">
                <input type="text" id="starttime" name="updstarttime" class="form-control" ng-model="updapplication.startAt">
              </div>
              <div class="col-lg-1"></div>
            </div><br/><br/>
            <div class="form-group">
              <div class="col-lg-2">
                <label for="depfacultyname">End Time</label>
              </div>
              <div class="col-lg-9">
                <input type="text" id="endtime" name="updendtime" class="form-control" ng-model="updapplication.endAt">
              </div>
              <div class="col-lg-1"></div>

            <div class="col-lg-5"></div><div class="col-lg-4"><br/></div><div class="col-lg-3"></div>
          </div>

              <!--div class="col-lg-5"></div><div class="col-lg-4"><br/></div><div class="col-lg-3"></div-->
            <br> <br> <br></div>
                <div class="modal-footer">
                  <button type="button" class="btn btn-success btn-md" style="margin-top: -1%" name="btnupdapplication" id="updapplication" ng-click="updateApplication()">Update</button>
                  <button type="button" class="btn btn-danger" data-dismiss="modal">
                    Cancel</button>
                </div>
              </form>
            </div>
          </div>
          </div>
        </div>

          <!--end update-->
          <!--registered-->
        <div class="row" id="applicationviewform">
          <form action="/search/" method="GET">
            <div class="col-lg-12 input-goup">
              <input type="text" name="srch" id="srch" placeholder="academic year..." ng-model="appkeyword" ng-keyup="searchApplication()" class="form-control srch">
            </div></form><br/><br/>
          <span style="color:green">"""),format.raw/*321.37*/("""{"""),format.raw/*321.38*/("""{"""),format.raw/*321.39*/(""" applicationfeedmsg """),format.raw/*321.59*/("""}"""),format.raw/*321.60*/("""}"""),format.raw/*321.61*/("""</span><br/>
          <table class="table table-bordered">
            <caption>Registered Applications</caption>
            <thead>
              <tr>
                <th>Academic Year </th><th> Start Time </th><th>End Time  </th><th colspan="2">Modifications  </th>
              </tr>
            </thead>
            <tbody>
              <tr ng-repeat="appl in applications">
                <th> """),format.raw/*331.22*/("""{"""),format.raw/*331.23*/("""{"""),format.raw/*331.24*/(""" appl.academicYear """),format.raw/*331.43*/("""}"""),format.raw/*331.44*/("""}"""),format.raw/*331.45*/(""" </th>
                <th>"""),format.raw/*332.21*/("""{"""),format.raw/*332.22*/("""{"""),format.raw/*332.23*/(""" appl.startAt """),format.raw/*332.37*/("""}"""),format.raw/*332.38*/("""}"""),format.raw/*332.39*/("""  </th>
                <th> """),format.raw/*333.22*/("""{"""),format.raw/*333.23*/("""{"""),format.raw/*333.24*/(""" appl.endAt """),format.raw/*333.36*/("""}"""),format.raw/*333.37*/("""}"""),format.raw/*333.38*/(""" </th>
                <th style="text-align:center;"><a href="#" class="btn btn-warning glyphicon glyphicon-pencil" data-toggle="modal" data-target="#applicationupdform" ng-click="loadApplicationUpdater(appl.id)">Edit</a></th>
                <th style="text-align:center;"><a href="#" class="btn btn-danger glyphicon glyphicon-remove" data-toggle="modal" data-target="#delModal"  ng-click="setCurrentCateId('application',appl.id)">Delete</a>
                  </a></th>
              </tr>
            </tbody>
          </table>
        </div><!--end branchviewform-->

        <div class="row" id="applicationregtypeform" ng-init="loadApptype()">
          <form name="form" action=""method="POST">
            <h3 style="margin-top:-0.1%">New Application Type Registration</h3>
            <p style="color:green;">"""),format.raw/*345.37*/("""{"""),format.raw/*345.38*/("""{"""),format.raw/*345.39*/(""" regapptypesuccessmsg """),format.raw/*345.61*/("""}"""),format.raw/*345.62*/("""}"""),format.raw/*345.63*/("""</p>
            <div class="form-group">
              <div class="col-lg-2">
                <label for="sectionname">Application Type</label>
              </div>
              <div class="col-lg-9">
                <input type="text" id="apptypename" name="apptypename" class="form-control" ng-model="apptypename">
              </div>
              <div class="col-lg-1"></div>
            </div><br/><br/>
            <div class="col-lg-5"></div><div class="col-lg-4"><br/><button type="button" class="btn btn-success btn-md" name="btnregsection" id="btnregsection" ng-click="registerApptype()">Register</button></div><div class="col-lg-3"></div>
          </form>
        </div>
          <!--updating form-->
        <div class="row">
          <div  id="applicationupdtypeform"  class="modal fade" role="dialog">
            <div class="modal-dialog">
                <!-- Modal content-->
              <div class="modal-content">
                <form name="form" action=""method="POST">
                  <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h3>"""),format.raw/*367.25*/("""{"""),format.raw/*367.26*/("""{"""),format.raw/*367.27*/("""updapptype.typeName"""),format.raw/*367.46*/("""}"""),format.raw/*367.47*/("""}"""),format.raw/*367.48*/(""" Application Type Updating</h3>
                  </div>
                  <div class="modal-body">
                    <form name="form" action=""method="POST">


                      <p style="color:green;">"""),format.raw/*373.47*/("""{"""),format.raw/*373.48*/("""{"""),format.raw/*373.49*/(""" updapptypesuccessmsg """),format.raw/*373.71*/("""}"""),format.raw/*373.72*/("""}"""),format.raw/*373.73*/("""</p>
                      <div class="form-group">
                        <div class="col-lg-2">
                          <label for="updapptypename">Application Type Name</label>
                        </div>
                        <div class="col-lg-9">
                          <input type="text" id="updapptypename" name="updapptypename" class="form-control" ng-model="updapptype.typeName">
                        </div>
                        <div class="col-lg-1"></div>
                      </div><br/><br/>
                      <div class="modal-footer">
                        <button type="button" class="btn btn-success btn-md" name="btnupdapptype" style="margin-top: -2%" id="btnupdapptype" ng-click="updateApptype()">Update</button>
                        <button type="button" class="btn btn-danger" data-dismiss="modal">
                          Cancel</button>
                      </div>
                    </form>
                  </div>
              </div>
            </div>
          </div>
          </div>
          <!--end update-->
          <!--registered-->
        <div class="row" id="applicationviewtypeform" ng-init="">
          <form action="/search/" method="GET">
            <div class="col-lg-12 input-goup">
              <input type="text" name="srch" id="srch" placeholder="app type name..." ng-model="apptypekeyword" ng-keyup="searchApptype()" class="form-control srch">
            </div></form><br/><br/>
          <span style="color:green">"""),format.raw/*401.37*/("""{"""),format.raw/*401.38*/("""{"""),format.raw/*401.39*/(""" apptypefeedmsg """),format.raw/*401.55*/("""}"""),format.raw/*401.56*/("""}"""),format.raw/*401.57*/("""</span><br/>
          <table class="table table-bordered">
            <caption>Registered App Type</caption>
            <thead>
              <tr>
                <th>App Type</th>
                <th colspan="2"> Modifications </th>
              </tr>
            </thead>
            <tbody>
              <tr ng-repeat="apptype in apptypes">
                <th> """),format.raw/*412.22*/("""{"""),format.raw/*412.23*/("""{"""),format.raw/*412.24*/(""" apptype.typeName """),format.raw/*412.42*/("""}"""),format.raw/*412.43*/("""}"""),format.raw/*412.44*/(""" </th>
                <th style="text-align:center;"><a href="#" class="btn btn-warning glyphicon glyphicon-pencil" data-toggle="modal" data-target="#applicationupdtypeform"ng-click="loadApptypeUpdater(apptype.id)">Edit</a></th>
                <th style="text-align:center;"><a href="#" class="btn btn-danger glyphicon glyphicon-remove" data-toggle="modal" data-target="#delModal"ng-click="setCurrentCateId('applicationtype',apptype.id)">Delete</a>
                  </a></th>
              </tr>
            </tbody>
          </table>
        </div><!--end branchviewform-->
      </div><!--panel 8 application-->
    </div><!--end applicationInfo info-->
    <!--end application-->
<!--faculty info-->
    <div class="facultyInfo">
      <nav class="tabs" style="font-color:white;">
        <ul>
          <li><a href="#facultyreg" id="" class="sbmenu" style="color:white">Add New</a></li>
            &nbsp;&nbsp;&nbsp;&nbsp;
          <li><a href="#facultyview" id="" class="sbmenu" style="color:white" ng-click="loadFaculty()">View Registered</a></li>
        </ul>
      </nav>
      <div class="col-lg-8 panel" id="faculty" style="height:;border:2px solid lightgray;box-shadow:;border-radius: 3px;padding:0% 3% 0% 3%;      padding-bottom: 1%">
        <br/>
        <div class="row" id="facultyregform">
          <form name="form" action=""method="POST">
            <h3 style="margin-top:-0.1%">New Faculty Registration</h3>
            <p style="color:green;">"""),format.raw/*437.37*/("""{"""),format.raw/*437.38*/("""{"""),format.raw/*437.39*/(""" regfacultysuccessmsg """),format.raw/*437.61*/("""}"""),format.raw/*437.62*/("""}"""),format.raw/*437.63*/("""</p>
            <div class="form-group">
              <div class="col-lg-2">
                <label for="facultyname">Faculty Name</label>
              </div>
              <div class="col-lg-9">
                <input type="text" id="facultyname" name="facultyname" class="form-control" ng-model="facultyname">
              </div>
              <div class="col-lg-1"></div>
            </div><br/><br/>
            <div class="form-group">
              <div class="col-lg-2">
                <label for="facbranchname">BranchTable Name</label>
              </div>
              <div class="col-lg-9">
                <select id="facbranchname" name="facbranchname" class="form-control" ng-init="loadBranch()" ng-model="facbranchid">
                  <option ng-repeat="facbr in branches" value=""""),format.raw/*453.64*/("""{"""),format.raw/*453.65*/("""{"""),format.raw/*453.66*/("""facbr.id"""),format.raw/*453.74*/("""}"""),format.raw/*453.75*/("""}"""),format.raw/*453.76*/("""">"""),format.raw/*453.78*/("""{"""),format.raw/*453.79*/("""{"""),format.raw/*453.80*/("""facbr.branchName"""),format.raw/*453.96*/("""}"""),format.raw/*453.97*/("""}"""),format.raw/*453.98*/("""</option>
                  </select>
              </div>
              <div class="col-lg-1"></div>
            </div>
            <div class="col-lg-5"></div><div class="col-lg-4"><br/><button type="button" class="btn btn-success btn-md" style="margin-top: -1%;" name="btnregfaculty" ng-click="registerFaculty()" id="btnregfaculty"value="">Register</button></div><div class="col-lg-3"></div>
          </form>
        </div>
          <!--updating form-->
        <div class="row">
         <div id="facultyupdform"  class="modal fade" role="dialog">
          <div class="modal-dialog">
              <!-- Modal content-->
            <div class="modal-content">
              <form name="form" action="" method="POST">
                <div class="modal-header">
                  <button type="button" class="close" data-dismiss="modal">&times;</button>
                  <h3>"""),format.raw/*470.23*/("""{"""),format.raw/*470.24*/("""{"""),format.raw/*470.25*/("""updfaculty.facultyName"""),format.raw/*470.47*/("""}"""),format.raw/*470.48*/("""}"""),format.raw/*470.49*/(""" Faculty Updating</h3>
                </div>
                <div class="modal-body">
          <form name="form" action=""method="POST">
            <p style="color:green;">"""),format.raw/*474.37*/("""{"""),format.raw/*474.38*/("""{"""),format.raw/*474.39*/(""" updfacultysuccessmsg """),format.raw/*474.61*/("""}"""),format.raw/*474.62*/("""}"""),format.raw/*474.63*/("""</p>
            <div class="form-group">
              <div class="col-lg-2">
                <label for="updfacultyname">Faculty Name</label>
              </div>
              <div class="col-lg-9">
                <input type="text" id="updfacultyname" name="updfacultyname" class="form-control" ng-model="updfaculty.facultyName">
              </div>
              <div class="col-lg-1"></div>
            </div><br/><br/>
            <div class="form-group">
              <div class="col-lg-2">
                <label for="updfacbranchname">BranchTable Name</label>
              </div>
              <div class="col-lg-9">
                <select id="updfacbranchname" name="updfacbranchname" class="form-control" ng-init="loadBranch()" ng-model="updfaculty.branchid">
                  <option ng-repeat="facbr in branches" value=""""),format.raw/*490.64*/("""{"""),format.raw/*490.65*/("""{"""),format.raw/*490.66*/("""facbr.id"""),format.raw/*490.74*/("""}"""),format.raw/*490.75*/("""}"""),format.raw/*490.76*/("""">"""),format.raw/*490.78*/("""{"""),format.raw/*490.79*/("""{"""),format.raw/*490.80*/("""facbr.branchName==updfaculty.branchTable.branchName?facbr.branchName+" (Current BranchTable)":facbr.branchName"""),format.raw/*490.190*/("""}"""),format.raw/*490.191*/("""}"""),format.raw/*490.192*/("""</option>
                </select>

              </div>
              <div class="col-lg-1"></div>
                  <br> <br> <br></div>
                <div class="modal-footer">
                  <button type="button" class="btn btn-success btn-md" style="margin-top: -1%" name="btnupdfaculty" id="btnupdfaculty" ng-click="updateFaculty()">Update</button>
                  <button type="button" class="btn btn-danger" data-dismiss="modal">
                    Cancel</button>
                </div>
              </form>
            </div>
          </div>
        </div>
          </div>
          </div>
          <!--end update-->
          <!--registered-->
        <div class="row" id="facultyviewform" ng-init="loadFaculty()">
          <form action="/search/" method="GET">
            <div class="col-lg-12 input-goup">
              <input type="text" name="srch" id="srch" placeholder="Faculty name..." ng-model="facultykeyword" ng-keyup="searchFaculty()" class="form-control srch">
            </div></form><br/><br/>
          <span style="color:green">"""),format.raw/*514.37*/("""{"""),format.raw/*514.38*/("""{"""),format.raw/*514.39*/(""" facultyfeedmsg """),format.raw/*514.55*/("""}"""),format.raw/*514.56*/("""}"""),format.raw/*514.57*/("""</span><br/>
          <table class="table table-bordered">
            <caption>Registered Faculties</caption>
            <thead>
              <tr> <th>Faculty Names  </th> <th>BranchTable  </th> <th colspan="2">  Modifications</th>
              </tr>
            </thead>
            <tbody>
              <tr ng-repeat="faculty in faculties">
                <th> """),format.raw/*523.22*/("""{"""),format.raw/*523.23*/("""{"""),format.raw/*523.24*/(""" faculty.facultyName """),format.raw/*523.45*/("""}"""),format.raw/*523.46*/("""}"""),format.raw/*523.47*/(""" </th>
                <th> """),format.raw/*524.22*/("""{"""),format.raw/*524.23*/("""{"""),format.raw/*524.24*/("""faculty.branchTable.branchName"""),format.raw/*524.54*/("""}"""),format.raw/*524.55*/("""}"""),format.raw/*524.56*/(""" </th>
                <th style="text-align:center;"><a href="#" class="btn btn-warning glyphicon glyphicon-pencil" data-toggle="modal" data-target="#facultyupdform" ng-click="loadFacultyUpdater(faculty.id)">Edit</a></th>
                <th style="text-align:center;"><a href="#" class="btn btn-danger glyphicon glyphicon-remove" data-toggle="modal" data-target="#delModal"ng-click="setCurrentCateId('faculty',faculty.id)">Delete</a>
                  </a></th>
              </tr>
            </tbody>
          </table>
        </div><!--end facultyviewform-->
      </div><!--panel 6 faculty-->
    </div><!--end faculty info-->
    <!--department info-->
    <div class="departmentsInfo">
      <nav class="tabs" style="font-color:white;">
        <ul>
          <li><a href="#departmentreg" id="" class="sbmenu" style="color:white">Add New</a></li>
            &nbsp;&nbsp;&nbsp;&nbsp;
          <li><a href="#departmentview" id="" class="sbmenu" style="color:white" ng-click="loadDepartment()">View Registered</a></li>
        </ul>
      </nav>
      <div class="col-lg-8 panel" id="department" style="height:;border:2px solid lightgray;box-shadow:;border-radius: 3px;padding:0% 3% 0% 3%;      padding-bottom: 1%">
        <br/>
        <div class="row" id="departmentregform" ng-init="loadFaculty()">
          <form name="form" action=""method="POST">
            <h3 style="margin-top:-0.1%">New Department Registration</h3>
            <p style="color:green;">"""),format.raw/*548.37*/("""{"""),format.raw/*548.38*/("""{"""),format.raw/*548.39*/(""" regdeparmentsuccessmsg """),format.raw/*548.63*/("""}"""),format.raw/*548.64*/("""}"""),format.raw/*548.65*/("""</p>
            <div class="form-group">
              <div class="col-lg-2">
                <label for="departmentname">Department Name</label>
              </div>
              <div class="col-lg-9">
                <input type="text" id="departmentname" name="departmentname" class="form-control" ng-model="departmentname">
              </div>
              <div class="col-lg-1"></div>
            </div><br/><br/>
            <div class="form-group">
              <div class="col-lg-2">
                <label for="depfacultyname">Faculty Name</label>
              </div>
              <div class="col-lg-9">
                <select id="depfacultyname" name="depfacultyname" class="form-control" ng-model="depfacultyid">
                  <option ng-repeat="faculty in faculties" value=""""),format.raw/*564.67*/("""{"""),format.raw/*564.68*/("""{"""),format.raw/*564.69*/("""faculty.id"""),format.raw/*564.79*/("""}"""),format.raw/*564.80*/("""}"""),format.raw/*564.81*/("""">"""),format.raw/*564.83*/("""{"""),format.raw/*564.84*/("""{"""),format.raw/*564.85*/("""faculty.facultyName"""),format.raw/*564.104*/("""}"""),format.raw/*564.105*/("""}"""),format.raw/*564.106*/("""</option>
                </select>
              </div>
              <div class="col-lg-1"></div>
            </div>
            <div class="col-lg-5"></div><div class="col-lg-4"><br/><button type="button" class="btn btn-success btn-md" name="btnregdeparment" id="btnregdepartment" ng-click="registerDepartment()">Register</button></div><div class="col-lg-3"></div>
          </form>
        </div>
          <!--updating form-->
        <div class="row">
          <div  id="departmentupdform"  class="modal fade" role="dialog">
          <div class="modal-dialog">
              <!-- Modal content-->
            <div class="modal-content">
              <form name="form" action="" method="POST">
                <div class="modal-header">
                  <button type="button" class="close" data-dismiss="modal">&times;</button>
                  <h3>"""),format.raw/*581.23*/("""{"""),format.raw/*581.24*/("""{"""),format.raw/*581.25*/("""upddepartment.departmentName"""),format.raw/*581.53*/("""}"""),format.raw/*581.54*/("""}"""),format.raw/*581.55*/(""" Department Updating</h3>
                </div>
                <div class="modal-body">

          <form name="form" action=""method="POST">


            <p style="color:green;">"""),format.raw/*588.37*/("""{"""),format.raw/*588.38*/("""{"""),format.raw/*588.39*/(""" upddepartmentsuccessmsg """),format.raw/*588.64*/("""}"""),format.raw/*588.65*/("""}"""),format.raw/*588.66*/("""</p>
            <div class="form-group">
              <div class="col-lg-2">
                <label for="upddepartmentname">Department Name</label>
              </div>
              <div class="col-lg-9">
                <input type="text" id="upddepartmentname" name="upddepartmentname" class="form-control" ng-model="upddepartment.departmentName">
              </div>
              <div class="col-lg-1"></div>
            </div><br/><br/>
            <div class="form-group">
              <div class="col-lg-2">
                <label for="updfacultyname">Faculty Name</label>
              </div>
              <div class="col-lg-9">
                <select id="upddepfacultyname" name="upddepfacultyname" class="form-control" ng-model="upddepfacultyid">
                  <option ng-repeat="faculty in faculties" value=""""),format.raw/*604.67*/("""{"""),format.raw/*604.68*/("""{"""),format.raw/*604.69*/("""faculty.id"""),format.raw/*604.79*/("""}"""),format.raw/*604.80*/("""}"""),format.raw/*604.81*/("""">"""),format.raw/*604.83*/("""{"""),format.raw/*604.84*/("""{"""),format.raw/*604.85*/("""faculty.facultyName==upddepartment.faculty.facultyName?faculty.facultyName+" (Current Faculty)":faculty.facultyName"""),format.raw/*604.200*/("""}"""),format.raw/*604.201*/("""}"""),format.raw/*604.202*/("""</option>
                </select>

              </div>
              <div class="col-lg-1"></div>
          <br> <br> <br></div>
        <div class="modal-footer">
          <button type="button" class="btn btn-success btn-md" name="btnupddepartment" style="margin-top: -2%" id="updfaculty" ng-click="updateDepartment()">Update</button>
          <button type="button" class="btn btn-danger" data-dismiss="modal">
            Cancel</button>
        </div>
        </form>
      </div>
    </div>
  </div>
  </div>
 </div>
          <!--end update-->
          <!--registered-->
        <div class="row" id="departmentviewform" ng-init="loadDepartment()">
          <form action="/search/" method="GET">
            <div class="col-lg-12 input-goup">
              <input type="text" name="srch" id="srch" placeholder="department name..." ng-model="departmentkeyword" ng-keyup="searchDepartment()" class="form-control srch">
            </div></form><br/><br/>
          <span style="color:green">"""),format.raw/*628.37*/("""{"""),format.raw/*628.38*/("""{"""),format.raw/*628.39*/(""" departmenfeedmsg """),format.raw/*628.57*/("""}"""),format.raw/*628.58*/("""}"""),format.raw/*628.59*/("""</span><br/>
          <table class="table table-bordered">
            <caption>Registered Departments</caption>
            <thead>
              <tr>
                <th>Department</th>
                <th> Faculty </th>
                <th colspan="2"> Modifications </th>
              </tr>
            </thead>
            <tbody>
              <tr ng-repeat="dept in departments">
                <th> """),format.raw/*640.22*/("""{"""),format.raw/*640.23*/("""{"""),format.raw/*640.24*/(""" dept.departmentName """),format.raw/*640.45*/("""}"""),format.raw/*640.46*/("""}"""),format.raw/*640.47*/(""" </th>
                <th> """),format.raw/*641.22*/("""{"""),format.raw/*641.23*/("""{"""),format.raw/*641.24*/(""" dept.faculty.facultyName """),format.raw/*641.50*/("""}"""),format.raw/*641.51*/("""}"""),format.raw/*641.52*/(""" </th>
                <th style="text-align:center;"><a href="#" class="btn btn-warning glyphicon glyphicon-pencil" data-toggle="modal" data-target="#departmentupdform" ng-click="loadDepartmentUpdater(dept.id)">Edit</a></th>
                <th style="text-align:center;"><a href="#" class="btn btn-danger glyphicon glyphicon-remove" data-toggle="modal" data-target="#delModal"ng-click="setCurrentCateId('department',dept.id)">Delete</a>
                  </a></th>
              </tr>
            </tbody>
          </table>
        </div><!--end branchviewform-->
      </div><!--panel 6 branchTable-->
    </div><!--end departments info-->

    <div class="sectionsInfo">
      <nav class="tabs" style="font-color:white;">
        <ul>
          <li><a href="#sectionreg" id="" class="sbmenu" style="color:white">Add New</a></li>
            &nbsp;&nbsp;&nbsp;&nbsp;
          <li><a href="#sectionview" id="" class="sbmenu" style="color:white" ng-click="loadSection()">View Registered</a></li>
        </ul>
      </nav>
      <div class="col-lg-8 panel" id="section" style="height:;border:2px solid lightgray;box-shadow:;border-radius: 3px;padding:0% 3% 0% 3%;      padding-bottom: 1%">
        <br/>
        <div class="row" id="sectionregform" ng-init="">
          <form name="form" action=""method="POST">
            <h3 style="margin-top:-0.1%">New Section Registration</h3>
            <p style="color:green;">"""),format.raw/*665.37*/("""{"""),format.raw/*665.38*/("""{"""),format.raw/*665.39*/(""" regsectionsuccessmsg """),format.raw/*665.61*/("""}"""),format.raw/*665.62*/("""}"""),format.raw/*665.63*/("""</p>
            <div class="form-group">
              <div class="col-lg-2">
                <label for="sectionname">Section Name</label>
              </div>
              <div class="col-lg-9">
                <input type="text" id="sectionname" name="sectionsname" class="form-control" ng-model="sectionname">
              </div>
              <div class="col-lg-1"></div>
            </div><br/><br/>
            <div class="col-lg-5"></div><div class="col-lg-4"><br/><button type="button" class="btn btn-success btn-md" name="btnregsection" id="btnregsection" ng-click="registerSection()">Register</button></div><div class="col-lg-3"></div>
          </form>
        </div>
          <!--updating form-->
        <div class="row">
          <div  id="sectionupdform"  class="modal fade" role="dialog" ng-init="loadDepartment()">
            <div class="modal-dialog">
                <!-- Modal content-->
              <div class="modal-content">
                <form name="form" action=""method="POST">
                  <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h3>"""),format.raw/*687.25*/("""{"""),format.raw/*687.26*/("""{"""),format.raw/*687.27*/("""updsection[0].sectionName"""),format.raw/*687.52*/("""}"""),format.raw/*687.53*/("""}"""),format.raw/*687.54*/(""" Section Updating</h3>
                  </div>
                  <div class="modal-body">

                    <form name="form" action=""method="POST">


                      <p style="color:green;">"""),format.raw/*694.47*/("""{"""),format.raw/*694.48*/("""{"""),format.raw/*694.49*/(""" updsectionsuccessmsg """),format.raw/*694.71*/("""}"""),format.raw/*694.72*/("""}"""),format.raw/*694.73*/("""</p>
                      <div class="form-group">
                        <div class="col-lg-2">
                          <label for="updsectiontname">Section Name</label>
                        </div>
                        <div class="col-lg-9">
                          <input type="text" id="updsectionname" name="updsectionname" class="form-control" ng-model="updsection.sectionName">
                        </div>
                        <div class="col-lg-1"></div>
                      </div><br/><br/>
                      <div class="modal-footer">
                        <button type="button" class="btn btn-success btn-md" name="btnupdsection" style="margin-top: -2%" id="updsection" ng-click="updateSection()">Update</button>
                        <button type="button" class="btn btn-danger" data-dismiss="modal">
                          Cancel</button>
                      </div>
                    </form>
                  </div>
              </div>
            </div>
          </div>
        </div>
          <!--end update-->
          <!--registered-->
        <div class="row" id="sectionviewform" ng-init="loadSection()">
          <form action="/search/" method="GET">
            <div class="col-lg-12 input-goup">
              <input type="text" name="srch" id="srch" placeholder="section name..." ng-model="sectionkeyword" ng-keyup="searchSection()" class="form-control srch">
            </div></form><br/><br/>
          <span style="color:green">"""),format.raw/*722.37*/("""{"""),format.raw/*722.38*/("""{"""),format.raw/*722.39*/(""" sectionnfeedmsg """),format.raw/*722.56*/("""}"""),format.raw/*722.57*/("""}"""),format.raw/*722.58*/("""</span><br/>
          <table class="table table-bordered">
            <caption>Registered Sections</caption>
            <thead>
              <tr>
                <th>Section</th>
                <th colspan="2"> Modifications </th>
              </tr>
            </thead>
            <tbody>
              <tr ng-repeat="section in sections">
                <th> """),format.raw/*733.22*/("""{"""),format.raw/*733.23*/("""{"""),format.raw/*733.24*/(""" section.sectionName """),format.raw/*733.45*/("""}"""),format.raw/*733.46*/("""}"""),format.raw/*733.47*/(""" </th>
                <th style="text-align:center;"><a href="#" class="btn btn-warning glyphicon glyphicon-pencil" data-toggle="modal" data-target="#sectionupdform"ng-click="loadSectionUpdater(section.id)">Edit</a></th>
                <th style="text-align:center;"><a href="#" class="btn btn-danger glyphicon glyphicon-remove" data-toggle="modal" data-target="#delModal" ng-click="setCurrentCateId('section',section.id)">Delete</a>
                  </a></th>
              </tr>
            </tbody>
          </table>
        </div><!--end branchviewform-->
      </div><!--panel 6 branchTable-->
    </div><!--end sections info-->

    <div class="classesInfo">
      <nav class="tabs" style="font-color:white;">
        <ul>
          <li><a href="#classesreg" id="" class="sbmenu" style="color:white">Add New</a></li>
            &nbsp;&nbsp;&nbsp;&nbsp;
          <li><a href="#classesview" id="" class="sbmenu" style="color:white" ng-click="loadClasses()">View Registered</a></li>
        </ul>
      </nav>
      <div class="col-lg-8 panel" id="class" style="height:;border:2px solid lightgray;box-shadow:;border-radius: 3px;padding:0% 3% 0% 3%;      padding-bottom: 1%">
        <br/>
        <div class="row" id="classregform" ng-init="loadFaculty()">
          <form name="form" action=""method="POST">
            <h3 style="margin-top:-0.1%">New Class Registration</h3>
            <p style="color:green;">"""),format.raw/*757.37*/("""{"""),format.raw/*757.38*/("""{"""),format.raw/*757.39*/(""" regclasssuccessmsg """),format.raw/*757.59*/("""}"""),format.raw/*757.60*/("""}"""),format.raw/*757.61*/("""</p>
            <div class="form-group">
              <div class="col-lg-2">
                <label for="classname">Class Name</label>
              </div>
              <div class="col-lg-9">
                <input type="text" id="classname" name="classname" class="form-control" ng-model="classname">
              </div>
              <div class="col-lg-1"></div>
            </div><br/><br/>
            <div class="form-group">
              <div class="col-lg-2">
                <label for="classsectionname">Department Name</label>
              </div>
              <div class="col-lg-9">
                <select id="classdeptname" name="classdeptname" class="form-control" ng-model="classdeptid" ng-init="loadDepartment()">
                  <option ng-repeat="dept in departments" value=""""),format.raw/*773.66*/("""{"""),format.raw/*773.67*/("""{"""),format.raw/*773.68*/("""dept.id"""),format.raw/*773.75*/("""}"""),format.raw/*773.76*/("""}"""),format.raw/*773.77*/("""">"""),format.raw/*773.79*/("""{"""),format.raw/*773.80*/("""{"""),format.raw/*773.81*/("""dept.departmentName"""),format.raw/*773.100*/("""}"""),format.raw/*773.101*/("""}"""),format.raw/*773.102*/("""</option>
                </select>
              </div>
              <div class="col-lg-1"></div>
            </div><br/><br/>
            <div class="form-group">
              <div class="col-lg-2">
                <label for="classsectionname">Section Name</label>
              </div>
              <div class="col-lg-9">
                <select id="classsectionname" name="classsectionname" class="form-control" ng-model="classsecid">
                  <option ng-repeat="section in sections" value=""""),format.raw/*784.66*/("""{"""),format.raw/*784.67*/("""{"""),format.raw/*784.68*/("""section.id"""),format.raw/*784.78*/("""}"""),format.raw/*784.79*/("""}"""),format.raw/*784.80*/("""">"""),format.raw/*784.82*/("""{"""),format.raw/*784.83*/("""{"""),format.raw/*784.84*/("""section.sectionName"""),format.raw/*784.103*/("""}"""),format.raw/*784.104*/("""}"""),format.raw/*784.105*/("""</option>
                </select>
              </div>
              <div class="col-lg-1"></div>
            </div>
            <div class="col-lg-5"></div><div class="col-lg-4"><br/><button type="button" class="btn btn-success btn-md" name="btnregdeparment" id="btnregdepartment" ng-click="registerClass()">Register</button></div><div class="col-lg-3"></div>
          </form>
        </div>
          <!--Class form-->
        <div class="row">
          <div  id="classupdform"  class="modal fade" role="dialog">
            <div class="modal-dialog">
                <!-- Modal content-->
              <div class="modal-content">
                <form name="form" action=""method="POST">
                  <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h3>"""),format.raw/*801.25*/("""{"""),format.raw/*801.26*/("""{"""),format.raw/*801.27*/("""classes.className"""),format.raw/*801.44*/("""}"""),format.raw/*801.45*/("""}"""),format.raw/*801.46*/(""" Class Updating</h3>
                  </div>
                  <div class="modal-body">

                    <form name="form" action=""method="POST">


                      <p style="color:green;">"""),format.raw/*808.47*/("""{"""),format.raw/*808.48*/("""{"""),format.raw/*808.49*/(""" updclasssuccessmsg """),format.raw/*808.69*/("""}"""),format.raw/*808.70*/("""}"""),format.raw/*808.71*/("""</p>
                      <div class="form-group">
                        <div class="col-lg-2">
                          <label for="updclassname">Class Name</label>
                        </div>
                        <div class="col-lg-9">
                          <input type="text" id="updclassname" name="updclassname" class="form-control" ng-model="updclasses.classesName">
                        </div>
                        <div class="col-lg-1"></div>
                      </div><br/><br/>
                      <div class="form-group">
                        <div class="col-lg-2">
                          <label for="updclasssectionname">Department Name</label>
                        </div>
                        <div class="col-lg-9">
                          <select id="classdeptname" name="updclassdeptname" class="form-control" ng-model="classdeptid" ng-init="loadDepartment()">
                            <option ng-repeat="upddept in departments" value=""""),format.raw/*824.79*/("""{"""),format.raw/*824.80*/("""{"""),format.raw/*824.81*/("""upddept.id"""),format.raw/*824.91*/("""}"""),format.raw/*824.92*/("""}"""),format.raw/*824.93*/("""">"""),format.raw/*824.95*/("""{"""),format.raw/*824.96*/("""{"""),format.raw/*824.97*/("""upddept.departmentName==updclasses.department.departmentName?updclasses.department.departmentName+" (Current Department)":upddept.departmentName"""),format.raw/*824.241*/("""}"""),format.raw/*824.242*/("""}"""),format.raw/*824.243*/("""</option>
                          </select>
                        </div>
                        <div class="col-lg-1"></div>
                      </div>
                      <div class="form-group">
                        <div class="col-lg-2">
                          <label for="updsectionname">Section Name</label>
                        </div>
                        <div class="col-lg-9">
                          <select id="updclasssecyname" name="updclasssecname" class="form-control" ng-model="classsecid">
                            <option ng-repeat="section in sections" value=""""),format.raw/*835.76*/("""{"""),format.raw/*835.77*/("""{"""),format.raw/*835.78*/("""section.id"""),format.raw/*835.88*/("""}"""),format.raw/*835.89*/("""}"""),format.raw/*835.90*/("""">"""),format.raw/*835.92*/("""{"""),format.raw/*835.93*/("""{"""),format.raw/*835.94*/("""section.sectionName==updclasses.section.sectionName?section.sectionName+" (Current Section)":section.sectionName"""),format.raw/*835.206*/("""}"""),format.raw/*835.207*/("""}"""),format.raw/*835.208*/("""</option>
                          </select>

                        </div>
                        <div class="col-lg-1"></div>
                        <br> <br> <br></div>
                      <div class="modal-footer">
                        <button type="button" class="btn btn-success btn-md" name="btnupdclass" style="margin-top: -2%"  id="updclass" ng-click="updateClass()">Update</button>
                        <button type="button" class="btn btn-danger" data-dismiss="modal">
                          Cancel</button>
                      </div>
                    </form>
                  </div>
              </div>
            </div>
          </div>
        </div>
          <!--end update-->
          <!--registered-->
        <div class="row" id="classviewform" ng-init="loadClasses();loadSection()">
          <form action="/search/" method="GET">
            <div class="col-lg-12 input-goup">
              <input type="text" name="srch" id="srch" placeholder="class name..." ng-model="classkeyword" ng-keyup="searchClass()" class="form-control srch">
            </div></form><br/><br/>
          <span style="color:green">"""),format.raw/*859.37*/("""{"""),format.raw/*859.38*/("""{"""),format.raw/*859.39*/(""" classfeedmsg """),format.raw/*859.53*/("""}"""),format.raw/*859.54*/("""}"""),format.raw/*859.55*/("""</span><br/>
          <table class="table table-bordered">
            <caption>Registered Classes</caption>
            <thead>
              <tr>
                <th>Classes</th>
                <th> Department </th>
                <th> Sections </th>
                <th colspan="2"> Modifications </th>
              </tr>
            </thead>
            <tbody>
              <tr ng-repeat="class in classes">
                <th> """),format.raw/*872.22*/("""{"""),format.raw/*872.23*/("""{"""),format.raw/*872.24*/(""" class.classesName """),format.raw/*872.43*/("""}"""),format.raw/*872.44*/("""}"""),format.raw/*872.45*/(""" </th>
                <th> """),format.raw/*873.22*/("""{"""),format.raw/*873.23*/("""{"""),format.raw/*873.24*/(""" class.department.departmentName """),format.raw/*873.57*/("""}"""),format.raw/*873.58*/("""}"""),format.raw/*873.59*/(""" </th>
                <th> """),format.raw/*874.22*/("""{"""),format.raw/*874.23*/("""{"""),format.raw/*874.24*/(""" class.section.sectionName """),format.raw/*874.51*/("""}"""),format.raw/*874.52*/("""}"""),format.raw/*874.53*/(""" </th>
                <th style="text-align:center;"><a href="#" class="btn btn-warning glyphicon glyphicon-pencil" data-toggle="modal" data-target="#classupdform" ng-click="loadClassesUpdater(class.id)">Edit</a></th>
                <th style="text-align:center;"><a href="#" class="btn btn-danger glyphicon glyphicon-remove" data-toggle="modal" data-target="#delModal"ng-click="setCurrentCateId('class',class.id)">Delete</a>
                  </a></th>
              </tr>
            </tbody>
          </table>
        </div><!--end branchviewform-->
      </div><!--panel 6 branchTable-->
    </div><!--end classes info-->

    <!--sponsor Info-->
    <div class="sponsorInfo" ng-init="loadSponsor()">
      <nav class="tabs" style="font-color:white;">
        <ul>
          <li><a href="#sponsorreg" id="" class="sbmenu" style="color:white">Add New</a></li>
            &nbsp;&nbsp;&nbsp;&nbsp;
          <li><a href="#sponsorview" id="" class="sbmenu" style="color:white" ng-click="loadSponsor()">View Registered</a></li>
        </ul>
      </nav>
      <div class="col-lg-8 panel" id="sponsor" style="height:;border:2px solid lightgray;box-shadow:;border-radius: 3px;padding:0% 3% 0% 3%; padding-bottom:;">
        <br/>
        <div class="row" id="sponsorregform">
          <form name="form" action=""method="POST">
            <h3 style="margin-top:-0.1%">New Sponsor Registration</h3>
            <p style="color:green;">"""),format.raw/*899.37*/("""{"""),format.raw/*899.38*/("""{"""),format.raw/*899.39*/(""" regsponsorsuccessmsg """),format.raw/*899.61*/("""}"""),format.raw/*899.62*/("""}"""),format.raw/*899.63*/("""</p>
            <div class="form-group">
              <div class="col-lg-2">
                <label for="sponsorname">Sponsor's Name</label>
              </div>
              <div class="col-lg-9">
                <input type="text" id="sponsorname" name="sponsorname" class="form-control" ng-model="sponsorName">
              </div>
              <div class="col-lg-1"></div>
            </div><br/><br/>
            <div class="form-group">
              <div class="col-lg-2">
                <label for="sponsoremail">E-mail</label>
              </div>
              <div class="col-lg-9">
                <input type="text" id="sponsoremail" name="sponsoremail" class="form-control" ng-model="sponsorEmail">
              </div>
              <div class="col-lg-1"></div>
            </div><br/><br/>
            <div class="form-group">
              <div class="col-lg-2">
                <label for="sponsorphone">Phone</label>
              </div>
              <div class="col-lg-9">
                <input type="text" id="sponsorphone" name="sponsorphone" class="form-control" ng-model="sponsorPhone">
              </div>
              <div class="col-lg-1"></div>
            </div><br/><br/>
            <div class="form-group">
              <div class="col-lg-2">
                <label for="sponsoraddress">Address</label>
              </div>
              <div class="col-lg-9">
                <textarea cols="50" rows="5" id="sponsoraddress" name="sponsoraddress" class="form-control" ng-model="sponsorAddress"></textarea>
              </div>
              <div class="col-lg-1"></div>
            </div>
            <div class="col-lg-5"></div><div class="col-lg-4"><br/><button type="button" class="btn btn-success btn-lg" name="regsponsor" style="margin-top: -1%" id="regsponsor" ng-click="registerSponsor()" value="">Register</button><br/><br/></div><div class="col-lg-3"></div>
          </form>
        </div>
          <!--updating form-->
        <div class="row">
          <div id="sponsorupdform" class="modal fade" role="dialog">
          <div class="modal-dialog">
              <!-- Modal content-->
            <div class="modal-content">
              <form name="form" action=""method="POST">
                <div class="modal-header">
                  <button type="button" class="close" data-dismiss="modal">&times;</button>
                  <h3>"""),format.raw/*948.23*/("""{"""),format.raw/*948.24*/("""{"""),format.raw/*948.25*/("""sponsor.sponsorName"""),format.raw/*948.44*/("""}"""),format.raw/*948.45*/("""}"""),format.raw/*948.46*/(""" Sponsor Updating</h3>
                </div>
                <div class="modal-body">
          <form name="form" action=""method="POST">
            <p style="color:green;">"""),format.raw/*952.37*/("""{"""),format.raw/*952.38*/("""{"""),format.raw/*952.39*/(""" updsponsorsuccessmsg """),format.raw/*952.61*/("""}"""),format.raw/*952.62*/("""}"""),format.raw/*952.63*/("""</p>
            <div class="form-group">
              <div class="col-lg-2">
                <label for="updsponsorname">Sponsor's Name</label>
              </div>
              <div class="col-lg-9">
                <input type="text" id="updsponsorname" name="updsponsorname" class="form-control" ng-model="updsponsor.sponsorName">
              </div>
              <div class="col-lg-1"></div>
            </div><br/><br/>
            <div class="form-group">
              <div class="col-lg-2">
                <label for="updsponsoremail">E-mail</label>
              </div>
              <div class="col-lg-9">
                <input type="text" id="updsponsoremail" name="updsponsoremail" class="form-control" ng-model="updsponsor.sponsorEmail">
              </div>
              <div class="col-lg-1"></div>
            </div><br/><br/>
            <div class="form-group">
              <div class="col-lg-2">
                <label for="updsponsorphone">Phone</label>
              </div>
              <div class="col-lg-9">
                <input type="text" id="updsponsorphone" name="updsponsorphone" class="form-control" ng-model="updsponsor.sponsorPhone">
              </div>
              <div class="col-lg-1"></div>
            </div><br/><br/>
            <div class="form-group">
              <div class="col-lg-2">
                <label for="updsponsoraddress">Address</label>
              </div>
              <div class="col-lg-9">
                <textarea cols="50" rows="5" id="updsponsoraddress" name="updsponsoraddress" class="form-control" ng-model="updsponsor.sponsorAddress"></textarea>
              </div>
              <div class="col-lg-1"></div>
                  <br> <br> <br><br> <br> <br></div>
                <div class="modal-footer">
                  <button type="button" class="btn btn-success btn-md" name="updsponsor" style="margin-top: -1%" id="regsponsor" ng-click="updateSponsor()">Update</button>
                  <button type="button" class="btn btn-danger" data-dismiss="modal">
                    Cancel</button>
                </div>
              </form>
            </div>
          </div>
          </div>
        </div>
</div>
          <!--end update-->
          <!--sponsor view-->
        <div class="row" id="sponsorviewform">
          <form action="/search/" method="GET">
            <div class="col-lg-12 input-goup">
              <input type="text" name="srch" id="srch" placeholder="sponsor name..." ng-model="sponsorkeyword" ng-keyup="searchSponsor()" class="form-control srch">
            </div></form><br/><br/>
          <span style="color:green">"""),format.raw/*1007.37*/("""{"""),format.raw/*1007.38*/("""{"""),format.raw/*1007.39*/(""" sponsorfeedmsg """),format.raw/*1007.55*/("""}"""),format.raw/*1007.56*/("""}"""),format.raw/*1007.57*/("""</span><br/>
          <table class="table table-bordered">
            <caption>Registered Sponsors</caption>
            <thead>
              <tr>
                <th> Sponsor </th>
                <th> E-mail </th>
                <th> Phone </th>
                <th colspan="3">  Modifications</th>
              </tr>
            </thead>
            <tbody>
              <tr ng-repeat="sponsor in sponsors">
                <th> """),format.raw/*1020.22*/("""{"""),format.raw/*1020.23*/("""{"""),format.raw/*1020.24*/(""" sponsor.sponsorName """),format.raw/*1020.45*/("""}"""),format.raw/*1020.46*/("""}"""),format.raw/*1020.47*/(""" </th>
                <th> """),format.raw/*1021.22*/("""{"""),format.raw/*1021.23*/("""{"""),format.raw/*1021.24*/(""" sponsor.sponsorEmail """),format.raw/*1021.46*/("""}"""),format.raw/*1021.47*/("""}"""),format.raw/*1021.48*/(""" </th>
                <th> """),format.raw/*1022.22*/("""{"""),format.raw/*1022.23*/("""{"""),format.raw/*1022.24*/(""" sponsor.sponsorPhone """),format.raw/*1022.46*/("""}"""),format.raw/*1022.47*/("""}"""),format.raw/*1022.48*/(""" </th>
                <th style="text-align:center;"><a href="#" class="btn btn-warning glyphicon glyphicon-pencil" data-toggle="modal" data-target="#sponsorupdform"ng-click="loadSponsorUpdater(sponsor.id)">Edit</a></th>
                <th style="text-align:center;"><a href="#" class="btn btn-danger glyphicon glyphicon-remove" data-toggle="modal" data-target="#delModal" ng-click="setCurrentCateId('sponsor',sponsor.id)">Delete</a>
                  </a></th>
              </tr>
            </tbody>
          </table>
        </div><!--end sponsorviewform-->
      </div><!--panel 6 sponsor-->
    </div><!--end sponsor info-->

<div class="employeesInfo">
    <nav class="tabs" style="font-color:white;">
      <ul>
        <li><a href="#employeesreg" id="" class="sbmenu" style="color:white">Add New</a></li>
          &nbsp;&nbsp;&nbsp;&nbsp;
        <li><a href="#employeesview" id="" class="sbmenu" style="color:white" ng-click="loadEmployee()">View Registered</a></li>
      </ul>
    </nav>
    <div class="col-lg-8 panel" id="employees" style="height:;border:2px solid lightgray;box-shadow:;border-radius: 3px;padding:0% 3% 0% 3%;      padding-bottom: 1%">
      <br/>
    <div class="row" id="employeeregform">
      <form name="form" action=""method="POST">
        <h3 style="margin-top:-0.1%">New Employee Registration</h3>
      <p style="color:green;">"""),format.raw/*1046.31*/("""{"""),format.raw/*1046.32*/("""{"""),format.raw/*1046.33*/(""" regemployeesuccessmsg """),format.raw/*1046.56*/("""}"""),format.raw/*1046.57*/("""}"""),format.raw/*1046.58*/("""</p>
          <div class="col-lg-6 form-group">
            <label for="fname">First Name</label>
            <input type="text" name="fname" id="fname" placeholder="Firstname" class="form-control" ng-model="empfname" autocomplete="off" required>
          </div>

          <div class="col-lg-6  form-group">
            <label for="lastname">Lastname</label>
            <input type="text" name="lastname" id="lastname" placeholder="Lastname" class="form-control"  ng-model="emplname" autocomplete="off" required>
          </div>

          <div class="col-lg-6  form-group">
            <label for="empemail">E-mail</label>
            <input type="text" name="empemail" id="empemail" placeholder="email" class="form-control" ng-model="empemail" autocomplete="off" required>
          </div>
          <div class="col-lg-6 form-group">
            <label for="empphone">Phone</label>
            <input type="text" name="empphone" id="empphone" placeholder="Phone Number" class="form-control" ng-model="empphone" autocomplete="off" required>
          </div>

        <div class="col-lg-6 form-group">
          <label for="emppwd">Password</label>
          <input type="password" name="emppwd" id="emppwd" class="form-control" ng-model="empppwd" autocomplete="off" required>
        </div>

        <div class="col-lg-6 form-group">
          <label for="empconfpwd">Confirm Password</label>
          <input type="password" name="empconfpwd" id="empconfpwd" class="form-control" ng-model="empconfpwd" autocomplete="off" required>
        </div>

        <div class="col-lg-12 form-group">
        <div class="row">
          <div class="col-lg-6 form-group">
            <label for="location">Location</label>
            <input type="text" name="location" id="location" placeholder="location" class="form-control" ng-model="emplocation" autocomplete="off" required>
<br>
            <label for="updqualification">Qualification</label>
            <input type="text" name="qualification" id="qualification" placeholder="Qualification" class="form-control" ng-model="empqualification" autocomplete="off" required>
          </div>

            <div class="col-lg-6  form-group">
                <label for="empaddress">Address</label>
                <textarea name="empaddress" id="empaddress" rows=5 cols="35" placeholder="Address" class="form-control" ng-model="empaddress" autocomplete="off" required></textarea>
            </div>
        </div>
          </div>

           <div class="col-lg-5"></div><div class="col-lg-4"><button type="button" class="btn btn-success btn-lg" name="btnregemployee" style="margin-top: -1%" id="btnregbranch" ng-click="registerEmployee()" value="">Register</button><br/><br/></div><div class="col-lg-3"></div>
</form>
    </div>

  <div class="row">
    <div  id="employeeupdform" class="modal fade" role="dialog">
      <div class="modal-dialog">
          <!-- Modal content-->
        <div class="modal-content">
          <form name="form" action=""method="POST">
            <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal">&times;</button>
              <h3>"""),format.raw/*1105.19*/("""{"""),format.raw/*1105.20*/("""{"""),format.raw/*1105.21*/(""" updemp.firstName+"&nbsp;&nbsp;"+updemp.lastName """),format.raw/*1105.70*/("""}"""),format.raw/*1105.71*/("""}"""),format.raw/*1105.72*/(""" Updating Employee</h3>
            </div>
            <div class="modal-body">
    <form name="form" action=""method="POST">
      <p style="color:green;">"""),format.raw/*1109.31*/("""{"""),format.raw/*1109.32*/("""{"""),format.raw/*1109.33*/(""" updemployeesuccessmsg """),format.raw/*1109.56*/("""}"""),format.raw/*1109.57*/("""}"""),format.raw/*1109.58*/("""</p>
      <div class="col-lg-6 form-group">
        <label for="fname">First Name</label>
        <input type="text" name="updfname" id="updfname" placeholder="Firstname" class="form-control" ng-model="updemp.firstName" autocomplete="off" required>
      </div>

      <div class="col-lg-6  form-group">
        <label for="lastname">Lastname</label>
        <input type="text" name="updlastname" id="updlastname" placeholder="Lastname" class="form-control"  ng-model="updemp.lastName" autocomplete="off" required>
      </div>

      <div class="col-lg-6  form-group">
        <label for="empemail">E-mail</label>
        <input type="text" name="updempemail" id="updempemail" placeholder="email" class="form-control" ng-model="updemp.email" autocomplete="off" required>
      </div>
      <div class="col-lg-6 form-group">
        <label for="updempphone">Phone</label>
        <input type="text" name="updempphone" id="updempphone" placeholder="Phone Number" class="form-control" ng-model="updemp.phoneNumber" autocomplete="off" required>
      </div>

      <div class="col-lg-12 form-group">
        <div class="row">
          <div class="col-lg-6 form-group">
            <label for="updlocation">Location</label>
            <input type="text" name="updlocation" id="updlocation" placeholder="location" class="form-control" ng-model="updemp.location" autocomplete="off" required>
            <br>
            <label for="updqualification">Qualification</label>
            <input type="text" name="updqualification" id="updqualification" placeholder="Qualification" class="form-control" ng-model="updemp.qualification" autocomplete="off" required>
          </div>

          <div class="col-lg-6  form-group">
            <label for="empaddress">Address</label>
            <textarea name="updempaddress" id="updempaddress" rows=5 cols="35" placeholder="Address" class="form-control" ng-model="updemp.address" autocomplete="off" required></textarea>
          </div>
        </div>
      </div>
          <br> <br> <br><br> <br> <br></div>
        <div class="modal-footer">
          <button type="button" class="btn btn-success btn-md" name="btnupdemployee" style="margin-top: -1%" id="btnupdemployee" ng-click="updateEmployee()">Update</button>
          <button type="button" class="btn btn-danger" data-dismiss="modal">
            Cancel</button>
        </div>
        </form>
      </div>
    </div>
  </div>
  </div>
      <div class="row" id="employeeviewform">
        <form action="/search/" method="GET">
          <div class="col-lg-12 input-goup">
            <input type="text" name="srch" id="srch" placeholder="Employee name..." ng-model="employeekeyword" ng-keyup="searchEmployee()" class="form-control srch">
          </div></form><br/><br/>
        <span style="color:green">"""),format.raw/*1161.35*/("""{"""),format.raw/*1161.36*/("""{"""),format.raw/*1161.37*/(""" employeefeedmsg """),format.raw/*1161.54*/("""}"""),format.raw/*1161.55*/("""}"""),format.raw/*1161.56*/("""</span><br/>
        <table class="table table-bordered">
          <caption>Registered Employees</caption>
          <thead>
            <tr>
              <th>Names  </th>
              <th> Contacts </th>
              <th>  Qualification</th>
              <th colspan="2">  Modifications</th>
            </tr>
          </thead>
          <tbody>
            <tr ng-repeat="emp in employee">
              <th> """),format.raw/*1174.20*/("""{"""),format.raw/*1174.21*/("""{"""),format.raw/*1174.22*/(""" emp.firstName+"&nbsp;&nbsp;"+emp.lastName """),format.raw/*1174.65*/("""}"""),format.raw/*1174.66*/("""}"""),format.raw/*1174.67*/("""  </th>
              <th> """),format.raw/*1175.20*/("""{"""),format.raw/*1175.21*/("""{"""),format.raw/*1175.22*/(""" emp.phoneNumber+";&nbsp;&nbsp;"+emp.email """),format.raw/*1175.65*/("""}"""),format.raw/*1175.66*/("""}"""),format.raw/*1175.67*/(""" </th>
              <th>  """),format.raw/*1176.21*/("""{"""),format.raw/*1176.22*/("""{"""),format.raw/*1176.23*/("""emp.qualification"""),format.raw/*1176.40*/("""}"""),format.raw/*1176.41*/("""}"""),format.raw/*1176.42*/("""</th>
              <th style="text-align:center;"><a href="#" class="btn btn-warning glyphicon glyphicon-pencil"data-toggle="modal" data-target="#employeeupdform"ng-click="loadEmployeeUpdater(emp.id)">Edit</a></th>
              <th style="text-align:center;"><a href="#" class="btn btn-danger glyphicon glyphicon-remove"data-toggle="modal" data-target="#delModal" ng-click="setCurrentCateId('employee',emp.id)">Delete</a>
                </a></th>
            </tr>
          </tbody>
        </table>
      </div><!--end employeeviewform-->
</div>
</div>

  <div id="delModal" class="modal fade" role="dialog">
    <div class="modal-dialog">
        <!-- Modal content-->
      <div class="modal-content">
        <form ng-submit="" >
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal">&times;</button>
            <h4 class="modal-title">Do you want to delete  ?</h4>
          </div>
          <div class="modal-body" >
            <p style="color:green;font-size:14px;"> """),format.raw/*1197.53*/("""{"""),format.raw/*1197.54*/("""{"""),format.raw/*1197.55*/("""delsuccessmsg"""),format.raw/*1197.68*/("""}"""),format.raw/*1197.69*/("""}"""),format.raw/*1197.70*/(""" </p>
            <label>Delete reason </label>
            <textarea class="form-control" ng-model="deleteReason" required></textarea>

          </div>
          <div class="modal-footer">
            <button type="submit" class="btn btn-danger" ng-click="delete()" >
              Delete</button><button type="button" class="btn btn-default" data-dismiss="modal">
            Close</button>
          </div>
        </form>
      </div>

    </div>
  </div><!--end delete Modal-->

    <div id="viewBranchModal" class="modal fade viewBranch" role="dialog">
      <div class="modal-dialog">
          <!-- Modal content-->
        <div class="modal-content">
          <form ng-submit="" >
            <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal">&times;</button>
              <h4 class="modal-title"> """),format.raw/*1220.40*/("""{"""),format.raw/*1220.41*/("""{"""),format.raw/*1220.42*/(""" viewBranch.branchName """),format.raw/*1220.65*/("""}"""),format.raw/*1220.66*/("""}"""),format.raw/*1220.67*/(""" Information</h4>
            </div>
            <div class="modal-body">
    <h5><b>Chancellor:</b>"""),format.raw/*1223.27*/("""{"""),format.raw/*1223.28*/("""{"""),format.raw/*1223.29*/(""" viewBranch.employee.firstName+"&nbsp;&nbsp;"+viewBranch.employee.lastName """),format.raw/*1223.104*/("""}"""),format.raw/*1223.105*/("""}"""),format.raw/*1223.106*/("""</h5>
             <address><b>Address:</b>"""),format.raw/*1224.38*/("""{"""),format.raw/*1224.39*/("""{"""),format.raw/*1224.40*/(""" viewBranch.branchAddress """),format.raw/*1224.66*/("""}"""),format.raw/*1224.67*/("""}"""),format.raw/*1224.68*/("""</address>
            </div>
            <div class="modal-footer">
              <button type="submit" class="btn btn-info" data-dismiss="modal" data-toggle="modal" data-target="#branchupdform" ng-click="loadBranchUpdater(viewBranch.id)">
                Edit</button><button type="button" class="btn btn-warning" data-dismiss="modal">
              Close</button>
            </div>
          </form>
        </div>

      </div>
    </div><!--end view Modal-->

        <div id="viewSponsorModal" class="modal fade viewSponsor" role="dialog">
          <div class="modal-dialog">
              <!-- Modal content-->
            <div class="modal-content">
              <form ng-submit="" >
                <div class="modal-header">
                  <button type="button" class="close" data-dismiss="modal">&times;</button>
                  <h4 class="modal-title"> """),format.raw/*1244.44*/("""{"""),format.raw/*1244.45*/("""{"""),format.raw/*1244.46*/(""" viewSponsor.sponsorName """),format.raw/*1244.71*/("""}"""),format.raw/*1244.72*/("""}"""),format.raw/*1244.73*/(""" Ltd Information</h4>
                </div>
                <div class="modal-body">
                  <div>
                    <b>Phone:</b> """),format.raw/*1248.35*/("""{"""),format.raw/*1248.36*/("""{"""),format.raw/*1248.37*/("""viewSponsor.sponsorPhone"""),format.raw/*1248.61*/("""}"""),format.raw/*1248.62*/("""}"""),format.raw/*1248.63*/("""<br/>
                   <b> E-mail:</b>"""),format.raw/*1249.35*/("""{"""),format.raw/*1249.36*/("""{"""),format.raw/*1249.37*/(""" viewSponsor.sponsorEmail """),format.raw/*1249.63*/("""}"""),format.raw/*1249.64*/("""}"""),format.raw/*1249.65*/("""
                  </div>
                  <div><b>Address:</b><br> """),format.raw/*1251.44*/("""{"""),format.raw/*1251.45*/("""{"""),format.raw/*1251.46*/(""" viewSponsor.sponsorAddress """),format.raw/*1251.74*/("""}"""),format.raw/*1251.75*/("""}"""),format.raw/*1251.76*/("""</div>
                </div>
                <div class="modal-footer">
                  <button type="submit" class="btn btn-info" data-dismiss="modal" data-toggle="modal" data-target="#sponsorupdform" ng-click="loadSponsorUpdater(viewSponsor.id)">
                    Edit</button><button type="button" class="btn btn-warning" data-dismiss="modal">
                  Close</button>
                </div>
              </form>
            </div>

          </div>
        </div><!--end delete Modal-->

    <div id="viewEmployeeModal" class="modal fade viewEmployee" role="dialog">
      <div class="modal-dialog">
          <!-- Modal content-->
        <div class="modal-content">
          <form ng-submit="" >
            <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal">&times;</button>
              <h4 class="modal-title"> """),format.raw/*1271.40*/("""{"""),format.raw/*1271.41*/("""{"""),format.raw/*1271.42*/(""" viewEmployee.firstName+"&nbsp;&nbsp;"+viewEmployee.lastName """),format.raw/*1271.103*/("""}"""),format.raw/*1271.104*/("""}"""),format.raw/*1271.105*/(""" Information</h4>
            </div>
            <div class="modal-body">
              <div>
                <h5><b>Contact:</b></h5>
                <b> E-mail:</b>"""),format.raw/*1276.32*/("""{"""),format.raw/*1276.33*/("""{"""),format.raw/*1276.34*/("""vewEmployee.email"""),format.raw/*1276.51*/("""}"""),format.raw/*1276.52*/("""}"""),format.raw/*1276.53*/("""<br>Phone:"""),format.raw/*1276.63*/("""{"""),format.raw/*1276.64*/("""{"""),format.raw/*1276.65*/("""vewEmployee.phone"""),format.raw/*1276.82*/("""}"""),format.raw/*1276.83*/("""}"""),format.raw/*1276.84*/("""
              </div>
                <div> <b>Qualification:</b>"""),format.raw/*1278.44*/("""{"""),format.raw/*1278.45*/("""{"""),format.raw/*1278.46*/(""" vewEmployee.qualification """),format.raw/*1278.73*/("""}"""),format.raw/*1278.74*/("""}"""),format.raw/*1278.75*/(""" </div>
                <div>
                  <h5><b>Address</b></h5>
                  Location: """),format.raw/*1281.29*/("""{"""),format.raw/*1281.30*/("""{"""),format.raw/*1281.31*/(""" viewEmployee.location """),format.raw/*1281.54*/("""}"""),format.raw/*1281.55*/("""}"""),format.raw/*1281.56*/("""<br/>
                  """),format.raw/*1282.19*/("""{"""),format.raw/*1282.20*/("""{"""),format.raw/*1282.21*/(""" viewEmployee.address """),format.raw/*1282.43*/("""}"""),format.raw/*1282.44*/("""}"""),format.raw/*1282.45*/("""
                  </div>
            </div>
            <div class="modal-footer">
              <button type="submit" class="btn btn-info" data-dismiss="modal" data-toggle="modal" data-target="#employeeupdform" ng-click="loadEmployeeUpdater(viewEmployee.id)">
                Edit</button><button type="button" class="btn btn-warning" data-dismiss="modal">
              Close</button>
            </div>
          </form>
        </div>
        </div>
      </div>

        <div class="col-lg-1">
        </div>
<script type="text/javascript">
    $(document).ready(function()"""),format.raw/*1298.33*/("""{"""),format.raw/*1298.34*/("""
      //popover
      $('[data-toggle="popover"]').popover();

      $('#starttime').click(function () """),format.raw/*1302.41*/("""{"""),format.raw/*1302.42*/("""
        $('#starttime').datepicker('show');
      """),format.raw/*1304.7*/("""}"""),format.raw/*1304.8*/(""");
      $('#endtime').click(function () """),format.raw/*1305.39*/("""{"""),format.raw/*1305.40*/("""
        $('#endtime').datepicker('show');
      """),format.raw/*1307.7*/("""}"""),format.raw/*1307.8*/(""");
    """),format.raw/*1308.5*/("""}"""),format.raw/*1308.6*/(""");
    function checkURI(sdta)"""),format.raw/*1309.28*/("""{"""),format.raw/*1309.29*/("""
      //alert(sdta);
      switch(sdta)"""),format.raw/*1311.19*/("""{"""),format.raw/*1311.20*/("""
        case 'branches':
        case 'branchreg':
          document.querySelector(".branchInfo").style.display="block";
          document.querySelector(".applicationInfo").style.display="none";
          document.querySelector(".facultyInfo").style.display="none";
          document.querySelector(".departmentsInfo").style.display="none";
          document.querySelector(".sectionsInfo").style.display="none";
          document.querySelector(".classesInfo").style.display="none";
          document.querySelector(".sponsorInfo").style.display="none";
          document.querySelector(".employeesInfo").style.display="none";
          //branches interface
          document.querySelector("#branchregform").style.display="block";
          document.querySelector("#branchupdform").style.display="none";
          document.querySelector("#branchviewform").style.display="none";
          break;
        case'branchupd':
          document.querySelector(".branchInfo").style.display="block";
          document.querySelector(".applicationInfo").style.display="none";
          document.querySelector(".facultyInfo").style.display="none";
          document.querySelector(".departmentsInfo").style.display="none";
          document.querySelector(".sectionsInfo").style.display="none";
          document.querySelector(".classesInfo").style.display="none";
          document.querySelector(".sponsorInfo").style.display="none";
          document.querySelector(".employeesInfo").style.display="none";

          document.querySelector("#branchregform").style.display="none";
          document.querySelector("#branchupdform").style.display="block";
          document.querySelector("#branchviewform").style.display="none";
          break;
        case'branchview':
          document.querySelector(".branchInfo").style.display="block";
          document.querySelector(".applicationInfo").style.display="none";
          document.querySelector(".facultyInfo").style.display="none";
          document.querySelector(".departmentsInfo").style.display="none";
          document.querySelector(".sectionsInfo").style.display="none";
          document.querySelector(".classesInfo").style.display="none";
          document.querySelector(".sponsorInfo").style.display="none";
          document.querySelector(".employeesInfo").style.display="none";
          document.querySelector("#branchregform").style.display="none";
          document.querySelector("#branchupdform").style.display="none";
          document.querySelector("#branchviewform").style.display="block";
          break;
        case 'application':
        case 'applicationreg':
          document.querySelector(".branchInfo").style.display="none";
          document.querySelector(".applicationInfo").style.display="block";
          document.querySelector(".facultyInfo").style.display="none";
          document.querySelector(".departmentsInfo").style.display="none";
          document.querySelector(".sectionsInfo").style.display="none";
          document.querySelector(".classesInfo").style.display="none";
          document.querySelector(".sponsorInfo").style.display="none";
          document.querySelector(".employeesInfo").style.display="none";
          //interface
          document.querySelector("#applicationregform").style.display="block";
          document.querySelector("#applicationupdform").style.display="none";
          document.querySelector("#applicationviewform").style.display="none";

          document.querySelector("#applicationregtypeform").style.display="none";
          document.querySelector("#applicationupdtypeform").style.display="none";
          document.querySelector("#applicationviewtypeform").style.display="none";
          break;
        case 'applicationregtype':
          document.querySelector(".branchInfo").style.display="none";
          document.querySelector(".applicationInfo").style.display="block";
          document.querySelector(".facultyInfo").style.display="none";
          document.querySelector(".departmentsInfo").style.display="none";
          document.querySelector(".sectionsInfo").style.display="none";
          document.querySelector(".classesInfo").style.display="none";
          document.querySelector(".sponsorInfo").style.display="none";
          document.querySelector(".employeesInfo").style.display="none";
          //interface
          document.querySelector("#applicationregform").style.display="none";
          document.querySelector("#applicationupdform").style.display="none";
          document.querySelector("#applicationviewform").style.display="none";

          document.querySelector("#applicationregtypeform").style.display="block";
          document.querySelector("#applicationupdtypeform").style.display="none";
          document.querySelector("#applicationviewtypeform").style.display="none";
          break;

        case'applicationupd':
          document.querySelector(".branchInfo").style.display="none";
          document.querySelector(".applicationInfo").style.display="block";
          document.querySelector(".facultyInfo").style.display="none";
          document.querySelector(".departmentsInfo").style.display="none";
          document.querySelector(".sectionsInfo").style.display="none";
          document.querySelector(".classesInfo").style.display="none";
          document.querySelector(".sponsorInfo").style.display="none";
          document.querySelector(".employeesInfo").style.display="none";
          //interface
          document.querySelector("#applicationregform").style.display="none";
          document.querySelector("#applicationupdform").style.display="block";
          document.querySelector("#applicationviewform").style.display="none";

          document.querySelector("#applicationregtypeform").style.display="none";
          document.querySelector("#applicationupdtypeform").style.display="none";
          document.querySelector("#applicationviewtypeform").style.display="none";
          break;
        case'applicationupdtype':
          document.querySelector(".branchInfo").style.display="none";
          document.querySelector(".applicationInfo").style.display="block";
          document.querySelector(".facultyInfo").style.display="none";
          document.querySelector(".departmentsInfo").style.display="none";
          document.querySelector(".sectionsInfo").style.display="none";
          document.querySelector(".classesInfo").style.display="none";
          document.querySelector(".sponsorInfo").style.display="none";
          document.querySelector(".employeesInfo").style.display="none";
          //interface
          document.querySelector("#applicationregform").style.display="none";
          document.querySelector("#applicationupdform").style.display="none";
          document.querySelector("#applicationviewform").style.display="none";

          document.querySelector("#applicationregtypeform").style.display="none";
          document.querySelector("#applicationupdtypeform").style.display="block";
          document.querySelector("#applicationviewtypeform").style.display="none";
          break;

        case'appicationview':
          document.querySelector(".branchInfo").style.display="none";
          document.querySelector(".applicationInfo").style.display="block";
          document.querySelector(".facultyInfo").style.display="none";
          document.querySelector(".departmentsInfo").style.display="none";
          document.querySelector(".sectionsInfo").style.display="none";
          document.querySelector(".classesInfo").style.display="none";
          document.querySelector(".sponsorInfo").style.display="none";
          document.querySelector(".employeesInfo").style.display="none";
          //interface
          document.querySelector("#applicationregform").style.display="none";
          document.querySelector("#applicationupdform").style.display="none";
          document.querySelector("#applicationviewform").style.display="block";

          document.querySelector("#applicationregtypeform").style.display="none";
          document.querySelector("#applicationupdtypeform").style.display="none";
          document.querySelector("#applicationviewtypeform").style.display="none";
          break;
        case'applicationviewtype':
          document.querySelector(".branchInfo").style.display="none";
          document.querySelector(".applicationInfo").style.display="block";
          document.querySelector(".facultyInfo").style.display="none";
          document.querySelector(".departmentsInfo").style.display="none";
          document.querySelector(".sectionsInfo").style.display="none";
          document.querySelector(".classesInfo").style.display="none";
          document.querySelector(".sponsorInfo").style.display="none";
          document.querySelector(".employeesInfo").style.display="none";
          //interface
          document.querySelector("#applicationregform").style.display="none";
          document.querySelector("#applicationupdform").style.display="none";
          document.querySelector("#applicationviewform").style.display="none";

          document.querySelector("#applicationregtypeform").style.display="none";
          document.querySelector("#applicationupdtypeform").style.display="none";
          document.querySelector("#applicationviewtypeform").style.display="block";
          break;


        case 'faculties':
        case 'facultyreg':
          document.querySelector(".branchInfo").style.display="none";
          document.querySelector(".applicationInfo").style.display="none";
          document.querySelector(".facultyInfo").style.display="block";
          document.querySelector(".departmentsInfo").style.display="none";
          document.querySelector(".sectionsInfo").style.display="none";
          document.querySelector(".classesInfo").style.display="none";
          document.querySelector(".sponsorInfo").style.display="none";
          document.querySelector(".employeesInfo").style.display="none";
          //faculties interface
          document.querySelector("#facultyregform").style.display="block";
          document.querySelector("#facultyupdform").style.display="none";
          document.querySelector("#facultyviewform").style.display="none";
          break;
        case'facultyupd':
          document.querySelector(".branchInfo").style.display="none";
          document.querySelector(".applicationInfo").style.display="none";
          document.querySelector(".facultyInfo").style.display="block";
          document.querySelector(".departmentsInfo").style.display="none";
          document.querySelector(".sectionsInfo").style.display="none";
          document.querySelector(".classesInfo").style.display="none";
          document.querySelector(".sponsorInfo").style.display="none";
          document.querySelector(".employeesInfo").style.display="none";
          //faculties interface
          document.querySelector("#facultyregform").style.display="none";
          document.querySelector("#facultyupdform").style.display="block";
          document.querySelector("#facultyviewform").style.display="none";
          break;
        case'facultyview':
          document.querySelector(".branchInfo").style.display="none";
          document.querySelector(".applicationInfo").style.display="none";
          document.querySelector(".facultyInfo").style.display="block";
          document.querySelector(".departmentsInfo").style.display="none";
          document.querySelector(".sectionsInfo").style.display="none";
          document.querySelector(".classesInfo").style.display="none";
          document.querySelector(".sponsorInfo").style.display="none";
          document.querySelector(".employeesInfo").style.display="none";
          //faculties interface
          document.querySelector("#facultyregform").style.display="none";
          document.querySelector("#facultyupdform").style.display="none";
          document.querySelector("#facultyviewform").style.display="block";
          break;
        case 'departments':
        case 'departmentreg':
          document.querySelector(".branchInfo").style.display="none";
          document.querySelector(".applicationInfo").style.display="none";
          document.querySelector(".facultyInfo").style.display="none";
          document.querySelector(".departmentsInfo").style.display="block";
          document.querySelector(".sectionsInfo").style.display="none";
          document.querySelector(".classesInfo").style.display="none";
          document.querySelector(".sponsorInfo").style.display="none";
          document.querySelector(".employeesInfo").style.display="none";
          //interface for department
          document.querySelector("#departmentregform").style.display="block";
          document.querySelector("#departmentupdform").style.display="none";
          document.querySelector("#departmentviewform").style.display="none";
          break;
        case'departmentupd':
          document.querySelector(".branchInfo").style.display="none";
          document.querySelector(".applicationInfo").style.display="none";
          document.querySelector(".facultyInfo").style.display="none";
          document.querySelector(".departmentsInfo").style.display="block";
          document.querySelector(".sectionsInfo").style.display="none";
          document.querySelector(".classesInfo").style.display="none";
          document.querySelector(".sponsorInfo").style.display="none";
          document.querySelector(".employeesInfo").style.display="none";
          //interface for department
          document.querySelector("#departmentregform").style.display="none";
          document.querySelector("#departmentupdform").style.display="block";
          document.querySelector("#departmentviewform").style.display="none";
          break;
        case'departmentview':
          document.querySelector(".branchInfo").style.display="none";
          document.querySelector(".applicationInfo").style.display="none";
          document.querySelector(".facultyInfo").style.display="none";
          document.querySelector(".departmentsInfo").style.display="block";
          document.querySelector(".sectionsInfo").style.display="none";
          document.querySelector(".classesInfo").style.display="none";
          document.querySelector(".sponsorInfo").style.display="none";
          document.querySelector(".employeesInfo").style.display="none";
          //interface for department
          document.querySelector("#departmentregform").style.display="none";
          document.querySelector("#departmentupdform").style.display="none";
          document.querySelector("#departmentviewform").style.display="block";
          break;

        case 'sections':
        case 'sectionreg':
          document.querySelector(".branchInfo").style.display="none";
          document.querySelector(".applicationInfo").style.display="none";
          document.querySelector(".facultyInfo").style.display="none";
          document.querySelector(".departmentsInfo").style.display="none";
          document.querySelector(".sectionsInfo").style.display="block";
          document.querySelector(".classesInfo").style.display="none";
          document.querySelector(".sponsorInfo").style.display="none";
          document.querySelector(".employeesInfo").style.display="none";
          //interface for section
          document.querySelector("#sectionregform").style.display="block";
          document.querySelector("#sectionupdform").style.display="none";
          document.querySelector("#sectionviewform").style.display="none";
          break;
        case'sectionupd':
          document.querySelector(".branchInfo").style.display="none";
          document.querySelector(".applicationInfo").style.display="none";
          document.querySelector(".facultyInfo").style.display="none";
          document.querySelector(".departmentsInfo").style.display="none";
          document.querySelector(".sectionsInfo").style.display="block";
          document.querySelector(".classesInfo").style.display="none";
          document.querySelector(".sponsorInfo").style.display="none";
          document.querySelector(".employeesInfo").style.display="none";
          //interface for section
          document.querySelector("#sectionregform").style.display="none";
          document.querySelector("#sectionupdform").style.display="block";
          document.querySelector("#sectionviewform").style.display="none";
          break;
        case'sectionview':
          document.querySelector(".branchInfo").style.display="none";
          document.querySelector(".applicationInfo").style.display="none";
          document.querySelector(".facultyInfo").style.display="none";
          document.querySelector(".departmentsInfo").style.display="none";
          document.querySelector(".sectionsInfo").style.display="block";
          document.querySelector(".classesInfo").style.display="none";
          document.querySelector(".sponsorInfo").style.display="none";
          document.querySelector(".employeesInfo").style.display="none";
          //interface for section
          document.querySelector("#sectionregform").style.display="none";
          document.querySelector("#sectionupdform").style.display="none";
          document.querySelector("#sectionviewform").style.display="block";
          break;

        case 'classes':
        case 'classesreg':
          document.querySelector(".branchInfo").style.display="none";
          document.querySelector(".applicationInfo").style.display="none";
          document.querySelector(".facultyInfo").style.display="none";
          document.querySelector(".departmentsInfo").style.display="none";
          document.querySelector(".sectionsInfo").style.display="none";
          document.querySelector(".classesInfo").style.display="block";
          document.querySelector(".sponsorInfo").style.display="none";
          document.querySelector(".employeesInfo").style.display="none";
          //interface for class
          document.querySelector("#classregform").style.display="block";
          document.querySelector("#classupdform").style.display="none";
          document.querySelector("#classviewform").style.display="none";
          break;
        case'classesupd':
          document.querySelector(".branchInfo").style.display="none";
          document.querySelector(".applicationInfo").style.display="none";
          document.querySelector(".facultyInfo").style.display="none";
          document.querySelector(".departmentsInfo").style.display="none";
          document.querySelector(".sectionsInfo").style.display="none";
          document.querySelector(".classesInfo").style.display="block";
          document.querySelector(".sponsorInfo").style.display="none";
          document.querySelector(".employeesInfo").style.display="none";
          //interface for class
          document.querySelector("#classregform").style.display="none";
          document.querySelector("#classupdform").style.display="block";
          document.querySelector("#classviewform").style.display="none";
          break;
        case'classesview':
          document.querySelector(".branchInfo").style.display="none";
          document.querySelector(".applicationInfo").style.display="none";
          document.querySelector(".facultyInfo").style.display="none";
          document.querySelector(".departmentsInfo").style.display="none";
          document.querySelector(".sectionsInfo").style.display="none";
          document.querySelector(".classesInfo").style.display="block";
          document.querySelector(".sponsorInfo").style.display="none";
          document.querySelector(".employeesInfo").style.display="none";
          //interface for class
          document.querySelector("#classregform").style.display="none";
          document.querySelector("#classupdform").style.display="none";
          document.querySelector("#classviewform").style.display="block";
          break;


        case 'sponsors':
        case 'sponsorreg':
          document.querySelector(".branchInfo").style.display="none";
          document.querySelector(".applicationInfo").style.display="none";
          document.querySelector(".facultyInfo").style.display="none";
          document.querySelector(".departmentsInfo").style.display="none";
          document.querySelector(".sectionsInfo").style.display="none";
          document.querySelector(".classesInfo").style.display="none";
          document.querySelector(".sponsorInfo").style.display="block";
          document.querySelector(".employeesInfo").style.display="none";
          //interface for department
          document.querySelector("#sponsorregform").style.display="block";
          document.querySelector("#sponsorupdform").style.display="none";
          document.querySelector("#sponsorviewform").style.display="none";
          break;
        case'sponsorupd':
          document.querySelector(".branchInfo").style.display="none";
          document.querySelector(".applicationInfo").style.display="none";
          document.querySelector(".facultyInfo").style.display="none";
          document.querySelector(".departmentsInfo").style.display="none";
          document.querySelector(".sectionsInfo").style.display="none";
          document.querySelector(".classesInfo").style.display="none";
          document.querySelector(".sponsorInfo").style.display="block";
          document.querySelector(".employeesInfo").style.display="none";
          //interface
          document.querySelector("#sponsorregform").style.display="none";
          document.querySelector("#sponsorupdform").style.display="block";
          document.querySelector("#sponsorform").style.display="none";
          break;
        case'sponsorview':
          document.querySelector(".branchInfo").style.display="none";
          document.querySelector(".applicationInfo").style.display="none";
          document.querySelector(".facultyInfo").style.display="none";
          document.querySelector(".departmentsInfo").style.display="none";
          document.querySelector(".sectionsInfo").style.display="none";
          document.querySelector(".classesInfo").style.display="none";
          document.querySelector(".sponsorInfo").style.display="block";
          document.querySelector(".employeesInfo").style.display="none";
          //interface
          document.querySelector("#sponsorregform").style.display="none";
          document.querySelector("#sponsorupdform").style.display="none";
          document.querySelector("#sponsorviewform").style.display="block";
          break;

        case 'employees':
        case 'employeesreg':
          document.querySelector(".branchInfo").style.display="none";
          document.querySelector(".applicationInfo").style.display="none";
          document.querySelector(".facultyInfo").style.display="none";
          document.querySelector(".departmentsInfo").style.display="none";
          document.querySelector(".sectionsInfo").style.display="none";
          document.querySelector(".classesInfo").style.display="none";
          document.querySelector(".sponsorInfo").style.display="none";
          document.querySelector(".employeesInfo").style.display="block";
          //interface for department
          document.querySelector("#employeeregform").style.display="block";
          document.querySelector("#employeeupdform").style.display="none";
          document.querySelector("#employeeviewform").style.display="none";
          break;
        case'employeeupd':
          document.querySelector(".branchInfo").style.display="none";
          document.querySelector(".applicationInfo").style.display="none";
          document.querySelector(".facultyInfo").style.display="none";
          document.querySelector(".departmentsInfo").style.display="none";
          document.querySelector(".sectionsInfo").style.display="none";
          document.querySelector(".classesInfo").style.display="none";
          document.querySelector(".sponsorInfo").style.display="none";
          document.querySelector(".employeesInfo").style.display="block";
          //interface for employee
          document.querySelector("#employeeregform").style.display="none";
          document.querySelector("#employeeupdform").style.display="block";
          document.querySelector("#employeeviewform").style.display="none";
          break;
        case'employeesview':
          document.querySelector(".branchInfo").style.display="none";
          document.querySelector(".applicationInfo").style.display="none";
          document.querySelector(".facultyInfo").style.display="none";
          document.querySelector(".departmentsInfo").style.display="none";
          document.querySelector(".sectionsInfo").style.display="none";
          document.querySelector(".classesInfo").style.display="none";
          document.querySelector(".sponsorInfo").style.display="none";
          document.querySelector(".employeesInfo").style.display="block";
          //interface for employee
          document.querySelector("#employeeregform").style.display="none";
          document.querySelector("#employeeupdform").style.display="none";
          document.querySelector("#employeeviewform").style.display="block";
          break;

        default:
          document.querySelector(".branchInfo").style.display="none";
          document.querySelector(".applicationInfo").style.display="none";
          document.querySelector(".facultyInfo").style.display="none";
          document.querySelector(".departmentsInfo").style.display="none";
          document.querySelector(".sectionsInfo").style.display="none";
          document.querySelector(".classesInfo").style.display="none";
          document.querySelector(".sponsorInfo").style.display="none";
          document.querySelector(".employeesInfo").style.display="none";

          document.querySelector("#branchregform").style.display="block";
          document.querySelector("#branchupdform").style.display="none";
          document.querySelector("#branchviewform").style.display="none";
      """),format.raw/*1744.7*/("""}"""),format.raw/*1744.8*/("""
    """),format.raw/*1745.5*/("""}"""),format.raw/*1745.6*/("""

    for(i=0;i<document.getElementsByClassName("sbmenu").length;i++)"""),format.raw/*1747.68*/("""{"""),format.raw/*1747.69*/("""
      document.getElementsByClassName("sbmenu")[i].onclick=function(e)"""),format.raw/*1748.71*/("""{"""),format.raw/*1748.72*/("""
        checkURI(e.target.toString().split("#")[1]);
      """),format.raw/*1750.7*/("""}"""),format.raw/*1750.8*/("""
    """),format.raw/*1751.5*/("""}"""),format.raw/*1751.6*/("""
    checkURI(document.URL.toString().split("#/")==1?document.URL.toString().split("#/").length:document.URL.toString().split("#/")[1]);
    </script>

        """),_display_(Seq[Any](/*1755.10*/footer())),format.raw/*1755.18*/("""
      </div>
      """)))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Aug 30 18:58:34 EET 2017
                    SOURCE: F:/play/ums/app/views/setting.scala.html
                    HASH: f276562cf5442a5fb22e40d5de69e922abc44c20
                    MATRIX: 866->1|899->26|937->27|1041->97|1075->110|1183->191|1211->192|1270->224|1298->225|1360->260|1388->261|1429->275|1457->276|1507->298|1536->299|1595->330|1624->331|1829->507|1859->508|1960->581|1989->582|2175->739|2205->740|2276->783|2305->784|2340->792|2368->793|2542->938|2572->939|2611->950|2640->951|2752->1035|2781->1036|2830->1057|2859->1058|2909->1080|2938->1081|2985->1100|3014->1101|3064->1123|3093->1124|3136->1139|3165->1140|3209->1156|3238->1157|3280->1171|3309->1172|3362->1197|3391->1198|3449->1228|3478->1229|3524->1247|3553->1248|3611->1278|3640->1279|3690->1301|3719->1302|3763->1318|3792->1319|3840->1339|3869->1340|3912->1355|3941->1356|4056->1442|4086->1443|4206->1535|4235->1536|4279->1551|4309->1552|7364->4579|7393->4580|7422->4581|7471->4602|7500->4603|7529->4604|7951->4998|7980->4999|8009->5000|8050->5013|8079->5014|8108->5015|8138->5017|8167->5018|8196->5019|8247->5041|8277->5042|8307->5043|8350->5057|8380->5058|8410->5059|8460->5080|8490->5081|8520->5082|10309->6842|10339->6843|10369->6844|10418->6864|10448->6865|10478->6866|10637->6996|10667->6997|10697->6998|10747->7019|10777->7020|10807->7021|11274->7459|11304->7460|11334->7461|11376->7474|11406->7475|11436->7476|11467->7478|11497->7479|11527->7480|11748->7671|11779->7672|11810->7673|13956->9790|13986->9791|14016->9792|14060->9807|14090->9808|14120->9809|14506->10166|14536->10167|14566->10168|14619->10192|14649->10193|14679->10194|14735->10221|14765->10222|14795->10223|14901->10300|14932->10301|14963->10302|17054->12364|17084->12365|17114->12366|17169->12392|17199->12393|17229->12394|19244->14380|19274->14381|19304->14382|19360->14409|19390->14410|19420->14411|19636->14598|19666->14599|19696->14600|19743->14618|19773->14619|19803->14620|22277->17065|22307->17066|22337->17067|22386->17087|22416->17088|22446->17089|22889->17503|22919->17504|22949->17505|22997->17524|23027->17525|23057->17526|23114->17554|23144->17555|23174->17556|23217->17570|23247->17571|23277->17572|23336->17602|23366->17603|23396->17604|23437->17616|23467->17617|23497->17618|24357->18449|24387->18450|24417->18451|24468->18473|24498->18474|24528->18475|25741->19659|25771->19660|25801->19661|25849->19680|25879->19681|25909->19682|26154->19898|26184->19899|26214->19900|26265->19922|26295->19923|26325->19924|27883->21453|27913->21454|27943->21455|27988->21471|28018->21472|28048->21473|28458->21854|28488->21855|28518->21856|28565->21874|28595->21875|28625->21876|30152->23374|30182->23375|30212->23376|30263->23398|30293->23399|30323->23400|31171->24219|31201->24220|31231->24221|31268->24229|31298->24230|31328->24231|31359->24233|31389->24234|31419->24235|31464->24251|31494->24252|31524->24253|32451->25151|32481->25152|32511->25153|32562->25175|32592->25176|32622->25177|32830->25356|32860->25357|32890->25358|32941->25380|32971->25381|33001->25382|33886->26238|33916->26239|33946->26240|33983->26248|34013->26249|34043->26250|34074->26252|34104->26253|34134->26254|34274->26364|34305->26365|34336->26366|35460->27461|35490->27462|35520->27463|35565->27479|35595->27480|35625->27481|36033->27860|36063->27861|36093->27862|36143->27883|36173->27884|36203->27885|36261->27914|36291->27915|36321->27916|36380->27946|36410->27947|36440->27948|37966->29445|37996->29446|38026->29447|38079->29471|38109->29472|38139->29473|38982->30287|39012->30288|39042->30289|39081->30299|39111->30300|39141->30301|39172->30303|39202->30304|39232->30305|39281->30324|39312->30325|39343->30326|40248->31202|40278->31203|40308->31204|40365->31232|40395->31233|40425->31234|40642->31422|40672->31423|40702->31424|40756->31449|40786->31450|40816->31451|41691->32297|41721->32298|41751->32299|41790->32309|41820->32310|41850->32311|41881->32313|41911->32314|41941->32315|42086->32430|42117->32431|42148->32432|43201->33456|43231->33457|43261->33458|43308->33476|43338->33477|43368->33478|43819->33900|43849->33901|43879->33902|43929->33923|43959->33924|43989->33925|44047->33954|44077->33955|44107->33956|44162->33982|44192->33983|44222->33984|45698->35431|45728->35432|45758->35433|45809->35455|45839->35456|45869->35457|47098->36657|47128->36658|47158->36659|47212->36684|47242->36685|47272->36686|47510->36895|47540->36896|47570->36897|47621->36919|47651->36920|47681->36921|49233->38444|49263->38445|49293->38446|49339->38463|49369->38464|49399->38465|49808->38845|49838->38846|49868->38847|49918->38868|49948->38869|49978->38870|51454->40317|51484->40318|51514->40319|51563->40339|51593->40340|51623->40341|52469->41158|52499->41159|52529->41160|52565->41167|52595->41168|52625->41169|52656->41171|52686->41172|52716->41173|52765->41192|52796->41193|52827->41194|53374->41712|53404->41713|53434->41714|53473->41724|53503->41725|53533->41726|53564->41728|53594->41729|53624->41730|53673->41749|53704->41750|53735->41751|54640->42627|54670->42628|54700->42629|54746->42646|54776->42647|54806->42648|55042->42855|55072->42856|55102->42857|55151->42877|55181->42878|55211->42879|56248->43887|56278->43888|56308->43889|56347->43899|56377->43900|56407->43901|56438->43903|56468->43904|56498->43905|56672->44049|56703->44050|56734->44051|57378->44666|57408->44667|57438->44668|57477->44678|57507->44679|57537->44680|57568->44682|57598->44683|57628->44684|57770->44796|57801->44797|57832->44798|59038->45975|59068->45976|59098->45977|59141->45991|59171->45992|59201->45993|59682->46445|59712->46446|59742->46447|59790->46466|59820->46467|59850->46468|59908->46497|59938->46498|59968->46499|60030->46532|60060->46533|60090->46534|60148->46563|60178->46564|60208->46565|60264->46592|60294->46593|60324->46594|61815->48056|61845->48057|61875->48058|61926->48080|61956->48081|61986->48082|64459->50526|64489->50527|64519->50528|64567->50547|64597->50548|64627->50549|64835->50728|64865->50729|64895->50730|64946->50752|64976->50753|65006->50754|67730->53448|67761->53449|67792->53450|67838->53466|67869->53467|67900->53468|68381->53919|68412->53920|68443->53921|68494->53942|68525->53943|68556->53944|68615->53973|68646->53974|68677->53975|68729->53997|68760->53998|68791->53999|68850->54028|68881->54029|68912->54030|68964->54052|68995->54053|69026->54054|70452->55450|70483->55451|70514->55452|70567->55475|70598->55476|70629->55477|73876->58694|73907->58695|73938->58696|74017->58745|74048->58746|74079->58747|74269->58907|74300->58908|74331->58909|74384->58932|74415->58933|74446->58934|77335->61793|77366->61794|77397->61795|77444->61812|77475->61813|77506->61814|77966->62244|77997->62245|78028->62246|78101->62289|78132->62290|78163->62291|78221->62319|78252->62320|78283->62321|78356->62364|78387->62365|78418->62366|78476->62394|78507->62395|78538->62396|78585->62413|78616->62414|78647->62415|79730->63468|79761->63469|79792->63470|79835->63483|79866->63484|79897->63485|80808->64366|80839->64367|80870->64368|80923->64391|80954->64392|80985->64393|81118->64496|81149->64497|81180->64498|81286->64573|81318->64574|81350->64575|81424->64619|81455->64620|81486->64621|81542->64647|81573->64648|81604->64649|82527->65542|82558->65543|82589->65544|82644->65569|82675->65570|82706->65571|82884->65719|82915->65720|82946->65721|83000->65745|83031->65746|83062->65747|83133->65788|83164->65789|83195->65790|83251->65816|83282->65817|83313->65818|83414->65889|83445->65890|83476->65891|83534->65919|83565->65920|83596->65921|84530->66825|84561->66826|84592->66827|84684->66888|84716->66889|84748->66890|84949->67061|84980->67062|85011->67063|85058->67080|85089->67081|85120->67082|85160->67092|85191->67093|85222->67094|85269->67111|85300->67112|85331->67113|85428->67180|85459->67181|85490->67182|85547->67209|85578->67210|85609->67211|85742->67314|85773->67315|85804->67316|85857->67339|85888->67340|85919->67341|85974->67366|86005->67367|86036->67368|86088->67390|86119->67391|86150->67392|86775->67987|86806->67988|86944->68096|86975->68097|87057->68150|87087->68151|87159->68193|87190->68194|87270->68245|87300->68246|87337->68254|87367->68255|87428->68286|87459->68287|87531->68329|87562->68330|114293->95032|114323->95033|114358->95039|114388->95040|114489->95111|114520->95112|114622->95184|114653->95185|114744->95247|114774->95248|114809->95254|114839->95255|115042->95420|115074->95428
                    LINES: 29->1|29->1|29->1|31->3|31->3|35->7|35->7|36->8|36->8|37->9|37->9|37->9|37->9|38->10|38->10|38->10|38->10|39->11|39->11|40->12|40->12|41->13|41->13|42->14|42->14|43->15|43->15|43->15|43->15|44->16|44->16|44->16|44->16|45->17|45->17|45->17|45->17|46->18|46->18|46->18|46->18|47->19|47->19|47->19|47->19|48->20|48->20|48->20|48->20|49->21|49->21|49->21|49->21|50->22|50->22|50->22|50->22|51->23|51->23|51->23|51->23|52->24|52->24|52->24|52->24|53->25|53->25|53->25|53->25|116->88|116->88|116->88|116->88|116->88|116->88|123->95|123->95|123->95|123->95|123->95|123->95|123->95|123->95|123->95|123->95|123->95|123->95|123->95|123->95|123->95|123->95|123->95|123->95|159->131|159->131|159->131|159->131|159->131|159->131|162->134|162->134|162->134|162->134|162->134|162->134|169->141|169->141|169->141|169->141|169->141|169->141|169->141|169->141|169->141|169->141|169->141|169->141|212->184|212->184|212->184|212->184|212->184|212->184|220->192|220->192|220->192|220->192|220->192|220->192|221->193|221->193|221->193|221->193|221->193|221->193|251->223|251->223|251->223|251->223|251->223|251->223|292->264|292->264|292->264|292->264|292->264|292->264|298->270|298->270|298->270|298->270|298->270|298->270|349->321|349->321|349->321|349->321|349->321|349->321|359->331|359->331|359->331|359->331|359->331|359->331|360->332|360->332|360->332|360->332|360->332|360->332|361->333|361->333|361->333|361->333|361->333|361->333|373->345|373->345|373->345|373->345|373->345|373->345|395->367|395->367|395->367|395->367|395->367|395->367|401->373|401->373|401->373|401->373|401->373|401->373|429->401|429->401|429->401|429->401|429->401|429->401|440->412|440->412|440->412|440->412|440->412|440->412|465->437|465->437|465->437|465->437|465->437|465->437|481->453|481->453|481->453|481->453|481->453|481->453|481->453|481->453|481->453|481->453|481->453|481->453|498->470|498->470|498->470|498->470|498->470|498->470|502->474|502->474|502->474|502->474|502->474|502->474|518->490|518->490|518->490|518->490|518->490|518->490|518->490|518->490|518->490|518->490|518->490|518->490|542->514|542->514|542->514|542->514|542->514|542->514|551->523|551->523|551->523|551->523|551->523|551->523|552->524|552->524|552->524|552->524|552->524|552->524|576->548|576->548|576->548|576->548|576->548|576->548|592->564|592->564|592->564|592->564|592->564|592->564|592->564|592->564|592->564|592->564|592->564|592->564|609->581|609->581|609->581|609->581|609->581|609->581|616->588|616->588|616->588|616->588|616->588|616->588|632->604|632->604|632->604|632->604|632->604|632->604|632->604|632->604|632->604|632->604|632->604|632->604|656->628|656->628|656->628|656->628|656->628|656->628|668->640|668->640|668->640|668->640|668->640|668->640|669->641|669->641|669->641|669->641|669->641|669->641|693->665|693->665|693->665|693->665|693->665|693->665|715->687|715->687|715->687|715->687|715->687|715->687|722->694|722->694|722->694|722->694|722->694|722->694|750->722|750->722|750->722|750->722|750->722|750->722|761->733|761->733|761->733|761->733|761->733|761->733|785->757|785->757|785->757|785->757|785->757|785->757|801->773|801->773|801->773|801->773|801->773|801->773|801->773|801->773|801->773|801->773|801->773|801->773|812->784|812->784|812->784|812->784|812->784|812->784|812->784|812->784|812->784|812->784|812->784|812->784|829->801|829->801|829->801|829->801|829->801|829->801|836->808|836->808|836->808|836->808|836->808|836->808|852->824|852->824|852->824|852->824|852->824|852->824|852->824|852->824|852->824|852->824|852->824|852->824|863->835|863->835|863->835|863->835|863->835|863->835|863->835|863->835|863->835|863->835|863->835|863->835|887->859|887->859|887->859|887->859|887->859|887->859|900->872|900->872|900->872|900->872|900->872|900->872|901->873|901->873|901->873|901->873|901->873|901->873|902->874|902->874|902->874|902->874|902->874|902->874|927->899|927->899|927->899|927->899|927->899|927->899|976->948|976->948|976->948|976->948|976->948|976->948|980->952|980->952|980->952|980->952|980->952|980->952|1035->1007|1035->1007|1035->1007|1035->1007|1035->1007|1035->1007|1048->1020|1048->1020|1048->1020|1048->1020|1048->1020|1048->1020|1049->1021|1049->1021|1049->1021|1049->1021|1049->1021|1049->1021|1050->1022|1050->1022|1050->1022|1050->1022|1050->1022|1050->1022|1074->1046|1074->1046|1074->1046|1074->1046|1074->1046|1074->1046|1133->1105|1133->1105|1133->1105|1133->1105|1133->1105|1133->1105|1137->1109|1137->1109|1137->1109|1137->1109|1137->1109|1137->1109|1189->1161|1189->1161|1189->1161|1189->1161|1189->1161|1189->1161|1202->1174|1202->1174|1202->1174|1202->1174|1202->1174|1202->1174|1203->1175|1203->1175|1203->1175|1203->1175|1203->1175|1203->1175|1204->1176|1204->1176|1204->1176|1204->1176|1204->1176|1204->1176|1225->1197|1225->1197|1225->1197|1225->1197|1225->1197|1225->1197|1248->1220|1248->1220|1248->1220|1248->1220|1248->1220|1248->1220|1251->1223|1251->1223|1251->1223|1251->1223|1251->1223|1251->1223|1252->1224|1252->1224|1252->1224|1252->1224|1252->1224|1252->1224|1272->1244|1272->1244|1272->1244|1272->1244|1272->1244|1272->1244|1276->1248|1276->1248|1276->1248|1276->1248|1276->1248|1276->1248|1277->1249|1277->1249|1277->1249|1277->1249|1277->1249|1277->1249|1279->1251|1279->1251|1279->1251|1279->1251|1279->1251|1279->1251|1299->1271|1299->1271|1299->1271|1299->1271|1299->1271|1299->1271|1304->1276|1304->1276|1304->1276|1304->1276|1304->1276|1304->1276|1304->1276|1304->1276|1304->1276|1304->1276|1304->1276|1304->1276|1306->1278|1306->1278|1306->1278|1306->1278|1306->1278|1306->1278|1309->1281|1309->1281|1309->1281|1309->1281|1309->1281|1309->1281|1310->1282|1310->1282|1310->1282|1310->1282|1310->1282|1310->1282|1326->1298|1326->1298|1330->1302|1330->1302|1332->1304|1332->1304|1333->1305|1333->1305|1335->1307|1335->1307|1336->1308|1336->1308|1337->1309|1337->1309|1339->1311|1339->1311|1772->1744|1772->1744|1773->1745|1773->1745|1775->1747|1775->1747|1776->1748|1776->1748|1778->1750|1778->1750|1779->1751|1779->1751|1783->1755|1783->1755
                    -- GENERATED --
                */
            