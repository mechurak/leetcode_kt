package q0011_ContainerWithMostWater

import kotlin.test.assertEquals

class Tc(val name: String, val height: IntArray, val want: Int)

fun main() {
    val testCases = arrayListOf(
            Tc("Example 1", intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7), 49),
    )

    val sol = Solution()
    for (tc in testCases) {
        println("== ${tc.name} ==")
        println(" height: ${tc.height.contentToString()}")
        val got = sol.maxArea(tc.height)
        println(" got: $got")
        assertEquals(tc.want, got, "error!!!")
    }
}









