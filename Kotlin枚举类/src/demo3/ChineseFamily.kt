package demo3

enum class ChineseFamily:Family {

    father,mother,son;


    override fun getrank() = 2

    override fun likesFood() {
        when(this.name){
            "father" -> println(" chinese father likes banana")
            "mother" -> println("chinese mother likes pear")
            "son" -> println("chinese son likes apple")
            else -> println("chinese this house no person")
        }
    }
}