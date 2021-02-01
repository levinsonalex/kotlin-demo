class KotlinQuizImpl : Quiz {
    override fun nameRepeater(name: String?, n: Int?): String {
        var outString = ""
        repeat(n ?: 1) { outString += name ?: "Name" }
        return outString
    }

    override fun rangePlay(): String = (6 until 30 step 2).joinToString(prefix = "nums: ", separator = ", ")

    override fun safePrintList(nullableList: List<String?>) {
        for (item in nullableList) {
            item?.let { println(it) }
        }
    }

    override fun easyTernary(input: String): Unit = if (input == "True") print("true") else print("false")
}