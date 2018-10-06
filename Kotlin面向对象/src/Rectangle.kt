
class Rect(var width:Int,var height:Int){
    fun move(){
        println("矩形移动了")
    }

    fun becomeBig(){
        println("矩形面积变大了")
    }
}

fun main(args: Array<String>) {
    var rect = Rect(30,20)
    println("矩形的高度为:${rect.height}")
    println("矩形的宽度为:${rect.width}")

    rect.becomeBig()
    rect.move()
}