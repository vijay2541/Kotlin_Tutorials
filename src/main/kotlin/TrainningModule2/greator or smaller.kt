package TrainningModule2

import com.sun.jdi.IntegerValue

fun main(args: Array<String>) {
    println("Enter two numbers:")
    val a = Integer.valueOf(readLine())
    val b = Integer.valueOf(readLine())
    println("You entered $a $b")


    if (a>b)
    println("$a is greater than $b")
    else
        println("$a is smaller than $b")

}

