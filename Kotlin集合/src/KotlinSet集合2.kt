fun main(args: Array<String>) {
    val mainLine = setOf("迪士尼","徐家汇","桃浦新村","南翔","马陆","嘉定新城")
    val subLineJd = setOf("嘉定新城","嘉定东","嘉定北")
    val subLineKs = setOf("嘉定新城","上海赛车场","安亭","花轿")
    val newLines = setOf("昌吉东路","上海汽车城")

    val mutableSetMainLine = mainLine.union(subLineJd).union(subLineKs).toMutableSet()
    //在末尾增加元素 add()方法
    mutableSetMainLine.add("光明路")
    println(mutableSetMainLine.joinToString())
    //添加另一个集合 addAll()
    mutableSetMainLine.addAll(newLines)
    println(mutableSetMainLine.joinToString())
    //移除一个元素 remove()
    mutableSetMainLine.remove("昌吉东路")
    println(mutableSetMainLine.joinToString())
    //移除另一个集合 removeAll()
    mutableSetMainLine.removeAll(newLines)
    println(mutableSetMainLine.joinToString())
}