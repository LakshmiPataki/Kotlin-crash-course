

fun reverseString(reverseString: String = "Hello World"
) : String {
    val finalString = buildString {
        for (i in reverseString.lastIndex downTo 0){
            append(reverseString[i]);
        }
    }
    return finalString

}

// fun main(){} -> This is a normal function

// fun reverseString(name:String){} -> Function with parameters

// fun reverseString(name:String) : String {} - Function with return type

// fun reverseString(name : String = "Anantha") {} - function with default parameter value

// Inorder to use named parameter you just have to do just like positional parameters, but when calling the function, use like below

// val result = reverseString(name = "Anantha")



