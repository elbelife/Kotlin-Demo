import java.io.File

fun main(args: Array<String>) {
    val str1 = "你好"
    val str2 = "你好"

    println(str1 === str2)
    println(str1 == str2)

    val file1 = File("/user/doc/a.txt")
    val file2 = File("/user/doc/a.txt")
    println(file1 === file2)
    println(file1 == file2)
}