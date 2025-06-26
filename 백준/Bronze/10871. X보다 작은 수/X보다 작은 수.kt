import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val (n, x) = reader.readLine().split(" ").map { it.toInt() }

    val st = StringTokenizer(reader.readLine())

    val array = Array(n) { st.nextToken().toInt() }

    val resultString = array.filter { it < x }.joinToString(" ")

    writer.write(resultString)

    writer.flush()
    writer.close()
    reader.close()
}
