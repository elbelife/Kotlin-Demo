fun main(args: Array<String>) {
    val tom = Student("Tom",23)
    val jerry = Student("Jerry",21)
    val smith = Student("Smith",25)
    val jhon = Student("Jhon",50)

    println(tom > jerry)
    println(tom > smith)
    println(tom > jhon)
    println(jerry > jhon)
    println(jerry > smith)
}

class Student(val name:String,val age:Int) {

    operator fun compareTo(otherStudent:Student):Int{
        return when{
            this@Student.age > otherStudent.age -> 1
            this@Student.age < otherStudent.age -> -1
            else -> 0
        }
    }
}