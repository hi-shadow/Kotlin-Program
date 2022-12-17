open class phone{
    fun call()=  println("Calling")
    
    fun charging()= println("device is on charging")
    fun playmusic() = println(" Playing music")
    
}
class smartphone : phone() {

    fun playmovie() = println("Playing Movies")
    fun open_amazon() =println("Opeing Amazon Prime Video") 
    
}
fun main() {
    
    var MiA3  = smartphone()
    
    MiA3.call()
    MiA3.playmusic()
    MiA3.charging()
    MiA3.playmovie()
    MiA3.open_amazon()


}