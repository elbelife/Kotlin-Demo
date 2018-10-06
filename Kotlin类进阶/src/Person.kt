open class Person{

    constructor(name:String,age:Int,height:Int,likeFood:String,costByMonth:Int){
         this.name = name
         this.age = age
         this.height = height
         this.likeFood = likeFood
         this.costByMonth = costByMonth
    }

    var name:String = " "
    var age:Int = 0
    var height:Int = 0
    var likeFood:String = " "
    var costByMonth:Int = 0

    open fun printInformation() = println("name:${name}，age:${age}，height:${height}，likeFood:${likeFood}，costByMonth:$costByMonth")
}