package demo3
fun main(args: Array<String>) {
    val person = Person()
    person.printInformation()
    person.printInformation(5)

    val animalNull:Animal? = null
    animalNull?.printInformation()

    val animalNotNoll:Animal? = Animal()
    animalNotNoll.printInformation()
}

fun Person.printInformation() = println("age:${this.age}")
fun Person.printInformation(count:Int){
    for(i in 1..count){
        println("age:${this.age}")
    }
}
fun Animal?.printInformation(){
    if(this == null ){
        println("sorry,this is null")
    }else{
        println("animal name:${this.name}")
    }
}