
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
object test extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/dashboardHome("TestTable Page")/*1.33*/{_display_(Seq[Any](format.raw/*1.34*/("""
  <div ng-controller="MainController" class="controllerCall">
    """),_display_(Seq[Any](/*3.6*/frontHeader())),format.raw/*3.19*/("""
    <br />
    <br />
    <style>
    #side-menu-1"""),format.raw/*7.17*/("""{"""),format.raw/*7.18*/("""
    background-color: #6f000d;color:white;"""),format.raw/*8.43*/("""}"""),format.raw/*8.44*/("""
    .list-group-item"""),format.raw/*9.21*/("""{"""),format.raw/*9.22*/("""height:60px;padding-top: 20px;margin-top:5% """),format.raw/*9.66*/("""}"""),format.raw/*9.67*/("""
      li"""),format.raw/*10.9*/("""{"""),format.raw/*10.10*/("""list-style-type: none;display: inline; background-color: #6f000d;color:white;padding: 1% 2% 1% 2%;border-radius:3px; color:white;font-size: 14px;"""),format.raw/*10.155*/("""}"""),format.raw/*10.156*/("""
    </style>
    <div class="col-lg-3">
      <div  class="list-group success" style="width: 100%; margin-top: -20%; margin-left: -10%;background-color:">

        <a class=" list-group-item " id="side-menu-1" href="#" style="">
          <span class="round-tabs">
            <i class="glyphicon glyphicon-pencil"></i>
          </span>Candidates</a>
      </div>

    </div>
    <nav class="tabs" style="font-color:white;">
    <ul>
      <li><a href="#" id="regformanchor" style="color:white">Register Candidates</a></li>
        &nbsp;&nbsp;&nbsp;&nbsp;
      <li><a href="#" id="registeredanchor"  style="color:white" ng-click="viewCandidates()">View Registered</a></li>
    </ul>
  <div class="col-lg-6 panel" style="border:2px solid lightgray;box-shadow: 2px 2px 2px rgba(0, 0, 0, .5), -2px -2px 2px rgba(0, 0, 0, .5);border-radius: 3px;padding:0% 3% 0% 3%;padding-bottom: 2%">
      <br/>
    <div class="row" id="regform">
      <form name="form" action=""method="POST">
        <h3>New Candidates Registration</h3><br>

        <p style="color:green;">"""),format.raw/*34.33*/("""{"""),format.raw/*34.34*/("""{"""),format.raw/*34.35*/(""" successmsg """),format.raw/*34.47*/("""}"""),format.raw/*34.48*/("""}"""),format.raw/*34.49*/("""</p>
          <div class="form-group">
            <div class="col-lg-2">
                <label for="names">Names</label>
            </div>
                <div class="col-lg-9">
                   <input type="text" id="names" name="names" class="form-control" ng-model="names">
               </div>
              <div class="col-lg-1"></div>
        </div><br/><br/>
          <div class="form-group">
            <div class="col-lg-2">
              <label for="names">Password</label>
            </div>
            <div class="col-lg-9">
              <input type="password" id="pwd" name="pwd" class="form-control" ng-model="pwd">
            </div>
            <div class="col-lg-1"></div>
          </div><br/><br/>
          <div class="form-group">
            <div class="col-lg-2">
              <label for="names">E-mail</label>
            </div>
            <div class="col-lg-9">
              <input type="text" id="email" name="email" class="form-control" ng-model="email">
            </div>
            <div class="col-lg-1"></div>
          </div><br/><br/>
          <div class="form-group">
            <div class="col-lg-2">
              <label for="names">Phone</label>
            </div>
            <div class="col-lg-9">
              <input type="text" id="phone" name="phone" class="form-control" ng-model="phone">
            </div>
            <div class="col-lg-1"></div>
          </div><br/>
          <div class="col-lg-4"></div><div class="col-lg-4"><br/><button type="button" class="btn btn-success" name="regcand" id="regcand"value="" ng-click="registerCandidates()">Register</button></div><div class="col-lg-4"></div>
      </form>
    </div>
    <!--updating form-->
    <div class="row" id="updform">
      <form name="form" action=""method="POST">
        <h3>"""),format.raw/*77.13*/("""{"""),format.raw/*77.14*/("""{"""),format.raw/*77.15*/("""updcand[0].name"""),format.raw/*77.30*/("""}"""),format.raw/*77.31*/("""}"""),format.raw/*77.32*/(""" Candidates Updating</h3><br>

        <p style="color:green;">"""),format.raw/*79.33*/("""{"""),format.raw/*79.34*/("""{"""),format.raw/*79.35*/(""" updatesuccessmsg """),format.raw/*79.53*/("""}"""),format.raw/*79.54*/("""}"""),format.raw/*79.55*/("""</p>
        <div class="form-group">
          <div class="col-lg-2">
            <label for="names">Names</label>
          </div>
          <div class="col-lg-9">
            <input type="text" id="names" name="names" class="form-control" ng-model="updcand[0].name">
          </div>
          <div class="col-lg-1"></div>
        </div><br/><br/>
        <div class="form-group">
          <div class="col-lg-2">
            <label for="names">Password</label>
          </div>
          <div class="col-lg-9">
            <input type="password" id="pwd" name="pwd" class="form-control" ng-model="updcand[0].pwd">
          </div>
          <div class="col-lg-1"></div>
        </div><br/><br/>
        <div class="form-group">
          <div class="col-lg-2">
            <label for="names">E-mail</label>
          </div>
          <div class="col-lg-9">
            <input type="text" id="email" name="email" class="form-control" ng-model="updcand[0].email">
          </div>
          <div class="col-lg-1"></div>
        </div><br/><br/>
        <div class="form-group">
          <div class="col-lg-2">
            <label for="names">Phone</label>
          </div>
          <div class="col-lg-9">
            <input type="text" id="phone" name="phone" class="form-control" ng-model="updcand[0].phone">
          </div>
          <div class="col-lg-1"></div>
        </div><br/>
        <div class="col-lg-4"></div><div class="col-lg-4"><br/>
        <button type="button" class="btn btn-success" name="updcand" id="updcand"value="" ng-click="updateCandidates()">Update</button>
        &nbsp; &nbsp; &nbsp;
        <button type="button" class="btn btn-danger" name="cancelUpd" id="cancelUpd">Cancel</button>
      </div><div class="col-lg-4"></div>
      </form>
    </div>

      <!--end update-->
      <!--registered-->
    <div class="row" id="registered">
      <form action="/search/" method="GET">
        <div class="col-lg-12 input-goup">
          <input type="text" name="srch" id="srch" placeholder="candidates name..." ng-model="keyword" ng-keyup="searchCandidates()" class="form-control">
        </div></form><br/>
      <span style="color:green">"""),format.raw/*131.33*/("""{"""),format.raw/*131.34*/("""{"""),format.raw/*131.35*/(""" feedmsg """),format.raw/*131.44*/("""}"""),format.raw/*131.45*/("""}"""),format.raw/*131.46*/("""</span><br/>
      <div class="col-lg-3">Names </div><div class="col-lg-3"> E-mail</div><div class="col-lg-3">Phone </div><div class="col-lg-3">Modifications</div>
      <div class="" ng-repeat="cand in candidates">
        <div class="col-lg-3"> """),format.raw/*134.32*/("""{"""),format.raw/*134.33*/("""{"""),format.raw/*134.34*/(""" cand.name """),format.raw/*134.45*/("""}"""),format.raw/*134.46*/("""}"""),format.raw/*134.47*/("""</div>
        <div class="col-lg-3">"""),format.raw/*135.31*/("""{"""),format.raw/*135.32*/("""{"""),format.raw/*135.33*/(""" cand.email """),format.raw/*135.45*/("""}"""),format.raw/*135.46*/("""}"""),format.raw/*135.47*/("""</div>
        <div class="col-lg-3">"""),format.raw/*136.31*/("""{"""),format.raw/*136.32*/("""{"""),format.raw/*136.33*/(""" cand.phone """),format.raw/*136.45*/("""}"""),format.raw/*136.46*/("""}"""),format.raw/*136.47*/("""</div>

        <div class="col-lg-3"><a href="#" id="updCands" class="fa fa-eye updCands">
        </a>&nbsp; &nbsp;  <a href="#" class="glyphicon glyphicon-pencil" ng-click="loadUpdater(cand.id)"></a>
            &nbsp; &nbsp;  <a href="#" class="glyphicon glyphicon-remove" ng-click="disableCandidates(cand.id)"></a>
          </a></div>
        </a></div>
      <span ng-init="candidatea='';">
        </div><!--ng repeat-->
      </div>
      <br/><br/>
            </div><!--panel 6-->
  <!--deleting modal-->



<div class="col-lg-3">
  </div>
  """),_display_(Seq[Any](/*154.4*/footer())),format.raw/*154.12*/("""

      </div>
""")))})),format.raw/*157.2*/("""
  <script>
    $(document).ready(function()"""),format.raw/*159.33*/("""{"""),format.raw/*159.34*/("""
      //heiding content
      $("#registered").hide();    $("#updform").hide();
      $("#regformanchor").click(function()"""),format.raw/*162.43*/("""{"""),format.raw/*162.44*/("""
        $("#regform").show();
        $("#registered").hide();
        $("#updform").show();
      """),format.raw/*166.7*/("""}"""),format.raw/*166.8*/(""");
      $("#registeredanchor").click(function()"""),format.raw/*167.46*/("""{"""),format.raw/*167.47*/("""
        $("#regform").hide();
        $("#registered").show();
        $("#updform").hide();
      """),format.raw/*171.7*/("""}"""),format.raw/*171.8*/(""");
      $(".updCands").click(function()"""),format.raw/*172.38*/("""{"""),format.raw/*172.39*/("""
        $("#regform").hide();
        $("#registered").hide();
        $("#updform").show();
      """),format.raw/*176.7*/("""}"""),format.raw/*176.8*/(""");
      $("#cancelUpd").click(function()"""),format.raw/*177.39*/("""{"""),format.raw/*177.40*/("""
        $("#regform").hide();
        $("#registered").show();
        $("#updform").hide();
      """),format.raw/*181.7*/("""}"""),format.raw/*181.8*/(""");
    """),format.raw/*182.5*/("""}"""),format.raw/*182.6*/(""");
    </script>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Aug 30 18:58:34 EET 2017
                    SOURCE: F:/play/ums/app/views/test.scala.html
                    HASH: fa39c92f24d26eb806abb6a7653dc07b6737f8d3
                    MATRIX: 863->1|902->32|940->33|1044->103|1078->116|1160->171|1188->172|1259->216|1287->217|1336->239|1364->240|1435->284|1463->285|1500->295|1529->296|1703->441|1733->442|2848->1529|2877->1530|2906->1531|2946->1543|2975->1544|3004->1545|4883->3396|4912->3397|4941->3398|4984->3413|5013->3414|5042->3415|5135->3480|5164->3481|5193->3482|5239->3500|5268->3501|5297->3502|7551->5727|7581->5728|7611->5729|7649->5738|7679->5739|7709->5740|7988->5990|8018->5991|8048->5992|8088->6003|8118->6004|8148->6005|8215->6043|8245->6044|8275->6045|8316->6057|8346->6058|8376->6059|8443->6097|8473->6098|8503->6099|8544->6111|8574->6112|8604->6113|9212->6685|9243->6693|9294->6712|9369->6758|9399->6759|9554->6885|9584->6886|9716->6990|9745->6991|9823->7040|9853->7041|9985->7145|10014->7146|10084->7187|10114->7188|10246->7292|10275->7293|10346->7335|10376->7336|10508->7440|10537->7441|10573->7449|10602->7450
                    LINES: 29->1|29->1|29->1|31->3|31->3|35->7|35->7|36->8|36->8|37->9|37->9|37->9|37->9|38->10|38->10|38->10|38->10|62->34|62->34|62->34|62->34|62->34|62->34|105->77|105->77|105->77|105->77|105->77|105->77|107->79|107->79|107->79|107->79|107->79|107->79|159->131|159->131|159->131|159->131|159->131|159->131|162->134|162->134|162->134|162->134|162->134|162->134|163->135|163->135|163->135|163->135|163->135|163->135|164->136|164->136|164->136|164->136|164->136|164->136|182->154|182->154|185->157|187->159|187->159|190->162|190->162|194->166|194->166|195->167|195->167|199->171|199->171|200->172|200->172|204->176|204->176|205->177|205->177|209->181|209->181|210->182|210->182
                    -- GENERATED --
                */
            