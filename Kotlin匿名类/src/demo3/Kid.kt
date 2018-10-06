package demo3

class Kid(name:String,age:Int) {

    var name:String = name

    var age:Int = age

    fun kidAction(){
        println("kids can swim in the amniotic fluid")
    }

    fun sayHello(){
        println("kids can sayHello")
    }

    companion object Hand:Flyable,Human(){

        override var hasHands: Boolean = false

        override fun walk() {
            println("hands can not walk")
        }

        override fun flyable() {
            println("hands can no fly")
        }

        var size:Int = 1

        fun handAction(){
            println("hands can hold things")
        }

        fun sayHello(){
            println("hands can not say hello")
        }
    }

    //伴生对象的名称可以直接不写，以下写法等同于上面的写法
//    companion object{
//        var size:Int = 1
//
//        fun handAction(){
//            println("hands can hold things")
//        }
//    }

}