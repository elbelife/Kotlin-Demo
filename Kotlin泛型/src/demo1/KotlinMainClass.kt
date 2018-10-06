package demo1

fun main(args: Array<String>) {
    val container1 = Container(1)
    container1.printInfomation()

    val container2 = Container<String>("2")
    container2.printInfomation()

    systemOutRelativeInformation(container2)

    systemOutRelativeInformation(container1)

    val stringFactory = StringFactory()
    stringFactory.produce("hello world")

    val intFactory = CommonFactory<Int>()
    intFactory.produce(1111)

}

fun <T>systemOutRelativeInformation(container: Container<T>){
    container.printInfomation()
}