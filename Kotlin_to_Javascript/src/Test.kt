import org.w3c.dom.HTMLInputElement
import kotlin.browser.*

import kotlin.js.*


fun main(args:Array<String>)
{

   println("hello world")

}

fun myFunction()
{

    val number_1= document.getElementById("number_1txt") as HTMLInputElement
    val number_2= document.getElementById("number_2txt") as HTMLInputElement


    val somma= number_1.value.toInt()+number_2.value.toInt()

    js("alert(somma)")

}