package `7_Null_Safety`

fun main() {
    /**
     * Nullable types
     */
    var neverNull: String = "This can't be null"

    // 컴파일 에러 발생
//    neverNull = null

    // nullable has nullabke
    var nullable: String? = "You can keep a null here"
    nullable = null

    // 기본적으로 null 값은 허용되지 않습니다.
    var inferredNonNull = "The compiler assumes non-nullable"
//    inferredNonNull = null

    // notNull doesn't accept null values
    fun strLength(notNull: String): Int {
        return notNull.length
    }

    println(strLength(neverNull)) // 18
//    println(strLength(nullable))  // Throws a compiler error

    /**
     * Check for null values
     */
    fun describeString(maybeString: String?): String {
        if (maybeString != null && maybeString.length > 0) {
            return "String of length ${maybeString.length}"
        } else {
            return "Empty or null string"
        }
    }

    val nullString: String? = null
    println(describeString(nullString))

    /**
     * Use safe calls
     */
    fun lengthString(maybeString: String?): Int? = maybeString?.length

    val nullString2: String? = null
    println(lengthString(nullString2))

    val nullString3: String? = null
    println(nullString3?.uppercase())

    // Use Elvis operator
    val nullString4: String? = null
    println(nullString4?.length ?: 0)
}