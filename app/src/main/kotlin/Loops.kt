class Loops {
    // Problem Statement - Ask the user to input a number. This is just to say how many numbers he will then enter in order to calculate the sum
    // if a user enters a String, set a default value to 0, as well as in the next step enter 'continue' so that program ignores.

    fun whileLoop() {
        println("How many numbers you want to enter?")
        val howManyNumbers = readln().toIntOrNull() ?: 0
        var sum: Int = 0
        var initialValue: Int = 0
        while (initialValue < howManyNumbers) {
            println("Enter the ${initialValue + 1} number")
            val inputNumber = readln().toIntOrNull() ?: continue
            sum = sum + inputNumber

            initialValue++
        }
        println("The sum of the numbers entered is $sum")
    }

    fun doWhileLoop(){
        var x:Int = 1
        do {
            println("*".repeat(x))
            x++
        }while ( x <= 5)
    }

    // There are multiple ways to write a for loop in Kotlin

    // METHOD:1 - Iterating over a range.

    fun forLoop(){
        for (i in 1 ..5){
            println(i)
            // this prints the number 1 to 5
            // in function is used to define the range.
        }

    //METHOD:2 using downTo and step
        for(i in 10 downTo 1 step 2){
            println(i)
        }
        // This prints 10, 8, 6, 4, 2

        // METHOD:3 Iterating over an Array or List
        val fruits = listOf<String>("Apple", "Banana", "Cherry")
        for(fruit in fruits){
            println(fruit)
        }

    //METHOD:4  Using indices

    val colors = arrayOf("Red", "Green", "Blue")
        for (i in colors.indices){
            println("Color at index $i is ${colors[i]}")
        }

    //METHOD:5  Using withIndex()

    val animals = listOf<String>("Dog", "Cat", "Elephant")
        for ((index, animal) in animals.withIndex()){
            println("Animal at index $index is $animal")
        }

    //METHOD:6 Looping through a Map

    val studentGrades: Map<String, Int> = mapOf(
        "Kohli" to 92,
        "Rohit" to 91,
        "Jadeja" to 90,
        "Bumrah" to 93
    )
        for((name, grade) in studentGrades){
            println(" $name score $grade")
        }

    println("Enter a String")
        val input  = readln()
        for(character in input){
            println(character)
        }



    }









}