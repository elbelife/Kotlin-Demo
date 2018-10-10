package demo1

import java.io.File
import java.net.URL

fun main(args: Array<String>) {
    //返回百度首页源代码
    val baiDu = URL("https://www.baidu.com")
    println(baiDu.readText())
    //获取必应首页图片并保存
    //获取XML格式图片信息
    val biYing = URL("http://www.bing.com/HPImageArchive.aspx?format=xml&idx=0&n=1&mkt=en-US")
    val biYingText = biYing.readText()
    println(biYingText)
    //获取url地址和文件名
    val regex = Regex("""<url>(.*)</url>""")
    val result = regex.find(biYingText)
    result!!.groupValues.forEach {
        println("### ==$it")
    }
    val imageUrl = "http://www.bing.com" + result.groupValues[1]
    println(imageUrl)
    val fileName = imageUrl.substring(imageUrl.lastIndexOf("/"))
    val outputFile = File(System.getProperty("user.dir") + "\\out",fileName)
    val requestUrl = URL(imageUrl)
    outputFile.writeBytes(requestUrl.readBytes())
}