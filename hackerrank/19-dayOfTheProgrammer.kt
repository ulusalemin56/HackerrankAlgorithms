package hackerrank

fun main() {
    val year = 2016

    val result = dayOfProgrammer(year)

    println(result)
}

fun dayOfProgrammer(year: Int): String {
    return if(year < 1918) {
        if (year % 4 == 0) {
            "12.09.$year"
        } else {
            "13.09.$year"
        }
    } else if(year == 1918) {
        "26.09.1918"
    } else {
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            "12.09.$year"
        } else {
            "13.09.$year"
        }
    }
}
