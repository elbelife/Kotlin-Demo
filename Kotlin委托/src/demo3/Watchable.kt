package demo3

import kotlin.properties.Delegates

class Watchable {
    
//    var value: String by Delegates.observable("初始值"){
//        property, oldValue, newValue ->  println("property == $property  oldValues == $oldValue   newValue == $newValue")
//    }

    var value: String by Delegates.vetoable("初始值"){
      property, oldValue, newValue ->  println("property == $property  oldValues == $oldValue   newValue == $newValue")
        false
    }

//    property, oldValue, newValue ->  println("property == $property  oldValues == $oldValue   newValue == $newValue")
}