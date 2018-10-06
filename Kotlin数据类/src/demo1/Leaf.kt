package demo1

data class Leaf(val size:String, val color:String, val shape:String, val vein:Int){
    override fun toString(): String {
        return "size='$size', color='$color', shape='$shape', vein=$vein"
    }
}