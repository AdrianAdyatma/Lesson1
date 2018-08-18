fun main(args: Array<String>) {

//    val accountBalance = 200
//    val itemPrice = 300
//
//    val moneyLeft = accountBalance-itemPrice
//
//    if (moneyLeft>0){
//        println("You can buy this item and still have $moneyLeft left")
//    }else if (moneyLeft<0){
//        println("Your balance is short by $moneyLeft")
//    }else{
//        println("You gonna have to spend all your money for it")
//    }

//    val degrees: Int = 50
//
//    if (degrees>=70){
//        println("This is some nice weather")
//    }else if (degrees<70 && degrees>=50){
//        println("Grab a sweater")
//    }else{
//        println("Holy crap it's freezing!")
//    }

//    val is_hungry = false
//    val is_bored = false
//
//    if (is_hungry || is_bored){
//        println("Let's get some pizza")
//    }

    var x = 4
    val y = 2

//    val z = if (x > y) x else y
//    println(z)

    when(x){
        !in 1..13 -> println("x == 1 or 2")
        else ->{
            x = y
            println("x is funny")
        }
    }

    println(vaderFeels("angry"))
    
}

fun vaderFeels(mood: String = "happy"): String {
    when(mood){
        "angry" -> return "mad"
        "sad" -> return "sad"
        else -> return "unknown"
    }
}