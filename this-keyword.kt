class Counter {
 var count = 0
 fun incrementCount() {
 this.count += 2
 }
}
fun main() {
 var c: Counter = Counter()
 var count = 50
 c.incrementCount()
 println("count in main " + count)
 println("count in counter " + c.count)
} 