fun main(args: Array<String>) {
    print("What is your age?")
    var age = readLine().toString().toInt();
    println(if (age <= 15) "You are not old enough to legally drive." else "You are old enough to legally drive.")
}