fun main(args: Array<String>) {

    val tesla = Car("Tesla","Model S","Red")
    tesla.brake()
    tesla.accelerate()

    val raptor = Truck("Ford","Raptor",100)
    raptor.details()
    raptor.park()
}