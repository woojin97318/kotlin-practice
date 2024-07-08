package `5_Funcations`

/**
 * 람다 표현식
 */

fun main() {
    // 변수에 할당
    val upperCaseString = { text: String -> text.uppercase() }
    println(upperCaseString("hello"))

    // 다른 메서드로 전달
    // filter() 사용
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val positives = numbers.filter { x -> x > 0 }
    val negatives = numbers.filter { x -> x < 0 }
    println(positives)
    println(negatives)
    // map 사용
    val doubles = numbers.map { x -> x * 2 }
    val tripled = numbers.map { x -> x * 3 }
    println(doubles)
    println(tripled)

    // Function types
    // upperCaseString2 변수 선언
    // upperCaseString2는 함수 타입으로 String을 받아 String를 리턴
    val upperCaseString2: (String) -> String = { text -> text.uppercase() }
    println(upperCaseString2("hello"))

    // Return from a function
    // toSeconds 정의 -> String을 인자로 받아 (Int) -> Int 타입의 함수를 반환
    // when 표현식을 사용하여 입력된 time 값에 따라 서로 다른 람다 식을 반환
    fun toSeconds(time: String): (Int) -> Int = when (time) {
        "hour" -> { value -> value * 60 * 60 }
        "minute" -> { value -> value * 60 }
        "second" -> { value -> value }
        else -> { value -> value }
    }
    val timesInMinutes = listOf(2, 10, 15, 1)
    val min2sec = toSeconds("minute")
    val totalTimeInSeconds = timesInMinutes.map(min2sec).sum()
    println("Total time is $totalTimeInSeconds secs")

    // Invoke separately
    // 람다 표현식은 중괄호`{}` 뒤에 괄호`()`를 추가하고 괄호 안에 매개변수를 포함하여 자체적으로 호출할 수 있다.
    println({ text: String -> text.uppercase() }("hello"))

    // Trailing lambdas 후행 람다식
    println(listOf(1, 2, 3).fold(0, {x, item -> x + item}))
    println(listOf(1, 2, 3).fold(0) {x, item -> x + item})
}