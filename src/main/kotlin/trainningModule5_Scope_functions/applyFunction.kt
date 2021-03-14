package trainningModule5_Scope_functions

class Person2()
{
    var name: String =""
    var age : Int = 0
}

fun main(args:Array<String>) {
    /** Scope function: 'apply'
    property 1: refer to context object using 'this'
    property 1: The return value is the 'context object'*/

    val person = Person2().apply {
        name = "Vijay Sharma"
        age = 23
    }
    with(person) {
        println(name)
        println(age)
    }
    person.also {
        it.age = 28
        println("age after five years is ${it.age}")
    }
}