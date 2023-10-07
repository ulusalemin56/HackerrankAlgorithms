package hackerrank

fun migratoryBirds(arr: Array<Int>): Int {
    val countOfBirds = arrayOf(0, 0, 0, 0, 0, 0)
    arr.forEach {
        countOfBirds[it] += 1
    }

    var maxIndex = 0
    var max = 0
    countOfBirds.forEachIndexed { index, element ->
        if (element > max) {
            max = element
            maxIndex = index
        }
    }
    return maxIndex
}

fun main() {
    val arr = arrayOf(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4)

    val result = migratoryBirds(arr)

    println(result)
}