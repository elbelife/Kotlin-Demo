class Student:Person {

    var teacherNumbers:Int = 0

    var schoolName:String = " "

    constructor(name:String,age:Int,height:Int,likeFood:String,costByMonth:Int,teacherNumbers:Int,schoolName:String):super(name,age,height,likeFood,costByMonth){
        this.teacherNumbers = teacherNumbers
        this.schoolName = schoolName
    }

    override fun printInformation() = println("name:${name}，age:${age}，height:${height}，likeFood:${likeFood}，costByMonth:${costByMonth}，teacherNumbers:${teacherNumbers}，schoolName:$schoolName")
}