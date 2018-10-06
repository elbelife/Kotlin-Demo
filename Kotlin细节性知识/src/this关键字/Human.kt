package this关键字

class Human(name:String,age:Int) {

    val name:String = name
    val age:Int = age

    fun printInformation() = println("name:${this.name},age:${this.age}")

    inner class Student(id:String) {
        val studentId: String = id
        val studentInformation: String
            get() = "id:${this.studentId},name:$name,age:$age"
    }
}