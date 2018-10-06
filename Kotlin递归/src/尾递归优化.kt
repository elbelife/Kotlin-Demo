fun main(args: Array<String>) {
   println(cumulative(100,0))//累加 5的累加 = 5+4+3+2+1 1的累加 = 1
}

tailrec fun cumulative(num:Int,result:Int):Int{
    println("计算机第${num}次运算,结果为$result")
    return if(num == 1) 1 else cumulative(num-1,result + num)
}