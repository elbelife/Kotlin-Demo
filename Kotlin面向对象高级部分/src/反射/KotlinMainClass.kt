package 反射


var x:Int = 1

fun main(args: Array<String>) {
    val shark = Shark("巨齿鲨",5000000)
    shark.getClass()
    println("=============分割线一==============")
    val sharkClass = shark::class
    println(sharkClass)
    println(sharkClass.isInstance(shark))
    println("=============分割线二==============")
    compute(::addCompute,2,3)
    println("=============分割线三==============")
    val mc = MyCompute<Int>(::compute)
    helloWithStr("NanJing")
    ::helloWithStr.call("BeiJing")
    println("=============分割线四==============")
    val phone = Phone("张三")
    val phone1 = Phone("李四")
    phone::sendMessage.call("早安","1458963220")
    Phone::sendMessage.call(phone1,"做爱吗","17369523002")
    println("=============分割线五==============")
    println(::x.get())
    ::x.set(2)
    println(::x.get())
    println("=============分割线五==============")
    val yaShua = Product("牙刷")
    val biJiBen = Product("笔记本")
    println(yaShua::name_length.get())
    println(Product::name_length.get(biJiBen))
    println("=============分割线六==============")
    printInformationAboutProduct(::Product,"台式电脑")
}

fun <T> compute(compution_function:(T,T)->Unit,a:T,b:T){
    compution_function(a,b)
}

fun addCompute(a:Int,b:Int){
    println("$a + $b = ${a+b}")
}

fun addCompute(a:Int){
    println("$a + 1 = ${a+1}")
}

fun helloWithStr(str:String){
    println("hello,$str")
}

fun printInformationAboutProduct(create:(String) -> Product,name:String){
    val product = create(name)
    product.printProductInformation()
}