public class LargestOddNumberInString {
}
//https://leetcode.com/problems/largest-odd-number-in-string/
//class Solution {
//    public String largestOddNumber(String num) {
//        for(int i=num.length()-1; i>=0; i--){
//            if((int)num.charAt(i)%2!=0){
//                return num.substring(0,i+1);
//            }
//        }
//        return "";
//    }
//}
//
//
//
//// class Solution {
////     public String largestOddNumber(String num) {
////         char[] arrCh = num.toCharArray();
////         for(int i=arrCh.length-1; i>=0; i--){
////             //storing every last index number(string) in it ..
////             int lastNum = arrCh[i] - '0';
//
////             //checking wheather it is odd or not
////             if(lastNum%2!=0){
////                 return num.substring(0,i+1);
////             }
////         }
////         return "";
////     }
//// }