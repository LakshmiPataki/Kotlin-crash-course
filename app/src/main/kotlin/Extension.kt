
fun split(inputString: String, delimiter: Char) : List<String> {
    val result = mutableListOf<String>()
    var current = StringBuilder()

    for(char in inputString){
        if(char == delimiter){
            result.add(current.toString())
            current = StringBuilder()

        } else {
            current.append(char)
        }
    }
    result.add(current.toString())
    return result
}