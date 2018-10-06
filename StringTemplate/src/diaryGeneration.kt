fun main(args: Array<String>) {
   println(diaryGeneration("北京"))
}

fun diaryGeneration(placeName:String):String{
    var template:String = """今天我们去${placeName}游玩，他的名字有${placeName.length}个大字"""
    return template
}