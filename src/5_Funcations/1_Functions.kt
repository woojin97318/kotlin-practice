package `5_Funcations`

import kotlin.math.PI

/**
 * `fun` 키워드를 사용하여 메서드 선언
 */
fun hello() {
    return println("Hello, world")
}

/**
 * x와 y를 매개변수로 받는다.
 * 타입을 선언한다.
 * 메서드의 반환 타입을 선언한다.
 */
fun sum(x: Int, y: Int): Int {
    return x + y
}

/**
 * Named arguments
 * 가독성 높은 코드를 위해 메서드를 호출할 때 매개변수 이름을 포함할 필요가 없다.
 * 그러나 매개변수 이름을 포함하면 가독성이 더 좋아질 수 있다.
 * 그러면 순서에 상관없이 매개변수를 작성할 수 있다.
 */
fun printMessagePrefix(message: String, prefix: String) {
    println("[$prefix] $message")
}

/**
 * Default Parameter Values
 * 메서드의 인자값의 기본값을 설장할 수 있다.
 */
fun printMessagePrefix2(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

/**
 * Functions without return
 * 메서드가 값을 반환하지 않으면 반환 유형은 Unit
 * return 키워드를 사용하거나 반환 유형을 선언할 필요가 없다.
 */
fun printMessagePrefix3(message: String) {
    println(message)
}

/**
 * Single-expression functions﻿
 * 코드를 더 간결하게 표한하기 위해 단일 표현식 메서드를 작성
 */
fun sum2(x: Int, y: Int) = x + y

fun main() {
    hello()

    println(sum(1, 2))

    printMessagePrefix(prefix = "Log", message = "Hello")

    printMessagePrefix2("Hello", "Log")
    printMessagePrefix2("Hello")
    printMessagePrefix2(prefix = "Log", message = "Hello")

    printMessagePrefix3("Hello")

    println(sum2(4, 2))
}