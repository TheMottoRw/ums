
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
object frontHeader extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<nav class="navbar navbar-default" role="navigation" style="background-color: #6f000d; width: 100%;">
    <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <img class="pull-left" src=""""),_display_(Seq[Any](/*9.38*/routes/*9.44*/.Assets.at("images/logo.png"))),format.raw/*9.73*/("""" height="50px" width="130px">
        <a style="color: white; font-size: 160%;" class="navbar-brand" href=""><li class="fa fa-cogs"></li>FULLY UNIVERSITY MANAGEMENT INFORMATION SYSTEM (UMS)</a>
    </div>
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
        <div class="col-sm-4 col-md-4 pull-right">
        </div>
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
                    SOURCE: F:/play/ums/app/views/frontHeader.scala.html
                    HASH: 3f617a931cf9a77ce6e9d82e45c5e140496bc2e7
                    MATRIX: 861->0|1401->505|1415->511|1465->540
                    LINES: 29->1|37->9|37->9|37->9
                    -- GENERATED --
                */
            