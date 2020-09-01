package q0005_LongestPalindromicSubstring

import kotlin.test.assertTrue

class Tc(val name: String, val s: String, val wantCandidates: ArrayList<String>)

fun main() {
    val testCases = arrayListOf(
            Tc("Example 1", "babad", arrayListOf("bab", "aba")),
            Tc("Example 2", "cbbd", arrayListOf("bb")),
    )

    val sol = Solution()
    for (tc in testCases) {
        println("== ${tc.name} ==")
        println(" s: ${tc.s}")
        val got = sol.longestPalindrome(tc.s)
        println(" got: $got")
        assertTrue(got in tc.wantCandidates, "error!!!")
    }
}
