fun main(args: Array<String>) {
     var counter = Counter(1)
     counter = counter + 2
    counter += 8
    println("counter == $counter")

    val quickCounter = QuickCounter(5)
    quickCounter *= 10
    println("quickCounter == $quickCounter")
}

class Counter(var a : Int){
    operator fun plus(b : Int) = Counter( a + b)

    override fun toString(): String {
        return "Counter(a=$a)"
    }
}

class QuickCounter(var a : Int){

    operator fun timesAssign(b : Int) {
        a *= b
    }

    override fun toString(): String {
        return "QuickCounter(a=$a)"
    }


}