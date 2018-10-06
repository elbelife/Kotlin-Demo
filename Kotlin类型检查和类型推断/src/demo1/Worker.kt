package demo1

class Worker(name:String,age:Int,salary:Int):Person(name,age) {

    val salary:Int = salary

    fun printWorkerInformation(){
        println("Worker".toUpperCase())
    }
}