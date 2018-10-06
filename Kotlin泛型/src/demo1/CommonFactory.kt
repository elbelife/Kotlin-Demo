package demo1

class CommonFactory<U>:Factory<U>{
    override fun produce(thing: U) {
        println("撒覅红了就完蛋了卡是否合格不经常$thing")
    }

}