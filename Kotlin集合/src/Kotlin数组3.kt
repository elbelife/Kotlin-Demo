fun main(args: Array<String>) {
    val numSort = arrayOf(-99,2,56,-100,85,963,15,-20,30,89,-74)
    val nollstation = arrayOf("嘉定北","徐家汇","南翔","桃浦新村","徐家汇","上海西站","罗山路","迪士尼","嘉定新城","桃浦新村","南翔")
    val nollstationChar = arrayOf("A","A","A","A","A","A","A","A","A","A")
    //求和
    println(numSort.sum())
    //增强求和
    println(numSort.sumBy { 10_000 + it })
    //求平均值
    println(numSort.average())
    //将所有的元素从左向右合成为一个值，仅针对字符串数组 s1和s2分别代表数组的一个元素和下一个元素
    println(nollstationChar.reduce{s1,s2 -> "$s1,$s2"})
    println(nollstation.reduce { s1,s2 -> "$s1,$s2" })
    //将所有的元素从右向左合成为一个值，仅针对字符串数组 s1和s2分别代表数组的一个元素和下一个元素
    println(nollstation.reduceRight{s1 , s2 -> "$s2,$s1"})
    //相当于加了前缀的reduce方法
    println(nollstation.fold("地铁十一号线"){s1,s2 -> "$s1--$s2"})
    //相当于加了后缀的reduceRight方法
    println(nollstation.foldRight("地铁十一号线"){s1,s2 -> "$s2--$s1"})
}