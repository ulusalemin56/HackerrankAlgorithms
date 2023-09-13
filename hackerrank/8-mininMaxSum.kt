package hackerrank

fun miniMaxSum(arr: Array<Int>) {
    var minNum = arr[0]
    var maxNum = arr[0]
    var sumArr = 0L
    arr.forEach {
        if(it < minNum)
            minNum = it
        if(it > maxNum)
            maxNum = it
        sumArr += it
    }
    println("${sumArr - maxNum} ${sumArr - minNum}")
}

fun main() {
    val arr = arrayOf(1, 2, 3, 4, 5)
    miniMaxSum(arr)
}