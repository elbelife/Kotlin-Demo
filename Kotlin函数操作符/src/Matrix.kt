class Matrix(var a:Int,var b:Int,var c:Int,var d:Int) {

    operator fun plus(matrix: Matrix) = Matrix(a + matrix.a,b + matrix.b,c + matrix.c,d + matrix.d)

    operator fun get(hor: Int, ver: Int): Int {
        val point = Pair(hor, ver)
        return when (point) {
            Pair(0, 0) -> a
            Pair(0, 1) -> b
            Pair(1, 0) -> c
            Pair(1, 1) -> d
            else -> 0
        }
    }

    operator fun set(hor: Int, ver: Int,newValue:Int):Unit{
        val point = Pair(hor,ver)
        when(point){
            Pair(0, 0) -> this.a = newValue
            Pair(0, 1) -> this.b = newValue
            Pair(1, 0) -> this.c = newValue
            Pair(1,1) -> this.d = newValue
            else -> return
        }
    }

    override fun toString(): String {
        return "Matrix(a=$a, b=$b, c=$c, d=$d)"
    }

}