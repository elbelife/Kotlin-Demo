fun main(args: Array<String>) {
    val originalMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3)
    val destinationMap = mutableMapOf("key40" to 40, "key50" to 50)
//    //将originalMap中符合条件的键值对添加到destinationMap中，并生成一个新的MutableMap对象
//    val filteredMap = originalMap.filterTo(destinationMap) { it.value < 3 }
//
//    println(filteredMap)
//    println(destinationMap)
//    println(originalMap)

    val filterNotMap = originalMap.filterNotTo(destinationMap){it.value < 2}

    println(filterNotMap)
    println(destinationMap)
    println(originalMap)

    
}