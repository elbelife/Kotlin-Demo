fun main(args: Array<String>) {
    val mapAirport = mapOf<String,String>(Pair("PVG","上海浦东机场"),Pair("LAX","济宁嘉祥机场"),Pair("HND","羽田空港"), Pair("机场","悬崖勒马"))
    val mapEmpty = mapOf<String,String>()
    val map = mapOf(Pair("c", 3), Pair("b", 2), Pair("d", 1))
    val sorted = map.toSortedMap()
    println(sorted.keys) // [b, c, d]
    println(sorted.values) // [2, 3, 1]

    //只对key变形:mapKeys() 返回一个新的Map对象
    println(mapAirport.mapKeys { "机场代号:${it.key}" })
    //只对value变形:mapValues() 返回一个新的Map对象
    println(mapAirport.mapValues { "机场名称:${it.value}" })
    //最大值依据
    println(mapAirport.maxBy { it.value.length })
    //最小值依据
    println(mapAirport.minBy { it.value.length })
    //排序 默认按key排序
    println(mapAirport.toSortedMap())
    //转换成普通键值对的list
    println(mapAirport.toList())
    //转变成可变Map MutableMap
    val newMutableMap = mapAirport.toMutableMap()
    println(newMutableMap)

}