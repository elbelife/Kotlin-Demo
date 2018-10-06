package demo3

fun main(args: Array<String>) {
//    Kid.Companion.handAction()
//    Kid.Hand.handAction()

//    Kid.handAction()
//    println(Kid.size)

    Kid.sayHello()

    val kid = Kid("小明",30)

    kid.kidAction()

    Kid.Hand.flyable()

    println(Kid.hasHands)
}