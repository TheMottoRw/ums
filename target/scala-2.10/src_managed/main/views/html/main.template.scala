
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/title)),format.raw/*7.22*/("""</title>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*12.54*/routes/*12.60*/.Assets.at("bootstrap/css/bootstrap.css"))),format.raw/*12.101*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*13.54*/routes/*13.60*/.Assets.at("bootstrap/css/bootstrap.min.css"))),format.raw/*13.105*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*14.54*/routes/*14.60*/.Assets.at("bootstrap/css/breadcrumbs.css"))),format.raw/*14.103*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*15.54*/routes/*15.60*/.Assets.at("/bootstrap/css/simple-sidebar.css"))),format.raw/*15.107*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*16.54*/routes/*16.60*/.Assets.at("/bootstrap/css/font-awesome.min.css"))),format.raw/*16.109*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*17.54*/routes/*17.60*/.Assets.at("bootstrap-datepicker/css/datepicker3.css"))),format.raw/*17.114*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*18.59*/routes/*18.65*/.Assets.at("images/favicon.png"))),format.raw/*18.97*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*19.54*/routes/*19.60*/.Assets.at("stylesheets/main.css"))),format.raw/*19.94*/("""">
        <script src=""""),_display_(Seq[Any](/*20.23*/routes/*20.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*20.74*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*21.23*/routes/*21.29*/.Assets.at("javascripts/angular.min.js"))),format.raw/*21.69*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*22.23*/routes/*22.29*/.Assets.at("javascripts/angular-route.min.js"))),format.raw/*22.75*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*23.23*/routes/*23.29*/.Assets.at("javascripts/dirPagination.js"))),format.raw/*23.71*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*24.23*/routes/*24.29*/.Assets.at("javascripts/app.js"))),format.raw/*24.61*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*25.23*/routes/*25.29*/.Assets.at("javascripts/maincontroller.js"))),format.raw/*25.72*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*26.23*/routes/*26.29*/.Assets.at("javascripts/highcharts.js"))),format.raw/*26.68*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*27.23*/routes/*27.29*/.Assets.at("javascripts/exporting.js"))),format.raw/*27.67*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*28.23*/routes/*28.29*/.Assets.at("javascripts/angular-breadcrumb.js"))),format.raw/*28.76*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*29.23*/routes/*29.29*/.Assets.at("javascripts/angular-breadcrumb.min.js"))),format.raw/*29.80*/(""""></script>
    </head>
    <style>


    </style>
    <body ng-app="umsApp" ng-cloak style = "background-color:white;">
        """),_display_(Seq[Any](/*36.10*/content)),format.raw/*36.17*/("""
    <script src=""""),_display_(Seq[Any](/*37.19*/routes/*37.25*/.Assets.at("bootstrap/js/bootstrap.js"))),format.raw/*37.64*/("""" type="text/javascript"></script>
    <script src=""""),_display_(Seq[Any](/*38.19*/routes/*38.25*/.Assets.at("bootstrap-datepicker/js/bootstrap-datepicker.js"))),format.raw/*38.86*/("""" type="text/javascript"></script>
    <script>
                $('div.alert').not('.alert-important').delay(3000).slideUp(300);
    </script>
    <script >
                $(function () """),format.raw/*43.31*/("""{"""),format.raw/*43.32*/("""
                    $('#datepicker').datepicker();
                """),format.raw/*45.17*/("""}"""),format.raw/*45.18*/(""");
        </script>
    <script>
    $("#menu-toggle").click(function(e) """),format.raw/*48.41*/("""{"""),format.raw/*48.42*/("""
        e.preventDefault();
        $("#wrapper").toggleClass("toggled");
    """),format.raw/*51.5*/("""}"""),format.raw/*51.6*/(""");
    </script>
    </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Aug 30 18:58:32 EET 2017
                    SOURCE: F:/play/ums/app/views/main.scala.html
                    HASH: e3e62f0945fa5024b9efafec51b852b90b371a82
                    MATRIX: 778->1|902->31|990->84|1016->89|1285->322|1300->328|1364->369|1456->425|1471->431|1539->476|1631->532|1646->538|1712->581|1804->637|1819->643|1889->690|1981->746|1996->752|2068->801|2160->857|2175->863|2252->917|2349->978|2364->984|2418->1016|2510->1072|2525->1078|2581->1112|2642->1137|2657->1143|2724->1188|2817->1245|2832->1251|2894->1291|2987->1348|3002->1354|3070->1400|3140->1434|3155->1440|3219->1482|3289->1516|3304->1522|3358->1554|3451->1611|3466->1617|3531->1660|3624->1717|3639->1723|3700->1762|3770->1796|3785->1802|3845->1840|3915->1874|3930->1880|3999->1927|4069->1961|4084->1967|4157->2018|4323->2148|4352->2155|4407->2174|4422->2180|4483->2219|4572->2272|4587->2278|4670->2339|4885->2526|4914->2527|5010->2595|5039->2596|5141->2670|5170->2671|5276->2750|5304->2751
                    LINES: 26->1|29->1|35->7|35->7|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25|54->26|54->26|54->26|55->27|55->27|55->27|56->28|56->28|56->28|57->29|57->29|57->29|64->36|64->36|65->37|65->37|65->37|66->38|66->38|66->38|71->43|71->43|73->45|73->45|76->48|76->48|79->51|79->51
                    -- GENERATED --
                */
            