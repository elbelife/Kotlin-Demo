fun main(args: Array<String>) {
    val number = arrayOf(1,-85,65,23,-102,999)
    val numSort = arrayOf(-99,2,56,-100,85,963,15,-20,30,89,-74)
    val station = arrayOf("北京站","襄阳站","南京站","上海站","桃浦新村")
    val nollstation = arrayOf("嘉定北","徐家汇","南翔","桃浦新村","徐家汇","上海西站","罗山路","迪士尼","嘉定新城","桃浦新村","南翔")

    //plus方法
    val numberPlusNumSort = number.plus(numSort)
    val numberPlusNumSortOther = numSort.plus(number)
    println(numberPlusNumSort.joinToString ())
    println(numberPlusNumSortOther.joinToString ())
    val  oldStationPlusNewStation = station.plus(nollstation)
    val  oldStationPlusNewStationOther = nollstation.plus(station)
    println(oldStationPlusNewStation.joinToString())
    println(oldStationPlusNewStationOther.joinToString())
    //+操作符
    println((station + nollstation).joinToString())
    println((numSort + number).joinToString())
    //zip方法配对
    println(numberPlusNumSort.zip(oldStationPlusNewStation))
    println(oldStationPlusNewStation.zip(numberPlusNumSort))
    //加强版zip配对
    println(numberPlusNumSort.zip(oldStationPlusNewStation){x,y -> "$x---$y"})
    println(numSort.zip(number){x,y -> "$x---$y"})
}