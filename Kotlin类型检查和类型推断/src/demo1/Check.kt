package demo1

class Check(val person: Person) {
//    var student = Student("张三",28,88.5)
//    var worker = Worker("李四",30,800)

    fun needMoney(){
        if(person !is Worker || person.salary < 1000){
            println("${person.name} need money")
        }
    }
}

fun main(args: Array<String>) {
//    val check = Check()
//    check.needMoney(check.student)
}