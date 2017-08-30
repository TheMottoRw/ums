
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
object inHeader extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*2.1*/("""<nav ng-init="loadCurrentUser()" class="navbar navbar-default" role="navigation" style="background-color: #6f000d;">
    <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <img class="pull-left" src=""""),_display_(Seq[Any](/*10.38*/routes/*10.44*/.Assets.at("images/logo.png"))),format.raw/*10.73*/("""" height="50px" width="130px">
        <a style="color: white; font-size: 160%;" class="navbar-brand" href=""""),_display_(Seq[Any](/*11.79*/routes/*11.85*/.Application.index())),format.raw/*11.105*/(""""><li class="fa fa-cogs"></li> UNIVERSITY MANAGEMENT</a>
    </div>
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
        <ul class="nav navbar-nav navbar-right">
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">"""),format.raw/*16.133*/("""{"""),format.raw/*16.134*/("""{"""),format.raw/*16.135*/("""currentUser.firstName"""),format.raw/*16.156*/("""}"""),format.raw/*16.157*/("""}"""),format.raw/*16.158*/(""" """),format.raw/*16.159*/("""{"""),format.raw/*16.160*/("""{"""),format.raw/*16.161*/("""currentUser.lastName"""),format.raw/*16.181*/("""}"""),format.raw/*16.182*/("""}"""),format.raw/*16.183*/(""" <span class="caret"></span></a>
                <ul class="dropdown-menu">
                    <li><a href="">Change password</a></li>
                    <li role="separator" class="divider"></li>
                    <li><a href="/logout/">Logout</a></li>
                </ul>
            </li>
        </ul>
    </div>
</nav>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Aug 30 18:58:31 EET 2017
                    SOURCE: F:/play/ums/app/views/inHeader.scala.html
                    HASH: 68291bba6e3f0cf5beb79895088db6a92f8098c0
                    MATRIX: 858->2|1414->522|1429->528|1480->557|1626->667|1641->673|1684->693|2078->1058|2108->1059|2138->1060|2188->1081|2218->1082|2248->1083|2278->1084|2308->1085|2338->1086|2387->1106|2417->1107|2447->1108
                    LINES: 29->2|37->10|37->10|37->10|38->11|38->11|38->11|43->16|43->16|43->16|43->16|43->16|43->16|43->16|43->16|43->16|43->16|43->16|43->16
                    -- GENERATED --
                */
            