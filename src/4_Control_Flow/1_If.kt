package `4_Control_Flow`

fun main() {
    val d: Int
    val check = true

    if (check) {
        d = 1
    } else {
        d = 2
    }

    println(d)

    // Kotlin은 삼항연산자기 없다. 대신 아래와 같이 사용
    val a = 1
    val b = 2
    println(if (a > b) a else b)
}