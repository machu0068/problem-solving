import java.io.BufferedWriter

fun main() {
    BufferedWriter(System.out.writer()).use {
        val weight = 13
        val ratio = 0.165
        it.write(
            "$weight * ${String.format("%.6f", ratio)} = ${String.format("%.6f", weight * ratio)}"
        )
    }
}