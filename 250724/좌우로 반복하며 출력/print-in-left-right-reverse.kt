import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use {
        it.readLine().toInt()
    }
    val array = Array(n) { row ->
        val range = if (row % 2 == 0) 1..n else n downTo 1
        range.toList().toTypedArray()
    }
    BufferedWriter(System.out.writer()).use {
        array.forEach { row ->
            it.write(row.joinToString(""))
            it.newLine()
        }
    }
}