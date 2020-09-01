package q0009_PalindromeNumber

import kotlin.test.assertEquals

class Tc(val name: String, val x: Int, val want: Boolean)

fun main() {
    val testCases = arrayListOf(
            Tc("Example 1", 121, true),
            Tc("Example 2", -121, false),
            Tc("Example 3", 10, false),
    )

    val sol = Solution()
    for (tc in testCases) {
        println("== ${tc.name} ==")
        println(" s: ${tc.x}")
        val got = sol.isPalindrome(tc.x)
        println(" got: $got")
        assertEquals(tc.want, got, "error!!!")
    }
}
