package demo4
fun main(args: Array<String>) {
   val person = Person()
    println(person.name)
    println(person.age)

    val fruit = Fruit(listOf("Apple","Banana","Pear","Watermelon"))
    val box = Box(15)
    val emptyBox = EmptyBox(15)
    box.haveFruits(fruit)
    emptyBox.haveFruits(fruit)


}

var Person.name:String
get() = this._name
set(value) { this._name = value }

var Person.age:Int
get() = this._age
set(value){ this._age = value }