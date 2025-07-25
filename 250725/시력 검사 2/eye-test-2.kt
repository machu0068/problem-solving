fun main() {
    val avg = System.`in`.bufferedReader().readLine().toDouble()
    val result = when {
        1.0 <= avg -> "High"
        avg < 0.5 -> "Low"
        else -> "Middle"
    }
    System.out.bufferedWriter().use { it.write(result) }
}
