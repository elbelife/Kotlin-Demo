package demo3

open class Father(var height:Int,var weight:Int) {

    open var money = 300

    open fun eat(){
        println("I like eat Fruit")
    }

    fun action(){
        println("I can run")
    }
}