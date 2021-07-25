package traintest

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets: ")
   var tickets = scanner.nextInt()
    print("How many round-trip tickets: ")
    var Round = scanner.nextInt()
    val final = Count(tickets,Round);

    final.print()

}


class Count(var tickets:Int,var Round:Int){

    var total = (tickets-Round)*1000+(Round*2000)*0.9


    fun print(){

        println("Total tickets: " + tickets)
        println("Round-trip: " + Round)
        println("Total: : " + total.toInt())







    }





}