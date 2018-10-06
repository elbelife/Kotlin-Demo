open class Friend1 {

    open val name:String
    open val age:Int

    constructor(name:String,age:Int){
        this.name = name
        this.age = age
        println("我是构造方法")
    }

    init {
        println("我是init代码块")
    }


}