package this关键字

fun main(args: Array<String>) {
    val human = Human("王小明",21)
    val student = human.Student("30")

    println(student.studentInformation)

//    val man = Man("男人",40)
//    val woman = man.Woman("20","女人",17)
//    println(woman.studentInformation)

//    val man1:Man = Man("男人中的男人",30)
//    val man = Man("男人",40)
//    val woman = man.Woman("20","女人",17,man1)
//
//    println(woman.studentInformation)
//   woman.letManSayHello()

//    val man = Man("男人",40)
//    val woman = man.Woman("1020","女人")
//    println(woman.nameAddingStr("我爱"))

    val man1:Man = Man("男人中的男人",30)
    val man = Man("男人",40)
    val woman = man.Woman("20","女人",man1)
    woman.letManSayHello("美女")
}