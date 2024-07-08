package `3_Collections`

fun main() {
    // 불변 Map
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)

    // 가변 Map
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)

    // 가변 객체를 불변 객체로 전환
    val juiceMenuLoked: Map<String, Int> = juiceMenu

    // `[key]`를 사용하여 value 접근
    println(juiceMenu["apple"])
    println(juiceMenu["kiwi"])

    // 갯수 체크
    println(juiceMenu.count())

    // Map의 요소 추가, 제거
    juiceMenu.put("coconut", 150)
    println(juiceMenu)

    juiceMenu.remove("orange")
    println(juiceMenu)

    // 특정 값이 Set의 key로 존재하는지 여부 체크
    println(juiceMenu.containsKey("kiwi"))
    println(juiceMenu.containsKey("banana"))

    // Map의 key 또는 value를 출력
    println(juiceMenu.keys)
    println(juiceMenu.values)

    // Map에 특정 Key나 Value가 존재하는지 여부 확인
    println("orange" in juiceMenu.keys)
    println("kiwi" in juiceMenu.keys)
    println(190 in juiceMenu.values)
    println(210 in juiceMenu.values)

    /**
     * 연습문제
     * 1 부터 3까지의 정수에 대해 Map을 정의하라.
     * key: 숫자
     * value: 철자
     */
    val number2word: Map<Int, String> = mapOf(1 to "one", 2 to "two", 3 to "three")
    val n = 2
    println("$n is spelt as '${number2word[n]}'")
}