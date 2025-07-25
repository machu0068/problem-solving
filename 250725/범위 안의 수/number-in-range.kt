import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val a = BufferedReader(System.`in`.reader()).use {
        it.readLine().toInt()
    }
    BufferedWriter(System.out.writer()).use {
        it.write(
            when (a) {
                in 10..20 -> "yes"
                else -> "no"
            }
        )
    }
}