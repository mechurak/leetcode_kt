package q0001_TwoSum

import kotlin.test.assertTrue

class Tc(val name: String, val nums: IntArray, val target: Int, val wants: IntArray)

fun main() {
    val testCases = arrayListOf<Tc>(
        Tc("tc1", intArrayOf(2,7,11, 15), 9, intArrayOf(0,1)),
        Tc("tc2", intArrayOf(2,7,11, 15), 18, intArrayOf(1,2))
    )

    val sol = Solution()
    for (tc in testCases) {
        println("== ${tc.name} ==")
        println(" nums: ${tc.nums.contentToString()}, target: ${tc.target}")
        val ret = sol.twoSum(tc.nums, tc.target)
        println(" ret: ${ret.contentToString()}")
        assertTrue(ret.contentEquals(tc.wants), "error!!!")
    }
}