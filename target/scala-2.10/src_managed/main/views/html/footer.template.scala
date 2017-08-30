
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
object footer extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<div style="height: 40px;padding-top: 3px; background-color: #6f000d; padding-left: 2%; padding-right: 2%;" class="navbar-fixed-bottom">
    <nav role="navigation" style="background-color: ;padding-bottom: 1%; padding-top: 1%; padding-left: 1%; color: white;">
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
           <p><b>Copyright &copy; """),_display_(Seq[Any](/*4.36*/(new Date().format("YYYY")))),format.raw/*4.63*/(""" Innovel Technologies Ltd. All right reserved</b><span style="margin-right: 1%;" class="pull-right">Developed by: Innovel Technologies Ltd.</span></p>
        </div>
    </nav>
</div>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Aug 30 18:58:31 EET 2017
                    SOURCE: F:/play/ums/app/views/footer.scala.html
                    HASH: 9eda74395bf4ea791e008440f639003f53d4679a
                    MATRIX: 856->0|1271->380|1319->407
                    LINES: 29->1|32->4|32->4
                    -- GENERATED --
                */
            