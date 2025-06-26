import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))
    val t = reader.readLine().toInt()

    (1..t).forEach { it ->
        val (a, b) = reader.readLine().split(" ").map { it.toInt() }
        writer.write("Case #$it: $a + $b = ${a + b}\n")
    }

    writer.flush()
    writer.close()
    reader.close()
}
