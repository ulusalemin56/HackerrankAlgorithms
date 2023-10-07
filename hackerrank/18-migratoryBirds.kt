package hackerrank

fun migratoryBirds(arr: Array<Int>): Int {
    var result = arr[0]
    var preCount = 0
    var count = 0
    for (i in arr.indices) {
        for (j in (i + 1) until arr.size) {
            if (arr[i] == arr[j]) {
                count ++
            }
        }
        if (count > preCount) {
            result = arr[i]
            preCount = count
        } else if (count == preCount && arr[i] < result) {
            result = arr[i]
            preCount = count
        }
        count = 0
    }
    return result
}

fun main() {
    val arr = arrayOf(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4)

    val result = migratoryBirds(arr)

    println(result)
}