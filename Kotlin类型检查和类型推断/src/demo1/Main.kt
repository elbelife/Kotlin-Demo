package demo1

fun main(args: Array<String>) {

    val student = Student("张三",28,88.5)
    val worker = Worker("李四",30,800)
    printInformation(student)
    printInformation(worker)
    needMoney(student)
    needMoney(worker)

    val w:Person = Worker("大禹",30,350000)
    val n_w:Worker = w as Worker
    n_w.printWorkerInformation()

    val edgWorker:Worker? = Worker("EDG",15,800000)
    val n_edgWorker:Worker = edgWorker as Worker
    n_edgWorker.printWorkerInformation()

//    val rngWorker:Worker? = null
//    val n_rngWorker:Worker = rngWorker as Worker
//    n_rngWorker.printWorkerInformation()

    val igWorker:Worker? = Worker("IG",20,30000)
    val ig:String? = igWorker as? String?
    println(ig == null)


//    val human =Human(student)
//    needMoney(human.person)

}

fun needMoney(person: Person){
    if(person !is Worker || person.salary < 1000){
        println("${person.name} need money")
    }
}

fun printInformation(person:Person){
    when (person) {
        is Student -> {
            person.printStudentInformation()
        }
        is Worker -> {
           person.printWorkerInformation()
        }
        is Person -> {
            person.printPersonInformation()
        }
    }

}
