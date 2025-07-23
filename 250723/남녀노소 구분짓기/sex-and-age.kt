import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val br = BufferedReader(System.`in`.reader())
    val (gender, age) = Pair(
        br.readLine().toInt(),
        br.readLine().toInt()
    )
    BufferedWriter(System.out.writer()).use {
        it.write(
            when (gender) {
                0 -> when {
                    age >= 19 -> "MAN"
                    else -> "BOY"
                }

                else -> when {
                    age >= 19 -> "WOMAN"
                    else -> "GIRL"
                }
            }
        )
    }
}