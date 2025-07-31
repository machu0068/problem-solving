import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    BufferedWriter(System.out.writer()).use { br ->
        val output = generateSequence(n) { it + n }
            .runningFold(0 to mutableListOf<Int>()) { acc, value ->
                val count = if (value % 5 == 0) acc.first + 1 else acc.first
                acc.second.add(value)
                count to acc.second
            }
            .first { it.first == 2 }
            .second
            .joinToString(" ")
        br.write(output)
    }
}