public class ReverseTheWordsInString {
}
//https://leetcode.com/problems/reverse-words-in-a-string/
//class Solution {
//    public String reverseWords(String s) {
//        //first trim string on basic of space and store as String array
//        //trim == removing extra spaces from start and end
//        //split == divide strig based on "\\s+" that is one or more extra spaces
//        String [] strArr = s.trim().split(" +");
//
//        StringBuilder sb = new StringBuilder();
//
//        //will pick string from the back index of string array and append to sb
//        for(int i= strArr.length-1; i>=0; i--){
//            sb.append(strArr[i]);
//
//            //after every word , we must have add one space
//            //NOTE : - donot add space after last word
//            if(i>0){
//                sb.append(" ");
//            }
//        }
//        return sb.toString();
//    }
//}