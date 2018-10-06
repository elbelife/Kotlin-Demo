import demo1.Compution
import demo2.Person

fun main(args: Array<String>) {
  val compution = Compution(6.0, 2.0)

    compution.add()
    compution.divide()
    compution.multiply()
    compution.subtract()

    compution.pow(5)

     compution.printAllComputionResult()

  val person = Person()
  println(person.name)
}