fun main(args: Array<String>) {
    val 人物 = Triple("杰夫贝佐斯","全世界最有钱",1200)
    println("${人物.first}是${人物.second}的人，身价为${人物.third}亿美元")

    val 花费 = Pair(5.30,"很饱")
    println("今天${花费.first}，我吃得${花费.second}")

    val (year,month:Int,day) = Triple("2017",8,"25")
    println(year + "年" + month + "月" + day +"日")

    val (name:String,age:Int) = Pair("刘彪",18)
    println("我叫$name" + "，今年${age}岁")
}