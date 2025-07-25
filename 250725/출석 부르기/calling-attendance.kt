import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val num = BufferedReader(System.`in`.reader()).use {
        it.readLine().toInt()
    }
    BufferedWriter(System.out.writer()).use {
        it.write(
            when (num) {
                1 -> "John"
                2 -> "Tom"
                3 -> "Paul"
                else -> "Vacancy"
            }
        )
    }
}