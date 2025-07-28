import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val output = buildString {
        val result = BufferedReader(System.`in`.reader()).use { br ->
            generateSequence { br.readLine().toInt() }
                .takeWhile { 20 <= it && it < 30 }
                .average()
        }
        append("%.2f".format(result))
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}