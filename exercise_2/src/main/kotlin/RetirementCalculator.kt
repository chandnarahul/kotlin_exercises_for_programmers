import java.time.LocalDateTime

fun main(args: Array<String>) {
    print("What is your current age? ")
    val inp1 = readLine().toString().toInt();
    print("At what age would you like to retire? ")
    val inp2 = readLine().toString().toInt();
    println("You have ${inp2 - inp1} years left until you can retire.")
    val year = LocalDateTime.now()
    println("It's ${year.year}, so you can retire in ${year.year + (inp2 - inp1)}.")
}