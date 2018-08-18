fun main(args: Array<String>) {

    val rebels = arrayListOf(
            "Leiah",
            "Luke",
            "Han Solo",
            "Mon Mothma"
    )

    val rebelVehicle = hashMapOf(
            "Solo" to "Millenium Falcon",
            "Luke" to "Landspeeder"
    )

    rebelVehicle.put("Leiah", "Tantive IV")

    for (rebel in rebels){
        println("Name : $rebel")
    }

    for ((key, value) in rebelVehicle){
        println("$key drives/flies $value")
    }

    var x = 0
    while (x<10){
        x++
        println(x)
    }
}