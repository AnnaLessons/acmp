

fun main() {
    println("Введите число монет")
    val money: Int = readLine()!!.toInt()

    var resh: Int = 0
    var eagle: Int = 0

    for (index in 1..money) {
        val coin: Int = readLine()!!.toInt()
        if (coin == 1) {
            resh++
        } else {
            eagle++
        }
    }

    if (resh >= eagle) {
        println (eagle)
    } else println(resh)

}