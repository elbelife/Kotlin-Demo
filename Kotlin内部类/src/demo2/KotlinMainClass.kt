package demo2
fun main(args: Array<String>) {
    operate(Cat())
    operate(Dog())
    operate(Pig())
}

fun operate(animal:Animal) = when(animal){
    is Cat -> animal.operate()
    is Dog -> animal.operate()
    is Pig -> animal.operate()
}