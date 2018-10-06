package 异常处理

val number:Int? = try {
    "123".toInt()
}catch (e:Exception){
    0
}finally {
    println("初始化number")
}

val a:Int? = null

val name = "ASD"

fun main(args: Array<String>) {
    transformStringToInt("abc")
    transformStringToInt("123")

    println(number)

    println(a is Int?)

    customException()
}

fun transformStringToInt(string: String):Int{
    return try {
        val int = string.toInt()
        println("正在转换...")
        int
    } catch (e: Exception) {
        println("出现异常...")
        0
    }finally {
        println("必须执行的代码块")
    }
}

fun customException(){
    try {
        if(name != "DER"){
            throw ErrorException("内容不相等")
        }
    } catch (e: Exception) {
        if(e is ErrorException){
            println(e.message)
        }
    }
}