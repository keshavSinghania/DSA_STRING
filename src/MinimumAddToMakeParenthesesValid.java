public class MinimumAddToMakeParenthesesValid {
}

//https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
//class Solution {
//    public int minAddToMakeValid(String s) {
//        int openCount = 0;
//        int extra = 0;
//        for(int i=0; i<s.length(); i++){
//            if(s.charAt(i)=='('){
//                openCount++;
//            }else if(s.charAt(i)==')'){
//                if(openCount<=0){
//                    extra++;
//                }else{
//                    openCount--;
//                }
//            }
//        }
//        return openCount+extra;
//    }
//}