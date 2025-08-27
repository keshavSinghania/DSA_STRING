public class FindTheIndexOfTheFirstOccurance {
}

//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
// class Solution {
//     public int strStr(String haystack, String needle) {
//         if(!haystack.contains(needle)) return -1;
//         int needleLength = needle.length();
//         for(int i=0; i<=haystack.length() - needleLength; i++){
//             if(haystack.substring(i,i+needleLength).equals(needle)) return i;
//         }
//         return -1;
//     }
// }

//class Solution {
//    public int strStr(String haystack, String needle) {
//        int needleLength = needle.length();
//        int haystackLength = haystack.length();
//
//        for (int i = 0; i <= haystackLength - needleLength; i++) {
//            if (haystack.substring(i, i + needleLength).equals(needle)) {
//                return i;
//            }
//        }
//        return -1;
//    }
//}
