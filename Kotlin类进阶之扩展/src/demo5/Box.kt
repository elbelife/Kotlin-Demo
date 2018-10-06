package demo5

open class Box {

    fun Fruit.printAll() = println("I am all fruits")

    fun Apple.printAll() = print("I am apples")

    fun printInformation(f:Fruit){
        f.printAll()
    }
}