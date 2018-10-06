/**
 * 洗衣机面向对象例子
 */
class WashMachine(var module:String,var size:Int) {

    var isDoorOpen = true
    var currentModule = 0

    fun open(){
        println("把洗衣机的门打开")
        isDoorOpen = true
    }

    fun close(){
        println("把洗衣机的门关闭")
        isDoorOpen = false
    }

    fun selectModule(module:Int){
        currentModule = module
        when(module){
            0 -> println("请选择洗衣模式")
            1 -> println("洗内裤模式")
            2 -> println("洗牛仔裤模式")
            else -> println("不要乱按，按坏不保修")
        }
    }

    fun startWash(){
        if (isDoorOpen){
            println("请关闭洗衣机的门")
        }else {
            when(currentModule){
                0 -> {println("您当前没有选择模式")}
                1 -> {
                    println("开启洗内裤模式")
                    println("给洗衣机加水")
                    setMotorSpeed(100)
                    println("洗衣机开始洗衣服")
                    println("洗衣机洗完了")
                    println("给洗衣机放水")
                }

                2 -> {
                    println("开启洗牛仔裤模式")
                    println("给洗衣机加水")
                    setMotorSpeed(1000)
                    println("洗衣机开始洗衣服")
                    println("洗衣机洗完了")
                    println("给洗衣机放水")
                }

                else -> {
                    println("错误的模式")
                }
            }

        }
    }

   private fun setMotorSpeed(speed:Int){
        println("当前电机的转速为${speed}圈每秒")
    }

}