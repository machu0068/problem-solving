import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val temperature = BufferedReader(System.`in`.reader()).use {
        it.readLine().toInt()
    }
    val result = when (temperature) {
        in (100..200) -> "vapor"
        in (0 until 100) -> "water"
        else -> "ice"
    }
    BufferedWriter(System.out.writer()).use {
        it.write(result)
    }
}