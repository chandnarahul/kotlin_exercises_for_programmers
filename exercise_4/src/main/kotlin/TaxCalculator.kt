fun main(args: Array<String>) {
    print("What is the order amount?")
    var amount = readLine().toString().toDouble();
    print("What is the state?")
    val state = readLine().toString();
    if (state.equals("WI", true) || state.equals("Wisconsin", true)) {
        println("The subtotal is ${amount}")
        println("The tax is $0.55");
        amount += 0.55;
    }
    println("The total is $${amount}")

}