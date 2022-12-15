fun main() {
    var ball_bat = "Cricket"
    var animal = "Dog"
    
    // when statment is used as  if...else if...else statment 

    when(ball_bat){
        "Cricket" -> println("Cricket Game")
        "Hockey" -> println("Hockey Game")
        "VallyBall" -> println("VallyBall Game")
        "Soccer" -> println("Soccer Game")
        else -> println("Invalid Game")
}
        // You can also store in variable
        
        var result  = when(animal){
        "Cat" -> "Animal : Cat"
        "Dog" -> "Animal : Dog"
        "Suwar" -> "Animal : Suwar"
        "Horse" -> "Animal : Horse"
        else -> "Invalid Animal"

    }
    println(result)

}