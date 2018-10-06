package demo2

open class Animal(name: String,age:Int) {

    var age:Int = age

    open var name:String = name

    open fun bark(){
        println("动物的叫声")
    }
}