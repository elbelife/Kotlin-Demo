class Man(name:String):Human(name) {

    override fun eat(){
       println("我是男人，我叫$name")
    }

    override fun sleep() {
        println("我是男人，我睡得时间长")
    }
}