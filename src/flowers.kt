
fun main() {
    var first: Char = 'G'
    var second: Char = 'C'
    var three: Char = 'V'
    val K: Int = readLine()!!.toInt()

    for (index in 1..K) {
        val temp1: Char = second
        second = three
        three = temp1

        val temp2: Char = first
        first =  second
        second= temp2

    }
    println("$first$second$three")

}