package demo1

import demo1.Leaf

fun main(args: Array<String>) {
    val leaf = Leaf("30", "yellow", "circle", 57)
//    val (size,color,shape,vein) = leaf
    val size = leaf.component1()
    val color = leaf.component2()
    val shape = leaf.component3()
    val vein = leaf.component4()
    println("大小:$size,颜色:$color,形状:$shape,叶脉数:$vein")
//    println("大小:${leaf.size},颜色:${leaf.color},形状:${leaf.shape},叶脉数:${leaf.vein}")

    val chun = Leaf("30", "green", "circle", 37)
    val xia = chun.copy(vein = 50)
    val qiu = xia.copy(color = "red")
    val dong = qiu.copy(size = "", color = "", shape = "", vein = 0)

    println("春天:$chun")
    println("夏天:$xia")
    println("秋天:$qiu")
    println("冬天:$dong")
    println("冬天:${dong.toString() is String}")
}