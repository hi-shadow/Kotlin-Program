fun main() {
    
    // There is 2 types of list in kotlin language 
    // 1] mutable  : you can add , remove , change 
    // 2] immutable list : you can't add , remove , change

        val list_1  = mutableListOf(1 , 2 , 3 , 4) //[mutable list identity : mutablelListOf]
        for(i in list_1){
              print("$i" +" , ")
        }
        println() //  [formatted output purpose]
         list_1.add(5)
         list_1.remove(1)
         for(i in list_1){
  print("$i" +" , ")
           }
        println()
         list_1[0] = 100
            for(i in list_1){
            print("$i" +" , ")
         }

         println()

         // you van also murge 2 list together 
 

println()
        val list_2 = listOf(1,2,3,4)
        println("Immutable List :" )
        for (i in list_2) {
            print("$i"+" , ")
            
        }
        // Throws Error because list_2 is immutable [identity is : listOf]
        //  list_1.add(5)
        //  list_1.remove(1)
        //  list_1[0] = 100




}