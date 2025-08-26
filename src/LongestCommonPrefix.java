public class LongestCommonPrefix {
}
//class Solution {
//    public String longestCommonPrefix(String[] strs) {
//        StringBuilder ans = new StringBuilder();
//
//        //sorting strs
//        Arrays.sort(strs);
//
//        char[] first = strs[0].toCharArray();
//        char[] last = strs[strs.length-1].toCharArray();
//
//        for(int i=0; i<first.length; i++){
//            if(first[i] == last[i]){
//                ans.append(first[i]);
//            }else{
//                break;
//            }
//        }
//        return ans.toString();
//    }
//}
//
//
//// BRUTE FORCE
//
//// class Solution {
////     public String longestCommonPrefix(String[] strs) {
////         String ans = strs[0];
////         for(int i=0; i<strs.length-1; i++){
////             String temp = "";
////             for(int j=0; j<ans.length() && j<strs[i+1].length(); j++){
////                 if(ans.charAt(j) == strs[i+1].charAt(j)){
////                     temp += ans.charAt(j);
////                 }else{
////                     break;
////                 }
////             }
////             ans = temp;
////         }
////         return ans;
////     }
// }