package demo3

class Son(height:Int,weight:Int):Father(height, weight) {

    override var money: Int = 100

    override fun eat() {
        println("I like eat meet")
    }

}