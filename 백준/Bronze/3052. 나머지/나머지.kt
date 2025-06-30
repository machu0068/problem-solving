import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val array = Array(10) { reader.readLine().toInt() % 42 }
    array.toSet().size

    writer.write("${array.toSet().size}")

    writer.flush()
    writer.close()
    reader.close()
}
