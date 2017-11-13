fun main(args: Array<String>) {
    print("Enter the price of item 1: ")
    val one = readLine().toString().toInt();
    print("Enter the quantity of item 1: ")
    val oneq = readLine().toString().toInt();

    print("Enter the price of item 2: ")
    val two = readLine().toString().toInt();

    print("Enter the quantity of item 2: ")
    val twoq = readLine().toString().toInt();

    print("Enter the price of item 3: ")
    val three = readLine().toString().toInt();

    print("Enter the quantity of item 3: ")
    val threeq = readLine().toString().toInt();
    val subTotal: Double = ((one * oneq) + (two * twoq) + (three * threeq)).toDouble();

    val tax = 5.5 * (subTotal / 100)

    val total = subTotal + tax;

    println("Subtotal: $${subTotal}")
    println("Tax: $${tax}")
    println("Total: $${total}")
}