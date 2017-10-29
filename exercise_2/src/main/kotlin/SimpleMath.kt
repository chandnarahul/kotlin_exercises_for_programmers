fun main(args: Array<String>) {
    print("What is the first number? ")
    val inp1 = readLine().toString().toInt();
    print("What is the second number? ")
    val inp2 = readLine().toString().toInt();
    println("${inp1} + ${inp2} = ${inp1 + inp2}")
    println("${inp1} - ${inp2} = ${inp1 - inp2}")
    println("${inp1} * ${inp2} = ${inp1 * inp2}")
    println("${inp1} / ${inp2} = ${inp1 / inp2}")
}