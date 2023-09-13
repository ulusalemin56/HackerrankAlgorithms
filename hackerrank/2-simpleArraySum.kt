package hackerrank

fun simpleArraySum(ar: Array<Int>) = ar.sum()

fun main() {
    print("Sayılar: ")
    val ar = arrayOf(1, 2, 3, 4, 10, 11)
    val result = simpleArraySum(ar)
    println(result)
}