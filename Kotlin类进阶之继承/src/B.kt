class B(override val constStr: String):A() {

    override var str: String = "B"
    override fun toString(): String {
        return "B(constStr='$constStr', str='$str')"
    }

//    override val constStr: String = "BB"



}