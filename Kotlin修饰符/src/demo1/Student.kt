package demo1

import demo1.Person

open class Student: Person() {

    override var name: String = "xxx"

    override var age: Int = 18

    override fun printInformation() {
        println("name:$name,age:$age")
    }


}