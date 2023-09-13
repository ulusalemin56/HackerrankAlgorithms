package hackerrank

fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>) {
    var countDownOfApple = 0
    var countDownOfOrange = 0

    for(appleDis in apples) {
        val distance = a + appleDis
        if(distance >= s && distance <= t) {
            countDownOfApple += 1
        }
    }

    for(orangeDis in oranges) {
        val distance = b + orangeDis
        if(distance >= s && distance <= t) {
            countDownOfOrange += 1
        }
    }
    println(countDownOfApple)
    println(countDownOfOrange)
}

fun main() {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val s = first_multiple_input[0].toInt()

    val t = first_multiple_input[1].toInt()

    val second_multiple_input = readLine()!!.trimEnd().split(" ")

    val a = second_multiple_input[0].toInt()

    val b = second_multiple_input[1].toInt()

    val apples = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val oranges = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    countApplesAndOranges(s, t, a, b, apples, oranges)
}