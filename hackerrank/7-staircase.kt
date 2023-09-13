package hackerrank

fun staircase(n: Int) {
    for (i in 1..n) {
        for(j in 1..n-i){
            print(" ")
        }
        for(k in 1..i){
            print("#")
        }
        println()
    }
}

fun main() {
    val n = readLine()!!.trim().toInt()
    staircase(n)
}