class Woman(name:String):Human(name) {

    override fun eat(){
        println("我是女人，我叫$name")
    }

    override fun sleep() {
        println("我是女人，我睡的时间短")
    }
}