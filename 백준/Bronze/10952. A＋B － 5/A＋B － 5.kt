import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val (a, b) = reader.readLine().split(" ").map { it.toInt() }
        if (a == 0 && b == 0) {
            break
        }
        writer.write("${a + b}\n")
    }

    writer.flush()
    writer.close()
    reader.close()
}
