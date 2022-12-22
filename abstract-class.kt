abstract class CAR{
    
    abstract var name : String
    abstract fun top_speed()
    abstract fun color()
    fun greet()=println("heyy From Abstract Class") // you can also define a normal function and variable in abstract class
}
class lemborghini : CAR()
{
    override var name = "Lemborghini ARX-378"
    override fun top_speed() = println("780 mph")
    override fun color() = println("Orange")

}

fun main() {

    var lembo = lemborghini()
    println(lembo.name)
    lembo.top_speed()
    lembo.color()
    lembo.greet()
    
}