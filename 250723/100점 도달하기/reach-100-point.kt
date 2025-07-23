import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val br = BufferedReader(System.`in`.reader())
    val n = br.readLine().toInt()
    br.close()
    val result = StringBuilder().apply {
        (n..100).forEach {
            val grade = when (it) {
                in (90..100) -> "A"
                in (80 until 90) -> "B"
                in (70 until 80) -> "C"
                in (60 until 70) -> "D"
                else -> "F"
            }
            append(grade)
            append(" ")
        }
    }.toString()
    BufferedWriter(System.out.writer()).use {
        it.write(result)
    }
}