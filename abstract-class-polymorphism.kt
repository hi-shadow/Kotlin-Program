abstract class operation {

    abstract var no1 : Int
    abstract var no2 : Int
    
}
 class sum(a : Int , b : Int ) : operation()
 {
    override var no1 = a 
    override var no2 = b
    println("the sum of $a and $b is : $a+b")
 }
 class sub : operation()
 { 
    override var no1 = a 
    override var no2 = b
    println("the sub of $a and $b is : $a-b")
}
class mul :  operation()
{ 
    override var no1 = a 
    override var no2 = b
    println("the multiplication of $a and $b is : $a*b")
}
class div :  operation()
{
     override var no1 = a 
    override var no2 = b
    println("the division of $a and $b is : $a/b")
}


fun main() {
    
    fun op(Array<operation>) 
    {
        for (i in objects) {

            
            
        }
    }
}