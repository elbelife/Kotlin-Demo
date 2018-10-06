fun main(args: Array<String>) {
    val schoolNews = SchoolNews()
    println(schoolNews.content)
    println(schoolNews.origin)
    println(schoolNews.newslength())

    val a = A()
    val b = B()
    a.printSign("fsaaAfddsfsE")
    b.printSign("ASSertGFFwexcDE")
    println(a.printSign("fsaaAfddsfsE",false))
    println(a.printSign("fsaaAfddsfsE",true))
}