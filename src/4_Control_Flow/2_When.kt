package `4_Control_Flow`

fun main() {
    // 여러 분기가 있는 조건식이 있는 경우 if문이 아닌 when을 사용한다.
    val obj = "Hello"
    when (obj) {
        "1" -> println("One")
        "2" -> println("Two")
        "Hello" -> println("Greeting")
        else -> println("Unknown")
    }

    // when 구문은 변수에 할당이 가능하다.
    val obj2 = "Hello"
    val result = when (obj2) {
        "1" -> println("One")
        "2" -> println("Two")
        "Hello" -> println("Greeting")
        else -> println("Unknown")
    }
    println(result)

    val temp = 18
    val description = when {
        temp < 0 -> "very cold"
        temp < 10 -> "a bit cold"
        temp < 20 -> "warm"
        else -> "hot"
    }
    println(description)
}