package demo1

interface CommonCompution {

    fun add()

    fun subtract()

    fun multiply()

    fun divide()

    fun printAllComputionResult(){
        print("add:")
        add()
        print("subtract:")
        subtract()
        print("multiply:")
        multiply()
        print("divide:")
        divide()
    }
}