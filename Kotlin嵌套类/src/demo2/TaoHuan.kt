package demo2

class TaoHuan {

    val outcolor:String = "red"
    val size:Int = 20
    val shape:String = "circle"

    fun getShapeContent():String{
        return this@TaoHuan.shape
    }

    fun getShapeContent1():String{
        return this.shape
    }

    inner class JiangPin{
        val size:Int = 15
        val shape:String = "rect"

        fun getOutSize():Int{
            return this@TaoHuan.size
        }

        fun getInSize():Int{
            return this@JiangPin.size
        }

        fun getThisSize():Int{
            return this.size
        }
    }
}