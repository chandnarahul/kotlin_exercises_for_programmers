fun main(args: Array<String>) {
    print("What is the order amount?")
    var amount = readLine().toString().toDouble();
    print("What is the state?")
    val state = readLine().toString();

    val isWisconsin = state.equals("WI", true) || state.equals("Wisconsin", true)
    var op: String = ""
    if (isWisconsin) {
        op = "The subtotal is ${amount} \nThe tax is $0.55\n"
        amount += 0.55;
    }
    op += "The total is $${amount}"
    println(op)
}