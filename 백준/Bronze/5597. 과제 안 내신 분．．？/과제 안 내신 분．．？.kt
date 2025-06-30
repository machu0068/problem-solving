import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val array = Array(31) { 1 }

    repeat(28) {
        val i = reader.readLine().toInt()
        array[i] = 0
    }

    val missingNumbers = (1..30)
        .filter { i -> array[i] == 1 }
        .joinToString("\n")

    writer.write("$missingNumbers\n")

    writer.flush()
    writer.close()
    reader.close()
}
