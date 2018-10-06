class Friend3(name:String,age:Int) {

    val name:String = name

    val age:Int = age

    var parent:Friend3? = null

    constructor(name:String,age:Int,child:Friend3):this(name, age){
        child.parent = this@Friend3
    }

    init {
        println("构造方法执行了")
    }
}