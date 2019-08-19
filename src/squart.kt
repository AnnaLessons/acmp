const val number = 15

fun main() {
    val a: Int = readLine()!!.toInt()
    val b: Int = readLine()!!.toInt()
    val c: Int = readLine()!!.toInt()

    println("Объем равен = ${volume(a, b, c)}")

    println("Площадь поверхности = ${area(a, b, c)}")


}

fun volume (a: Int, b: Int, c: Int): Int {
    return a * b * c
}

fun area (a: Int, b: Int, c: Int): Int {
    return ((a * b)+(a * c)+(b * c)) * 2
}