import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use {
        it.readLine().toInt()
    }
    val array = Array(n) { Array(n) { 0 } }
    (0 until n).forEach { col ->
        val range = if (col % 2 == 0) 0 until n else (0 until n).reversed()
        range.forEachIndexed { i, row -> array[row][col] = i + 1 }
    }
    BufferedWriter(System.out.writer()).use { bw ->
        bw.write(
            array.joinToString("\n") { it.joinToString("") }
        )
    }
}