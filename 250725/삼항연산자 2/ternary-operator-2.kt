import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val a = BufferedReader(System.`in`.reader()).use {
        it.readLine().toInt()
    }
    val result = if (a == 1) "t" else "f"
    BufferedWriter(System.out.writer()).use {
        it.write(result)
    }
}