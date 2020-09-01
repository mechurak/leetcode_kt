package q0004_MedianOfTwoSortedArrays

import kotlin.test.assertEquals

class Tc(val name: String, val nums1: IntArray, val nums2: IntArray, val want: Double)

fun main() {
    val testCases = arrayListOf(
            Tc("Example 1", intArrayOf(1, 3), intArrayOf(2), 2.0),
            Tc("Example 2", intArrayOf(1, 2), intArrayOf(3, 4), 2.5),
            Tc("Example 3", intArrayOf(0, 0), intArrayOf(0, 0), 0.0),
            Tc("Example 4", intArrayOf(), intArrayOf(1), 1.0),
            Tc("Example 5", intArrayOf(2), intArrayOf(), 2.0),
            Tc("Wrong Answer 1", intArrayOf(), intArrayOf(2, 3), 2.5),
            Tc("Wrong Answer 2", intArrayOf(3), intArrayOf(-2, -1), -1.0),
            Tc("Wrong Answer 3", intArrayOf(1, 2), intArrayOf(-1, 3), 1.5),
            Tc("Wrong Answer 4", intArrayOf(1, 2), intArrayOf(1, 1), 1.0),
            Tc("Wrong Answer 5", intArrayOf(1, 2), intArrayOf(1, 2, 3), 2.0),
            Tc("TC 1", intArrayOf(1, 10), intArrayOf(2, 11), 6.0),
    )

    val sol = Solution()
    for (tc in testCases) {
        println("== ${tc.name} ==")
        println(" nums1: ${tc.nums1}")
        println(" nums2: ${tc.nums2}")
        val got = sol.findMedianSortedArrays(tc.nums1, tc.nums2)
        println(" got: $got")
        assertEquals(tc.want, got, "error!!!")
    }
}
