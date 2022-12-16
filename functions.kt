// Function : No Argument And No Return
fun message()
{
    println("Hello World")
}

// Function With Argument With Return

fun sum(num1 : Int , num2 : Int) : Int
{
    val result = num1 + num2
    return  result
}
// Function : No Argument With  Return

fun printSt() : String
{
    return "Hey ! I m Function With No Argument + return"
}

// Function : With Argument And No Return
fun drive(age : Int) 
{
    if(age<18)
    {
        println("You Are Under Age")
    }
    else if(age==18)
    {
        println("First Apply For Driving Licsence")
    }
    else{
        println("You Can Drive")
}
}
// One line Function 
fun oneline(a : Int , b : Int) : Int = a+b
fun main() {

drive(32) // With Argument No Return
message() // No Argument No Return
println(sum ( 10 , 20 )) // With Argument With return
println(printSt())
println(oneline(100,200))

}