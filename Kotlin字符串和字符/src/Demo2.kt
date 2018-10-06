fun main(args: Array<String>) {
    val title = "  这里有个标题:亚马逊的市值已超过google公司，位居全球第二  "
    //舍弃前9个字符
    println(title.drop(9))
    //舍弃后7个字符
    println(title.dropLast(9))
    //舍弃前面的空格和尾部的空格以及“全球”字符串
    println(title.dropWhile { it.isWhitespace() }.dropLastWhile { it == '第' || it.isWhitespace() || it == '二' })
    //取前9个字符
    println(title.take(9))
    //取后8个字符
    println(title.takeLast(8))
    //替换功能
    println(title.replace("google","谷歌"))
    //取字符串内容包含空格和“这里”的子字符串（从前面取）
    println(title.takeWhile { it.isWhitespace() || it == '这' || it == '里'})
    //去字符串内容包含空格和“第二”的子字符串（从后面取）
    println(title.takeLastWhile { it.isWhitespace() || it == '第' || it == '二' })

}