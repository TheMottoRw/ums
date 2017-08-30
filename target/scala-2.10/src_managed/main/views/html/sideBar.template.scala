
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
object sideBar extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(page:String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.15*/("""
<div  class="list-group success" style="width: 130%; margin-top: -20%; margin-left: -10%;">
    <style>
#side-menu-1:hover,#side-menu-2:hover,#side-menu-3:hover,#side-menu-4:hover,#side-menu-5:hover,#side-menu-6:hover"""),format.raw/*4.114*/("""{"""),format.raw/*4.115*/("""
background-color: #6f000d;color:white;"""),format.raw/*5.39*/("""}"""),format.raw/*5.40*/("""
#side-menu-1:focus,#side-menu-2:focus,#side-menu-3:focus,#side-menu-4:focus,#side-menu-5:focus,#side-menu-6:focus"""),format.raw/*6.114*/("""{"""),format.raw/*6.115*/("""
background-color:#6f000d;color:white;"""),format.raw/*7.38*/("""}"""),format.raw/*7.39*/("""
.list-group-item"""),format.raw/*8.17*/("""{"""),format.raw/*8.18*/("""height:60px;padding-top: 20px;"""),format.raw/*8.48*/("""}"""),format.raw/*8.49*/("""
</style>
<a class=" list-group-item " id="side-menu-1" href="" style="">
    <span class="round-tabs">
    <i class="glyphicon glyphicon-folder-open"></i>
</span>Academic Choice</a>
    <a class="list-group-item" id="side-menu-2" href="#">
        <span class="round-tabs">
            <i class="glyphicon glyphicon-user"></i>
        </span>
        Student Profile</a>
    <a class="list-group-item" id="side-menu-3" href="#">
        <span class="round-tabs">
            <i class="glyphicon glyphicon-book"></i>
        </span>
        Education Background</a>
    <a class="list-group-item" id="side-menu-4"  href="#">
        <span class="round-tabs">
            <i class="glyphicon glyphicon-euro"></i>
        </span>
        Payment</a>
</div>"""))}
    }
    
    def render(page:String): play.api.templates.HtmlFormat.Appendable = apply(page)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (page) => apply(page)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Aug 30 18:58:34 EET 2017
                    SOURCE: F:/play/ums/app/views/sideBar.scala.html
                    HASH: 9e5c96f744ec8e3ba9b78015a61daaa25f96acd0
                    MATRIX: 776->1|883->14|1132->235|1161->236|1228->276|1256->277|1399->392|1428->393|1494->432|1522->433|1567->451|1595->452|1652->482|1680->483
                    LINES: 26->1|29->1|32->4|32->4|33->5|33->5|34->6|34->6|35->7|35->7|36->8|36->8|36->8|36->8
                    -- GENERATED --
                */
            