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


val btn = SimpleClassStyle("btn")
val btn_info = SimpleClassStyle("btn-info")