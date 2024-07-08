package `3_Collections`

fun main() {
    // 불변 리스트 생성
    val readOnlyList = listOf("triangle", "square", "circle")
    println(readOnlyList)

    // 가변 리스트 생성
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println(shapes)

    // 가변 리스트의 수정을 방지하려면 캐스팅을 통해 불변 리스트로 변경할 수 있다.
    val shapesLocked: List<String> = shapes
    println(shapesLocked)

    // `[]`를 사용하여 리스트 요소에 접근
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println("리스트의 첫 번째 요소는 ${readOnlyShapes[0]}입니다.")

    // 리스트에서 첫 번째 요소 또는 마지막 요소는 아래와 같이 접근
    println(readOnlyShapes.first())
    println(readOnlyShapes.last())

    // 리스트 요소의 갯수는 `count()` 메서드 사용
    println(readOnlyShapes.count())

    // 리스트에 특정 요소가 포함되어있는지 여부 체크
    println("circle" in readOnlyShapes)
    println("circle?" in readOnlyShapes)

    // 리스트 요소 추가, 제거
    val shapes2: MutableList<String> = mutableListOf("triangle", "square", "circle")
    shapes2.add("pentagon")
    println(shapes2)

    shapes2.remove("pentagon")
    println(shapes2)

    /**
     * 연습문제
     * 두 리스트의 총 갯수 확인
     */
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)
    val totalCount: Int = greenNumbers.count() + redNumbers.count()
    println(totalCount)
}