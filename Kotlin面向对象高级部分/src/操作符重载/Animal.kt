package 操作符重载

class Animal(var age:Int):Comparable<Animal> {

    override fun compareTo(other: Animal): Int {
        return when {
            this.age > other.age -> 1
            this.age == other.age -> 0
            else -> -1
        }
    }
}