import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val standard = listOf(1, 1, 2, 2, 2, 8)
    val list = reader.readLine().split(" ").map { it.toInt() }
    val result = Array(6) { 0 }
    (0..5).forEach { i ->
        result[i] = standard[i] - list[i]
    }

    writer.write(result.joinToString(" "))

    writer.flush()
    writer.close()
    reader.close()
}
