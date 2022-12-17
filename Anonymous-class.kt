interface car {
    fun company() 
}
fun main() {
  var a = object : car {
    override fun company() {
      println("BMW")
    }
  }
  a.company()
}