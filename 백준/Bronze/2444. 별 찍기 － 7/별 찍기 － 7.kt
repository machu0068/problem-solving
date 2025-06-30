import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = reader.readLine().toInt()

    for (i in 1..n) {
        for (j in 0..n - i - 1) {
            writer.write(" ")
        }
        for (k in 1..2 * i - 1) {
            writer.write("*")
        }
        writer.write("\n")
    }
    for (i in 1..n - 1) {
        for (j in 1..i) {
            writer.write(" ")
        }
        for (k in 1..2 * (n - i) - 1) {
            writer.write("*")
        }
        writer.write("\n")
    }

    writer.flush()
    writer.close()
    reader.close()
}