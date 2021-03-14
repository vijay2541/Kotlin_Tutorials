package trainningModule5_Scope_functions

class Person{
    var name : String? = "vijay "
    var sirname : String ? = "Sharma"
    var age : Int = 23

}

fun main (args: Array<String>){
    /** Scope function: 'with'
        property 1: refer to context object using 'this'
        property 1: The return value is the 'lambda result'*/

    val person =Person()
    val ageafterfiveyears: Int = with (person) {
        print(this.name)    // its optional to use keyword 'this' when we are using 'with'
        println(this.sirname)
        println(this.age)
        age + 5
    }
    println("Age after five years is $ageafterfiveyears")
}
