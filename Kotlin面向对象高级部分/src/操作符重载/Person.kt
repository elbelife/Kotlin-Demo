package 操作符重载

class Person(name:String,age:Int) {

    val name:String = name

    val age:Int = age

    operator fun unaryPlus() = Person(this.name,this.age + 1)

    operator fun unaryMinus() = Person(this.name,this.age - 1)

    operator fun plus(person: Person):Person{
        if(this.name != person.name){
            return Person(this.name + person.name,this.age)
        }else{
            throw NameSameException("名字相同，不能做相加操作")
        }
    }

    operator fun rangeTo(person: Person):List<Person>{
        if(this.name != person.name){
            val personList = mutableListOf<Person>()
            for( i in this.age..person.age){
                val p = Person(this.name,i)
                personList.add(p)
            }
            return personList
        }else{
            throw NameSameException("名字相同，不能做相加操作")
        }
    }

    override fun toString(): String {
        return "Person(name='$name', age=$age)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Person

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }

    operator fun invoke(){
        println("name='$name', age=$age")
    }

    operator fun invoke(count:Int){
        println("name='$name', age=$age,count=$count")
    }

    fun printPersonInformation(function:((Person) -> Unit)?,person: Person){
        function?.invoke(person)
    }

    fun sayHello(){
        println("Hello World")
    }


}