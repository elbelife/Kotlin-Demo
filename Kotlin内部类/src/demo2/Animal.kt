package demo2

sealed class Animal {
}

class Cat:Animal(){
    fun operate() = println("你是猫")
}

class Dog:Animal(){
    fun operate() = println("你是狗")
}

class Pig:Animal(){
    fun operate() = println("你是猪")
}
