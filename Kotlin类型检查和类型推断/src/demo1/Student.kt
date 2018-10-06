package demo1

class Student( name:String,age:Int,score:Double):Person(name,age) {

    val score:Double = score

    fun printStudentInformation(){
        println("Student".toUpperCase())
    }
}