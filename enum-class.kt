enum class day (no:Int){
    Sunday(1),
    Monday(2),
    Tuesday(3),
    Wednesday(4),
    Thusday(5),
    Friday(6),
    Saturday(7); // on last value semicolon is must

    fun greet() = println("Hello : $this") 

}

fun main() {
    var today  = day.Sunday
    today.greet()
}