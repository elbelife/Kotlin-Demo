package demo4

open class Box(size:Int) {

    val size:Int = size



    //情况1
//    fun haveFruits(f:Fruit){
//        println("I am a box,size is $size")
//        println("I have Fruits")
//        f.printAll()
//    }

//    fun Fruit.printAll(){
//        this.printInformation()
//    }

    //情况2
//        fun haveFruits(f:Fruit){
//        printInformation()
//        f.printAll()
//    }
//
//    fun printInformation(){
//        println("I am a box,size is $size")
//        println("I have Fruits")
//    }
//
//    fun Fruit.printAll(){
//        this@Box.printInformation()
//    }

    //情况3
    open fun Fruit.printAll(){
        this.printInformation()
    }

        fun haveFruits(f:Fruit){
        println("I am a box,size is $size")
        println("I have Fruits")
        f.printAll()
    }
}