fun main(args: Array<String>) {
    val a1 = Element("铝")
    a1.react(Particle())
    a1.react(Electron())
    val neno = NobleGas("氩")
    neno.react(Particle())
    neno.react(Electron())
}

open class Particle

class Electron : Particle()

open class Element(var name : String){

    open fun Particle.react(name : String){
        println("${name}与粒子发生反应")
    }

    open fun Electron.recat(name : String){
        println("${name}与电子发生反应生成同位素")
    }

    fun react(particle: Particle){
        particle.react(name)
    }
}

class NobleGas(name: String) : Element(name){

    override fun Particle.react(name: String) {
          println("${name}是稀有气体，不与粒子发生反应")
    }

    override fun Electron.recat(name: String) {
          println("${name}是稀有气体，不与电子发生化学反应")
    }

    fun react(electron: Electron){
        electron.recat(name)
    }
}