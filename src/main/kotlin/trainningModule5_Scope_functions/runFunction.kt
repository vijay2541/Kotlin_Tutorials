package trainningModule5_Scope_functions

class Person3{
    var name : String? = "vijay "
    var sirname : String ? = "Sharma"
    var age : Int = 23

}

fun main (args: Array<String>){
    /** Scope function: 'run'
    property 1: refer to context object using 'this'
    property 1: The return value is the 'lambda result'
    'run' is combination of 'with' and 'let'
    if you want to operate on a Nullable object and avoid NullPointerException then use 'run' */

    val person: Person3? = Person3()
    val bio  = person?.run {
        print(this.name)    // its optional to use keyword 'this' when we are using 'with'
        println(this.sirname)
        println(this.age)
        "I have studied all five scope Functions"
    }
    println(bio)
}
