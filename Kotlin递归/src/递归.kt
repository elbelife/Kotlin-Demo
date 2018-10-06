import java.math.BigInteger

fun main(args: Array<String>) {
    val num = BigInteger("100")
    //计算5的阶乘 5*4*3*2*1
    println(fact(num))
}

fun fact(num:BigInteger):BigInteger{
    //1的阶乘为1
    return if(num== BigInteger.ONE) BigInteger.ONE else num * fact(num-BigInteger.ONE)
}