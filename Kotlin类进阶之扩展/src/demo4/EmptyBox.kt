package demo4

class EmptyBox(size:Int):Box(size) {

    override fun Fruit.printAll() {
        this.printNoFruit()
    }
}