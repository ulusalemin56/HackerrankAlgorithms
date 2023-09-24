package hackerrank

fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {
    var counterPair = 0
    for (i in 0 until n) {
        for (j in (i + 1) until n) {
            val sumPair = ar[i] + ar[j]
            if (sumPair % k == 0) {
                counterPair ++
            }
        }
    }
    return counterPair
}

fun main() {
    val n = 6
    val k = 3
    val ar = arrayOf(1, 3, 2, 6, 1, 2)
    val result = divisibleSumPairs(n, k, ar)
    println(result)
}