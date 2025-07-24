import java.io.BufferedWriter

fun main() {
    val output = buildString {
        append("Let's go LeebrosCode!")
    }
    BufferedWriter(System.out.writer()).use {
        it.write(output)
    }
}