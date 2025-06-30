import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val s = reader.readLine().uppercase().toCharArray()
    val array = Array(91) { 0 }
    s.forEach { it -> array[it.code]++ }
    val result = if (array.filter { it == array.max() }.size != 1) {
        '?'
    } else {
        array.indexOf(array.max()).toChar()
    }
    writer.write("$result")

    writer.flush()
    writer.close()
    reader.close()
}
