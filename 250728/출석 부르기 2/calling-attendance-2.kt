import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val output = buildString {
        BufferedReader(System.`in`.reader()).use { br ->
            generateSequence { br.readLine().toInt() }
                .any {
                    appendLine(
                        when (it) {
                            1 -> "John"
                            2 -> "Tom"
                            3 -> "Paul"
                            4 -> "Sam"
                            else -> "Vacancy"
                        }
                    )
                    it > 4
                }
        }
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}