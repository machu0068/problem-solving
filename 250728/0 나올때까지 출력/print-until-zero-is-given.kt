import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val output = buildString {
        BufferedReader(System.`in`.reader()).use { br ->
            generateSequence { br.readLine() }
                .takeWhile { it != "0" }
                .forEach { appendLine(it) }
        }
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}