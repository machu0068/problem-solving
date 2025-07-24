import java.io.BufferedWriter

fun main() {
    val output = buildString {
        appendLine("Hello students!")
        append("Welcome to LeebrosCode!")
    }
    BufferedWriter(System.out.writer()).use {
        it.write(output)
    }
}