fun main(args: Array<String>) {
    val nollstation = arrayOf("嘉定北","徐家汇","南翔","桃浦新村","徐家汇","上海西站","罗山路","迪士尼","嘉定新城")
    //获取数组元素个数
    println(nollstation.count())
    println(nollstation.size)
    //获取指定位置的元素
    println(nollstation.first())//第一个位置
    println(nollstation.component1())//第一个位置
    println(nollstation.component2())//第二个位置
    println(nollstation.component3())//第三个位置
    println(nollstation.component4())//第四个位置
    println(nollstation.component5())//第五个位置
    println(nollstation[6])//第六个位置
    println(nollstation.last())//最后一个
    //是否包含某个元素
    println(nollstation.contains("嘉定北"))
    println(nollstation.contains("AAA"))
    //丢弃某些元素
    println(nollstation.drop(5))//丢弃前5个元素
    println(nollstation.dropWhile { it.equals("徐家汇")  })//丢弃符合条件的元素
    println(nollstation.dropWhile { it.equals("嘉定北")  })//丢弃符合条件的元素
    println(nollstation.dropLast(5))//丢弃后5个元素
    println(nollstation.dropLastWhile { it == "迪士尼" })//丢弃符合条件的元素
    println(nollstation.dropLastWhile { it == "嘉定新城" })//丢弃符合条件的元素
    //查找符合条件的第一个元素
    println(nollstation.find { it.contains("徐") })
    println(nollstation.find { it.contains("南") })
    //查找符合条件的最后一个元素
    println(nollstation.findLast { it.contains("迪") })
    //将整个数组以字符串的形式分割
    println(nollstation.joinToString())
    //定制分割形式
    println(nollstation.joinToString { it + "傻逼" })
    println(nollstation.joinToString(separator = "--",prefix = "地铁线：",limit = 5))
    //取出元素
    println(nollstation.take(2))//取前两个元素
    println(nollstation.takeLast(3))//取后三个元素
    //切割数组，取出指定索引范围内的元素
    println(nollstation.sliceArray(2 .. 5).joinToString ())
    //将数组自身元素首尾顺序颠倒
    println(nollstation.reversed().joinToString())
    println(nollstation.reversedArray().joinToString())
    println(nollstation.joinToString())
    nollstation.reverse()
    println(nollstation.joinToString())
}