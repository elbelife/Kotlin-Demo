fun main(args: Array<String>) {

    val myNumber = MyNumber(5)
    println("sum() == ${myNumber.sum()}")
    println("parseStr() == ${myNumber.parseStr() is String}")
    println("parseStr() == ${myNumber.parseStr()}")
}

class MyNumber(var a : Int){

    private fun Int.ciFang(): Int{
        return this * this * this
    }

    private fun Int.zhuanZiFuChuan(): String{
        return this.toString()
    }

    fun sum() =  a.ciFang()

    fun parseStr() = a.zhuanZiFuChuan()
}