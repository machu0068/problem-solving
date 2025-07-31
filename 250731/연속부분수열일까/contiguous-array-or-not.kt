import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        val (_, b) = br.readLine().split(" ").map { it.toInt() }
        val arrayA = br.readLine().split(" ").map { it.toInt() }
        val arrayB = br.readLine().split(" ").map { it.toInt() }
        val result = arrayA
            .windowed(b, 1)
            .any { it == arrayB }
        val output = if (result) "Yes" else "No"
        BufferedWriter(System.out.writer()).use { it.write(output) }
    }
}