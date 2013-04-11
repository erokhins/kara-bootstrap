package kara.bootstrap.views.home

import kara.bootstrap.styles.*
import kara.*

/**
* @author Stanislav Erokhin
*/

class BootstrapTestView(layout : HtmlLayout? = null) : HtmlView(layout) {
    override fun render(context: ActionContext) {
        h1(c = text_center) {
            +"Test page for Bootstrap lib for Kara"
        }

        h3(c = text_info) {
            +"Buttons:"
        }
        div(c = btn) {
            +"button"
        }
        div(c = btn + btn_warning) {
            +"warning"
        }
        div(c = btn + btn_danger) {
            +"danger"
        }

        h3(c = text_info) {
            +"Icons:"
        }
        ul {
            li {
                b(c = icon_book)
                +"icon_book"
            }
            li {
                b(c = icon_off)
                +"icon_off"
            }
        }

    }
}