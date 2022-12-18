fun main() {
    
    val arr = arrayOf(1,2,3,4,5)
    println(arr[2])
    // println(arr[10]) // throw a error is index out of bound exeption

    // exeption handaling
    try {
     println(arr[10]) // throw a error is index out of bound exeption but it try to run either throw exeption
        
    }
    catch(e : Exception) {
        println("Exeptionn raised")
        println(e)

    }
    finally {
        println("I Am Finnnaly Block So I am Run Definatly") // Finally blocks definatly runs even your code raised exeption

    }
}