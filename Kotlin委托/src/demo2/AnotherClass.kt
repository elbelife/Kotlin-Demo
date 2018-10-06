package demo2

import kotlin.reflect.KProperty

class AnotherClass {

    operator fun getValue(duiXiang:Any?,myShuXing:KProperty<*>):String{
        return "${duiXiang}委托了${myShuXing.name}属性给${this@AnotherClass}}"
    }

    operator fun setValue(duiXiang: Any?,myShuXing: KProperty<*>,value:String){
        println("${duiXiang}的${myShuXing.name}属性被我赋值为$value")
    }

}