fun main(args: Array<String>) {
    var man = Man()
    man.JJ()

    var woman = Woman()
    woman.eat()

    println(man is Man)
    println(man is Human)
    println(man is IMan)
    println(woman is Woman)
}