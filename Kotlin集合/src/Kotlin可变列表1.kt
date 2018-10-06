fun main(args: Array<String>) {
    val nollNewStation = mutableListOf("FaceBook","Google","Twitter","Mirsoft","Amazon","AliBaBa","Tensent")
    val m = MutableList<String>(20,::addYuansu)
    println(m.joinToString())
    //向列表尾部添加元素
    nollNewStation.add("大疆")
    nollNewStation.add("京推推")
//    val otherStation = mutableListOf("嘤嘤嘤","呜呜呜","SIX GOD","RTY")
//    val otherStation = arrayOf("嘤嘤嘤","呜呜呜","SIX GOD","RTY")
    val otherStation = arrayListOf("嘤嘤嘤","呜呜呜","SIX GOD","RTY")
    nollNewStation.addAll(otherStation)
    //移除指定元素
    nollNewStation.remove("嘤嘤嘤")
    //移除指定下标的元素
    nollNewStation.removeAt(1)
    //替换指定位置的元素 set或下标方法
    nollNewStation.set(0,"美国法院")
    nollNewStation[1] = "图案特"
    //取子列表
    val subList = nollNewStation.subList(1,5)
    println(subList)
    //清空集合
//    subList.clear()
//    subList.removeAll(subList)
    subList.removeAll { it.length == 3 }
    println(subList)
    println(nollNewStation.joinToString())
}

private fun addYuansu(index:Int):String{
    return "AAAAAA$index"
}