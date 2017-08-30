
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
object admission extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/dashboardHome("Student admission form")/*1.41*/ {_display_(Seq[Any](format.raw/*1.43*/("""
  <div ng-controller="MainController" xmlns="http://www.w3.org/1999/html">
    """),_display_(Seq[Any](/*3.6*/frontHeader())),format.raw/*3.19*/("""
      <div class="col-lg-2">
        <div style="height:36px">
        </div>
       <!-- (page:String)-->
        <style>
        #side-menu-1:hover,#side-menu-2:hover,#side-menu-3:hover,#side-menu-4:hover,#side-menu-5:hover,#side-menu-6:hover"""),format.raw/*9.122*/("""{"""),format.raw/*9.123*/("""
        background-color: #6f000d;color:white;"""),format.raw/*10.47*/("""}"""),format.raw/*10.48*/("""
        #side-menu-1:focus,#side-menu-2:focus,#side-menu-3:focus,#side-menu-4:focus,#side-menu-5:focus,#side-menu-6:focus"""),format.raw/*11.122*/("""{"""),format.raw/*11.123*/("""
        background-color:#6f000d;color:white;"""),format.raw/*12.46*/("""}"""),format.raw/*12.47*/("""
        .list-group-item"""),format.raw/*13.25*/("""{"""),format.raw/*13.26*/("""height:60px;padding-top: 20px;"""),format.raw/*13.56*/("""}"""),format.raw/*13.57*/("""
        </style>
        <div  class="list-group success" style="width: 130%; margin-top: -20%; margin-left: -10%;">

          <a class=" list-group-item " id="side-menu-1" href="" style="">
            <span class="round-tabs">
              <i class="glyphicon glyphicon-pencil"></i>
            </span>Academic Choice</a>
          <a class="list-group-item " id="side-menu-2" href="#">
            <span class="round-tabs">
              <i class="glyphicon glyphicon-user"></i>
            </span>
            Student Profile</a>
          <a class="list-group-item " id="side-menu-3" href="#">
            <span class="round-tabs">
              <i class="glyphicon glyphicon-book"></i>
            </span>
            Education Background</a>
          <a class="list-group-item " id="side-menu-4"  href="#">
            <span class="round-tabs">
              <i class="glyphicon glyphicon-euro"></i>
            </span>
            Payment</a>
        </div>
        </div>
    <div id="gud"></div>
    <div class="col-lg-8" style="margin-left: 1% ; width: 82%;">
      <div class="panel panel-default" style="background:whitesmoke;">
        <div class="panel-heading">
          <h2 style="padding:0px ; margin:0px;color:#6f000d">
            New user registration form <li class="glyphicon glyphicon-pencil"></li></h2>
        </div>
      <div class="row" style="margin-top: -5% ;">
        <div class="panel-body">
          <hr>
          <div class="col-lg-12"">
            <div class="row">
              <section style="">
                <div class="wizard" style="padding-left:2%;padding-right:2%">
                  <div class="wizard-inner">
                    <div class="connecting-line"></div>
                    <ul class="nav nav-tabs" role="tablist">

                      <li role="presentation" class="active">
                        <a href="#step1" data-toggle="tab" aria-controls="step1" role="tab" title="Step 1">
                          <span class="round-tab">
                            <i class="glyphicon glyphicon-pencil"></i>
                          </span>
                        </a>
                      </li>

                      <li role="presentation" class="disabled">
                        <a href="#step2" data-toggle="tab" aria-controls="step2" role="tab" title="Step 2">
                          <span class="round-tab">
                            <i class="glyphicon glyphicon-user"></i>
                          </span>
                        </a>
                      </li>
                      <li role="presentation" class="disabled">
                        <a href="#step3" data-toggle="tab" aria-controls="step3" role="tab" title="Step 3">
                          <span class="round-tab">
                            <i class="glyphicon glyphicon-book"></i>
                          </span>
                        </a>
                      </li>

                      <li role="presentation" class="disabled">
                        <a href="#complete" data-toggle="tab" aria-controls="complete" role="tab" title="Payment">
                          <span class="round-tab">
                            <i class="glyphicon glyphicon-euro"></i>
                          </span>
                        </a>
                      </li>
                    </ul>
                  </div>

                  <form role="form" action="" method="POST" enctype="multipart/form-data">
                    <div class="tab-content">
                      <div class="tab-pane active" role="tabpanel" id="step1">
                        <div class="step1">
                          <div class="row">
                            <h2 style="margin-left: 24%">Academic Choice</h2>
                            <div class="col-lg-6 form-group">
                              <label for="adbranchname">Campus</label>
                              <select id="adbranchname" name="adbranchname" class="form-control" ng-init="loadBranch()" ng-change="loadFacultyByBranch()" ng-model="adbranchid">
                                <option ng-repeat="adbranch in branches" value=""""),format.raw/*98.81*/("""{"""),format.raw/*98.82*/("""{"""),format.raw/*98.83*/("""adbranch.id"""),format.raw/*98.94*/("""}"""),format.raw/*98.95*/("""}"""),format.raw/*98.96*/("""">"""),format.raw/*98.98*/("""{"""),format.raw/*98.99*/("""{"""),format.raw/*98.100*/("""adbranch.branchName"""),format.raw/*98.119*/("""}"""),format.raw/*98.120*/("""}"""),format.raw/*98.121*/("""</option>
                              </select>
                            </div>


                            <div class="col-lg-6  form-group">
                              <label for="apptype">Application Type</label>
                              <select id="apptype" class=" form-control" ng-init="loadApptype()">
                                <option>Applications Type</option>
                                <option ng-repeat="apptype in apptypes" value=""""),format.raw/*107.80*/("""{"""),format.raw/*107.81*/("""{"""),format.raw/*107.82*/("""apptype.id"""),format.raw/*107.92*/("""}"""),format.raw/*107.93*/("""}"""),format.raw/*107.94*/("""">"""),format.raw/*107.96*/("""{"""),format.raw/*107.97*/("""{"""),format.raw/*107.98*/("""apptype.typeName"""),format.raw/*107.114*/("""}"""),format.raw/*107.115*/("""}"""),format.raw/*107.116*/("""</option>
                              </select>
                            </div>

                            <div class="col-lg-6  form-group">
                              <label for="adfacultyname">Faculty</label>
                              <select id="adfacultyname" name="adfacultyname" class="form-control" ng-change="loadDepartmentByFaculty()" ng-model="adfacultyid">
                                <option selected>Select Faculty</option>
                                <option ng-repeat="adfaculty in faculties" value=""""),format.raw/*115.83*/("""{"""),format.raw/*115.84*/("""{"""),format.raw/*115.85*/("""adfaculty.id"""),format.raw/*115.97*/("""}"""),format.raw/*115.98*/("""}"""),format.raw/*115.99*/("""">"""),format.raw/*115.101*/("""{"""),format.raw/*115.102*/("""{"""),format.raw/*115.103*/("""adfaculty.facultyName"""),format.raw/*115.124*/("""}"""),format.raw/*115.125*/("""}"""),format.raw/*115.126*/("""</option>
                              </select>

                            </div>

                            <div class="col-lg-6 form-group">
                              <label for="academicyear">Academic Year</label>
                              <select id="academicyear" class=" form-control">
                                <option>2017- 2018</option>
                              </select>
                            </div>

                            <div class="col-lg-6 form-group">
                              <label for="addepartmentname">Department</label>
                              <select id="addepartmentname" name="addepartmentname" class="form-control" ng-change="loadSectionByDepartment()" ng-model="addepartmentid">
                                <option selected>Select Department</option>
                                <option ng-repeat="addepartment in departments" value=""""),format.raw/*131.88*/("""{"""),format.raw/*131.89*/("""{"""),format.raw/*131.90*/("""addepartment.id"""),format.raw/*131.105*/("""}"""),format.raw/*131.106*/("""}"""),format.raw/*131.107*/("""">"""),format.raw/*131.109*/("""{"""),format.raw/*131.110*/("""{"""),format.raw/*131.111*/("""addepartment.departmentName"""),format.raw/*131.138*/("""}"""),format.raw/*131.139*/("""}"""),format.raw/*131.140*/("""</option>
                              </select>

                            </div>

                            <div class="col-lg-6  form-group">
                              <div class="row">
                                <div class="col-lg-6">
                                  <label for="section">Section</label>
                                  <select id="section" class=" form-control" ng-init="loadSection()" ng-change="loadClassesBySection()" ng-model="adsectionid">
                                    <option selected> Select Section</option>
                                    <option ng-repeat="section in sections" value=""""),format.raw/*142.84*/("""{"""),format.raw/*142.85*/("""{"""),format.raw/*142.86*/("""section.id"""),format.raw/*142.96*/("""}"""),format.raw/*142.97*/("""}"""),format.raw/*142.98*/("""">"""),format.raw/*142.100*/("""{"""),format.raw/*142.101*/("""{"""),format.raw/*142.102*/(""" section.sectionName """),format.raw/*142.123*/("""}"""),format.raw/*142.124*/("""}"""),format.raw/*142.125*/("""</option>
                                  </select>
                                </div>
                                <div class="col-lg-6  form-group">
                                  <label for="class">Class</label>
                                  <select id="class" class=" form-control" ng-model="adclassid">
                                    <option> Choose Levels</option>
                                    <option ng-repeat="class in classes" value="classes.id">"""),format.raw/*149.93*/("""{"""),format.raw/*149.94*/("""{"""),format.raw/*149.95*/(""" class.classesName """),format.raw/*149.114*/("""}"""),format.raw/*149.115*/("""}"""),format.raw/*149.116*/("""</option>
                                  </select>
                                </div>
                              </div>
                            </div>
                          </div>
                          </div>
                        <ul class="list-inline  ul-step-1 pull-right">
                          <li><button type="button" class="btn btn-primary next-step">Next</button></li>
                        </ul>
                      </div>
                      <div class="tab-pane" role="tabpanel" id="step2">
                        <div class="step2">
                          <div class="step_21">
                            <div class="row">
                              <h2 style="margin-left: 24%">Personal Information</h2>
                              <div class="col-lg-6 form-group">
                                <label for="father">Father Name</label>
                                <input type="text" name="father" id="father" placeholder="Father Name" class="form-control" autocomplete="off" required>
                              </div>

                              <div class="col-lg-6  form-group">
                                <label for="nationality">Nationality</label>
                                <input type="text" name="nationality" id="nationality" placeholder="Nationality" class="form-control" autocomplete="off" required>
                              </div>

                              <div class="col-lg-6  form-group">
                                <label for="mother">Mother Name</label>
                                <input type="text" name="mother" id="mother" placeholder="Mother Name" class="form-control" autocomplete="off" required>
                              </div>


                              <div class="col-lg-6 form-group">
                                <div class="row">
                                  <div class="col-lg-6 form-group" style="margin-top: 1%">
                                  <br>  <label for="gender">Gender &nbsp;&nbsp;&nbsp;</label>
                                    <input type="radio" name="gender" class="" id="gender" value="Male" checked>Male
                                    <input type="radio" name="gender" class="" id="gender" value="Female">Female
                                  </div>
                                 <br> <div class="col-lg-6 input-group" style="padding-right: 2.8%;border-radius: 1%">
                                <span class="datepicker input-group-addon">DOB</span>
                                <input type="text" name="dob" id="datepicker" class="form-control" required>
                                  <div class="col-lg-1"></div>
                              </div>
                              </div>
                                </div>
                              <div class="col-lg-6 form-group">
                                <label for="phone">Phone</label>
                                <input type="text" name="phone" id="phone" placeholder="phone number" class="form-control" autocomplete="off" required>
                              </div>

                              <div class="col-lg-6  form-group">
                                <div class="row">
                                  <div class="col-lg-6">
                                    <label for="class">Province</label>
                                    <select id="class" class=" form-control">
                                      <option> Province</option>
                                      <option> South</option>
                                      <option> North</option>
                                      <option> East</option>
                                      <option> West</option>
                                      <option> Kigali City</option>
                                    </select>
                                  </div>
                                  <div class="col-lg-6  form-group">
                                    <label for="districtss">District</label>
                                    <select id="distrct" class=" form-control">
                                      <option> Districts</option>
                                    </select>
                                  </div>
                                </div>
                              </div>

                              <div class="col-lg-6 form-group">
                                <label for="email">Email</label>
                                <input type="text" name="email" id="email" placeholder="email address" class="form-control" autocomplete="off" required>
                              </div>


                              <div class="col-lg-6 form-group">
                                <div class="row">
                                  <div class="col-lg-6  form-group">
                                    <label for="sectors">Sectors</label>
                                    <select id="sectors" class=" form-control">
                                      <option> Sectors</option>
                                    </select>
                                  </div>
                                  <div class="col-lg-6  form-group">
                                    <label for="cells">Cell</label>
                                    <select id="cells" class=" form-control">
                                      <option> Cells</option>
                                    </select>
                                  </div>
                                </div>
                              </div>
                            </div>
                          </div>
                            </div>
                        <ul class="list-inline  ul-step-2 pull-right">
                          <li><button type="button" class="btn btn-default prev-step">Previous</button></li>
                          <li><button type="button" class="btn btn-primary next-step">Next</button></li>
                        </ul>
                      </div>
                      <div class="tab-pane" role="tabpanel" id="step3">
                        <div class="step3">

                           <div class="row mar_ned">
                             <h2 style="margin-left: 24%">Education Background</h2>
                             <div class="col-lg-6 form-group">
                               <label for="schoolname">School Name</label>
                               <input type="text" class="form-control" id="schoolname">
                             </div>

                             <div class="col-lg-6 form-group">
                               <label for="diplomano">Diploma/Certificate No</label>
                               <input type="text" class="form-control" id="diplomano" required>
                             </div>

                             <div class="col-lg-6 form-group">
                               <label for="schooladdr">School Address</label>
                               <textarea class="form-control" id="schooladdr" cols="45" rows="4" placeholder="" required></textarea>
                             </div>

                             <div class="col-lg-6 form-group">
                               <label for="termyear">Termination Year</label>
                               <input type="text" class="form-control" id="termyear" required>
                             </div>

                               <div class="col-lg-6 form-group">
                               <label for="option">Option</label>
                               <input type="text" class="form-control" id="option" required>
                             </div>

                             <div class="col-lg-6 form-group">
                               <label for="marks">Marks/Grade</label>
                               <input type="text" class="form-control" id="marks" required>
                               </div>

                             <div class="col-lg-6 form-group">
                               <label for="transcripts">Transcripts</label>
                               <input type="file" id="transcripts" class="form-control" name="transcripts">
                             </div>
                           </div>
                        </div>
                        <ul class="list-inline ul-step-3 pull-right">
                          <li><button type="button" class="btn btn-default prev-step">Previous</button></li>
                          <li><button type="button" class="btn btn-primary btn-info-full next-step">Next</button></li>
                        </ul>
                      </div>
                      <div class="tab-pane" role="tabpanel" id="complete">
                        <div class="step44">
                          <div class="col-lg-12">
                            <h2 style="margin-left: 24%">Payment Information</h2>
                            <div class="row">
                  <div class="col-lg-2"></div>
                          <div class="col-lg-8">
                            <br>  <label for="havesponsor"> Do You have Sponsor? &nbsp; &nbsp; &nbsp;</label>
                            <input type="radio" name="havesponsor" class="" id="havesponsoryes" value="yes">Yes
                            <input type="radio" name="havesponsor" class="" id="havesponsorno" value="no" checked>No
                          </div>
                    <div class="col-lg-2"></div>
                            </div>
                            </div>
                          <div class="col-lg-6">
                            <label for="installement">
                              Installement</label>
                            <input type="text" class="form-control" name="installement" id="installement">
                            </div>

                          <div class="col-lg-6">
                            <label for="paypercentage"> Payment Percentage</label>
                            <input type="text" class="form-control" name="paypercentage" id="paymode">
                          </div>


                          <div class="col-lg-6 sponsorslist">
                            <label for="sponsors"> Sponsors</label>
                            <select name="sponsors" id="sponsors" class="form-control" ng-init="loadSponsor()" ng-model="stdSponsor">
                            <option>Sponsors List</option>
                              <option ng-repeat="sponsor in sponsors">"""),format.raw/*328.71*/("""{"""),format.raw/*328.72*/("""{"""),format.raw/*328.73*/("""sponsor.sponsorName"""),format.raw/*328.92*/("""}"""),format.raw/*328.93*/("""}"""),format.raw/*328.94*/("""</option>
                            </select>
                          </div>

                          <div class="col-lg-6 sponsorfileattach">
                            <label for="sponsorfile"> Attachments</label>
                            <input type="file" class="form-control" name="sponsorfile" id="sponsorfile">
                          </div>

                            <ul class="list-inline  ul-step-4 pull-right">
                              <li><button type="button" class="btn btn-default prev-step">Previous</button></li>
                              <li><button type="button" class="btn btn-success btn-info-full next-step">Submit</button></li>
                            </ul>
                          </div>
                        </div>
                      </div>
                      <div class="clearfix"></div>
                    </div>
                  </form>
                </div>
              </section>
            </div>
          </div>
        </div>
      </div>
     </div>
    <div class="col-lg-2"></div>
      <script>
              var tabsIndex=1,currTabsIndex=1;
              $(document).ready(function () """),format.raw/*357.45*/("""{"""),format.raw/*357.46*/("""
                //Initialize tooltips
                $('.nav-tabs > li a[title]').tooltip();

                //Wizard
                $('a[data-toggle="tab"]').on('show.bs.tab', function (e) """),format.raw/*362.74*/("""{"""),format.raw/*362.75*/("""

                  var $target = $(e.target);
                  var steps=document.URL.split('#')[1];

                  switch(steps)"""),format.raw/*367.32*/("""{"""),format.raw/*367.33*/("""

                    case '/step1':
                      currTabsIndex=tabsIndex;
                            tabsIndex=1;
                          break;
                    case '/step2':
                      currTabsIndex=tabsIndex;
                            tabsIndex=2;
                      break;
                    case '/step3':
                      currTabsIndex=tabsIndex;
                            tabsIndex=3;
                      break;
                    case '/complete':
                      currTabsIndex=tabsIndex;
                            tabsIndex=4;
                      break;
                    default:
                          break;
                  """),format.raw/*387.19*/("""}"""),format.raw/*387.20*/("""
                  //alert("Clicking Event Parent Selected Tab "+steps+"=>"+tabsIndex);
                  if ($target.parent().hasClass('disabled')) """),format.raw/*389.62*/("""{"""),format.raw/*389.63*/("""
                    //alert('Able');
                    return false;
                  """),format.raw/*392.19*/("""}"""),format.raw/*392.20*/("""else"""),format.raw/*392.24*/("""{"""),format.raw/*392.25*/("""
                    activateSelectedTabPane(currTabsIndex);
                  """),format.raw/*394.19*/("""}"""),format.raw/*394.20*/("""
                """),format.raw/*395.17*/("""}"""),format.raw/*395.18*/(""");

                $(".next-step").click(function (e) """),format.raw/*397.52*/("""{"""),format.raw/*397.53*/("""
                  var $active = $('.wizard .nav-tabs li.active');
                  $active.next().removeClass('disabled');
                  nextTab($active);
                """),format.raw/*401.17*/("""}"""),format.raw/*401.18*/(""");
                $(".prev-step").click(function (e) """),format.raw/*402.52*/("""{"""),format.raw/*402.53*/("""
                  var $active = $('.wizard .nav-tabs li.active');
                  prevTab($active);

                """),format.raw/*406.17*/("""}"""),format.raw/*406.18*/(""");
              """),format.raw/*407.15*/("""}"""),format.raw/*407.16*/(""");

              function nextTab(elem) """),format.raw/*409.38*/("""{"""),format.raw/*409.39*/("""
                //tabsIndex changed in switch
                //alert("Before"+tabsIndex);
                activateSelectedTabPane(currTabsIndex);
                $(elem).next().find('a[data-toggle="tab"]').click();
                document.querySelector("#side-menu-"+tabsIndex).style="background-color:none";
                document.querySelector("#side-menu-"+tabsIndex).style="background-color:#6f000d";
                document.querySelector("#side-menu-"+tabsIndex).style.color="white";

             //alert("After "+tabsIndex);
              """),format.raw/*419.15*/("""}"""),format.raw/*419.16*/("""
              function prevTab(elem) """),format.raw/*420.38*/("""{"""),format.raw/*420.39*/("""
               // alert("Before"+tabsIndex);
                activateSelectedTabPane(currTabsIndex);
                $(elem).prev().find('a[data-toggle="tab"]').click();
                document.querySelector("#side-menu-"+tabsIndex).style="background-color:none";
                document.querySelector("#side-menu-"+tabsIndex).style="background-color:#6f000d";
                document.querySelector("#side-menu-"+tabsIndex).style.color="white";
              //  alert("After "+tabsIndex);
              """),format.raw/*428.15*/("""}"""),format.raw/*428.16*/("""
              function activateSelectedTabPane()"""),format.raw/*429.49*/("""{"""),format.raw/*429.50*/("""
                document.querySelector("#side-menu-"+currTabsIndex).style="background-color:none";
                document.querySelector("#side-menu-"+tabsIndex).style="background-color:#6f000d";
                document.querySelector("#side-menu-"+tabsIndex).style.color="white";

              """),format.raw/*434.15*/("""}"""),format.raw/*434.16*/("""

              //according menu

              $(document).ready(function()
              """),format.raw/*439.15*/("""{"""),format.raw/*439.16*/("""
                //hiding sponsors infos
                $(".sponsorslist").hide();
                $(".sponsorfileattach").hide();

                //Add Inactive Class To All Accordion Headers
                $('.accordion-header').toggleClass('inactive-header');

                //Set The Accordion Content Width
                var contentwidth = $('.accordion-header').width();
                $('.accordion-content').css("""),format.raw/*449.45*/("""{"""),format.raw/*449.46*/("""}"""),format.raw/*449.47*/(""");

                //Open The First Accordion Section When Page Loads
                $('.accordion-header').first().toggleClass('active-header').toggleClass('inactive-header');
                $('.accordion-content').first().slideDown().toggleClass('open-content');

                // The Accordion Effect
                $('.accordion-header').click(function () """),format.raw/*456.58*/("""{"""),format.raw/*456.59*/("""
                  if($(this).is('.inactive-header')) """),format.raw/*457.54*/("""{"""),format.raw/*457.55*/("""
                    $('.active-header').toggleClass('active-header').toggleClass('inactive-header').next().slideToggle().toggleClass('open-content');
                     $(this).toggleClass('active-header').toggleClass('inactive-header');
                    $(this).next().slideToggle().toggleClass('open-content');

                  """),format.raw/*462.19*/("""}"""),format.raw/*462.20*/("""

                  else """),format.raw/*464.24*/("""{"""),format.raw/*464.25*/("""
                    $(this).toggleClass('active-header').toggleClass('inactive-header');
                    $(this).next().slideToggle().toggleClass('open-content');
                  """),format.raw/*467.19*/("""}"""),format.raw/*467.20*/("""
                """),format.raw/*468.17*/("""}"""),format.raw/*468.18*/(""");
                $("#havesponsoryes").click(function()"""),format.raw/*469.54*/("""{"""),format.raw/*469.55*/("""
                  $(".sponsorslist").show();
                  $(".sponsorfileattach").show();
                """),format.raw/*472.17*/("""}"""),format.raw/*472.18*/(""");
                $("#havesponsorno").click(function()"""),format.raw/*473.53*/("""{"""),format.raw/*473.54*/("""
                  $(".sponsorslist").hide();
                  $(".sponsorfileattach").hide();
                """),format.raw/*476.17*/("""}"""),format.raw/*476.18*/(""");

                return false;
              """),format.raw/*479.15*/("""}"""),format.raw/*479.16*/(""");

                  function activateMenu()"""),format.raw/*481.42*/("""{"""),format.raw/*481.43*/("""
                  document.querySelector("#side-menu-1").style.backgroundColor="#6f000d";

                    document.querySelector("#side-menu-1").style.color="white";
                  """),format.raw/*485.19*/("""}"""),format.raw/*485.20*/("""
              activateMenu();
                  /**
                 * Created by BPRAdmin on 6/28/2017.
                 */

      </script>

  </div>
  """),_display_(Seq[Any](/*494.4*/footer())),format.raw/*494.12*/("""
""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Aug 30 18:58:31 EET 2017
                    SOURCE: F:/play/ums/app/views/admission.scala.html
                    HASH: 0440f7e7200b5d2eff2620a7733a0fc1a646148a
                    MATRIX: 868->1|915->40|954->42|1071->125|1105->138|1384->389|1413->390|1489->438|1518->439|1670->562|1700->563|1775->610|1804->611|1858->637|1887->638|1945->668|1974->669|6237->4904|6266->4905|6295->4906|6334->4917|6363->4918|6392->4919|6422->4921|6451->4922|6481->4923|6529->4942|6559->4943|6589->4944|7097->5423|7127->5424|7157->5425|7196->5435|7226->5436|7256->5437|7287->5439|7317->5440|7347->5441|7393->5457|7424->5458|7455->5459|8030->6005|8060->6006|8090->6007|8131->6019|8161->6020|8191->6021|8223->6023|8254->6024|8285->6025|8336->6046|8367->6047|8398->6048|9359->6980|9389->6981|9419->6982|9464->6997|9495->6998|9526->6999|9558->7001|9589->7002|9620->7003|9677->7030|9708->7031|9739->7032|10424->7688|10454->7689|10484->7690|10523->7700|10553->7701|10583->7702|10615->7704|10646->7705|10677->7706|10728->7727|10759->7728|10790->7729|11310->8220|11340->8221|11370->8222|11419->8241|11450->8242|11481->8243|22225->18958|22255->18959|22285->18960|22333->18979|22363->18980|22393->18981|23620->20179|23650->20180|23878->20379|23908->20380|24077->20520|24107->20521|24853->21238|24883->21239|25063->21390|25093->21391|25215->21484|25245->21485|25278->21489|25308->21490|25418->21571|25448->21572|25495->21590|25525->21591|25611->21648|25641->21649|25851->21830|25881->21831|25965->21886|25995->21887|26148->22011|26178->22012|26225->22030|26255->22031|26327->22074|26357->22075|26948->22637|26978->22638|27046->22677|27076->22678|27621->23194|27651->23195|27730->23245|27760->23246|28092->23549|28122->23550|28247->23646|28277->23647|28744->24085|28774->24086|28804->24087|29206->24460|29236->24461|29320->24516|29350->24517|29722->24860|29752->24861|29808->24888|29838->24889|30056->25078|30086->25079|30133->25097|30163->25098|30249->25155|30279->25156|30423->25271|30453->25272|30538->25328|30568->25329|30712->25444|30742->25445|30822->25496|30852->25497|30928->25544|30958->25545|31181->25739|31211->25740|31412->25905|31443->25913
                    LINES: 29->1|29->1|29->1|31->3|31->3|37->9|37->9|38->10|38->10|39->11|39->11|40->12|40->12|41->13|41->13|41->13|41->13|126->98|126->98|126->98|126->98|126->98|126->98|126->98|126->98|126->98|126->98|126->98|126->98|135->107|135->107|135->107|135->107|135->107|135->107|135->107|135->107|135->107|135->107|135->107|135->107|143->115|143->115|143->115|143->115|143->115|143->115|143->115|143->115|143->115|143->115|143->115|143->115|159->131|159->131|159->131|159->131|159->131|159->131|159->131|159->131|159->131|159->131|159->131|159->131|170->142|170->142|170->142|170->142|170->142|170->142|170->142|170->142|170->142|170->142|170->142|170->142|177->149|177->149|177->149|177->149|177->149|177->149|356->328|356->328|356->328|356->328|356->328|356->328|385->357|385->357|390->362|390->362|395->367|395->367|415->387|415->387|417->389|417->389|420->392|420->392|420->392|420->392|422->394|422->394|423->395|423->395|425->397|425->397|429->401|429->401|430->402|430->402|434->406|434->406|435->407|435->407|437->409|437->409|447->419|447->419|448->420|448->420|456->428|456->428|457->429|457->429|462->434|462->434|467->439|467->439|477->449|477->449|477->449|484->456|484->456|485->457|485->457|490->462|490->462|492->464|492->464|495->467|495->467|496->468|496->468|497->469|497->469|500->472|500->472|501->473|501->473|504->476|504->476|507->479|507->479|509->481|509->481|513->485|513->485|522->494|522->494
                    -- GENERATED --
                */
            