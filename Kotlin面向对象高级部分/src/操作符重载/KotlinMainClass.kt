package 操作符重载

fun main(args: Array<String>) {
     var person = Person("shen",20)
     var person1 = person.ageIncrement()
    println(person1.age)//21

    println((+person1).age)//22
    println((-person).age)//19

    println((++person).age)//21

    println("===============分割线一==================")

    var hu = Person("Hu",22)
    println((hu++).age)
    println((hu).age)

    var liu = Person("Liu",21)
    println((++liu).age)
    println(liu.age)

    println("===============分割线二==================")

    val zhang = Person("Zhang",30)
    val wang = Person("Wang",30)

    val zhangWang: Person
    try {
        zhangWang = zhang + wang
        println(zhangWang.name)
    } catch (e: Exception) {
        println(e.message)
    }

    println("===============分割线三==================")

    val diao = Person("Diao",15)
    val li = Person("Li",20)

    println(diao.rangeTo(li).joinToString(separator = "=="))

    println("===============分割线四==================")

    val ps = Persons(mutableListOf(Person("shen",20),Person("zhen",30), Person("nan",45),Person("jing",100)))
    val jing = Person("jing",100)
    val ning = Person("ning",60)

    println(jing in ps)
    println(ning !in ps)

    val shen = ps[0]
    println(shen)

    ps[0] = ning
    println(ps[0])

    println("===============分割线五==================")

    val bu = Person("Bu",20)
    bu()
    bu(5)
    bu.sayHello()

    println("===============分割线六==================")

    val chen = Person("Chen",19)
    chen.printPersonInformation({it -> println(it.name)},chen)

    ps += chen

    for(i in ps.personList){
        println(i)
    }

    println("===============分割线七==================")

    val cat = Animal(12)

    val dog = Animal(18)

    println(cat > dog)
    println(cat == dog)
    println(cat < dog)

}

fun Person.ageIncrement():Person{
    return Person(this.name,this.age + 1)
}

operator fun Person.inc() = Person(this.name,this.age + 1)