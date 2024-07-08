package `3_Collections`

fun main() {
    // 불변 Set
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
    println(readOnlyFruit)

    // 가변 Set
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
    println(fruit)

    // 가변 Set의 수정을 방지하려면 캐스팅을 통해 불변 Set으로 변경할 수 있다.
    val fruitLocked: Set<String> = fruit

    // Set 갯수
    println(fruit.count())

    // 특정 요소가 Set에 포함되어있는지 확인
    println("apple" in fruit)
    println("kiwi" in fruit)

    // 요소의 추가, 제거
    fruit.add("dragonfruit")
    println(fruit)

    fruit.remove("dragonfruit")
    println(fruit)

    /**
     * 연습문제
     * 서버에서 지원하는 프로토콜 Set가 있습니다.
     * 사용자가 특정 프로토콜을 사용하려한다.
     * 해당 프로토콜이 지원되는지의 여부를 확인하라.
     */
    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = requested.uppercase() in SUPPORTED
    println("Supported for $requested: $isSupported")
}