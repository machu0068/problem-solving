import java.io.BufferedWriter

fun main() {
    val output = buildString {
        (1..19).forEach { dan ->
            (1..19).forEach { i ->
                append("$dan * $i = ${dan * i}")
                append(
                    when {
                        i == 19 || i % 2 == 0 -> "\n"
                        else -> " / "
                    }
                )
            }
        }
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}