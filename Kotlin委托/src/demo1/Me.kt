package demo1

class Me(name:String):ShangJi {

    var name:String = name


    override fun getTask() {
       println("上级将任务分配给${this.name}，他要委托给别人")
    }


}