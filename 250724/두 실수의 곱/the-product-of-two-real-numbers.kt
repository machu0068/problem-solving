import java.io.BufferedWriter

fun main() {
    BufferedWriter(System.out.writer()).use {
        val a = 5.26
        val b = 8.27
        it.write(String.format("%.3f", a * b))
    }
}