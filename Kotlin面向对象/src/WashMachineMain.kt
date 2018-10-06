fun main(args: Array<String>) {
    var washMachine = WashMachine("松下",50)
    washMachine.open()
    println("小花花把牛仔裤放进洗衣机里")
    washMachine.close()
    washMachine.selectModule(2)
    washMachine.startWash()

}