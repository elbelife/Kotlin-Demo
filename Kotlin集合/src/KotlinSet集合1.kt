fun main(args: Array<String>) {
    val mainLine = setOf("迪士尼","徐家汇","桃浦新村","南翔","马陆","嘉定新城")
    val subLineJd = setOf("嘉定新城","嘉定东","嘉定北")
    val subLineKs = setOf("嘉定新城","上海赛车场","安亭","花轿")
    val emptySet = setOf<String>()

    //计算元素的总个数
    println(mainLine.size)
    println(mainLine.count())
    //判断及和是否有元素
    println(mainLine.isEmpty())
    println(emptySet.isEmpty())
    //是否包含某个元素
    println(subLineJd.contains("嘉定东"))
    println(subLineKs.contains("上海赛车场"))
    //转换为数组
    println(mainLine.toTypedArray().joinToString())
    //某个Set集合是否完全包含另一个集合
    println(mainLine.containsAll(subLineJd))
    println((mainLine + subLineJd).containsAll(subLineJd))
    //两个Set集合间的运算 交集(两个集合都包含的元素) 差集(从一个集合中排除与另一个集合交集的部分) 并集(两个集合合并成一个新的集合，重复的元素保留一个)
    //补集(并集去除交集后的部分)
    //交集
    println(mainLine.intersect(subLineJd))
    println(mainLine.intersect(subLineKs))
    println(subLineJd.intersect(subLineKs))
    //差集
    println(mainLine.subtract(subLineJd))
    println(mainLine.subtract(subLineKs))
    println(subLineJd.subtract(subLineKs))
    //并集
    println(mainLine.union(subLineJd))
    //补集
    println(mainLine.union(subLineJd) - mainLine.intersect(subLineJd))

}