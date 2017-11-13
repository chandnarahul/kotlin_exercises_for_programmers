fun main(args: Array<String>) {
    print("What is the length of the room in feet? ")
    val length = readLine().toString().toInt();
    print("What is the width of the room in feet? ")
    val width = readLine().toString().toInt();

    val squareFeet = length * width;

    var gallon = (squareFeet / 350);
    if (squareFeet % 350 != 0) {
        gallon++;
    }

    println("You will need to purchase ${gallon} gallons of")
    println("paint to cover ${squareFeet} square feet.")
}