package TrainningModule3_star_patterns

fun main(args : Array<String>)
{
    for (i in 1..4) {
        for (j in 1..7) {
            if (j <= 3 + i && j >= 5 - i){
                print("*")}
            else {
                print(" ")
            }

        }
        println("")
    }
}
// sample output:
//   *
//  ***
// *****
//*******