package demo3
fun main(args: Array<String>) {
  val  list = listOf(1,4,5,2,3)
  println(filterValues(list,4))
}

fun <T:Comparable<T>> filterValues(list:List<T>,up:T):List<T>{
    return list.filter { it <= up }
}