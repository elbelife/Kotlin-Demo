package 结构相等和引用相等

fun main(args: Array<String>) {
    val person1 = Person("张三",21)
    val person2 = Person("张三",21)

    val person3 = person1
    person3.name = "李四"

    println(person1.name)

    println(person1 == person2)
    println(person1 === person2)
    println(person1 === person3)

    println("============分割线一=============")

    val str1:String = "ASD"
    val str2:String = "ASD"
    val str3:String = String("ASD".toCharArray())

    println(str1 == str2)
    println(str1.equals(str2))
    println(str1 === str2)

    println(str3)
    println(str1 === str3)

    println("============分割线二=============")

    val int1:Int = 5
    val int2:Int = 5

    println(int1 == int2)
    println(int1 === int2)

}