fun main(args: Array<String>) {
    val str = "My dad said \"I need you\""

//    val rawCrawl = """
//        A long time ago,
//        In a galaxy
//        far, far, away...
//    """.trimIndent()
//    println(rawCrawl+"\n")

//    for (char in str){
//        println(char)
//    }

//    val contentEquals: Boolean = str.contentEquals("May the force be with you.")
//    println(contentEquals)
//
    val contains = str.contains("fOrC",true)
//    println(contains)

//    val strUpper = str.toUpperCase()
//    println(strUpper)
//
//    val strLower = str.toLowerCase()
//    println(strLower)

//    val num = 6
//    val numString = num.toString()
//    println(numString)

//    val subsequent = str.subSequence(3,14)
//    println(subsequent.toString().toUpperCase())

    val luke = "Luke Skywalker Noob"
    val weapon = "Lightsaber"
    val vehicle = "landspeeder"
    val age = 22

    println("${luke.toUpperCase()} wields a $weapon and drives $vehicle, he is $age years old")

    println("Luke full name has ${luke.replace(" ","").length} letters")

}