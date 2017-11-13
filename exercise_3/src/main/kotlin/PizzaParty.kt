fun main(args: Array<String>) {
    print("How many people? ")
    val people = readLine().toString().toInt();
    print("How many pizzas do you have? ")
    val pizza = readLine().toString().toInt();
    print("Number of slices per pizza? ")
    val pizzaSlices = readLine().toString().toInt();

    println("${people} people with ${pizza} pizzas")
    println("Each person gets ${(pizza * pizzaSlices) / people} pieces of pizza.")
    println("There are ${(pizza * 8) % people} leftover pieces.")
}