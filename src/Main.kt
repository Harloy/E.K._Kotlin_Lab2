import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Введите число для округления:")
    val numberToRound = scanner.nextInt()
    println("Результат округления: ${roundNumber(numberToRound)}")

    println("\nВведите количество лет:")
    val years = scanner.nextInt()
    println("Результат: ${years} ${getYearEnding(years)}")

    println("Программа завершена!")
}

fun roundNumber(number: Int): String {
    return if (number < 1000) {
        number.toString()
    } else {
        val thousands = number / 1000
        "${thousands}К"
    }
}

fun getYearEnding(years: Int): String {
    val lastDigit = years % 10
    val lastTwoDigits = years % 100

    return when {
        lastTwoDigits in 11..19 -> "лет"
        lastDigit == 1 -> "год"
        lastDigit in 2..4 -> "года"
        else -> "лет"
    }
}