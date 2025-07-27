import java.io.BufferedWriter

fun main() {
    val iterator = (10..26 step 2).iterator()
    BufferedWriter(System.out.writer()).use {
        val output = buildString {
            while (iterator.hasNext()) {
                append(iterator.nextInt())
                append(" ")
            }
        }
        it.write(output)
    }
}