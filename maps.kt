fun main() {
    // maps means onr type of array but key and value pairs
    // There is 2 types of maps in kotlin language 
    // 1] mutable  : you can add , remove , change 
    // 2] immutable list : you can't add , remove , change
    
    val map_1  = mutableMapOf<Int ,String>() //[mutable map identity : mutableMapOf]
    map_1.put(1 , "gautam")
    map_1.put(2 , "sagar")
    map_1.put(4 , "sunny")
    map_1.put(3 , "gedu")
    
     // you can also print like this 
    println(map_1[1])
    println(map_1.get(1))
    
    map_1[1] = "Vaja Gautam" // you can change value like this
    println(map_1[1])
    
    // for all keys and values , you can use loops
    
    for((key , values) in map_1){
              println("$key : $values  ")
        }
        println() //  [formatted output purpose]
        
        
        //[immutable map identity : mutableMapOf]
        val map_2  = mapOf<Int ,String>(1 to "gautam" , 2 to "sagar" , 3 to "sunny" , 4 to "gedu")
        
        println("immutable map prints \n") //  [formatted output purpose]
                   for((key , values) in map_2){
              println("$key : $values  ")
        }         

      
}