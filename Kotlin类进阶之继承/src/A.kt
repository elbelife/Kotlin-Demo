open class A {

    open var str:String = "A"

    open val constStr:String = "AA"

    override fun toString(): String {
        return "A(str='$str', constStr='$constStr')"
    }


}