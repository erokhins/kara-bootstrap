package kara.bootstrap.views

import kara.HTML
import kara.HtmlLayout
import kara.ActionContext
import kara.HtmlView
import kara.DirectLink

/**
* @author Stanislav Erokhin
*/

class BootstrapLayout(val title : String) : HtmlLayout() {
    override fun HTML.render(context: ActionContext, mainView: HtmlView) {
    head {
        title(title)
        meta("viewport", "width=device-width, initial-scale=1.0")
        link(DirectLink("/bootstrap/css/bootstrap.min.css"), rel = "stylesheet",  mimeType = "text/css")
    }
    body {
        renderView(context, mainView)
    }
}
}