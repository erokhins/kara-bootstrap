package kara.bootstrap

import java.util.ArrayList
import java.util.Collections

/**
* @author Stanislav Erokhin
*/

fun convertStyleNameToKara(className : String): String {
    return className.replace('-', '_')
}


fun styleClassTemplate(className : String) : String {
    return """val ${convertStyleNameToKara(className)} = SimpleClassStyle("${className}")"""
}

fun bootstrapStyleClassesTemplate(classNamesSet : Set<String>): String {
    val classNames : MutableList<String> = ArrayList<String>(classNamesSet)
    Collections.sort(classNames)

    val builder = StringBuilder()
    builder.append(
"""
package kara.bootstrap.styles

import kara.StyleClass

/**
* @author Stanislav Erokhin
*/

public class SimpleClassStyle(val name : String) : StyleClass {
    override fun name(): String {
        return name
    }
}

"""
    )

    for (className in classNames) {
        if (!className.isEmpty()) {
            builder.append(styleClassTemplate(className)).append("\n")
        }
    }

    return builder.toString()
}