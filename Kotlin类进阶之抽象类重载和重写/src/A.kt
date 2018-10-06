open class A {

    open fun printSign(content:String) = println(content.toLowerCase())

    open fun printSign(content:String,upOrLow:Boolean) = when(upOrLow){
        true -> content.toLowerCase()
        false -> content.toUpperCase()
    }
}