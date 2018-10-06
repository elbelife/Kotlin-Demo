package demo1

class Human(person: Person) {

     internal val person = person
//    get() = Student("XX",20,85.3)

    fun  say(){
        if(person !is Worker || person.salary < 1000){
            println("${person.name} need money")
        }
    }
}