class KotlinQuizImpl : Quiz {
    override fun nameRepeater(name: String?, n: Int?): String {
        var outString = ""
        repeat(n ?: 1) { outString += name ?: "Name" }
        return outString
    }

    override fun rangePlay(n: Int?, stepVal: Int?): String =
        (0 until (n ?: 0) step (stepVal ?: 1)).joinToString(prefix = "nums: ", separator = ", ")

    override fun safePrintList(nullableList: List<String?>) {
        for (item in nullableList) {
            item?.let { println(it) }
        }
    }

    override fun easyTernary(input: String): Unit =
        if (input == "True") print("true") else print("false")
}