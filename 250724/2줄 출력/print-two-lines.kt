import java.io.BufferedWriter

fun main() {
    val output = buildString {
        appendLine("Hello")
        append("World")
    }
    BufferedWriter(System.out.writer()).use {
        it.write(output)
    }
}