package trainningModule5_Scope_functions

fun main (args:Array<String>) {
    /** Scope function: 'also'
    property 1: refer to context object using 'it'
    property 1: The return value is the 'context object'*/


    val numberList: MutableList<Int> = mutableListOf(1, 2, 3, 5)
    println("Elements in the list are $numberList")
    val duplicateList = numberList.also {
        it.add(4)
        println("Updated number list after add $it")
        it.remove(5)
        println("Updated number list after remove $it \n")
    }
    println("Original list is: $numberList")
    println("duplicate list is: $duplicateList")
}
