package demo2
fun main(args: Array<String>) {
  val box1 = Box(100,"正方形")
  val box2 = Box(100,"正方形")
  val box3 = Box(91,"三角形")
  val box4 = box3

  println("box1 == box2:${box1.equals(box2)}")
  println("box1 == box3:${box1.equals(box3)}")
  println("box1 == box4:${box1.equals(box3)}")
  println("box3 == box4:${box3.equals(box4)}")
}