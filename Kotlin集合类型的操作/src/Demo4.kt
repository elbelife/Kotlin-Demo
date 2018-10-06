fun main(args: Array<String>) {
    val list = listOf<Int>(1,2,3,4,5,6)
    val listPlaceName = listOf("英雄联盟","DNF","D下城与勇士","守望先锋","上海机场","青岛非机场","第五人格","葡萄牙首都机场","葡萄牙首都机场")

    //elementAt:返回指定索引处的元素，如果索引不在集合的索引范围内，则抛出索引越界异常
    println(listPlaceName.elementAt(3))
    //elementAtOrElse:如果索引越界，则调用函数
    println(listPlaceName.elementAtOrElse(10){it * 21})
    //elementAlOrNull:如果索引越界则返回null
    println(list.elementAtOrNull(10))
    //first:返回第一个满足条件的元素
    println(list.first { it % 2 == 0})
    //firstOrNull:找不到满足条件的元素返回null
    println(list.firstOrNull { it == 8 })
    //indexOf:返回元素的首个索引 不存在返回-1
    println(listPlaceName.indexOf("DNF"))
    //indexOfFirst:返回满足条件的首个元素的索引 若元素不存在，则返回-1
    println(listPlaceName.indexOfFirst { it.contains("D") })
    //indexOfLast:返回满足条件的元素的最后索引 若元素不存在，则返回-1
    println(listPlaceName.indexOfLast { it.contains("D") })
    //返回最后一个满足条件的元素
    println(list.last { it % 2 == 0 })
    //lastIndexOf:返回元素的最后索引 若元素不存在，则返回-1
    println(listPlaceName.lastIndexOf("葡萄牙首都机场"))
    //lastOrNull:返回最后一个满足条件的元素 若元素不存在，则返回-1
    println(listPlaceName.lastOrNull { it.contains("葡萄牙") })
    println(listPlaceName.lastOrNull { it.contains("哈哈哈") })
    //返回满足条件的单元素 如果没找到或者多个元素满足条件则抛出异常
    println(list.single{it % 5 == 0})
//    println(list.single{it % 5 == 6})
    //返回满足条件的单元素 如果没找到或者多个元素满足条件则返回null
    println(list.singleOrNull { it % 5 == 6 })
    //partition:把集合拆开分成1对集合，第一个集合满足条件，另一个集合不满足条件
    println(listPlaceName.partition { it.contains("机场") })
    //把两个集合以相同的索引顺序进行配对，组成一个新的集合 新集合以最短的那个集合索引为准
    println(list.zip(listOf("100","102","104")))
}