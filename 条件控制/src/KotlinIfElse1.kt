fun checkAge(age:Int):Unit{
//   if(age<18){
//       println("你他妈是未成年人，不能嫖娼")
//   }else{
//       println("大爷，经常来玩啊")
//   }

//    if(age<18)
//        println("你他妈是未成年人，不能嫖娼")
//    else
//        println("大爷，经常来玩啊")

    if(age<18) println("你他妈是未成年人，不能嫖娼") else println("大爷，经常来玩啊")

}

fun main(args: Array<String>) {
    val smallAge = 19
    checkAge(smallAge)

    val bigAge = 17
    checkAge(bigAge)
}