package demo1

fun main(args: Array<String>) {
    val two = Two()
    println("${two.age}")
    two.newAddFunction()

    val two1 = object : One(20),Three{

        override var age: Int = 30

        override fun interFunction() {
            println("我是对象表达式里面重写的方法 interFunction Three")
        }

        override fun oneFunction() {
            super.oneFunction()
            println("我是对象表达式里面重写的方法 oneFunction One")
        }

    }

    println("${two1.age}")
    two1.interFunction()
    two1.oneFunction()
}