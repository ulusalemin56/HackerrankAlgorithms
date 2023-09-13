package hackerrank

fun birthdayCakeCandles(candles: Array<Int>): Int {
    val max = candles.max()
    return candles.count { it == max }
}

fun main() {
    val candles = arrayOf(3, 2, 1, 3,)
    val result = birthdayCakeCandles(candles)
    println(result)
}