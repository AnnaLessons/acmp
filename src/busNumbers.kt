

fun main() {

    var N: Byte = readLine()!!.toByte()
    val letters: Array<Char> = arrayOf('A', 'B', 'C', 'E', 'H', 'K', 'M', 'O', 'P', 'T', 'X', 'Y')
    val result: MutableList<String> = mutableListOf()

    while(N.toInt() != 0) {
        val number: String = readLine()!!
        for(letter in letters) {
            if(letter == number[0])

        }
        N--
    }
}