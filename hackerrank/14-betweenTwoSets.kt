package hackerrank

fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    val maxOfA : Int = a.max()
    val minOfB = b.min()
    var countFactor = 0

    for(i in maxOfA.rangeTo(minOfB)) {
        if(a.all{ i % it == 0} and b.all{ it % i == 0}) {
            countFactor ++
        }
    }
    return countFactor
}

fun main() {
    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val brr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val total = getTotalX(arr, brr)

    println(total)
}