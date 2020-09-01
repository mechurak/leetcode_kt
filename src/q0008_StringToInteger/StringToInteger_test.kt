package q0008_StringToInteger

import kotlin.test.assertEquals

class Tc(val name: String, val str: String, val want: Int)

fun main() {
    val testCases = arrayListOf(
            Tc("Example 1", "42", 42),
            Tc("Example 2", "   -42", -42),
            Tc("Example 3", "4193 with words", 4193),
            Tc("Example 4", "words and 987", 0),
            Tc("Example 5", "-91283472332", -2147483648),  // INT_MIN
            Tc("Runtime Error 1", "-912-8332", -912),
            Tc("TC 1", "-+912", 0),
    )

    val sol = Solution()
    for (tc in testCases) {
        println("== ${tc.name} ==")
        println(" s: ${tc.str}")
        val got = sol.myAtoi(tc.str)
        println(" got: $got")
        assertEquals(tc.want, got, "error!!!")
    }
}
