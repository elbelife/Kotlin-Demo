package demo3

class Outer {

    var color:String = "red"

    var size:Int = 30

    fun functionA(){
        println("I am Outer")
    }

    inner class Inter{

        var color:String = "blue"

        var size:Int = 20

        fun functionB(){
            println("I am Inter")
        }

        fun functionC(){
            this@Outer.functionA()
        }
    }
}