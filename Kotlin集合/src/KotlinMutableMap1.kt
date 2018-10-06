fun main(args: Array<String>) {
    val mapAirport = mapOf<String,String>(Pair("PVG","上海浦东机场"),Pair("LAX","济宁嘉祥机场"),Pair("HND","羽田空港"), Pair("机场","悬崖勒马"))
    val mutableMapAirport = mapAirport.toMutableMap()
    val airportFuture = mapOf<String,String>(Pair("M31","仙女座星系"),Pair("PROXIMA","比邻星@"))

    //添加元素
    mutableMapAirport.put("DRT","武汉火车站")
    mutableMapAirport["ERT"] = "义乌机场"
    println(mutableMapAirport)

    //更新元素
    mutableMapAirport["PVG"] = "浙江杭州飞机场"
    mutableMapAirport.put("LAX","北海机场")
    println(mutableMapAirport)

    //添加其他Map集合
//    mutableMapAirport.putAll(airportFuture)
    mutableMapAirport += airportFuture
    println(mutableMapAirport)

    //移除键值对
    mutableMapAirport.remove("LAX")
    println(mutableMapAirport)

    //清空Map集合
    mutableMapAirport.clear()
    println(mutableMapAirport)
}