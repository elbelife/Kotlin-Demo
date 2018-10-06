fun main(args: Array<String>) {


    val numComp = NumberCompution(55,23) { x, y -> x + y}
    numComp.operation()
    numComp.operator = {x,y -> x * y}
    numComp.operation()

    val person = Person(15)
    person.age = 19
    println(person.isAdult)
    person.addAge = 18
    println(person.isAdult)
    println(person.addAge)
    println(person.age)

    val person1 = Person(26)
    println(person1.isAdult)
    person1.age = 20
    println(person1.isAdult)
    person1.addAge = 10
    println(person1.isAdult)
}