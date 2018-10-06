fun main(args: Array<String>) {
    val list = listOf<Int>(1,2,3,4,5,6)
    val numList = listOf<Int>(0,85,45,23,100,23,29,77)
    val listPlaceName = listOf("英雄联盟","DNF","D下城与勇士","守望先锋","上海机场","青岛非机场","第五人格","葡萄牙首都机场","葡萄牙首都机场")

    //reversed:返回逆转顺序后的所有元素
    println(listPlaceName.reversed())
    //sorted:返回升序后的所有集合
    println(numList.sorted())
    //sortedBy:返回按特定比较器(comparator)升序后的所有元素
    println(numList.sortedBy { it % 2 })
    //sortedDescending:返回降序后的所有元素
    println(numList.sortedDescending())
    println(listPlaceName.sortedDescending())
    //sortedByDescending:返回按特定比较器(comparator)降序后的所有元素
    println(numList.sortedByDescending { it % 3 })
}