import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        val gender = br.readLine()
        val age = br.readLine().toInt()
        BufferedWriter(System.out.writer()).use {
            it.write(
                when (gender) {
                    "0" -> when {
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
}