package `5_Funcations`

fun main() {
    /**
     * 연습문제 1
     * 웹 서비스에서 지원하는 작업 목록, 모든 요청에 대한 공통 접두사, 특정 리소스의 ID가 있습니다.
     * ID가 5인 리소스에 대한 작업 제목을 요청하려면 https://example.com/book-info/5/title URL을 생성해야 합니다.
     * 람다 식을 사용하여 작업 목록에서 URL 목록을 만듭니다.
     */
    val actions = listOf("title", "year", "author")
    val prefix = "https://example.com/book-info"
    val id = 5
    val urls = actions.map { action -> "$prefix/$id/$action" }
    println(urls)

    /**
     * 연습문제 2
     *  값과 동작(() -> Unit 유형의 함수)을 취하여 주어진 횟수만큼 동작을 반복하는 함수를 작성하세요. 그런 다음 이 함수를 사용하여 "Hello"를 5번 인쇄합니다.
     */
    fun repeatN(n: Int, action: () -> Unit) {
        for (i in 1..n) {
            action()
        }
    }

    repeatN(5) { println("Hello") }
}