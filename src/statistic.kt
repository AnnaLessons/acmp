

fun main() {

    val allDates: List<String> = readLine()!!.split(' ')
    val even: MutableList<String> = mutableListOf()
    val odd: MutableList<String> = mutableListOf()

    for(date in allDates) {
        if (date.toByte() % 2 == 0) {
            even.add(date)
        } else odd.add(date)
    }

    for(date in odd) {
        print("$date ")
    }
    println()

    for(date in even) {
        print("$date ")
    }
    println()

    if(even.size >= odd.size) {
        print("YES")
    } else print("NO")
}
