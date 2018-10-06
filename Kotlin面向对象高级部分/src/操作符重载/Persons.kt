package 操作符重载

class Persons(personList:MutableList<Person>) {

    val personList:MutableList<Person> = personList

    operator fun contains(person: Person): Boolean{
        if(this.personList.contains(person)){
            return true
        }
        return false
    }

    operator fun get(i:Int):Person{
        return personList[i]
    }

    operator fun set(i:Int,person: Person){
        personList[i] = person
    }

    operator fun plusAssign(person: Person){
        this.personList.add(person)
    }

}