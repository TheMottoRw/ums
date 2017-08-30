
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
object dashboardHome extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""
<!DOCTYPE html>
<html>
    <head>
        <title>"""),_display_(Seq[Any](/*5.17*/title)),format.raw/*5.22*/("""</title>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("bootstrap/css/bootstrap.css"))),format.raw/*9.101*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*10.54*/routes/*10.60*/.Assets.at("/bootstrap/css/simple-sidebar.css"))),format.raw/*10.107*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*11.54*/routes/*11.60*/.Assets.at("/bootstrap/css/font-awesome.min.css"))),format.raw/*11.109*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*12.54*/routes/*12.60*/.Assets.at("bootstrap-datepicker/css/datepicker3.css"))),format.raw/*12.114*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*13.59*/routes/*13.65*/.Assets.at("images/favicon.png"))),format.raw/*13.97*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*14.54*/routes/*14.60*/.Assets.at("stylesheets/main.css"))),format.raw/*14.94*/("""">
        <script src=""""),_display_(Seq[Any](/*15.23*/routes/*15.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*15.74*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*16.23*/routes/*16.29*/.Assets.at("javascripts/angular.min.js"))),format.raw/*16.69*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*17.23*/routes/*17.29*/.Assets.at("javascripts/angular-route.min.js"))),format.raw/*17.75*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*18.23*/routes/*18.29*/.Assets.at("javascripts/dirPagination.js"))),format.raw/*18.71*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*19.23*/routes/*19.29*/.Assets.at("javascripts/app.js"))),format.raw/*19.61*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*20.23*/routes/*20.29*/.Assets.at("javascripts/maincontroller.js"))),format.raw/*20.72*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*21.23*/routes/*21.29*/.Assets.at("javascripts/highcharts.js"))),format.raw/*21.68*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*22.23*/routes/*22.29*/.Assets.at("javascripts/exporting.js"))),format.raw/*22.67*/(""""></script>
    </head>
    <body ng-app="umsApp" ng-cloak style = "background:white;">
        """),_display_(Seq[Any](/*25.10*/content)),format.raw/*25.17*/("""
    <script src=""""),_display_(Seq[Any](/*26.19*/routes/*26.25*/.Assets.at("bootstrap/js/bootstrap.js"))),format.raw/*26.64*/("""" type="text/javascript"></script>
    <script src=""""),_display_(Seq[Any](/*27.19*/routes/*27.25*/.Assets.at("bootstrap-datepicker/js/bootstrap-datepicker.js"))),format.raw/*27.86*/("""" type="text/javascript"></script>
    <script>
                $('div.alert').not('.alert-important').delay(3000).slideUp(300);
        </script>
    <script >
                $(function () """),format.raw/*32.31*/("""{"""),format.raw/*32.32*/("""
                    $('#datepicker').datepicker();
                """),format.raw/*34.17*/("""}"""),format.raw/*34.18*/(""");
        </script>
    <script>
                $("#menu-toggle").click(function(e) """),format.raw/*37.53*/("""{"""),format.raw/*37.54*/("""
                    e.preventDefault();
                    $("#wrapper").toggleClass("toggled");
                """),format.raw/*40.17*/("""}"""),format.raw/*40.18*/(""");
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
                    DATE: Wed Aug 30 18:58:31 EET 2017
                    SOURCE: F:/play/ums/app/views/dashboardHome.scala.html
                    HASH: f2be4bed5a82cd9480004d039d94a17a7c270c1a
                    MATRIX: 787->1|911->31|1001->86|1027->91|1298->327|1312->333|1375->374|1468->431|1483->437|1553->484|1646->541|1661->547|1733->596|1826->653|1841->659|1918->713|2016->775|2031->781|2085->813|2178->870|2193->876|2249->910|2311->936|2326->942|2393->987|2487->1045|2502->1051|2564->1091|2658->1149|2673->1155|2741->1201|2812->1236|2827->1242|2891->1284|2962->1319|2977->1325|3031->1357|3125->1415|3140->1421|3205->1464|3299->1522|3314->1528|3375->1567|3446->1602|3461->1608|3521->1646|3657->1746|3686->1753|3742->1773|3757->1779|3818->1818|3908->1872|3923->1878|4006->1939|4230->2135|4259->2136|4357->2206|4386->2207|4503->2296|4532->2297|4678->2415|4707->2416
                    LINES: 26->1|29->1|33->5|33->5|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|53->25|53->25|54->26|54->26|54->26|55->27|55->27|55->27|60->32|60->32|62->34|62->34|65->37|65->37|68->40|68->40
                    -- GENERATED --
                */
            