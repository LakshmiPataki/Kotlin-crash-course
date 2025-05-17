class Collections {
    fun array(){
        val numbers: IntArray = intArrayOf(1,2,45,33,65,2,5)
        val numbers2 = booleanArrayOf(true, false, true, false)
        val numbers3: FloatArray = floatArrayOf(4f,5f,66f)
        val numbers4  = doubleArrayOf(44.0,66.0,77.0)

        //Todo - take an user input, consider it as an index and print its relevant number. If number doesn't exist print that as well.

        numbers[0] = 99

        println("Enter the number which finds you the element At in an array")

        try {

            val inputNumber = readln()
            val inputAsInteger = inputNumber.toIntOrNull()
            if(inputAsInteger != null && inputAsInteger in 0 .. numbers.size){
                println(" The number from numbers of IntArray for the $inputAsInteger is ${numbers[inputAsInteger]}")
            }else {
                println("The number doesn't exist.")
            }
        } catch (e: NumberFormatException){
            "This is not a valid input"
//            println(e.toString())
        }

        //Todo  Check the difference between Lists and array in kotlin, what it is for java and dart

    }

    fun emptyArray() {
        //  If I want to enter an empty array I can use this
        val emptyArray = intArrayOf(3, 4, 5, 6) + 5 + 5
        println(emptyArray.contentToString())
        // the result is misleading. Arrays are immutable, it is fixed. In result although you can [3,4,5,6,5,5]
        // behind the scenes it has created three new arrays. but you can change the values of elements at specific indices

        emptyArray[1] = 99
        println(emptyArray.contentToString())

        // Arrays in kotlin are fixed size, but you can create new arrays by using +, which does not mutate  the original array - it returns new one.

        // in order to add or remove you've got to use List. There are two types of list List<T> readOnlyList = listOf(1,2,3)
        // and there are mutable lists as well

        val readOnlyList = listOf<Int>(1, 2, 3, 4) // immutable list
        val mutableList = mutableListOf<Int>(1, 2, 3, 4)
        mutableList.add(5)
        mutableList.add(6)
        mutableList.remove(6)

        println("Printing the mutableList $mutableList")
    }

        //Below is the way to create Maps in Kotlin

        fun emptyMap(){
            val emptyMap = mutableMapOf<String,Int>()
            emptyMap["India"] = 91
            println("Creating and adding elements to empty map -> $emptyMap")

        }

        fun immutableMap(){
            val immutableMap = mapOf<String, String>(
                "India" to "In",
                "United States" to "US",
                "Germany" to "DE",
            )

            println("An Example of immutable Map containing String to String $immutableMap")

            // another example

            val countryCodes = mapOf<String,Int>(
                "India" to 91,
                "Afghanistan" to 93 ,
                "Albania" to 91,
            )
//            countryCodes["Argentina"] = 54 - We cannot do this to immutable map

            println("Another example of Immutable Map containing String to Int $countryCodes")

        }

        fun mutableMap() {
            val countryCodes = mutableMapOf(
                "India" to 91,
                "Afghanistan" to 93,
                "Albania" to 91
            )
            countryCodes["Argentina"] = 54
            countryCodes.remove("Albania")

            println("This is an example of mutableMap $countryCodes")
            println("I am printing only keys ${countryCodes.keys}")
            println("I am printing only values ${countryCodes.values}")


        }

    fun immutableSets(){
        val immutableSets = setOf<Int>(1,2,3,4,5,6,7,8,8) // although it has repeated number. It doesn't get executed just because it is a set.
        println("printing the immutable sets $immutableSets")

        // you can also write this is as val immutableSets : Set<Int> = setOf(1,2,3,4,5,6,7,8)
    }

    fun mutableSets(){
        val mutableSet: MutableSet<Int> = mutableSetOf(1,2,3,4,5,6,7,8,9)
        mutableSet.add(10)
        mutableSet.remove(5)
        println("Printing the mutable set $mutableSet")
    }

    }


