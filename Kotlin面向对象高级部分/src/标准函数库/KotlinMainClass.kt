package 标准函数库

fun main(args: Array<String>) {
    //apply函数
    val runnable = Runnable { println("线程运行中...") }
    Thread(runnable).apply {
        isDaemon = false
    }.start()
    //let函数
//   println(let())
    "HelloWorld".let {
        println(it)
    }
    //with函数
//    with(ArrayList<String>()){
//        add("AAA")
//        add("BBB")
//        add("CCC")
//        println(this)
//    }
    println(with())
    //run函数
//    ArrayList<String>().run {
//        add("WE")
//        add("EDG")
//        add("RNG")
//        add("IG")
//        println(this)
//    }
    println(run())
    //repeat函数
    repeat(10){
        println("S8")
    }
    //断言
    assert(-10)
}

fun let():Int{
    "HelloWorld".let {
        println(it)
        return 666
    }
}

fun with():ArrayList<String>{
    with(ArrayList<String>()){
        add("AAA")
        add("BBB")
        add("CCC")
        return this
    }
}

fun run():ArrayList<String>{
    ArrayList<String>().run {
        add("WE")
        add("EDG")
        add("RNG")
        add("IG")
        return this
    }
}

fun assert(x:Int){
    check(x > 0) {"数字必须大于0"}
    println(x)
}