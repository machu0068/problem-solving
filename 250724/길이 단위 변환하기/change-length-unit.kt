import java.io.BufferedWriter

fun main() {
    BufferedWriter(System.out.writer()).use {
        val ft = 30.48
        val mi = 160934
        val output = buildString {
            appendLine("9.2ft = %.1fcm".format(9.2 * ft))
            appendLine("1.3mi = %.1fcm".format(1.3 * mi))
        }
        it.write(output)
    }
}