fun main(args: Array<String>) {

//    var name = "JohnnyB"
//    name = null

    var nullableName: String? = "Do i really exist?"
//    nullableName = null

//    Null check
//    if (nullableName != null){
//        println(nullableName.length)
//    }else{
//        println(-1)
//    }

//    Concise way
    val l = if (nullableName!=null) nullableName.length else -1
    println(l)

//    Safe Call Operator
    println(nullableName?.length)

//    Elvis Operator
    val len = nullableName?.length ?: -1
    println(len)

    val noName = nullableName ?: "Unknown"
    println(noName)

    println(nullableName ?: "Unlisted")

//    !!
//    println(nullableName.length) won't run
    println(nullableName!!.length)
}