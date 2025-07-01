import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = reader.readLine().split(" ").map { it.toInt() }

    val matrixA = Array(n) {
        reader.readLine().split(" ").map { it.toInt() }.toIntArray()
    }
    val matrixB = Array(n) {
        reader.readLine().split(" ").map { it.toInt() }.toIntArray()
    }

    val resultMatrix = Array(n) { row ->
        IntArray(m) { col ->
            matrixA[row][col] + matrixB[row][col]
        }
    }

    resultMatrix.forEach { rowArray ->
        writer.write(rowArray.joinToString(" ") + "\n")
    }

    writer.flush()
    writer.close()
    reader.close()
}
