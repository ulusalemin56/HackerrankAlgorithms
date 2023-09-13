
fun timeConversion(s: String): String {
    val charFormat = s[s.length - 2]
    if(charFormat == 'A') {
        val hour = (s.substring(0,1).toInt() * 10) + s.substring(1,2).toInt()
        val convertHour = if(hour == 12){
            "00"
        } else {
            if(hour >= 10)
                hour.toString()
            else
                "0$hour"
        }
        return convertHour + s.substring(2, s.length -2)
    } else {
        val hour = (s.substring(0,1).toInt() * 10) + s.substring(1,2).toInt()
        val convertHour = if(hour == 12){
            hour.toString()
        } else {
            "${12 + hour}"
        }
        return convertHour + s.substring(2, s.length -2)
    }
}

fun main() {
    val s = "07:05:45PM"
    val result = timeConversion(s)
    println(result)
}