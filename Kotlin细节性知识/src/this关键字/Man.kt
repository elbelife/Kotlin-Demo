package this关键字

class Man(name: String, age: Int) {

    val name: String = name
    val age: Int = age

    fun printInformation() = println("name:${this.name}，age:${this.age}")

//    inner class Woman(id:String,name:String,age:Int){
//        val id:String = id
//        val name:String = name
//        val age:Int = age
//        val studentInformation:String
//        get() = "id:${this.id},name:${this@Man.name},age:${this@Man.age}"
//    }

//    inner class Woman(id:String,name:String,age:Int,man: Man){
//        val man:Man = man
//        val id:String = id
//        val name:String = name
//        val age:Int = age
//        val studentInformation:String
//            get() = "id:${this.id},name:${this@Man.name},age:${this@Man.age}"
//
//        fun Man.sayHello() = println(this@Woman.name)
//
//        fun letManSayHello(){
//             man.sayHello()
//        }
//    }

    //    inner class Woman(id:String,name:String){
//        val id:String = id
//        val name:String = name
//        val studentInformation:String
//            get() = "id:$id,name:$name,age:$age"
//        val nameAddingStr:(String) -> String = {str -> this.name + str}
//    }
    inner class Woman(id: String, name: String,man: Man) {
        val man: Man = man
        val id: String = id
        val name: String = name
        val studentInformation: String
            get() = "id:$id,name:$name,age:$age"

        fun Man.sayHelloWithAddingStr(str1: String){
            val nameAddingStr:(String) -> String = {str -> this.name + str}
            println("Hello,My Name is ${nameAddingStr(str1)}")
        }

        fun letManSayHello(str:String) {
            man.sayHelloWithAddingStr(str)
        }
    }

}