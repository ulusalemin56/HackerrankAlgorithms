package hackerrank

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var rewardsA = 0
    var rewardsB = 0

    a.forEachIndexed {i, element ->
        if(element > b[i])
            rewardsA ++
        else if (element != b[i])
            rewardsB ++
    }

    return arrayOf(rewardsA, rewardsB)
}

fun main() {

    val a = arrayOf(17, 28, 30)

    val b = arrayOf(99, 16, 8)

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}