package q0005_LongestPalindromicSubstring

class Solution {
    fun longestPalindrome(s: String): String {
        var answer = ""
        s.forEachIndexed{ i, c ->
            val odd_answer = getCurAnswer(s, i, i)
            if (odd_answer.length > answer.length) {
                answer = odd_answer
            }
            val even_answer = getCurAnswer(s, i, i+1)
            if (even_answer.length > answer.length) {
                answer = even_answer
            }
        }
        return answer
    }

    fun getCurAnswer(s: String, l: Int, r: Int): String {
        var leftIndex = l
        var rightIndex = r
        while (leftIndex >= 0 && rightIndex < s.length && s[leftIndex] == s[rightIndex]) {
            leftIndex -= 1
            rightIndex += 1
        }
        return s.substring(leftIndex+1 until rightIndex)
    }
}