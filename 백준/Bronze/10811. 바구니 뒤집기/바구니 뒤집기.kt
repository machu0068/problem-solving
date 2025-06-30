import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = reader.readLine().split(" ").map { it.toInt() }

    val array = Array(n) { it + 1 }

    repeat(m) {
        val (i, j) = reader.readLine().split(" ").map { it.toInt() }
        array.reverse(i - 1, j)
    }

    writer.write(array.joinToString(" "))

    writer.flush()
    writer.close()
    reader.close()
}
