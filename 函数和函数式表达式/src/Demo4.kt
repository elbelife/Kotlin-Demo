/**
 * 命名参数和默认参数
 */
fun main(args: Array<String>) {

    //命名参数
    val book = "基于kotlin的Android"

//    var result = book.regionMatches(thisOffset = 9,other = "深入Android",otherOffset = 2,length = 7,ignoreCase = true)
//    var result = book.regionMatches(thisOffset = 9,other = "深入android",otherOffset = 2,length = 7,ignoreCase = true)
//    var result = book.regionMatches(thisOffset = 9,other = "深入android",otherOffset = 2,length = 7,ignoreCase = false)
    val result = book.regionMatches(thisOffset = 9,other = "深入Android",otherOffset = 2,length = 7,ignoreCase = false)

    println("result == $result")

    println(book.endsWith(suffix = "android",ignoreCase = true))
    println(book.endsWith(ignoreCase = true,suffix = "android"))

    //默认参数
    val user = User("张三",credits = 88.56)
    user.printlnInfo()
    val user1 = User("李四",15,78.0)
    user1.printlnInfo()
}

class User(val name:String = "王五",val age:Int = 18,val credits:Double = 100000.0){

//    val age = age

    fun printlnInfo(){
        println("用户名字为：${name}，用户年龄为：${age}岁，用户的余额为：${credits}元")
    }
}