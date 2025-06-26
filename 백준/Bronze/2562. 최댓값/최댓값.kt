import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))
    val array = Array(9) { reader.readLine().toInt() }

    writer.write("${array.max()}\n${array.indexOf(array.max()) + 1}\n")

    writer.flush()
    writer.close()
    reader.close()
}
