class upper {
    class nested {
        fun greet() {
            println("hello world")
            
        }
    }
    
}
fun main() {
    val a  = upper.nested().greet() 
println(a)
}