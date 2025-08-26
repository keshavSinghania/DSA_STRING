public class RotateString {
}
// class Solution {
//     public boolean rotateString(String s, String goal) {
//         if(s.length()!= goal.length()) return false;
//         for(int i=0; i<s.length(); i++){
//             if(s.equals(goal)) return true;
//             else{
//                 s=rotateOnce(s);
//             }
//         }
//         return false;
//     }

//     //function to swipe first and last value
//     String rotateOnce(String s){
//         return s.substring(1)+s.charAt(0);
//     }
// }

class Solution {
    public boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal);
    }
}

// // class Solution {
// //     public boolean rotateString(String s, String goal) {
// //         int count = 0;
// //         for(int i=0; i<s.length(); i++){
// //             if(s.charAt(i)!=goal.charAt(i)){
// //                 //have to find index wheever its rotated (max cont should be 2)
// //                 int index = findIndex(goal, s.charAt(i));
// //                 count++;
// //                 if(count>2) return false;
// //                 while(index<goal.length()){
// //                     if(s.charAt(i++)!=goal.charAt(index++)){
// //                         return false;
// //                     }
// //                 }
// //             }
// //         }
// //         return true;
// //     }

// //     //function to find index
// //     int findIndex(String s, char target){
// //         for(int i=0; i<s.length(); i++){
// //             if(s.charAt(i)== target){
// //                 return i;
// //             }
// //         }
// //         return -1;
// //     }
// // }