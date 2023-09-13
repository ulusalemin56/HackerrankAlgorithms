package hackerrank

fun plusMinus(arr: Array<Int>) {
    val n = arr.size.toDouble()
    val positiveCount  = arr.count{
        it > 0
    }/n

    val negativeCount = arr.count{
        it < 0
    }/n
    val zero = 1 - (positiveCount + negativeCount)

    println(positiveCount)
    println(negativeCount)
    println(zero)
}

fun main() {
    val arr = arrayOf(-4, 3, -9, 0, 4, 1)
    plusMinus(arr)
}