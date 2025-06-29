import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = reader.readLine().split(" ").map { it.toInt() }
    val array = Array(n) { 0 }

    repeat(m) {
        val (i, j, k) = reader.readLine().split(" ").map { it.toInt() }
        (i..j).forEach { index -> array[index - 1] = k }
    }

    writer.write(array.joinToString(" "))

    writer.flush()
    writer.close()
    reader.close()
}
