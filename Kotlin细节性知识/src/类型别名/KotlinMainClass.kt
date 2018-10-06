package 类型别名

typealias MyFriend = My_Friend_From_China_And_Very_High_Boy
typealias StrIntType = MyType<String,Int>
typealias IntType<U> = MyType<U,Int>
typealias MyFunction = (Int,Int) -> Int
typealias CustomFunction<E,R> = (E,R) -> Unit
typealias Cat = Animal.A_Very_Cute_And_Heavy_Oledr_Cat_Is_Animal

fun main(args: Array<String>) {
//    val myFriend = My_Friend_From_China_And_Very_High_Boy()
    val myFriend = MyFriend()
    println(myFriend.name)
    println(myFriend.age)

    val strIntType = StrIntType("shen",20)
    println(strIntType.a)
    println(strIntType.b)

    val intType:IntType<Double> = IntType(20.0,30)
    println(intType.a)
    println(intType.b)

    println(operate(add,5,6))

    val cat = Animal().Cat()
    println(cat.ageAnimal)
    println(cat.nameAnimal)


}

val add:(Int,Int) -> Int = {a,b -> a + b}

//fun operate(function:(Int,Int) -> Unit,a:Int,b:Int){
//    function(a,b)
//}

fun operate(function:MyFunction,a:Int,b:Int):Int{
    return function(a,b)
}

fun <E,R> rawOperate(function:CustomFunction<E,R>,a:E,b:R){
    function(a,b)
}