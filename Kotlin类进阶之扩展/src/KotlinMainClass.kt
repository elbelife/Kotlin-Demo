import demo1.Say
import demo2.A
import demo2.B

fun main(args: Array<String>) {
    val say = Say()
    say.sayHello()
    say.sayHi()
    say.sayGreat()
    say.sayLove()

    val num = 5
    num.sayHello()
    6.sayHello()

    val map = mutableMapOf<String,Int?>()
    map.addNotNull("A",5)
    map.addNotNull("A",null)
    println(map)

    val a:A = B()
    a.printlnSayHello()

    val b = B()
    b.printlnSayHello()

    val ese:A = B()
    ese.println_sayHello()

    val list = mutableListOf(1,2,3)
//    swapIndexFromList(list,0,1)
    list.swapIndexFromList(0,1)
    println(list.joinToString())
}

fun Say.sayGreat() = println("Great")

fun Say.sayLove() = println("Love")

fun Int.sayHello() = println("Hello,I am ${this}")

fun MutableMap<String,Int?>.addNotNull(key:String,value:Int?){
    if(value != null){
        this[key] = value
    }
}

fun A.printlnSayHello() = println("Hello A!")

fun B.printlnSayHello() = println("Hello B!")

fun A.println_sayHello() = println("println_sayHello,A")

//fun swapIndexFromList(list:MutableList<Int>,index1:Int,index2:Int){
//    val temp:Int = list[index1]
//    list[index1] = list[index2]
//    list[index2] = temp
//}

fun MutableList<Int>.swapIndexFromList(index1:Int,index2:Int){
    val temp:Int = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
}
