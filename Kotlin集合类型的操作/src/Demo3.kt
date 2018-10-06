fun main(args: Array<String>) {
    val list = listOf<Int>(1,2,3,4,5,6)
    val listPlaceName = listOf("英雄联盟","DNF","守望先锋","上海机场","青岛非机场","第五人格","葡萄牙首都机场")
    val nullProbaleList = listOf<Any?>("LOL","DNF",null,1,6,5.0f)

    //flatMap:迭代集合的所有元素，为每一个元素生成一个新的集合，最后把所有集合摊平合并到一个集合里
    println(listPlaceName.flatMap { listOf(it,it+"啊") })
    //groupBy:分组，返回一个原集合按条件判断函数分组后的map
    println(list.groupBy { if(it % 2 == 0) "偶数" else "奇数" })
    //map:返回一个对每个元素变换后的新集合
    println(list.map { it *  3})
    //mapIndexed:在map的基础上，引入集合的索引供变换使用
    println(listPlaceName.mapIndexed { index, s -> s + index })
    //mapNotNull:对所有非null元素进行变换
    println(list.mapNotNull { it + 555555 })
    println(nullProbaleList.mapNotNull { it })
}