package demo3

//class EntrustMap(var map: Map<String,String>) {
//    val key1:String by map
//    val key2:String by map
//    val key3:String by map
//}
class EntrustMap(var map: MutableMap<String,String>) {
    val key1:String by map
    val key2:String by map
    val key3:String by map
}


fun main(args: Array<String>) {
//    val entrustMap = EntrustMap(mapOf("key1" to "value1","key2" to "value2","key3" to "value3"))
//    println(entrustMap.map)
//    println(entrustMap.key1)
//    println(entrustMap.key2)
//    println(entrustMap.key3)

    val map = mutableMapOf("key1" to "value1","key2" to "value2","key3" to "value3")
    val entrustMap = EntrustMap(map)

    println(entrustMap.key1)
    println(entrustMap.key2)
    println(entrustMap.key3)
    println("修改之后:")
    map["key1"] = "valueA"
    map["key2"] = "valueB"
    map["key3"] = "valueC"
    println(entrustMap.key1)
    println(entrustMap.key2)
    println(entrustMap.key3)

}