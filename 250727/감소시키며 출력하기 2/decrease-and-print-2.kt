import java.io.BufferedWriter

fun main() {
    val iterator = (26 downTo 10).iterator()
    val output = buildString {
        while (iterator.hasNext()) {
            append(iterator.nextInt())
            append(" ")
        }
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}