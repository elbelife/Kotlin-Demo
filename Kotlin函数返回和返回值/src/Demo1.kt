fun main(args: Array<String>) {
    显示小于九的数字()
}

fun maxNumber(a:Int,b:Int,c:Int):Int{
    fun maxNumber(a:Int,b:Int):Int{
        return if(a > b) a else b
    }
    return maxNumber(maxNumber(a,b),maxNumber(b,c))
}

fun 显示小于九的数字(){
    val list = listOf(1,2,0,-1,3,-3,10)
    list.forEach ( fun(x){
        if(x < 9)
            println(x)
        else return
    } )
    println("函数继续执行")
}

