package demo1

fun main(args: Array<String>) {
    operate(Fruit.Apple())
    operate(Fruit.Banana())
    operate(Fruit.WaterMelon())
}

fun operate(fruit: Fruit) = when(fruit){
    is Fruit.Apple -> fruit.operator()
    is Fruit.Banana -> fruit.operate()
    is Fruit.WaterMelon -> fruit.operate()
}