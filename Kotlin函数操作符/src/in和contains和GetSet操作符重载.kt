fun main(args: Array<String>) {
    val numbers = arrayOf(4,5,6,7,8)

    val result = 6 in numbers
    val result1 = numbers.contains(6)

    val result2 = 7 !in numbers
    val result3 = !numbers.contains(7)
    println("result == $result")
    println("result == $result1")
    println("result == $result2")
    println("result == $result3")

    println("numbers.get(1) == ${numbers[1]}")

    val matrix = Matrix(1,2,3,4)
    val matrixOther = Matrix(1,2,3,4)
    val matrixThird = matrix + matrixOther

    println("matrix.toString == $matrix")
    println("matrixOther.toString == $matrixOther")
    println("matrixThird.toString == $matrixThird")

    println("matrixThird[0,0] == ${matrixThird[0,0]}")
    matrixThird[0,0] = 5
    println("matrixThird[0,0] == ${matrixThird[0,0]}")
}