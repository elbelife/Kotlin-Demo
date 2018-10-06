fun main(args: Array<String>) {
    var a = 5
    var b = 3

    var isToday = if(a > b)  true else  false

    println(isToday)

    var readSuccess = try {
        readLine()
        true
    } catch (e: Exception) {
        false
    }
}
