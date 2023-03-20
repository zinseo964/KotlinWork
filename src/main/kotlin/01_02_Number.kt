/**
 * Kotlin 의 기본 타입들 (Basic Type) : https://kotlinlang.org/docs/basic-types.html
 *    Number  (+ unsigned Number)
 *    Boolean
 *    Character
 *    String
 *    Array
 *
 *
 * Number 타입   https://kotlinlang.org/docs/numbers.html
 *    Byte, Short, Int, Long
 *    Float, Double
 *
 * Unsigned Integer (부호없는 정수) : https://kotlinlang.org/docs/unsigned-integer-types.html
 *    UByte, UShort, UInt, ULong
 */

fun main() {
    var doubleV : Double = 110.1111
//    var floatV : Float = 110.0
    var floatV : Float = 110.0f
    var longV : Long = 110
    var shortV : Short = 30
    var byteV : Byte = 10
    var intV : Int = 1

//    Kotlin 에서는 모든 숫자 타입들도 사실 객체 -> 그렇기에 Method 가 존재
    println(doubleV)
    println(floatV)
    println(longV)
    println(floatV.toString())

//    형변환
//    doubleV = intV ; Kotlin 에서는 형변환 불가능 method 로 명시적으로 해야한다
//    각 type 별로, to***() method 가 존재
    doubleV = intV.toDouble()
    intV = doubleV.toInt()
//    char -> Num 도 to Method 로 가능 ; 문자열 중에 숫자가 들어간것만 가능
    println("123".toLong() + 10)

    println("-------------------------")
}