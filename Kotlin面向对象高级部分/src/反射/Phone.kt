package 反射

class Phone(name:String) {

    val name:String = name

    fun sendMessage(msg:String,phoneNum:String){
        println("${name}收到一条来自${phoneNum}的短信，短信内容为:$msg")
    }
}