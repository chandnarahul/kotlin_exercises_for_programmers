fun main(args: Array<String>) {
    print(" Enter the principal: ")
    val principal = readLine().toString().toInt();
    print("Enter the rate of interest: ")
    val rate = readLine().toString().toDouble();
    print("Enter the number of years: ")
    val years = readLine().toString().toInt();
    print("number of times the interest is compounded per year ")
    val number = readLine().toString().toDouble();

    val a = (principal * Math.pow(1 + ((rate / 100) / number), (number * years).toDouble())) * 100;
    print("$${principal} invested at ${rate}% for ${years} years compounded ${number} times per year is $${Math.round(a) / 100.0}. ")
}