# P1047 remove all adjacent duplicates in string 

给出由小写字母组成的字符串S，重复项删除操作会选择两个相邻且相同的字母，并删除它们。

在 S 上反复执行重复项删除操作，直到无法继续删除。

在完成所有重复项删除操作后返回最终的字符串。答案保证唯一。

示例：

输入："abbaca"
输出："ca"
解释：
例如，在 "abbaca" 中，我们可以删除 "bb" 由于两字母相邻且相同，这是此时唯一可以执行删除操作的重复项。之后我们得到字符串 "aaca"，其中又只有 "aa" 可以执行重复项删除操作，所以最后的字符串为 "ca"。


提示：

1 <= S.length <= 20000
S 仅由小写英文字母组成。

https://leetcode-cn.com/problems/remove-all-adjacent-duplicates-in-string

总体思路就是使用栈结构，时间复杂度为$O(N)$，只不过在实际编码时不一定要使用Stack，Java的String类本身就类似于一个栈结构

更进一步，不一定必须要使用String相关类，直接使用Char数组即可


