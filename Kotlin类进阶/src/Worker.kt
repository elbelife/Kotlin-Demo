class Worker:Person {

    var nameWorkerPlace:String = " "
    var salary:Int = 0

    constructor(name:String,age:Int,height:Int,likeFood:String,costByMonth:Int,nameWorkerPlace:String,salary:Int):super(name,age,height,likeFood,costByMonth){
        this.salary = salary
        this.nameWorkerPlace = nameWorkerPlace
    }

    override fun printInformation() = println("name:${name}，age:${age}，height:${height}，likeFood:${likeFood}，costByMonth:${costByMonth}，salary:${salary}，nameWorkerPlace:$nameWorkerPlace")
}