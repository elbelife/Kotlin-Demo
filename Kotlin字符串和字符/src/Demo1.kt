fun main(args: Array<String>) {
    val str = "谷歌发布TensorFlow Lite，苹果不甘示弱祭出Core ML"

    println(str.length)
    println(str.isEmpty())
    println(str.count())
    //获取指定位置的字符
    println(str.get(1))
    println(str[1])
    println(str.elementAt(1))
    //获取头字符
    println(str.first())
    //获取尾子符
    println(str.last())
    //截取某一段字符串
    println(str.substring(20))
    println(str.substring(20,22))
    //indexOf(str:String)
    println(str.substring(str.indexOf("苹")))
    println(str.substring(str.indexOf("苹"),22))
    //展示字符串索引区间
    println(str.indices)
    //最后一个字符的下标
    println(str.lastIndex)
    //是否包含某个字符或字符串
    println(str.contains("咕咕"))
    println(str.contains("谷歌"))

    val a = "aaa"
    val b = "bbb"
    val c = "AAA"
    val d = String("aaa".toCharArray())
    println(a == b)
    println(a.contentEquals(b))
    println(c.equals(a,true))
    println(d.equals(a))
    println(d.equals(c,true))
}