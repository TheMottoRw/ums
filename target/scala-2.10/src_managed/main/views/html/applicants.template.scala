
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
object applicants extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/dashboardHome("Applicants")/*1.29*/{_display_(Seq[Any](format.raw/*1.30*/("""
  <div ng-controller="MainController" class="controllerCall">
    """),_display_(Seq[Any](/*3.6*/frontHeader())),format.raw/*3.19*/("""
    <br />
    <br />
    <style>
    #side-menu-1"""),format.raw/*7.17*/("""{"""),format.raw/*7.18*/("""
    background-color: #6f000d;color:white;"""),format.raw/*8.43*/("""}"""),format.raw/*8.44*/("""
    .list-group-item"""),format.raw/*9.21*/("""{"""),format.raw/*9.22*/("""height:60px;padding-top: 20px;margin-top:5% """),format.raw/*9.66*/("""}"""),format.raw/*9.67*/("""
    li"""),format.raw/*10.7*/("""{"""),format.raw/*10.8*/("""list-style-type: none;display: inline; background-color: #6f000d;color:white;padding: 1% 2% 1% 2%;border-radius:3px; color:white;font-size: 14px;"""),format.raw/*10.153*/("""}"""),format.raw/*10.154*/("""
    </style>
    <div class="col-lg-3">
      <div  class="list-group success" style="width: 100%; margin-top: -20%; margin-left: -10%;background-color:">

        <a class=" list-group-item " id="side-menu-1" href="#" style="">
          <span class="round-tabs">
            <i class="glyphicon glyphicon-pencil"></i>
          </span>Applicants</a>
      </div>

    </div>
    <nav class="tabs" style="font-color:white;">
      <ul>
        <li><a href="#applicantswait" id="applicantswait" class="sbmenu" style="color:white">Applicants</a></li>
          &nbsp;&nbsp;&nbsp;&nbsp;
        <li><a href="#applicantsapproved" id="applicantsapproved" class="sbmenu" style="color:white">Approved</a></li>
          &nbsp;&nbsp;&nbsp;&nbsp;
        <li><a href="#applicantsaccepted" id="applicantsaccepted" class="sbmenu" style="color:white">Accepted</a></li>
      </ul>
      <div class="col-lg-6 panel" style="border:2px solid lightgray;box-shadow: 2px 2px 2px rgba(0, 0, 0, .5), -2px -2px 2px rgba(0, 0, 0, .5);border-radius: 3px;padding:0% 3% 0% 3%;padding-bottom: 2%">
        <br/>
          <!--waiting-->
        <div class="row" id="waiting">
          <h2>All Applicant need Approval</h2>
          <form action="/search/" method="GET">
            <div class="col-lg-12 input-goup">
              <input type="text" name="srch" id="srch" placeholder="candidates name..." ng-model="keyword" class="form-control">
            </div></form><br/>
          <span style="color:green">"""),format.raw/*39.37*/("""{"""),format.raw/*39.38*/("""{"""),format.raw/*39.39*/(""" feedmsg """),format.raw/*39.48*/("""}"""),format.raw/*39.49*/("""}"""),format.raw/*39.50*/("""</span><br/>
          <div class="col-lg-3">Names </div><div class="col-lg-3"> E-mail</div><div class="col-lg-3">Phone </div><div class="col-lg-3">Modifications</div>
          <div class="" ng-repeat="cand in candidates">
            <div class="col-lg-3"> """),format.raw/*42.36*/("""{"""),format.raw/*42.37*/("""{"""),format.raw/*42.38*/(""" cand.name """),format.raw/*42.49*/("""}"""),format.raw/*42.50*/("""}"""),format.raw/*42.51*/("""</div>
            <div class="col-lg-3">"""),format.raw/*43.35*/("""{"""),format.raw/*43.36*/("""{"""),format.raw/*43.37*/(""" cand.email """),format.raw/*43.49*/("""}"""),format.raw/*43.50*/("""}"""),format.raw/*43.51*/("""</div>
            <div class="col-lg-3">"""),format.raw/*44.35*/("""{"""),format.raw/*44.36*/("""{"""),format.raw/*44.37*/(""" cand.phone """),format.raw/*44.49*/("""}"""),format.raw/*44.50*/("""}"""),format.raw/*44.51*/("""</div>
            <div class="col-lg-3"><a href="#" id="updCands" class=" glyphicon glyphicon-pencil updCands">
                &nbsp; &nbsp;  <a href="#">&times;
            </a></div>
          </div><!--ng repeat-->
        </div><!--end waiting-->
          <!--approved-->
        <div class="row" id="approved">
          <h2>Approved Candidates</h2>
          <form action="/search/" method="GET">
            <div class="col-lg-12 input-goup">
              <input type="text" name="srch" id="srch" placeholder="candidates name..." ng-model="keyword" class="form-control">
            </div></form><br/>
          <span style="color:green">"""),format.raw/*57.37*/("""{"""),format.raw/*57.38*/("""{"""),format.raw/*57.39*/(""" feedmsg """),format.raw/*57.48*/("""}"""),format.raw/*57.49*/("""}"""),format.raw/*57.50*/("""</span><br/>
          <div class="col-lg-3">Names </div><div class="col-lg-3"> E-mail</div><div class="col-lg-3">Phone </div><div class="col-lg-3">Modifications</div>
          <div class="" ng-repeat="cand in candidates">
            <div class="col-lg-3"> """),format.raw/*60.36*/("""{"""),format.raw/*60.37*/("""{"""),format.raw/*60.38*/(""" cand.name """),format.raw/*60.49*/("""}"""),format.raw/*60.50*/("""}"""),format.raw/*60.51*/("""</div>
            <div class="col-lg-3">"""),format.raw/*61.35*/("""{"""),format.raw/*61.36*/("""{"""),format.raw/*61.37*/(""" cand.email """),format.raw/*61.49*/("""}"""),format.raw/*61.50*/("""}"""),format.raw/*61.51*/("""</div>
            <div class="col-lg-3">"""),format.raw/*62.35*/("""{"""),format.raw/*62.36*/("""{"""),format.raw/*62.37*/(""" cand.phone """),format.raw/*62.49*/("""}"""),format.raw/*62.50*/("""}"""),format.raw/*62.51*/("""</div>
            <div class="col-lg-3"><a href="#" id="updCands" class=" glyphicon glyphicon-pencil updCands">
                &nbsp; &nbsp;  <a href="#">&times;
            </a></div>
          </div><!--ng repeat-->
        </div><!--end approved-->
          <!--accepted-->
        <div class="row" id="accepted">
          <h2>All Applicant Accepted</h2>
          <form action="/search/" method="GET">
            <div class="col-lg-12 input-goup">
              <input type="text" name="srch" id="srch" placeholder="candidates name..." ng-model="keyword" class="form-control">
            </div></form><br/>
          <span style="color:green">"""),format.raw/*75.37*/("""{"""),format.raw/*75.38*/("""{"""),format.raw/*75.39*/(""" feedmsg """),format.raw/*75.48*/("""}"""),format.raw/*75.49*/("""}"""),format.raw/*75.50*/("""</span><br/>
          <div class="col-lg-3">Names </div><div class="col-lg-3"> E-mail</div><div class="col-lg-3">Phone </div><div class="col-lg-3">Modifications</div>
          <div class="" ng-repeat="cand in candidates">
            <div class="col-lg-3"> """),format.raw/*78.36*/("""{"""),format.raw/*78.37*/("""{"""),format.raw/*78.38*/(""" cand.name """),format.raw/*78.49*/("""}"""),format.raw/*78.50*/("""}"""),format.raw/*78.51*/("""</div>
            <div class="col-lg-3">"""),format.raw/*79.35*/("""{"""),format.raw/*79.36*/("""{"""),format.raw/*79.37*/(""" cand.email """),format.raw/*79.49*/("""}"""),format.raw/*79.50*/("""}"""),format.raw/*79.51*/("""</div>
            <div class="col-lg-3">"""),format.raw/*80.35*/("""{"""),format.raw/*80.36*/("""{"""),format.raw/*80.37*/(""" cand.phone """),format.raw/*80.49*/("""}"""),format.raw/*80.50*/("""}"""),format.raw/*80.51*/("""</div>
            <div class="col-lg-3"><a href="#" id="updCands" class=" glyphicon glyphicon-pencil updCands">
                &nbsp; &nbsp;  <a href="#">&times;
            </a></div>
          </div><!--ng repeat-->
        </div><!--end approved-->
        <br/><br/>
      </div><!--panel 6-->

      <div class="col-lg-3">
      </div>
      """),_display_(Seq[Any](/*91.8*/footer())),format.raw/*91.16*/("""

  </div>
""")))})),format.raw/*94.2*/("""
<script>
    $(document).ready(function()"""),format.raw/*96.33*/("""{"""),format.raw/*96.34*/("""
      //heiding content
      $("#registered").hide();    $("#updform").hide();
      $("#regformanchor").click(function()"""),format.raw/*99.43*/("""{"""),format.raw/*99.44*/("""
        $("#regform").show();
        $("#registered").hide();
        $("#updform").show();
      """),format.raw/*103.7*/("""}"""),format.raw/*103.8*/(""");
      $("#registeredanchor").click(function()"""),format.raw/*104.46*/("""{"""),format.raw/*104.47*/("""
        $("#regform").hide();
        $("#registered").show();
        $("#updform").hide();
      """),format.raw/*108.7*/("""}"""),format.raw/*108.8*/(""");
      $(".updCands").click(function()"""),format.raw/*109.38*/("""{"""),format.raw/*109.39*/("""
        $("#regform").hide();
        $("#registered").hide();
        $("#updform").show();
      """),format.raw/*113.7*/("""}"""),format.raw/*113.8*/(""");
      $("#cancelUpd").click(function()"""),format.raw/*114.39*/("""{"""),format.raw/*114.40*/("""
        $("#regform").hide();
        $("#registered").show();
        $("#updform").hide();
      """),format.raw/*118.7*/("""}"""),format.raw/*118.8*/(""");
    """),format.raw/*119.5*/("""}"""),format.raw/*119.6*/(""");
  function checkURI(sdta)"""),format.raw/*120.26*/("""{"""),format.raw/*120.27*/("""
   switch(sdta)"""),format.raw/*121.16*/("""{"""),format.raw/*121.17*/("""
      case 'applicantswait':
            document.querySelector("#waiting").style.display='block';
        document.querySelector("#approved").style.display='none';
        document.querySelector("#accepted").style.display='none';
            break;
      case'applicantsapproved':
        document.querySelector("#waiting").style.display='none';
        document.querySelector("#approved").style.display='block';
        document.querySelector("#accepted").style.display='none';
        break;
      case'applicantsaccepted':
        document.querySelector("#waiting").style.display='none';
        document.querySelector("#approved").style.display='none';
        document.querySelector("#accepted").style.display='block';
            break;
      default:
        document.querySelector("#waiting").style.display='block';
        document.querySelector("#approved").style.display='none';
        document.querySelector("#accepted").style.display='none';
    """),format.raw/*141.5*/("""}"""),format.raw/*141.6*/("""
  """),format.raw/*142.3*/("""}"""),format.raw/*142.4*/("""
  for(i=0;i<document.getElementsByClassName("sbmenu").length;i++)"""),format.raw/*143.66*/("""{"""),format.raw/*143.67*/("""
    document.getElementsByClassName("sbmenu")[i].onclick=function(e)"""),format.raw/*144.69*/("""{"""),format.raw/*144.70*/("""
      checkURI(e.target.toString().split("#")[1]);
    """),format.raw/*146.5*/("""}"""),format.raw/*146.6*/("""
    checkURI(null);
  """),format.raw/*148.3*/("""}"""),format.raw/*148.4*/("""
    </script>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Aug 30 18:58:31 EET 2017
                    SOURCE: F:/play/ums/app/views/applicants.scala.html
                    HASH: eb5fa45c50461ad43ccc422b6f0c7e6b1552c204
                    MATRIX: 869->1|904->28|942->29|1046->99|1080->112|1162->167|1190->168|1261->212|1289->213|1338->235|1366->236|1437->280|1465->281|1500->289|1528->290|1702->435|1732->436|3279->1955|3308->1956|3337->1957|3374->1966|3403->1967|3432->1968|3722->2230|3751->2231|3780->2232|3819->2243|3848->2244|3877->2245|3947->2287|3976->2288|4005->2289|4045->2301|4074->2302|4103->2303|4173->2345|4202->2346|4231->2347|4271->2359|4300->2360|4329->2361|5019->3023|5048->3024|5077->3025|5114->3034|5143->3035|5172->3036|5462->3298|5491->3299|5520->3300|5559->3311|5588->3312|5617->3313|5687->3355|5716->3356|5745->3357|5785->3369|5814->3370|5843->3371|5913->3413|5942->3414|5971->3415|6011->3427|6040->3428|6069->3429|6763->4095|6792->4096|6821->4097|6858->4106|6887->4107|6916->4108|7206->4370|7235->4371|7264->4372|7303->4383|7332->4384|7361->4385|7431->4427|7460->4428|7489->4429|7529->4441|7558->4442|7587->4443|7657->4485|7686->4486|7715->4487|7755->4499|7784->4500|7813->4501|8209->4862|8239->4870|8285->4885|8357->4929|8386->4930|8540->5056|8569->5057|8701->5161|8730->5162|8808->5211|8838->5212|8970->5316|8999->5317|9069->5358|9099->5359|9231->5463|9260->5464|9331->5506|9361->5507|9493->5611|9522->5612|9558->5620|9587->5621|9645->5650|9675->5651|9721->5668|9751->5669|10761->6651|10790->6652|10822->6656|10851->6657|10947->6724|10977->6725|11076->6795|11106->6796|11192->6854|11221->6855|11274->6880|11303->6881
                    LINES: 29->1|29->1|29->1|31->3|31->3|35->7|35->7|36->8|36->8|37->9|37->9|37->9|37->9|38->10|38->10|38->10|38->10|67->39|67->39|67->39|67->39|67->39|67->39|70->42|70->42|70->42|70->42|70->42|70->42|71->43|71->43|71->43|71->43|71->43|71->43|72->44|72->44|72->44|72->44|72->44|72->44|85->57|85->57|85->57|85->57|85->57|85->57|88->60|88->60|88->60|88->60|88->60|88->60|89->61|89->61|89->61|89->61|89->61|89->61|90->62|90->62|90->62|90->62|90->62|90->62|103->75|103->75|103->75|103->75|103->75|103->75|106->78|106->78|106->78|106->78|106->78|106->78|107->79|107->79|107->79|107->79|107->79|107->79|108->80|108->80|108->80|108->80|108->80|108->80|119->91|119->91|122->94|124->96|124->96|127->99|127->99|131->103|131->103|132->104|132->104|136->108|136->108|137->109|137->109|141->113|141->113|142->114|142->114|146->118|146->118|147->119|147->119|148->120|148->120|149->121|149->121|169->141|169->141|170->142|170->142|171->143|171->143|172->144|172->144|174->146|174->146|176->148|176->148
                    -- GENERATED --
                */
            