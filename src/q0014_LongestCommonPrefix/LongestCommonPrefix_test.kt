package q0014_LongestCommonPrefix

import kotlin.test.assertEquals

class Tc(val name: String, val strs: Array<String>, val want: String)

fun main() {
    val testCases = arrayListOf(
            Tc("Example 1", arrayOf("flower", "flow", "flight"), "fl"),
            Tc("Example 2", arrayOf("dog", "racecar", "car"), ""),
            Tc("Runtime Error 1", arrayOf(), ""),
    )

    val sol = Solution()
    for (tc in testCases) {
        println("== ${tc.name} ==")
        println(" s: ${tc.strs.contentToString()}")
        val got = sol.longestCommonPrefix(tc.strs)
        println(" got: $got")
        assertEquals(tc.want, got, "error!!!")
    }
}

