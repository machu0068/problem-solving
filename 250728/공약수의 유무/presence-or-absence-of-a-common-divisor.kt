import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val range = BufferedReader(System.`in`.reader()).use { br ->
        val st = StringTokenizer(br.readLine())
        (st.nextToken().toInt()..st.nextToken().toInt())
    }
    val output = when (range.firstOrNull { 1920 % it == 0 && 2880 % it == 0 } != null) {
        true -> "1"
        false -> "0"
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}