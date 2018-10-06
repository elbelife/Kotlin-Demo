fun main(args: Array<String>) {
    var list = listOf("鸡蛋","苹果","Iphone X","辣条")
//    for (element in list){
//        println(element)
//    }

    for ((index,element) in list.withIndex()){
        println("$index  $element")
    }
}