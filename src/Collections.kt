fun main(args: Array<String>) {

//    val imperials = listOf(
//            "Emperor",
//            "Darth Vader",
//            "Boba Fett",
//            "Takin"
//    )
//
//    println(imperials.sorted())
//    println(imperials[2])
//    println(imperials.last())
//    println(imperials.contains("Emperor"))

//    val rebels = arrayListOf(
//            "Leiah",
//            "Luke",
//            "Han Solo",
//            "Mon Mothma"
//    )
//
//    println(rebels.size)
//
//    rebels.add(2,"Chewbacca")
//    println(rebels)
//    println(rebels.indexOf("Luke"))
//
//    rebels.removeAt(2)
//    println(rebels)

//    val rebelVehiclesMap = mapOf(
//            "Solo" to "Millenium Falcon",
//            "Luke" to "Landspeeder"
//    )
//
//    println(rebelVehiclesMap["Solo"])
//    println(rebelVehiclesMap.get("Luke"))
//    println(rebelVehiclesMap.getOrDefault("Leiah","No vehicle"))

    val rebelVehicle = hashMapOf(
            "Solo" to "Millenium Falcon",
            "Luke" to "Landspeeder"
    )

    rebelVehicle.set("Luke", "X Wing")
    rebelVehicle.put("Leiah", "Tantive IV")

    println(rebelVehicle.count())

    rebelVehicle.remove("Leiah")

    println(rebelVehicle)


}