
package kara.bootstrap.routes

import kara.bootstrap.views.*
import kara.bootstrap.views.home.*
import kara.*

object Home {
    val layout = DefaultLayout()
    Get("/") class Index() : Request({
        IndexView()
    })

}

