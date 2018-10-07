package 反射

class Product(name:String){

    val name:String = name

    val name_length:Int
    get() = name.length

    fun printProductInformation(){
        println("产品名称==$name")
    }
}