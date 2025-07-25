import java.io.BufferedWriter

fun main() {
    val iterator = (10..26).iterator()
    val output = buildString {
        while (iterator.hasNext()) {
            append(iterator.nextInt())
            append(" ")
        }
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}