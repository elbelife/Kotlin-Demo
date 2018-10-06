package demo2

class Person: PersonInterface {
    override var name: String
        get() = "XXX"
        set(value) {}
    override var age: Int
        get() = 0
        set(value) {}
    override var height: Double
        get() = 0.0
        set(value) {}
    override var width: Double
        get() = 0.0
        set(value) {}
}