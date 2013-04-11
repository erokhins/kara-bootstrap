
package kara.bootstrap.routes

import kara.bootstrap.views.*
import kara.bootstrap.views.home.*
import kara.*

object Home {

    Get("/") class BootstrapTestPage() : Request({
        BootstrapTestView(BootstrapLayout("Bootstrap page"))
    })

}

