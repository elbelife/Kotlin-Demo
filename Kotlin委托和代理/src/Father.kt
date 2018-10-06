class Father:IWashBowl by Son {

    override fun washBowl() {
        println("我是爸爸，我吩咐儿子去洗碗")
        Son.washBowl()
        println("我看着儿子把碗洗完了")
    }
}