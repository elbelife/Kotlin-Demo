package demo1

class StringFactory:Factory<String> {
    override fun produce(thing: String) {
        println("this relaly is $thing")
    }
}