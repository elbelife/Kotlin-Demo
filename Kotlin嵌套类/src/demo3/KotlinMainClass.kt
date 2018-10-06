package demo3

fun main(args: Array<String>) {
    val father = Father(175,85)
    val son = Son(185,80)

    println("父亲的身高是${father.height}cm，父亲的体重是${father.weight}kg，父亲的钱是${father.money}")
    println("儿子的身高是${son.height}cm，儿子的体重是${son.weight}kg，儿子的钱是${son.money}")

    father.eat()
    father.action()
    son.action()
    son.eat()

    val inter = Outer().Inter()
    inter.functionB()
    inter.functionC()

}