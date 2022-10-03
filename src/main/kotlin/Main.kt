import java.util.*
import java.text.SimpleDateFormat

// #1
fun avrg(arr: IntArray): Int {

    var sum = 0
    var div = 0
    for (i in 2..arr.size step 2) {
        sum += arr[i]
        div ++
    }
    println("sum of numbers in: $sum")
    println("divider is: $div")

    return sum / div
}
// #2
fun isPalindrome(input : String): Boolean {
    val sb = StringBuilder(input)

    val reverseStr = sb.reverse().toString()

    return input.equals(reverseStr, ignoreCase = true)
}

// #3
fun Date.formatter(): String {
    val pattern = "HH:mm"

    val formatter = SimpleDateFormat(pattern)

    return formatter.format(this)
}

fun main() {

//#1
    println("#1")

    println("average is: ${avrg(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 12))}")

//#2
    println("#2")

    val input = "oto"
    if (isPalindrome(input)) {
        println("$input is a Palindrome")
    } else {
        println("$input is not a Palindrome")
    }

//#3
    println("#3")

    println("Formatted time is: ${(Date()).formatter()}")
}


