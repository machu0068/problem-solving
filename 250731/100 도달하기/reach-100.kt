import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    BufferedWriter(System.out.writer()).use { bw ->
        val sequence = generateSequence(1 to n) { it.second to it.first + it.second }
            .takeWhile { it.first <= 100 }
            .map { it.second }
            .toMutableList()
        sequence.add(0, 1)
        val output = sequence.joinToString(" ")
        bw.write(output)
    }

}