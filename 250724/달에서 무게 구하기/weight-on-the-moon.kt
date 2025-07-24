import java.io.BufferedWriter

fun main() {
    BufferedWriter(System.out.writer()).use {
        val weight = 13
        val ratio = 0.165
        val output = buildString {
            append("%d * %.6f = %.6f".format(weight, ratio, weight * ratio))
        }
        it.write(output)
    }
}