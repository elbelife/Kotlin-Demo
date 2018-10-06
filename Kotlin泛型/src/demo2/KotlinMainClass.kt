package demo2

fun main(args: Array<String>) {

}

fun change(f:Factory<String>){
    val factory : Factory<Any>  = f
}

fun change1(f:Factory1<Any>){
    val factory1 : Factory1<String> = f
}