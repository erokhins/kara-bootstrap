
package kara.bootstrap.views.home

import kara.*

class IndexView() : HtmlView() {
    override fun render(context: ActionContext) {
        h2("Welcome to Kara")
p("Your app is up and running, now it's time to make something!")
p("Start by editing this file here: src/kara/bootstrap/views/home/IndexView.kt")

    }
}

