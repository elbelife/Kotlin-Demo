package demo3

import kotlin.properties.Delegates

class Count {

    var value:Int by Delegates.observable(5) {
        property, oldValue, newValue ->
        var number = oldValue * newValue
        println("简单算术:$oldValue * $newValue = $number")
    }
}