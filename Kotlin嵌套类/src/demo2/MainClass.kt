package demo2

fun main(args: Array<String>) {
    val taoHuan = TaoHuan()
    val jiangPin = TaoHuan().JiangPin()

    println("外部类this@类名  : ${taoHuan.getShapeContent()}")
    println("外部类this  : ${taoHuan.getShapeContent1()}")
    println("内部类this@外部类名  : ${jiangPin.getOutSize()}")
    println("内部类this@内部类名  : ${jiangPin.getInSize()}")
    println("内部类this  : ${jiangPin.getThisSize()}")

}