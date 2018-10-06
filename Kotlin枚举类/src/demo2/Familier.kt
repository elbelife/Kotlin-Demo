package demo2

import demo1.EnumClass

enum class Familier(var rank:Int) {

    father(1),mother(3),son(2),daughter(4);

    override fun toString(): String{
        return "成员名字=${this.name}，成员排名=${rank}，成员序号=${this.ordinal}"
    }

    fun likeFood(){
        when(this.name){
            "father" -> println("father likes banana")
            "mother" -> println("mother likes pear")
            "son" -> println("son likes apple")
            "daughter" -> println("daughter likes lemon")
            else -> println("this house no person")
        }
    }

    fun action(){
        println("We all like sports!")
    }


}

fun main(args: Array<String>) {
    println(Familier.mother.compareTo(Familier.daughter))
    println(Familier.father.compareTo(Familier.daughter))
    println(Familier.father.compareTo(Familier.son))
    println(Familier.father.compareTo(Familier.mother))
    println(Familier.father.compareTo(Familier.father))

    println(Familier.father.ordinal)
    println(Familier.mother.ordinal)
    println(Familier.son.ordinal)
    println(Familier.daughter.ordinal)

    println(Familier.father.declaringClass.name)
    println(Familier.father.declaringClass)

    println(Familier.father.name)
    println(Familier.father.toString())

    val familier = Familier.values()

    println("家庭成员的数量为${familier.size}")
   for(f in familier){
       println(f)
   }

    println(Familier.valueOf("daughter").toString())

    Familier.mother.likeFood()
    Familier.mother.action()
}