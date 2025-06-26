fun getDigitListReversed(num: Int): List<Int> {
    var number = num
    val digitList = mutableListOf<Int>()
    while (number > 0) {
        digitList.add(number % 10)
        number /= 10
    }
    return digitList
}

fun main() {
    val firstNumber = readln().toInt()
    val secondNumber = readln().toInt()
    val secondNumberDigits = getDigitListReversed(secondNumber)
    secondNumberDigits.forEach {
        println(it * firstNumber)
    }
    println(firstNumber * secondNumber)
}
