package `4_Control_Flow`

fun main() {
    // 1부터 5까지의 숫자를 반복하고 숫자를 출력하는 for문
    for (number in 1..5) {
        println(number)
    }

    // Collections 또한 반복문 사용 가능
    val cakes = listOf("carrot", "cheese", "chocolate")
    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }
}