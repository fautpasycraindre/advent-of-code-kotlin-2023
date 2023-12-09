fun main() {
    fun part1(input: List<String>): Int {
        var counter = 0
        val digits = input.map { it.filter { it.isDigit() } }
        digits.println()
        for (digit in digits) {
            if (digit.length == 2)
                counter += digit.toInt()
            if (digit.length > 2)
                counter += (digit[0].toString() + digit[digit.length - 1].toString()).toInt()
            if (digit.length == 1)
                counter += (digit + digit).toInt()
        }
        counter.println()
        return counter
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 142)


    val input = readInput("Day01")
    part1(input).println()
    part2(input).println()
}
