import java.io.BufferedWriter

fun main() {
    val a = 26
    val b = 5
    val output = buildString {
        append("$a * $b = ${a * b}")
    }
    BufferedWriter(System.out.writer()).use {
        it.write(output)
    }
}