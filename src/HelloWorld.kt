fun main(args: Array<String>) {

    var name = "Johnny"
    var isAwesome = true

    println("The man "+name+" is "+isAwesome)

    name = "Adrian"
    isAwesome = false

    val doubleNum = 123.45 // 64 bit
    // float need to be identified with f
    val floatNum = 123.45f // 32 bit

    val longNum = 123445667734L // 64 bit, need L

    println(doubleNum+floatNum.toDouble())

    var name2: String
    name2 = "batman"

    println(name2)
}