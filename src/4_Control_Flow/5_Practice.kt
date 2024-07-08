package `4_Control_Flow`

fun main() {
    /**
     * 연습문제 1
     */
    val button = "A"
    println(
        when (button) {
            "A" -> "Yes"
            "B" -> "No"
            "X" -> "Menu"
            "Y" -> "Nothin"
            else -> "There is no such button"
        }
    )

    /**
     * 연습문제 2
     * 8조각으로 구성된 피자가 나올 때까지 피자 조각 수를 세는 코드 작성
     * while문, do-while문 사용
     */
    var pizzaSlices = 0
    while ( pizzaSlices < 7 ) {
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")
    }
    println("There are ${++pizzaSlices} slices of pizza. Hooray! We have a whole pizza! :D")

    pizzaSlices = 0
    do {
        println("There's only ${++pizzaSlices} slice/s of pizza :(")
    } while (pizzaSlices < 7)
    println("There are ${++pizzaSlices} slices of pizza. Hooray! We have a whole pizza! :D")

    /**
     * 연습문제 3
     */
    for (number in 1..100) {
        println(
            when {
                number % 15 == 0 -> "fizzbuzz"
                number % 3 == 0 -> "fizz"
                number % 5 == 0 -> "buzz"
                else -> "$number"
            }
        )
    }

    /**
     * 연습문제 4
     * 단어 List가 있다.
     * 문자 "l"로 시작하는 단어만for 및 if를 사용하여 출력.
     */
    val words = listOf("dinosaur", "limousine", "magazine", "language")
    for (w in words) {
        if (w.startsWith("l"))
            println(w)
    }
}