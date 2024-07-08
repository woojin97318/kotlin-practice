package `5_Funcations`

import kotlin.math.PI

/**
 * 연습문제 1
 * 원의 반지금을 매개변수로 받아 해당 원의 넓이를 출력하는 메서드
 */
fun circleArea1(radius: Int): Double {
    return PI * radius * radius
}

/**
 * 연습문제 2
 * 연습문제 1번을 단일표션식으로 작성
 */
fun circleArea2(radius: Int) = PI * radius * radius

/**
 * 시, 분, 초 단위로 주어진 시간 간격을 초로 변환하는 메서드
 * 대부분의 경우 하나 또는 두 개의 함수 매개 변수만 전달하면 되며 나머지는 0
 */
fun intervalInSeconds(
    hours: Int = 0,
    minutes: Int = 0,
    seconds: Int = 0
) = ((hours * 60) + minutes) * 60 + seconds

fun main() {
    println(circleArea1(2))
    println(circleArea2(2))

    println(intervalInSeconds(1, 20, 15))
    println(intervalInSeconds(minutes = 1, seconds = 25))
    println(intervalInSeconds(2))
    println(intervalInSeconds(minutes = 10))
    println(intervalInSeconds(1, seconds = 1))
}