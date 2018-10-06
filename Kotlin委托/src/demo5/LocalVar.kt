package demo5

import kotlin.properties.Delegates

val bianLiangA :String by lazy {
    println("表达式")
    "变量A"
}

var bianLiangB:String by Delegates.observable("变量B"){
    property, oldValue, newValue ->  println("变量名称为${property.name}，oldValue == ${oldValue}，newValue == $newValue}")
}

var bianLiangC:String by Delegates.notNull<String>()

fun main(args: Array<String>) {
    println(bianLiangA)
    bianLiangB = "新的变量B"
    bianLiangC = "变量C"
    println(bianLiangC)
}