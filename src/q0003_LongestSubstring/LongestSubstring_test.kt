package q0003_LongestSubstring

import kotlin.test.assertEquals

class Tc(val name: String, val s: String, val wants: Int)

fun main() {
    val testCases = arrayListOf(
            Tc("tc1", "abcabcbb", 3),
            Tc("tc2", "bbbbb", 1),
            Tc("tc3", "pwwkew", 3),
            Tc("tc4", "", 0),
            Tc("tc5", "au", 2),
            Tc("tc6", "dvdf", 3)
    )

    val sol = Solution()
    for (tc in testCases) {
        println("== ${tc.name} ==")
        println(" s: ${tc.s}")
        val ret = sol.lengthOfLongestSubstring(tc.s)
        println(" ret: $ret")
        assertEquals(tc.wants, ret, "error!!!")
    }
}