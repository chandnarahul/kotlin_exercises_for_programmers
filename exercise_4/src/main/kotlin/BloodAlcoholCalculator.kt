fun main(args: Array<String>) {
    var map: MutableMap<String, Double> = HashMap();
    map.put("IN", 0.08)
    map.put("FK", 0.04)
    map.put("RC", 0.05)
    map.put("BC", 0.06)
    val a = userInput("total alcohol consumed, in ounces (oz)")
    val w = userInput("body weight in pounds.")
    val h = userInput("number of hours since the last drink.")
    print("gender")
    val g = readLine().toString()
    var r = 0.73;
    if (g.equals("f", true)) {
        r = 0.66;
    }
    val bac = (a * 5.14 / w * r) - .015 * h;
    println("Your BAC is ${Math.round(bac * 100) / 100.0}")

    for (entry in map) {
        if (bac <= entry.value) {
            println("You can legally drive in ${entry.key}");
        }
    }
    if (bac >= 0.08) {
        println("It is not legal for you to drive.")
    }
}

private fun userInput(msg: String): Double {
    var run = true;
    var input: Double = 0.0;
    while (run) {
        try {
            print(msg)
            input = readLine().toString().toDouble();
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