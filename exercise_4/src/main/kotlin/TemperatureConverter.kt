fun main(args: Array<String>) {
    description();
    print("Your choice:");
    val inp = readLine().toString();
    if (inp.equals("c", true)) {
        inputDesc("Fahrenheit")
        outputDesc("Celsius", (userInput() - 32) * 5 / 9);
    } else if (inp.equals("f", true)) {
        inputDesc("Celsius")
        outputDesc("Fahrenheit", (userInput() * 9 / 5) + 32);
    }
}

fun description() {
    println("Press C to convert from Fahrenheit to Celsius.")
    println("Press F to convert from Celsius to Fahrenheit.")
}

fun inputDesc(inp: String) {
    print("Please enter the temperature in ${inp}:")
}

fun outputDesc(type: String, temp: Int) {
    println("The temperature in ${type} is ${temp}.")
}

private fun userInput(): Int {
    var run = true;
    var input = 0;
    while (run) {
        try {
            input = readLine().toString().toInt();
            if (input < 0) {
                throw Exception("");
            } else {
                break;
            }
        } catch (e: Exception) {
            println("enter a valid numeric input.");
        }
    }
    return input;
}