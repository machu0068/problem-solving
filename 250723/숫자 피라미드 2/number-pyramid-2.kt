import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use {
        it.readLine().toInt()
    }
    var num = 0
    BufferedWriter(System.out.writer()).use {
        it.write(
            (1..n).joinToString("\n") { i ->
                (1..i).joinToString(" ") {
                    num++
                    "$num"
                }
            }
        )
    }
}