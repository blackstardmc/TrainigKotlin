package FunctionsTesting

fun sayHello(nameOfPerson: String): String {
    return ("Hello " + nameOfPerson)
}

fun calc(number: Int): Int {
    var digit = 2 + number
    return number * digit
}

fun sum(number1: Int, number2: Int): Int {
    return number1 + number2
}

val sumV2: (Int, Int) -> Int = { a, b -> a + b }

val sumV3 = { a: Int, b: Int -> a + b }