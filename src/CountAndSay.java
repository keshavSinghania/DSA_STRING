public class CountAndSay {
}
//class Solution {
//    public String countAndSay(int n) {
//        String current = "1";
//        for(int i=1; i<n; i++){
//            StringBuilder temp = new StringBuilder();
//            for(int j=0; j<current.length(); j++){
//                int count = 1;
//                while(current.length()-1>j && current.charAt(j)==current.charAt(j+1)){
//                    count++;
//                    j++;
//                }
//                temp.append(count).append(current.charAt(j));
//            }
//            current=temp.toString();
//        }
//        return current;
//    }
//}