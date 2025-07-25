import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val a = BufferedReader(System.`in`.reader()).use {
        it.readLine().toInt()
    }
    BufferedWriter(System.out.writer()).use {
        when {
            a == 5 -> it.write("A")
            a % 2 == 0 -> it.write("B")
            else -> {}
        }
    }
}