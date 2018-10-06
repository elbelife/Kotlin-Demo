class NumberCompution(val num1:Int,val num2:Int,var operator:(Int,Int) -> Int) {

    fun operation(){
        println("Operation Result:${operator(num1,num2)}")
    }
}