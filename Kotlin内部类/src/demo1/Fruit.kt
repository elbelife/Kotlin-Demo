package demo1

sealed class Fruit {

    class Apple: Fruit(){
        fun operator() = println("苹果")
    }

    class Banana: Fruit(){
        fun operate() = println("香蕉")
    }

    class WaterMelon: Fruit(){
        fun operate() = println("柠檬")
    }

}