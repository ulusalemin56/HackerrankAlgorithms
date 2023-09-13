package hackerrank

fun aVeryBigSum(ar: Array<Long>): Long {
    return ar.sum()
}

fun main() {
    val ar = arrayOf<Long>(1000000001, 1000000002, 1000000003, 1000000004, 1000000005)
    val result = aVeryBigSum(ar)
    println(result)
}