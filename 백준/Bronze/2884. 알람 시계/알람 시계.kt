fun inputIntPair(): Pair<Int, Int> {
    val inputIntList = readln()
        .split(" ")
        .map { it.toInt() }
    return Pair(inputIntList[0], inputIntList[1])
}

fun main() {
    val hourAndMinute = inputIntPair()
    val timer = when {
        hourAndMinute.second < 45 -> when {
            hourAndMinute.first == 0 -> Pair(23, hourAndMinute.second + 15)
            else -> Pair(hourAndMinute.first - 1, hourAndMinute.second + 15)
        }

        else -> Pair(hourAndMinute.first, hourAndMinute.second - 45)
    }
    println("${timer.first} ${timer.second}")
}
