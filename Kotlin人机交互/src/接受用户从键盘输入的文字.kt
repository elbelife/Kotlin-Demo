fun main(args: Array<String>) {
    println("请输入第一个数字:")
    var firstStr = readLine()

    println("请输入第二个数字:")
    var secondStr = readLine()

    var firstNum = firstStr!!.toInt()
    var secondNum = secondStr!!.toInt()

    println("${firstNum}+${secondNum} = ${firstNum+ secondNum}")
}