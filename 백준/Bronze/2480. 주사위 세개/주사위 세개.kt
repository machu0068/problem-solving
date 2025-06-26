fun inputIntTripleSorted(): Triple<Int, Int, Int> {
    val inputIntList = readln()
        .split(" ")
        .map { it.toInt() }
        .sorted()
    return Triple(inputIntList[0], inputIntList[1], inputIntList[2])
}

fun main() {
    val (dice1, dice2, dice3) = inputIntTripleSorted()
    println(
        when {
            dice1 == dice2 && dice1 == dice3 -> 10000 + dice1 * 1000
            dice1 == dice2 || dice2 == dice3 -> 1000 + dice2 * 100
            else -> dice3 * 100
        }
    )
}
