fun main(args: Array<String>) {
    var son = Son()
    println("儿子的性格${son.character}")
    son.saySoundly()

    var man = Man("金正恩")
    man.eat()

    var woman = Woman("李雪梅")
    woman.eat()

    var humanList = listOf<Human>(man,woman)

    for (l in humanList){
        l.sleep()
    }
}