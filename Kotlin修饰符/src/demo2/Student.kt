package demo2

class Student(name:String,age:Int,height:Double,weight:Double):Person(name, age, height, weight) {

    fun access(){
        println(name)
        printZero()
    }
}