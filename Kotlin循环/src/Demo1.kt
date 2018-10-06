fun main(args: Array<String>) {
    //while循环
    var i = 0
    while (i <= 5){
        println("第${i}句我是你爸爸")
        i++
    }
    //for循环
//    val list = listOf(1,2,3,5)
//    for(x in list){
//        print("$x ")
//    }

    val set = setOf(1,3,5,7)
//    for(x in set){
//        print("$x ")
//    }
    for(x in set.indices){
        print("$x ")
    }

    val array = arrayOf(1,4,7,9)
//    for (x in array){
//        print("$x ")
//    }
    for(x in array.indices){
        print("$x ")
    }
//    val str:String = "我是好人"
//    for(x in str){
//        print("$x ")
//    }
}