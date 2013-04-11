
package kara.bootstrap.routes

import kara.bootstrap.views.*
import kara.bootstrap.views.home.*
import kara.*

object Home {

    Get("/") class Index() : Request({
        BootstrapTestView(BootstrapLayout("Bootstrap page"))
    })

}

