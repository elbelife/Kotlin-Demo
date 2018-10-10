package demo1

import java.io.*

fun main(args: Array<String>) {
    val fileName = """F:\tomcat\fff.txt"""
    val file = File(fileName)
//    println(file.readText())

    //大写前15行
    file.readLines().take(15).forEach {
//        println(it.toUpperCase())
    }

    //直接处理行
//    file.forEachLine(action = ::println)

    //读取为byte数组
    val byteArray:ByteArray = file.readBytes()
//    println(byteArray.joinToString(separator = "=="))

    val reader: InputStreamReader = file.reader()
   readFile(reader)

}

fun readFile(reader: InputStreamReader){
    val dir = System.getProperty("user.dir") + "\\out"
    val file = File(dir,"eee.txt")
    val writer:OutputStreamWriter = file.writer()
    var id:Int = -1
    while (reader.read().let { id = it;it!=-1 }) {
        writer.write(id)
    }
    writer.close()
    reader.close()
}