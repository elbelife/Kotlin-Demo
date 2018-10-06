fun main(args: Array<String>) {
    val title = "这里有个标题:亚马逊的市值已超过google公司，位居全球第二"
    title.toCharArray().forEach { print("$it,") }

    println()
    val name = "张明"
    val sex = true
    println("亲爱的${name}同志，您是${if (sex) "男生" else "女生"}")


}