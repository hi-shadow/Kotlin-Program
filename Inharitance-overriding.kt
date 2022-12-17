open class phone(){
    fun call()=  println("Calling")
    open var  name = ""
    open var havemic = 4
    
    
    fun charging()= println("  is on charging")
    fun playmusic() = println(" Playing music on  ")
    
}
class smartphone(nm : String) : phone() {

    override var name = nm
    override var havemic = 6
    
   
    fun playmovie() = println("Playing Movies on  ")
    fun open_amazon() =println("Opeing Amazon Prime Video on  ") 

    
}
fun main() {
    
    var Xiaomi  = smartphone("MI CC9e")
println(Xiaomi.havemic)
println(Xiaomi.name)
    Xiaomi.call()
    Xiaomi.playmusic()
    Xiaomi.charging()
    Xiaomi.playmovie()
    Xiaomi.open_amazon()


}