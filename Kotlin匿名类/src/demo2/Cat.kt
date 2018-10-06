package demo2

object Cat:Animal("name",25) {

    var myName = "对象声明"

    fun myFunction(){
        println("对象声明可以写方法")
    }

    override fun bark() {
        println("猫的叫声喵喵喵")
    }
}