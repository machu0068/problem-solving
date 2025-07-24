import java.io.BufferedWriter

fun main() {
    BufferedWriter(System.out.writer()).use {
        var a = 1
        var b = 2
        var c = 3
        val sum = a + b + c
        a = sum
        b = sum
        c = sum
        val output = buildString {
            append("$a $b $c")
        }
        it.write(output)
    }
}