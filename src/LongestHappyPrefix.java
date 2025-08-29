public class LongestHappyPrefix {
}

//https://leetcode.com/problems/longest-happy-prefix/description/
//class Solution {
//    public String longestPrefix(String s) {
//        int n = s.length(); //string length
//
//        //creating an extra array with same length as string....
//        int[] arr = new int[s.length()];
//        // int index = 1; //will use index to push value in our new array
//
//        int i=0;
//        int j=1;
//
//        //runs while loop until j reaches last index
//        while(j<n){
//            //if matched[increase j , increase i , and intialinze array cuurrent index by i+1 , increase current index]
//            if(s.charAt(i)==s.charAt(j)){
//                arr[j] = i + 1;
//                i++;
//                j++;
//            }else{
//                if(i == 0){
//                    //simply put current new array index value as 0 , and increase it ,, and also increase j
//                    arr[j] = 0;
//                    j++;
//                }else{
//                    //set the value of i as previous value of array index
//                    i = arr[i-1];
//                }
//            }
//        }
//        //arr[n-1] is the length of longest prefix suffix
//        return s.substring(0,arr[n-1]);
//    }
//}