fun main(args: Array<String>) {
    val list = listOf<Int>(1,2,3,4,5,6)
    val listSame = listOf(6,6,6,6,6,6,6)
    //any:只要有一个元素满足判定条件就返回true
    println(list.any { it % 2 == 0 })
    println(list.any {it > 8})
    //all:所有元素都满足条件返回true
    println(list.all { it < 8 })
    println(list.all { it % 2 == 0 })
    //返回满足条件的元素的数目
    println(list.count { it > 3 })
    //fold:提供一个初始值，并描述从第一个到最后一个元素如何依次与这个初始值计算的操作，从而实现累计
    println(list.fold(1){total,next -> println("total == $total,next == $next");total + next})
    //foldRight:和fold一样，单顺序是从最后一个元素到第一个元素
    println(list.foldRight(2){next,total -> println("next == $next,total == $total");total * next})
    //forEach:对每个元素进行指定的操作
    println(list.forEach { println(it) })
    //forEachIndex:与forEach相似，但可以获取元素的索引
    println(list.forEachIndexed { index, i ->  println("位置${index}的值是$i")})
    //max:获取最大的元素，如果没有元素返回null
    println(list.max())
    println(listSame.max())
    //min:获取最小的元素，如果没有元素返回null
    println(list.min())
    println(listSame.min())
    //maxBy:筛选出符合条件的最大元素
    println(list.maxBy { -it })
    //minBy:筛选出符合条件的最小元素
    println(list.minBy { -it })
}