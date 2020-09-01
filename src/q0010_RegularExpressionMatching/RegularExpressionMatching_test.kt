package q0010_RegularExpressionMatching

import kotlin.test.assertEquals

class Tc(val name: String, val s: String, val p: String, val want: Boolean)

fun main() {
    val testCases = arrayListOf(
            Tc("Example 1", "aa", "a", false),
            Tc("Example 2", "aa", "a*", true),
            Tc("Example 3", "ab", ".*", true),
            Tc("Example 4", "aab", "c*a*b", true),
            Tc("Example 5", "mississippi", "mis*is*p*.", false),
    )

    val sol = Solution()
    for (tc in testCases) {
        println("== ${tc.name} ==")
        println(" s: ${tc.s}, p: ${tc.p}")
        val got = sol.isMatch(tc.s, tc.p)
        println(" got: $got")
        assertEquals(tc.want, got, "error!!!")
    }
}

