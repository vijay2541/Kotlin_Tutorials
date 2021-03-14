package trainningModule5_Scope_functions

fun main(args: Array<String>)
{
    /** Scope function: 'let'
    property 1: refer to context object using 'it'
    property 1: The return value is the 'lambda result'*/

    val name : String? = "vijay sharma"

    val stringlength = name?.let {
        println(it.capitalize())
        println(it.decapitalize())
        println(it.reversed())
        it.length
    }
    println(stringlength)
}

