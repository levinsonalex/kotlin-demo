class KotlinQuizImpl : Quiz {
    override fun nameRepeater(name: String?, n: Int?): String {
        var outString = ""
        repeat(n ?: 1) { outString += name ?: "Name" }
        return outString
    }

    override fun rangePlay(n: Int?, stepVal: Int?): String =
        (0 until (n ?: 0) step (stepVal ?: 1)).joinToString(prefix = "nums: ", separator = ", ")

    override fun sumStringSizes(nullableList: List<String?>) : Int {
        return nullableList.sumBy { it?.length ?: 0 }
    }

    override fun easyTernary(input: String): Unit =
        if (input == "True") print("true") else print("false")
}