fun main(args: Array<String>) {
    var run = true;
    var age = 0;
    var map: MutableMap<String, Int> = HashMap();
    map.put("IN", 18)
    map.put("FK", 16)
    map.put("RC", 12)
    map.put("BC", 10)
    while (run) {
        try {
            print("What is your age?")
            age = readLine().toString().toInt();
            if (age < 0) {
                throw Exception("");
            } else {
                break;
            }
        } catch (e: Exception) {
            println("enter a valid age.");
        }
    }
    for (entry in map) {
        if (entry.value <= age) {
            println("You can legally drive in ${entry.key}");
        }
    }
}