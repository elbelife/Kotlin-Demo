fun main(args: Array<String>) {
    //run
    ArrayList<String>().run {
        add("测试一")
        add("测试二")
        add("测试三")
        println(this.joinToString())
    }
    //repeat
    repeat(8 ,{println("kotlin牛逼")})
    //require
     requireFun(9)
}

fun requireFun(x:Int){
    require(x > 8,{ println("x必须大于8")})
    println(x)
}