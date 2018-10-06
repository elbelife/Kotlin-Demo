fun main(args: Array<String>) {
    val list = listOf<Int>(1,2,3,4,5,6)
    val listPlaceName = listOf("英雄联盟","DNF","守望先锋","上海机场","青岛非机场","第五人格","葡萄牙首都机场")
    //reduce:与fold相似，但没有初始值 描述从第一个元素到最后一个元素如何依次计算的操作，从而实现累计
    println(list.reduce { total, next -> println("total == $total,next == $next");total + next  })
    //reduceRight:与reduce相似，只不过是从最后一个开始
    println(list.reduceRight{ total, next -> println("total == $total,next == $next");total + next  })
    //sumBy:返回经过处理的元素的总和
    println(list.sumBy { it % 2 })
    //把头n个元素去掉
    println(list.drop(3))
    //把头几个满足条件的元素去掉
    println(list.dropWhile { it / 1 == 1 })
    //把从倒数n个元素丢弃
    println(list.dropLast(2))
    //把最后几个满足条件的元素丢弃掉
    println(listPlaceName.dropLastWhile { it.contains("机场") })
    //返回满足条件的元素
    println(list.filter { it % 2 == 0 })
    //返回不满足条件的所有元素
    println(list.filterNot { it % 2 == 0 })
    //返回所有非null元素
    println(listPlaceName.filterNotNull())
    //slice:切割，按指定索引或索引范围内的元素
    println(list.slice(listOf(0,2,4)))
    println(list.slice(0..4))
    //返回头n个元素
    println(listPlaceName.take(4))
    //返回从尾部倒数n个元素
    println(list.takeLast(3))
    //返回满足条件的前n个元素
    println(list.takeWhile { it <= 3 })
}