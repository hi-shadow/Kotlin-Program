    // Function With No arguments No Return
    fun NANR() {
        println("Hello world")

    }

    // Function With No Arguments And Return
     fun NAWR() : String {
        return "Hello Sir ! Have A good day!" 
     }

    // Function With Arguments And No Return

    fun WANR(counter: Int) :  {
        while (i in 1..counter)
        {
            println("Hello $i")
        }
    
        // Function With  Arguments With Return

        fun WAWR(count: Int) : Int{
            for (i in 1..count)
            {
                return i
            }
        }

fun main() {


    
        // Calling The Functions

        NANR()
        NAWR()
        WANR(10)
        WAWR(10)

}