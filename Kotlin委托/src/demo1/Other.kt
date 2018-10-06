package demo1

class Other(shangJi:ShangJi):ShangJi by shangJi {

    override fun getTask() {
        println("我是被委托人，接受了别人委托的任务")
    }
}