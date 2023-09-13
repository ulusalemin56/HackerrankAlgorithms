package hackerrank

fun gradingStudents(grades: Array<Int>): Array<Int> {
    grades.forEachIndexed{index, grade ->
        val modGrade = grade % 5
        if(grade >= 38 && modGrade > 2) {
            grades[index] = grade - modGrade + 5
        }
    }
    return grades
}

fun main() {
    val grades = arrayOf(73, 67, 38, 33)
    val result = gradingStudents(grades)
    println(result.joinToString("\n"))
}