package q0007_ReverseInteger

import kotlin.test.assertEquals

class Tc(val name: String, val x: Int, val want: Int)

fun main() {
    val testCases = arrayListOf(
            Tc("Example 1", 123, 321),
            Tc("Example 2", -123, -321),
            Tc("Example 3", 120, 21),
            Tc("TC 1", 21474_47412, 21474_47412),
            Tc("TC 2", 21474_47413, 0),
            Tc("TC 3", -21474_47412, -21474_47412),
            Tc("Runtime Error 1", 0, 0),
            Tc("Wrong Answer 1", 15342_36469, 0),
            Tc("Wrong Answer 2", -21474_83412, -2143847412),
            Tc("Wring Answer 3", 15638_47412, 0)
    )

    val sol = Solution()
    for (tc in testCases) {
        println("== ${tc.name} ==")
        println(" s: ${tc.x}")
        val got = sol.reverse(tc.x)
        println(" got: $got")
        assertEquals(tc.want, got, "error!!!")
    }
}

