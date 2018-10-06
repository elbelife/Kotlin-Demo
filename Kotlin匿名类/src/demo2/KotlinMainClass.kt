package demo2

fun main(args: Array<String>) {
    var unknown = object{
        var name = "未知名称"

        fun function(){
            println("未知函数")
        }
    }

    println(unknown.name)
    unknown.function()

    println("可以通过类名直接访问:${Cat.myName}")
    Cat.myFunction()
    Cat.bark()
}