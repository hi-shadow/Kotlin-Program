fun main() {
    var number = 5
    var result = number in 1..10  // Either True Or False
    println(result)  // TRUE

    // 1..10 means : 1,2,3,4,5,6,7,8,9,10

    var number2 = 20
    var result2 = number2 in 1 until 10
    println(result2)  // FALSE

    // 1 until 10 means : 1,2,3,4,5,6,7,8,9 but not 10



}