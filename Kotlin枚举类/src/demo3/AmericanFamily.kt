package demo3

enum class AmericanFamily(var rank:Int):Family {

    father(1),mother(3),son(2),daughter(4);

    override fun getrank() = 1

    override fun likesFood() {
            when(this.name) {
                "father" -> println("american father likes banana")
                "mother" -> println("american mother likes pear")
                "son" -> println("american son likes apple")
                "daughter" -> println("american daughter likes lemon")
                else -> println("american this house no person")
            }
    }
}