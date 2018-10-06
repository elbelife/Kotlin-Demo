fun main(args: Array<String>) {
    while (true) {
        println("请输入第一个数字:")
        var firstStr = readLine()

        println("请输入第二个数字:")
        var secondStr = readLine()
        try {
            var firstNum = firstStr!!.toInt()
            var secondNum = secondStr!!.toInt()
            println("$firstNum+$secondNum = ${firstNum + secondNum}")
        } catch (e: Exception) {
            println("请输入数字")
        }
    }
}