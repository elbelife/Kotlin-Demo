package demo4

class Fruit(name:List<String>) {
    val name:List<String> = name

    fun printInformation() = println(name.forEach { println(it) })

    fun printNoFruit() = println("There is No Fruit")
}