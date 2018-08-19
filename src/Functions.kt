fun main(args: Array<String>) {

//    forceChoke()
//    makeAnEntrance("Run you clever boy, and remember")

//    val enemy = numbersOfEnemy(2,1)
//    println(message = "${enemy.toInt()+2} is surrounding us")
//
    println("${numbersOfEnemy(4,2).toInt()+2} is surrounding us")

    vaderFeels(42)

}


//fun forceChoke(){
//    println("You have failed me")
//}

//fun makeAnEntrance(line: String){
//    println(line.toUpperCase())
//}

fun numbersOfEnemy(stormtrooper: Int, robots: Int): String {
    return (stormtrooper+robots).toString()
}

fun vaderFeels(mood: Int = 100){
    println(mood)
}