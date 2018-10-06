fun main(args: Array<String>) {
    val printHello = {println("Hello World")}
//    println("printHello == $printHello")
    printHello()

    val printlnMsg = {msg : String -> println(msg)}
    printlnMsg("你好")
}