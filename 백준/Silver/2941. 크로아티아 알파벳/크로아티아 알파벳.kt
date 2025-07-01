import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val s = reader.readLine()
    var croatian = 0
    (0..s.length - 2).forEach { i ->
        when (s.substring(i..i + 1)) {
            "c=", "c-", "d-", "lj", "nj", "s=", "z=" -> croatian++
            else -> {}
        }
    }
    (0..s.length - 3).forEach { i ->
        when (s.substring(i..i + 2)) {
            "dz=" -> croatian++
            else -> {}
        }
    }
    val result = s.length - croatian

    writer.write("$result")

    writer.flush()
    writer.close()
    reader.close()
}
