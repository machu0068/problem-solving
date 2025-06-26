import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))
    val t = reader.readLine().toInt()

    repeat(t) { i ->
        writer.write("${"*".repeat(i + 1)}\n")
    }

    writer.flush()
    writer.close()
    reader.close()
}
