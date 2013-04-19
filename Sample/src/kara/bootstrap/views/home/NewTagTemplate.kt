package kara.bootstrap.views.home

import kara.*
import kara.bootstrap.styles.*

/**
* @author erokhins
*/

open class NEW_TAG() {
    var FOO1 : BodyTag.() -> Unit = empty_init;
    var FOO2 : UL.() -> Unit = empty_init;

    fun foo1(init : BodyTag.() -> Unit = empty_init): Unit {
        FOO1 = init
    }

    fun foo2(init : UL.() -> Unit = empty_init): Unit {
        FOO2 = init
    }
}

fun BodyTag.new_tag(init : NEW_TAG.() -> Unit = empty_init) : Unit {
    val new_tag = NEW_TAG()
    new_tag.init()
    h1 (init = new_tag.FOO1)
    div {
        ul(c = text_info + text_left, init = new_tag.FOO2)
    }
}

class NewTagTestView(layout : HtmlLayout? = null) : HtmlView(layout) {
    override fun render(context: ActionContext) {
        div(c = text_center) {
            new_tag {
                foo1 {
                    b {
                        +"h1"
                    }
                }
                foo2 {
                    li {
                        +"Item 1"
                    }
                    li {
                        +"Item 2"
                    }
                }
            }
        }
    }

}