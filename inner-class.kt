class upper {

     inner class nested {
        fun greet() = "I am kotlin language with java intigration" 
     }
    
}
fun main() {

    println(upper().nested().greet())
    
}