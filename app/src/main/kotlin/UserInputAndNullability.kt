class UserInputAndNullability {
    // Lets see how to write user input
    fun userInput(){

        println("Please Input the number")
        val input = readln().toDoubleOrNull()  // this is similar to double? in dart
        // the input can contain a null value
        println("The number entered is $input")
        println("Result if the input $input is divided by 33 = ${input!! / 33}")
        // !! is similar to !, in Dart
        // which means it could be used on values that may contain a null, but if it contains null value then the program will crash.

        // the other way is to use assignment operator, i.e input input ?? 0, just like in dart

        println("---------------------------------------------------------------")
        println("HEADING: Below input for, if the value is null take 1, try checking for string and null, will give you whether the number is even or false ")

        println("Please input another number")
        val inputAsInteger = readln().toIntOrNull() ?: 1
        val isEven  = inputAsInteger % 2 == 0
        println("is Even: $isEven")

        println("---------------------------------------------------------------")

        println("HEADING: Using ?. which takes a function. Here below I have used inc() which is increment. Try inputting null or string first and then go for 1 or any number")

        // we can also use ?. followed by a function.
        println("Please input another number")
        val inputAnotherInteger = readln().toIntOrNull() ?.inc() // it increments the number by 1 if input is zero
        // there are other functions as well, which you can put inplace of int()

        println("The input number is $inputAnotherInteger")

        println("---------------------------------------------------------------")

        // if and if-else statements is same as in dart
        //TODO: check if this works in dart, but it works in Kotlin. You can assign a value to variable based on if condition

        println("HEADING: Assigning a number based if-else statement and checking the out whether its even or odd")

        println("Enter an input")
        val x = readln().toIntOrNull() ?: 2
        println("The number entered is $x")

        val output = if( x % 2 == 0){
            "The number is even"
        }else {
            "The  number is odd"
        }

        println(output)

        println("---------------------------------------------------------------")

        println("HEADING: There is also another way of using if-else i.e by when ->")

        println("Enter the number")
        val y = readln().toInt()
        val result = when {
            y  % 2 == 0 -> {
                print("This is used if we are writing more than 1 line of code. ")
                "Input is even number"
            }

            y % 2 < 10-> "Input is odd and less than 10"
            else -> "Input is odd and greater and at least 11 or greater. "
        }
        println(result)

        println("---------------------------------------------------------------")

        println("There is also another way of using when statement. just like if you can use when() and also use of in operator and using try catch block")
        println("Enter the number")
        val z = readln()
//        throw Exception("Dude, wtf did you pass there?")
        // code after this will not be executed anymore. It is just to simply catch the exception.
        val input7 = try {
            z.toInt()
        } catch (e: NumberFormatException){
            0
        } finally {
            print("This always gets executed")
        }

        val output3  = when (input7) {
            3 -> "The number is 3"
            in 10  ..  20 -> "The Number is between 10 and 20" // just type in 10 .. 20
            else -> "The number is null or you have entered String"
        }
        println(output3)

        // also I dont always have to assign a value to when expression.

        println("---------------------------------------------------------------")
    }
}