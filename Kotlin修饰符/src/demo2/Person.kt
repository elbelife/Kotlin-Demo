package demo2

open class Person(name:String,age:Int,height:Double,weight:Double) {

    protected val name = name

    protected val age = age

    protected val height = height

    protected val weight = weight

    protected fun printZero() = println("0")

    fun printInformation(){
        println(name)
        println(age)
        println(height)
        println(weight)
    }
}