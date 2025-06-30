import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val s = reader.readLine()
        if (s.isNullOrEmpty()) {
            break
        }
        if (s.isBlank()) {
            break
        }
        writer.write("$s\n")
    }

    writer.flush()
    writer.close()
    reader.close()
}
