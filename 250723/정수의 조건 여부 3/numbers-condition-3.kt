import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val br = BufferedReader(System.`in`.reader())
    val a = br.readLine().toInt()
    br.close()
    BufferedWriter(System.out.writer()).use {
        it.write(
            when {
                (a % 13 == 0 || a % 19 == 0) -> "True"
                else -> "False"
            }
        )
    }
}