open class Player(val name: String, val age: Int, val gender: Int) {
    open fun attack(){
        println("attacking...")
    }
    open fun defend(){
        println("defending...")
    }
    fun run(){
        println("running...")
    }
    fun details(){
        val gendertext = if (gender==0) "male"
            else if (gender==1) "female"
            else "unknown"
        println("Player $name is $age years old and is a $gendertext")
    }
}

class Thief(name: String, age: Int, gender: Int): Player(name, age, gender) {
    override fun attack() {
        println("stealing...")
        super.run()
    }
}

//Subclass must provide all constructor needed but can add new parameter variable
class Warrior(name: String,age: Int, gender: Int, val sword: String) : Player(name, age, gender){
    override fun defend(){
        println("shielding...")
    }
    fun bringWeapon(){
        println("$name brought an ancient weapon: $sword")
    }
}