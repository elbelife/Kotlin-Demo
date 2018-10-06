package demo3


val lazeAttribute:String by lazy(LazyThreadSafetyMode.PUBLICATION) {
    println("表达式1")
    "结果1"
    "结果2"
    "结果3"
}

fun main(args: Array<String>) {
  var i = 1

    while (i < 5){
        println(lazeAttribute)
        i ++
    }

    val watchable = Watchable()
    watchable.value = "第一次修改的值"
    watchable.value = "第二次修改的值"
    watchable.value = "第三次修改的值"

//    val count = Count()
//    var m = 2
//    while (m < 10){
//        count.value = m
//        m ++
//    }
}