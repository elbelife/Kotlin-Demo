package demo1

open class Person {

    open var name:String = ""

    open var age:Int = 0

    var height:Double = 0.0

    var width:Double = 0.0

    open fun printInformation() = println("name:$name")


}