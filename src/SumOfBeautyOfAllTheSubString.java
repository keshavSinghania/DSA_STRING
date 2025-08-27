public class SumOfBeautyOfAllTheSubString {
}

//https://leetcode.com/problems/sum-of-beauty-of-all-substrings/
//class Solution {
//    public int beautySum(String s) {
//        int ans = 0;
//        //FINDING ALL THE POSSIBLE SUBSTRING
//        for(int i=0; i<s.length(); i++){
//            int[] count = new int[26];
//            for(int j=i; j<s.length(); j++){
//
//                int min = Integer.MAX_VALUE;
//                int max = 0;
//
//                char subStr= s.charAt(j);
//                count[subStr-'a']++;
//                for(int k=0; k<26; k++){
//                    if(count[k] > 0){
//                        if(count[k] > max){
//                            max = count[k];
//                        }
//                        if(count[k] < min){
//                            min = count[k];
//                        }
//                    }
//                }
//                ans+=max-min;
//            }
//        }
//        return ans;
//    }
//}


//EXTREME BRUTE FORCE
// class Solution {
//     public int beautySum(String s) {
//         int ans = 0;
//         //generating all the substrings
//         for(int i=0; i<s.length(); i++){
//             for(int j=i+1; j<s.length(); j++){
//                 ans += findBeauty(s.substring(i,j+1));
//             }
//         }
//         return ans;
//     }
//     //function to find the beauty of substring
//     int findBeauty(String s){
//         int frequency=0;
//         int maxFrequency = 0;
//         int minFrequency = Integer.MAX_VALUE;
//         for(int i=0; i<s.length(); i++){
//             frequency = findF(s,s.charAt(i));

//             if(frequency >0 && minFrequency>frequency){
//                 minFrequency = frequency;
//             }
//             else if(frequency>0 && maxFrequency<frequency){
//                 maxFrequency = frequency;
//             }
//         }
//         return maxFrequency - minFrequency;
//     }

//     //function to find min frequency
//     int findF(String s, char target){
//         int count = 0;
//         for(int i=0; i<s.length(); i++){
//             if(s.charAt(i)==target){
//                 count++;
//             }
//         }
//         return count;
//     }
// }