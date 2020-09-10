package q0013_RomanToInteger

import kotlin.test.assertEquals

class Tc(val name: String, val s: String, val want: Int)

fun main() {
    val testCases = arrayListOf(
            Tc("Example 1", "III", 3),
            Tc("Example 2", "IV", 4),
            Tc("Example 3", "IX", 9),
            Tc("Example 4", "LVIII", 58),
            Tc("Example 5", "MCMXCIV", 1994),
            Tc("Wrong Answer 1", "MMMXLV", 3045),
    )

    val sol = Solution()
    for (tc in testCases) {
        println("== ${tc.name} ==")
        println(" s: ${tc.s}")
        val got = sol.romanToInt(tc.s)
        println(" got: $got")
        assertEquals(tc.want, got, "error!!!")
    }
}

