package q0001_TwoSum

import kotlin.test.assertTrue

/*
https://leetcode.com/problems/two-sum/

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val counterMap = hashMapOf<Int, Int>()
        nums.forEachIndexed { i, v ->
            if (counterMap.containsKey(v)) {
                return intArrayOf(counterMap[v]!!, i)
            }
            val counterValue = target - v
            counterMap[counterValue] = i
        }
        return intArrayOf(-1, -1)
    }
}