// 1. 종결자를 사용하지 않아도 된다.
// 2. 형을 선언하지않았다면 변수를 대입시 형이 결정된다.
// 3. 변수는 읽기전용과 읽기쓰기 상태로 선언된다.
// 4. null은 엄격히 구분한다. -> null을 허용하는 변수는 ?로 정의
// 5. scope는 java와 유사하다

fun main() {
    println("hello kotlin")

//    1
    println("var = Read + Write, val = Only Read")
    var nCount : Int = 0
//    2
    var name = "PSW"
//    3
    nCount = 100
    println(nCount)

    val age = 0
//    age = 100 Error!
    println(age)

//    4
//    var MyMoney : Int = null : Null can not be a value of a non-null type Int

//    nullable (null 값을 허용하는 Int type) (? = Elvis 연산자)
    var MyMoney : Int? = null
    println(MyMoney)

//    5 : before calling, cannot be used.
    val message = "New Message"
    println(message)
    println(hiMessage)
}
// Global Variable
val hiMessage : String = "Hi"
