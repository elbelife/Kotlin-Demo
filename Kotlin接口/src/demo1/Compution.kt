package demo1

import demo1.AdvancedCompution
import demo1.CommonCompution

class Compution(num1:Double, num2:Double): CommonCompution, AdvancedCompution {

    val num1 = num1

    val num2 = num2

    override fun add() {
      println(num1 + num2)
    }

    override fun subtract() {
        println(num1 - num2)
    }

    override fun multiply() {
        println(num1 * num2)
    }

    override fun divide() {
        println(num1 / num2)
    }

    override fun pow(uo: Int) {
        var num1Result = 1.0
        var num2Result = 1.0
        for(i in 1..uo){
            num1Result *= num1
            num2Result *= num2
        }
        println("num1:${num1Result}，num2:$num2Result")
    }

}