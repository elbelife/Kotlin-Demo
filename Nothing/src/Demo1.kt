fun main(args: Array<String>) {
    val person = Person()
    val s = person.name ?: failed()
    println(s)

    val x = null //相当于val x:Nothing? = null
    val list = listOf(null)//相当于val list:List<Nothing?> = listOf(null)
    val listString:List<Person?> = list
}

fun failed(): Nothing? {
    throw RuntimeException("运行失败")
}

fun noEnd(): Nothing? {
    while (true) {
        println("你好")
    }
}