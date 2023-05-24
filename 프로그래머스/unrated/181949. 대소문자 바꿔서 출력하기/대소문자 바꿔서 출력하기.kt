fun main(args: Array<String>) {
    val s1 = readLine()!!


    val s2 = s1.map {
        if (it.isUpperCase()) it.lowercaseChar()
        else it.uppercaseChar()
    }
        .joinToString("")
    println(s2)
}