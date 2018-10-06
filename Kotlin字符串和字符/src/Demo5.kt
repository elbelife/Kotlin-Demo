fun main(args: Array<String>) {
    val me:Char = '我'
    val five:Char = '5'
    val str:String = "你好"

    //判断字符是否为汉字
    println(me.isLetter())
    //判断字符是否为数字
    println(five.isDigit())
    //字符的上一个字符
    println(five - 1)
    //字符的下一个字符
    println(me + 1)
    //输出字符在Unicode中的编号
    println(me.toInt())
    println(five.toInt())
    //输出指定的两个字符之间包含哪些字符
    println(me.until('你'))
    //将字符串和字符连接起来
    println(str + me + "是" + '王')
    //最后一个字符的下标
    println(str.lastIndex)
}