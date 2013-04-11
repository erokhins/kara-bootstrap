package kara.bootstrap

/**
* @author Stanislav Erokhin
*/


import org.jsoup.nodes.Document
import org.jsoup.Jsoup
import java.io.File
import java.util.Collections
import java.util.HashSet
import org.jsoup.nodes.Element

fun main(args : Array<String>) {
    val template : String = bootstrapStyleClassesTemplate(getAllStyleClassesFromFile("bootstrap/docs/base-css.html"))
    val outFile = File("out/BootstrapStyleClasses.kt")
    outFile.writeText(template, "UTF-8")
}

fun getAllStyleClassesFromFile(filename : String): Set<String> {
    val doc : Document = Jsoup.parse(File(filename), "UTF-8")!!
    val allStyleClasses : MutableSet<String> = HashSet<String>()

    for (element : Element in doc.getAllElements()!!) {
        allStyleClasses.addAll(element.classNames()!!)
    }

    return allStyleClasses
}