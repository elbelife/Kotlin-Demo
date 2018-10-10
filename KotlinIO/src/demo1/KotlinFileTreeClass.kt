package demo1

import java.io.File

fun main(args: Array<String>) {
    val file = File("""D:\Program Files""")
    val fileTreeWalk = file.walk()
    fileTreeWalk.maxDepth(1)
            .filter { it.isFile }
            .forEach (::println)
}