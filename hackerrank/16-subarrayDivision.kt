package hackerrank

fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    var result = 0
    val size = s.size
    for (i in 0..size - m) {
       var sumOfSquares = 0
        for (j in i until i + m) {
            sumOfSquares += s[j]
        }
        if (sumOfSquares == d) {
            result++
        }
    }
    return result
}

fun main() {
    val d = 3
    val m = 2
    val s = arrayOf(1, 2, 1, 3, 2)
    val result = birthday(s, d, m)
    println(result)
}