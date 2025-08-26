public class RomanToInteger {
}
//class Solution {
//    public int romanToInt(String s) {
//        int ans = 0;
//        for(int i=0; i<s.length(); i++){
//            int a= giveValue(s.charAt(i));
//            int b = 0;
//            if(i+1<s.length()){
//                b= giveValue(s.charAt(i+1));
//            }
//            if(a<b){
//                ans+= (b-a);
//                i++;
//            }else{
//                ans+= a;
//            }
//        }
//        return ans;
//    }
//    //function which would give me value on passing symbol
//    int giveValue(char symbol) {
//        switch (symbol) {
//            case 'I': return 1;
//            case 'V': return 5;
//            case 'X': return 10;
//            case 'L': return 50;
//            case 'C': return 100;
//            case 'D': return 500;
//            case 'M': return 1000;
//            default: return 0;
//        }
//    }
//}