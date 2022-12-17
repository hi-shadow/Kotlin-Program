class collage(course : String , sem : Int , fees : Int , management : String) {
                    var course = course
                    var sem = sem
                    var fees =  fees
                    var management = management
    fun greet(name : String){
        var nm = name
        println("Welcome $nm to semester $sem. Please pay a fees amount is RS $fees \n From Management Team : $management")
    } 


    constructor(course : String , sem : Int): this(course  , sem , 10000 , "Vidhyasabha Team")
    
}
fun main() {
    var addmission = collage("BCA" , 1 , 10000 , "Vidhyasabha")
    addmission.greet("Gautam")

    var addmission2 = collage("BSC" , 4)
    addmission2.greet("Milan")
}