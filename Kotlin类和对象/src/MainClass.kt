fun main(args: Array<String>) {
//    val friend1 = Friend1("小明",25)
    val friend2 = Friend2("张三",65)


    val firstFriend3 = Friend3("JackLove",23)
    val secondFriend3 = Friend3("Rookie",35,firstFriend3)

//    val friend4 = Friend4()

//    println("friend1.name == ${friend1.name},friend1.age == ${friend1.age}")
    println("friend2.name == ${friend2.name},friend2.age == ${friend2.age}")
    println("secondFriend3.name == ${secondFriend3.name},secondFriend3.age == ${secondFriend3.age},secondFriend3.parent == ${secondFriend3.parent}")
//    println("friend4.name == ${friend4.name},friend4.age == ${friend4.age}")

}