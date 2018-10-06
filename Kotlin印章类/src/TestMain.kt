fun main(args: Array<String>) {
    var donkey:Children = Children.Donkey()
//    donkey.sayHello()

    var hinnySon:Children = Children.HinnySon()
//    hinnySon.sayHello()

    var hinnySon1:Children = Children.HinnySon()
//    hinnySon1.sayHello()

    var children = listOf<Children>(donkey,hinnySon,hinnySon1)

    for(c in children){
        if(c is Children.Donkey){
           c.sayHello()
        }
    }
}