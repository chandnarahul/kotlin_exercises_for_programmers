fun main(args: Array<String>) {
    print(" Enter the principal: ")
    val principal = readLine().toString().toInt();
    print("Enter the rate of interest: ")
    val interest = readLine().toString().toDouble();
    print("Enter the number of years: ")
    val years = readLine().toString().toInt();

    val a = principal * (1 + ((interest / 100) * years))
    print("After ${years} years at ${interest}%, the investment will be worth $${a.toInt()}. ")
}