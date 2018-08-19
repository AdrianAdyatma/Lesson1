fun main(args: Array<String>) {

//    fun printMessage(message: String){
//        println(message)
//    }

    val printMessage = {
        message: String -> println(message)
    }
    printMessage("Hello World!")

    val sumA = {
        x: Int, y: Int -> x+y
    }
    println(sumA(2,3))

    val sumB : (Int, Int) -> Int = {
        x,y -> x+y
    }
    println(sumB(4,5))

    fun downloadData(url: String, completion: () -> Unit){
//        sent a download request
//        we got back data
//        there were no network errors
        completion()
    }

//    call downloadData
//    function inside the curly braces only works after downloadData complete
    downloadData("fakeUrl.com",{
        println("This code will only run after the completion of downloadData()")
    })

    fun downloadCarData(url: String, completion: (Car) -> Unit){
        val carCivic = Car("Toyota","Civic","White")
        completion(carCivic)
    }

    downloadCarData("fakeUrl.com"){
        println(it.color)
        println(it.make)
    }

    downloadCarData("fakeUrl.com"){car ->
        println(car.color)
        println(car.make)
    }

    fun downloadTruckData(url:String, success:(Truck?, Boolean) -> Unit){
//        make request
//        get result
        val webRequestSuccess = true
        if (webRequestSuccess){
//            receive truck data
            val truck = Truck("Toyota","Hilux",80)
            success(truck, true)
        }else{
            success(null, false)
        }
    }

    downloadTruckData("fakeUrl.com"){truck: Truck?, success: Boolean ->
        if(success){
//            do someting with our truck
            truck?.details()
        }else{
//            handle failure
            println("Something went wrong!")
        }
    }

}