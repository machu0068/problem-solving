import java.io.BufferedWriter

fun main() {
    val (weight, ratio) = Pair(13, 0.165)
    BufferedWriter(System.out.writer()).use {
        it.write(("$weight * ${String.format("%.6f", ratio)} = ${String.format("%.6f", weight * ratio)}"))
    }
}