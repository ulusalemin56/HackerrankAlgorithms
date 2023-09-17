package hackerrank

fun main() {
    val scores = arrayOf(3, 4, 21, 36, 10, 28, 35, 5, 24, 42)
    val result = breakingRecords(scores)
    println(result.joinToString(" "))
}

fun breakingRecords(scores: Array<Int>): Array<Int> {
    var highestScore = scores[0]
    var lowestScore = scores[0]
    var countOfBreakMax = 0
    var countOfBreakMin = 0
    for (score in scores) {
        when {
            score > highestScore -> {
                countOfBreakMax++
                highestScore = score
            }

            score < lowestScore -> {
                countOfBreakMin++
                lowestScore = score
            }
        }
    }
    return arrayOf(countOfBreakMax, countOfBreakMin)
}