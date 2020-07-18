package com.roohom.demo.ClassDemo;

import java.util.Arrays;

/**
 * ClassName: LongestSubStr
 * Author: Roohom
 * Function:找出字符串的最长无重复子串
 * 例如:
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * Date: 2020/7/18 18:04
 * Software: IntelliJ IDEA
 */
//未完成！


public class LongestSubStr {
    public static void getLongestSubStr(String str[], String aString)
    {
        for (int i=0;i<str.length;i++)
        {
            str[i] = String.valueOf(aString.charAt(i));
            for (int j=i+1;j<str.length;j++)
            {
                if (str[i]==str[j])
                {

                }
            }
        }
        //至此已经把字符串的每一位都拆分并且装进了数组中
        //System.out.println(Arrays.toString(str)); //用来打印检测是否已经把字符串每一位装进了数组

        //用来进行前一位与后一位的比较，如果后一位与前面的任何一位相同，终止比较，并得到不相同的字符数量

    }


    public static void main(String[] args) {
        String str = "pwwkew";
        String[] fullStr = new String[str.length()];
        getLongestSubStr(fullStr,str);
    }

}
