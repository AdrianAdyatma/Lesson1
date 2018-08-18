//class Car(var make: String, var model: String){
//    fun accelerate(){
//        println("Vroom vroom...")
//    }
//}
//
//class Truck (var year: Int, var towingcapacity: Int){
//    fun tow(){
//        println("Towing the horses...")
//    }
//    fun details(){
//        println("$year truck has $towingcapacity tonnes towing capacity")
//    }
//}

open class Vehicle(val make: String, val model: String){
    open fun accelerate(){
        println("Vroom vroom...")
    }
    fun park(){
        println("Finding nearest parking spot...")
    }
    fun brake(){
        println("Stopping...")
    }
}


//Inheritance
class Car(make: String, model: String, val color: String) : Vehicle(make, model){
    override fun accelerate(){
        println("Whuzzzzz...")
    }
}

class Truck(make: String, model: String, val towingcapacity: Int) : Vehicle(make, model){
    fun details(){
        println("$make $model has $towingcapacity tonnes towing capacity")
    }
}


