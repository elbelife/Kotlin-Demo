fun main(args: Array<String>) {
    val task = Runnable { println("线程正在运行") }
    Thread(task).apply { isDaemon = true }.start()

    //let
    myLet()
    println(myLet1())
    //with
    var str = "Hello World"
    str = str.toUpperCase()
    str.count()
    str.contains("H")
    println("str==$str")

    var string = "Hello World"
    with(string){
        string = toUpperCase()
        count()
        contains("H")
    }
    println("string==$string")
    //with和let
    val list = ArrayList<String>()
    println(with(list){
        add("你好")
        add("我好")
        add("大家好")
//        toString()
//        println("this == " + this)
    }.let {
        println("it == $it")
        return@let
    })
}

fun myLet() : Unit{
    "myLet".let {
        println(it)
        return@let
    }
}

fun myLet1() : Int{
    "myLet".let {
        println(it)
        return 999
    }
}