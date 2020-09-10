package q0012_IntegerToRoman

import kotlin.test.assertEquals

class Tc(val name: String, val num: Int, val want: String)

fun main() {
    val testCases = arrayListOf(
            Tc("Example 1", 3, "III"),
            Tc("Example 2", 4, "IV"),
            Tc("Example 3", 9, "IX"),
            Tc("Example 4", 58, "LVIII"),
            Tc("Example 5", 1994, "MCMXCIV"),
    )

    val sol = Solution()
    for (tc in testCases) {
        println("== ${tc.name} ==")
        println(" num: ${tc.num}")
        val got = sol.intToRoman(tc.num)
        println(" got: $got")
        assertEquals(tc.want, got, "error!!!")
    }
}

