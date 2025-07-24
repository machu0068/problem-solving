import java.io.BufferedWriter

fun main() {
    val output = buildString {
        append("3 5")
    }
    BufferedWriter(System.out.writer()).use {
        it.write(output)
    }
}