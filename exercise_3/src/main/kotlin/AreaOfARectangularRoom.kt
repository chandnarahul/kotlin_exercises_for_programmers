fun main(args: Array<String>) {
    print("What is the length of the room in feet? ")
    val length = readLine().toString().toInt();
    print("What is the width of the room in feet? ")
    val width = readLine().toString().toInt();

    println("You entered dimensions of ${length} feet by ${width} feet.")

    val const = 0.09290304

    val squareFeet = length * width;
    val squareMeters = squareFeet * const

    println("The area is")
    println("${squareFeet} square feet");
    println("${squareMeters} square meters")
}