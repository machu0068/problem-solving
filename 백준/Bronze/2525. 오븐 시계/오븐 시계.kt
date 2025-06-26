fun inputIntPair(): Pair<Int, Int> {
    val inputIntList = readln()
        .split(" ")
        .map { it.toInt() }
    return Pair(inputIntList[0], inputIntList[1])
}

fun main() {
    val (startHour, startMinute) = inputIntPair()
    val durationMinutes = readln().toInt()

    val totalMinutes = startHour * 60 + startMinute + durationMinutes

    val endHour = (totalMinutes / 60) % 24
    val endMinute = totalMinutes % 60

    println("$endHour $endMinute")
}
