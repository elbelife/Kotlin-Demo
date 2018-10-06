fun main(args: Array<String>) {
    var name1 = "张三"
    var name2 = "张二"
    var name3 = "张三"

    var name4 = "Andy"
    var name5 = "Andy"
    var name6 = "andy"

    println(name1 == name2)
    println(name1 == name3)
    println(name1.equals(name3))

    println(name4 == name5)
    println(name4.equals(name5))

    println(name5 == name6)
    println(name5.equals(name6))

    println(name5.equals(name6,true))//第二个参数代表是否忽略大小写 true:忽略大小写 false:不忽略大小写
    println(name5.equals(name6,false))
}