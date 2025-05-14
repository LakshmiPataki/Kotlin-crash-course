public final class Operators {

    fun arithmeticOperators(){
        val x:Int = 13
        val y = 6
        val addition = x + y
        println("addition: $addition")

        val subtraction  = x - y
        println("Subtraction: $subtraction")

        val multiplication = x * y
        println("multiplication: $multiplication")

        val division = x / y // data type doesn't change here. if its Int it is Int.
        println("Division: $division")

        val modulo = x % y
        println("Modulo: $modulo")

    }

    fun comparisonOperators(){
        val x:Int = 11
        val y:Int = 12
        println("Is x an even number? ${x % 2 == 0}")

    }

    fun logicalOperators(){
        val x:Int = 12
        val y:Int = 12
        val isNumberEven:Boolean = x % 2 ==0 && y%2 ==0 || x + y == 24
        println("Is the number Even? $isNumberEven")

        // just like in BODMAS rule, && operator prioritze over || operator.

    }

}