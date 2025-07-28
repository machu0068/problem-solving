import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val output = buildString {
        BufferedReader(System.`in`.reader()).use { br ->
            generateSequence { br.readLine().toInt() }
                .any { num ->
                    appendLine(
                        when {
                            num < 25 -> "Higher"
                            num > 25 -> "Lower"
                            else -> "Good"
                        }
                    )
                    num == 25
                }
        }
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}