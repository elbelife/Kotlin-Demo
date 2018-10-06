/**
 * 顶层函数
 */
fun main(args: Array<String>) {
      println(lowestSalary(3000 ))
}

fun lowestSalary(salary:Int){
    require(salary > 4000,{"最低工资不能少于4000元"})
}