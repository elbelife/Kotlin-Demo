object MinValue {

    operator fun invoke(a:Int,b:Int) = if(a < b) a else b
    operator fun invoke(x:Int,y:Int,z:Int) = invoke(invoke(x,y),z)
    operator fun invoke(x:Int,y:Int,z:Int,k:Int) = invoke(invoke(x,y),invoke(z,k))

}