fun main(args: Array<String>) {
    score(6)
    score(5)
    diaryGeneration("北爱尔兰联合王国")
    diaryGeneration("法国")
}

fun score(score:Int){
    when(score) {
        10->println("牛逼")
        9->println("可以")
        8->println("还行")
        else->println("菜逼")
    }
}

fun diaryGeneration(place:String){
  var diary = """我们去${place}游玩，他的名字有${numberToChinese(place.length)}个字"""
    println(diary)
}

fun numberToChinese(number:Int):String{
    var chinese = when(number){
//        1 -> return "一"
//        2 -> return "二"
//        3 -> return "三"
//        4 -> return "四"
//        5 -> return "五"
//        else -> return "十"
        1 ->  "一"
        2 ->  "二"
        3 ->  "三"
        4 ->  "四"
        5 ->  "五"
        else ->  "十"
    }

    return chinese
}