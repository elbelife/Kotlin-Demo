fun main(args: Array<String>) {
    val numSort = arrayOf(-99,2,56,-100,85,963,15,-20)
    val nollstation = arrayOf("嘉定北","徐家汇","南翔","桃浦新村","徐家汇","上海西站","罗山路","迪士尼","嘉定新城","桃浦新村","南翔")
    //判断所有元素是否满足指定条件
    println(numSort.all { it > 0 })
    //判断是否有一个元素满足条件
    println(numSort.any { it < 0 })
    //判断是否所有元素都不满足条件
    println(numSort.none { it == 0 })
    //数组升序
    println(numSort.sortedArray().joinToString())
    //数组降序
    println(numSort.sortedArrayDescending().joinToString())
    //增强型数组升序
    //根据元素的长度升序排列
    println(nollstation.sortedBy { it.length }.joinToString ())
    //增强型数组降序
    //根据元素的长度降序排列
    nollstation.sortByDescending { it.length }
    println(nollstation.joinToString())
    //帅选数组中的元素
    println(numSort.filter(::isDouble))
    //数组的最大值
    println(numSort.max())
    //数组的最小值
    println(numSort.min())
    //站名中最长的一个
    println(nollstation.maxBy { it.length })
    //站名中最短的一个
    println(nollstation.minBy { it.length })
    //删除重复元素
    println(nollstation.distinct())
    //增强型删除元素
    println(nollstation.distinctBy { it.length })
    //把一种类型的数组转换为另一种类型的数组，比如Int型转字符串类型，并加前缀
    println(numSort.map { "数字：$it" })

}

fun isDouble(i:Int) = i % 2 == 0