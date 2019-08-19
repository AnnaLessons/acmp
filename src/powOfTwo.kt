

fun main() {
    println ("Введите число")
    val number: Int = readLine()!!.toInt()

    var N: Int = 1

    while (N <= number) {
        if (N == number){
            println("YES")
            return

        }
        else N *= 2
    }
    println("NO")


}