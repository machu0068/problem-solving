import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        BufferedWriter(System.out.writer()).use { bw ->
            val result = mutableListOf<String>()
            while (true) {
                val num = br.readLine().toInt()
                val item = when {
                    num < 25 -> "Higher"
                    num > 25 -> "Lower"
                    else -> "Good"
                }
                result.add(item)
                if (num == 25) {
                    break
                }
            }
            bw.write(result.joinToString("\n"))
        }
    }
}