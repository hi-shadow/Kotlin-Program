class phone(company : String , modal : String , price : Int){
 constructor(company , modal , price){
    var cmpn = company
     var mdl  = modal
     var prc = price

     println("Your Device Specification----------- \n Company : $cmpn \n Modal : $mdl \n Price : prc")
 }
}
fun main() {

    var v11 = phone("vivo" , "v-11" , 26000)
    
    println(v11.modal)
    println(v11.company)
    println(v11.price)


}