fun main(args: Array<String>) {
    val student = Student("小明",20,180,"beef",500,30,"桂林电子科技大学北海校区")
//    student.name = "小明"
//    student.age = 20
//    student.height = 180
//    student.likeFood = "beef"
//    student.costByMonth = 500
//    student.schoolName = "桂林电子科技大学北海校区"
//    student.teacherNumbers = 30


    val worker = Worker("王部长",53,155,"any",15000000,"义乌警察局",10000000)
//    worker.name = "王部长"
//    worker.age = 53
//    worker.height = 155
//    worker.likeFood = "any"
//    worker.costByMonth = 15000000
//    worker.nameWorkerPlace = "义乌警察局"
//    worker.salary = 10000000

    student.printInformation()
    worker.printInformation()
}