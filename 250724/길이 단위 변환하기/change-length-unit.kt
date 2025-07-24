import java.io.BufferedWriter

fun main() {
    BufferedWriter(System.out.writer()).use {
        val a = 9.2
        val b = 1.3
        val ft = 30.48
        val mi = 160934
        val output = buildString {
            appendLine("%.1fft = %.1fcm".format(a, a * ft))
            appendLine("%.1fmi = %.1fcm".format(b, b * mi))
        }
        it.write(output)
    }
}