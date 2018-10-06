/**
 * 本地函数
 */
fun main(args: Array<String>) {
  printlnArea(100,500)
  printlnArea1(100,300)
    checkNumber(1,10)
}

fun printlnArea(width:Int,height:Int){
    fun area(width:Int,height:Int):Int{
        return width * height
    }
    val area = area(width, height)
    println(area)
}

fun printlnArea1(width:Int,height:Int){
    fun area() = width * height
    println(area())
}

fun checkNumber(start:Int,end:Int){
    for(x in start..end){
        fun isThree() = x % 3 == 0
        fun isFive() = x % 5 == 0

        if(isThree()){
            println("${x}能被3整除")
        }else if(isFive()){
            println("${x}能被5整除")
        }else if(isThree() && isFive()){
            println("${x}能被3整除，也能被5整除")
        }else{
            println(x)
        }
    }
}