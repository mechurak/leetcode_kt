package q0003_LongestSubstring

/*
https://leetcode.com/problems/longest-substring-without-repeating-characters/

Given a string, find the length of the longest substring without repeating characters.

== Example 1:
Input: "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

== Example 2:
Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

== Example 3:
Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val startIndexMap = hashMapOf<Char, Int>()
        var curPoint = 0
        var maxPoint = 0
        var left = 0
        s.forEachIndexed { index, c ->
            if (startIndexMap.containsKey(c)) {
                val prevIndex = startIndexMap[c]!!
                if (prevIndex < left) {
                    curPoint++
                } else {
                    left = prevIndex + 1
                    if (curPoint > maxPoint) {
                        maxPoint = curPoint
                    }
                    curPoint = index - left + 1
                }
            } else {
                curPoint++
            }
            startIndexMap[c] = index
        }

        if (curPoint > maxPoint) {
            maxPoint = curPoint
        }
        return maxPoint
    }
}