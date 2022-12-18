open class parent {

    public var a :Int  = 10
    private var b : Int = 20
    protected var c:Int = 30
    internal var d : Int = 40
    fun no() {
        println("Parent Class Numbers")
        println(a)
        println(b)
        println(c)
        println(d)
    } 
    
}
class child : parent()
{

    fun no_equals() {
        println("Child Class Prints")
        println("Public : $a") // Acceesible because its Public it means ita accessible Everywhere
        // println("Private : $b")  //can not be accessible because its private it means its accessible only within their class/function
        println("Protected : $c") // acceesible because its protected it means ita accessible  with in the subclass only
        println("Internal : $d") // Acceesible because its internal it means ita accessible  with in the module

    }  
}

fun main() {

var obj_parent = parent()
obj_parent.no()
  var obj_child = child()
  obj_child.no_equals()


    
}