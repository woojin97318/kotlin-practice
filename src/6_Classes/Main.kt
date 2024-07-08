package `6_Classes`

fun main() {
    // Create instance 인스턴스 생성
    val contact1 = Contact1(1, "mary@gmail.com")

    // Access properties 속성 접근
    println(contact1.email)
    contact1.email = "jane@gmail.com"
    println(contact1.email)

    // Member functions
    contact1.printId()

    // Print as string
    val user = User("Alex", 1)
    println(user)

    // Compare instances
    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)
    println(user == secondUser)
    println(user == thirdUser)

    // Copy instance
    println(user.copy())
    println(user.copy("Max"))
    println(user.copy(id = 3))
}