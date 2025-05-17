fun main(){ // in dart void main() {}
    val x = 5 // this is a way of creating a var, in dart we use var x = 5;

    /// there is also var in kotlin. The difference between val and var is mentioned below.

    println("Hello World")
    // println is similar to java. That is printing in new line.

    val y:Int = 6 // in dart, int y = 6;

    /// Other than Int, the other data type obviously available is Float and Double and the difference
    /// between is storage in memory Float is 32 bits where as Double is 64 bits.

    val z:Float = 6.34f
    val a:Double = 5.5

    val b:Boolean = true // this is boolean
    val c:String = "abc" // this is String
    /// if I want to change the value of c from "abc" to "xyz" then I cannot do it with val, instead,
    /// I should do it with var. Below is the example of both val and var

    //    c = "xyz" i get an error val cannot be re-assigned.
    var d:String = "abc"
    d = "xyz" // this works, but see you cannot change data type of the variable. if its string it has to be string.

    /// lets talk about all of the operators.
    val operator = Operators()
//    operator.arithmeticOperators()
//    operator.comparisonOperators()
//    operator.logicalOperators()

//    val userInputAndNullability = UserInputAndNullability()
//    userInputAndNullability.userInput()

//    val collection = Collections()
//    collection.array()
//    collection.emptyArray()
//    collection.mutableMap()
//    collection.immutableSets()

    val loops = Loops()
//    loops.whileLoop()
//    loops.doWhileLoop()
    loops.forLoop()









}