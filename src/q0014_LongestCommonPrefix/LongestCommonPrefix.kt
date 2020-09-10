package q0014_LongestCommonPrefix

class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""

        var length = Int.MAX_VALUE
        for (str in strs) {
            if (str.length < length) {
                length = str.length
            }
        }
        // println("array size: ${strs.size}")
        // println("min length: $length")

        var ans = ""
        for (i in 0 until length) {
            val cur: Char = strs[0][i]
            var success = true
            for (j in 1 until strs.size) {
                if (strs[j][i] != cur) {
                    success = false;
                    break;
                }
            }
            if (!success) {
                break;
            }
            ans += cur
            // println("ans: $ans")
        }

        return ans
    }
}