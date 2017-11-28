fun main(args: Array<String>) {
    var map: MutableMap<String, Double> = HashMap();
    map.put("IN", 0.08)
    map.put("FK", 0.04)
    map.put("RC", 0.05)
    map.put("BC", 0.06)
    pound(map)
    kilogram(map)
}

fun kilogram(map: MutableMap<String, Double>) {
    val a = userInput("total alcohol consumed, in grams.")
    val w = userInput("body weight in kilogram.")
    val h = userInput("number of hours since the last drink.")
    var r = getR()
    val bac = ((a * 28.35) * 5.14 / (w * 0.453592) * r) - .015 * h;
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

private fun pound(map: MutableMap<String, Double>) {
    val a = userInput("total alcohol consumed, in ounces (oz)")
    val w = userInput("body weight in pounds.")
    val h = userInput("number of hours since the last drink.")
    var r = getR()
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

private fun getR(): Double {
    print("gender")
    val g = readLine().toString()
    var r = 0.73;
    if (g.equals("f", true)) {
        r = 0.66;
    }
    return r
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