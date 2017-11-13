fun main(args: Array<String>) {
    print("How many euros are you exchanging? ")
    val euro = readLine().toString().toInt();
    print("What is the exchange rate? ")
    val rate = readLine().toString().toDouble();
    val usDollarExchange = 100.0;
    val amountTo = ((euro * rate) / usDollarExchange) * 100
    print("${euro} euros at an exchange rate of ${rate} is ")

    print("${Math.round(amountTo) / 100.0} U.S. dollars. ")
}