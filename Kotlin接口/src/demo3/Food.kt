package demo3

class Food:Apple,Banana {
    override fun give() {
        super<Apple>.give()
        super<Banana>.give()
    }

    override fun printSelf() = println("Apple Banana")
}