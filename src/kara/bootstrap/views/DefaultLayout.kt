
package kara.bootstrap.views

import kara.*
import kara.bootstrap.styles.*

class DefaultLayout() : HtmlLayout() {
    override fun render(context: ActionContext, mainView: HtmlView) {
        head {
            title("Kara App")
            stylesheet(DefaultStyles())
        }
        body {
            h1("Kara App")
            div(id="main") {
                renderView(context, mainView)
            }
        }
    }
}

