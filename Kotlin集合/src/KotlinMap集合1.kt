fun main(args: Array<String>) {
    val mapAirport = mapOf<String,String>(Pair("PVG","上海浦东机场"),Pair("LAX","济宁嘉祥机场"),Pair("HND","羽田空港"), Pair("机场","悬崖勒马"))
    val mapEmpty = mapOf<String,String>()
    //元素计数
    println(mapAirport.size)
    println(mapEmpty.size)
    //判断是否有元素
    println(mapAirport.isEmpty())
    println(mapEmpty.isEmpty())
    //获取某个key对应的value
    println(mapAirport.get("PVG"))
    println(mapAirport["PVG"])
    println(mapAirport.getOrDefault("AAA","各种各样的机场"))
    println(mapAirport.getOrDefault("LAX","各种各样的机场"))
    //获取所有key值
    println(mapAirport.keys.joinToString(prefix = "机场代号",separator = "--"))
    //获取所有的value值
    println(mapAirport.values.joinToString())
    //获取所有的条目
    println(mapAirport.entries.joinToString())
    //是否包含某个key
    println(mapAirport.containsKey("PVG"))
    //是否包含某个value
    println(mapAirport.containsValue("无聊机场"))
    //筛选器:filter方法
    println(mapAirport.filter { it.value.contains("机场") })
    //根据key筛选:filterKey方法
    println(mapAirport.filterKeys { it.contains("PVG")})
    //根据value筛选:filterValue方法'
    println(mapAirport.filterValues { it.contains("机场") })
    //把不符合条件的筛选出来:filterNot方法
    println(mapAirport.filterNot { it.value.contains("机场") })
    println((mapAirport.map { "机场代码:" + it.key + ",机场名称:" + it.value }))

}