package hackerrank

import kotlin.math.abs

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var sum1 = 0
    var sum2 = 0
    for(i in arr.indices) {
        sum1 += arr[i][i]
        sum2 += arr[i][arr.lastIndex - i]
    }
    return abs(sum1 - sum2)
}

fun main() {
    val n = readLine()!!.trim().toInt()
    val arr = Array(n) { Array(n) { 0 } }
    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }
    val result = diagonalDifference(arr)
    println(result)
}