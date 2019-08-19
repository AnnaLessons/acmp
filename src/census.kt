

data class Person(var age: Byte = 0,
                  var sex: Byte = 0)

fun main() {
    val N: Byte = readLine()!!.toByte()
    val array = Array(N.toInt()) {Person()}

    var t: Byte = 0

    while (t < N) {
        val input = readLine()!!.split(' ')
        array[t.toInt()].age = input[0].toByte()
        array[t.toInt()].sex = input[1].toByte()
        t++
    }

    var maxAgeIndex: Byte = 0
    t = 0

    while (t < N) {
        if(array[t.toInt()].sex == 1.toByte() &&
            array[t.toInt()].age > array[maxAgeIndex.toInt()].age) {
            maxAgeIndex = t
        }
        t++
    }
    println(maxAgeIndex + 1)

}