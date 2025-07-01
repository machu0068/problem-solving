import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val matrix = Array(9) {
        reader.readLine().split(" ").map { it.toInt() }.toIntArray()
    }

    var (max, rowOfMax, colOfMax) = arrayOf(matrix[0][0], 0, 0)

    matrix.forEachIndexed { rowIndex, row ->
        row.forEachIndexed { colIndex, value ->
            if (value > max) {
                max = value
                rowOfMax = rowIndex
                colOfMax = colIndex
            }
        }
    }

    writer.write("$max\n")
    writer.write("${rowOfMax + 1} ${colOfMax + 1}")

    writer.flush()
    writer.close()
    reader.close()
}
