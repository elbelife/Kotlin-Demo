package 反射

class Shark(name:String,age:Int) {

    var name:String = name

    var age:Int = age

    fun getClass(){
        val shark = Shark :: class
        println(shark)
        println(shark.simpleName)
        println(shark.isAbstract)
        val shark1 = Shark("大白鲨",1000)
        println(shark.isInstance(shark1))
    }
}