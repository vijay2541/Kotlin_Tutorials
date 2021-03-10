package TrainningModule3_star_patterns

fun main(args : Array<String>)
{
    println("Enter how many rows you want to print")
   var n = Integer.valueOf(readLine())
   var k = n*2-1
   println ("Number of rows is = $n and number of columns is = $k")
        for(i in 1..n) {
        var b : Boolean = true
        for (j in 1..k) {
            if (j >= n + 1 - i && j <= i + n-1  && b)
            {
                print("*")
                b = false
            }
            else
            {print(" ")
            b = true}
        }
        println("")
    }
}


// sample input:
//Enter how many rows you want to print
//8

//  sample output
//Number of rows is = 8 and number of columns is = 15
//       *
//      * *
//     * * *
//    * * * *
//   * * * * *
//  * * * * * *
// * * * * * * *
//* * * * * * * *