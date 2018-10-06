const val STRWARNING:String = "isAdult Change"

class Person(age:Int) {

    var age:Int = age
    set(value) {
        field = value
        if(age > 18){
            isAdult = true
            println(STRWARNING)
        }
    }

    var isAdult:Boolean = false
    private set
//    get() = age >= 18

    var addAge:Int = 0
//    get() = 0
    set(value){
        age += value
//        if(age > 18){
//            isAdult = true
//        }
    }

}