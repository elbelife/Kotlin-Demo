fun main(args: Array<String>) {
//    for(x in NewClass()){
//        println(x)
//    }
    check(5)
    check1(3)
}

fun check(x:Int){
    when(x){
        1,5,7 -> println("是1,5,7中的一个")
    }
}

fun check1(x:Int){
    val s = 1
    when(x){
        in s.rangeTo(4).step(2) ->{
            println("符合条件")
        }
    }
}