import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val plain = Array(100) { Array(100) { 0 } }
    val n = reader.readLine().toInt()
    repeat(n) {
        val (x, y) = reader.readLine().split(" ").map { it.toInt() }
        (x..x + 9).forEach { row ->
            (y..y + 9).forEach { col ->
                if (plain[row][col] == 0) {
                    plain[row][col] = 1
                }
            }
        }
    }

    val sum = plain.sumOf { it.sum() }
    writer.write("$sum")

    writer.flush()
    writer.close()
    reader.close()
}
