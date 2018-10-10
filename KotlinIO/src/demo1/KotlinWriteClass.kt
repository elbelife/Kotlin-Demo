package demo1

import java.io.File

fun main(args: Array<String>) {
    System.setProperty("w","""E:\kotlinproject\KotlinIO""")
//    val currentDir = System.getProperty("user.dir") + "\\out"
    val currentDir = System.getProperty("w") + "\\out"
    println(currentDir)
    val file = File(currentDir,"bbb.txt")
    file.writeText("第0～32号及第127号(共34个)是控制字符或通讯专用字符，如控制符：LF（换行）、CR（回车）、FF（换页）、DEL（删除）、BEL（振铃）等；通讯专用字符：SOH（文头）、EOT（文尾）、ACK（确认）等；\n" +
            "\n" + "第33～126号(共94个)是字符，其中第48～57号为0～9十个阿拉伯数字；65～90号为26个大写英文字母，97～122号为26个小写英文字母，其余为一些标点符号、运算符号等。\n" + "后128个(128—255)称为扩展ASCII码，目前许多基于x86的系统都支持使用扩展（或“高”）ASCII。")
    println(file.readText())

    file.writeBytes(byteArrayOf(12,56,83,57))
    println(file.readBytes().joinToString(separator = "&&"))

    //追加方式写入字节或字符
    file.appendBytes(byteArrayOf(93,85,74,93))
    file.appendText("闭上你的臭嘴，基佬\n")
    println(file.readText())

    //直接使用writer和outputstream
    val writer = file.writer()
}