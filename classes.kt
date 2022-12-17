class collage {

    var clg_name = "Kamani Science Collage"
    fun cources()
    {
        println("BCA")
        println("Bsc")
        println("BA")
    
    }
     var management = "Vidhyasabha Managemnt"
     
    
}
fun main() {
    
    var addmision = collage() // Create Object of collage class as addmission
    println(addmision.clg_name) // call and print variable of class  
    addmision.cources() // call the function of class
    println(addmision.management)

}