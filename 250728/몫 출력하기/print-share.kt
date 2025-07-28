import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val output = BufferedReader(System.`in`.reader()).use { br ->
        generateSequence { br.readLine().toInt() }
            .filter { it % 2 == 0 }
            .take(3)
            .map { it / 2 }
            .joinToString("\n")
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}