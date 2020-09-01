package q0006_ZigZagConversion

import kotlin.test.assertEquals

class Tc(val name: String, val s: String, val numRows: Int, val want: String)

fun main() {
    val testCases = arrayListOf(
            Tc("Example 1", "PAYPALISHIRING", 3, "PAHNAPLSIIGYIR"),
            Tc("Example 2", "PAYPALISHIRING", 4, "PINALSIGYAHRPI"),
            Tc("Wrong Answer 1", "PAYPALISHIRING", 5, "PHASIYIRPLIGAN"),
    )

    val sol = Solution()
    for (tc in testCases) {
        println("== ${tc.name} ==")
        println(" s: ${tc.s}, numRows: ${tc.numRows}")
        val got = sol.convert(tc.s, tc.numRows)
        println(" got: $got")
        assertEquals(tc.want, got, "error!!!")
    }
}
