public class SortCharacterByFrequency {
}
//class Solution {
//    public String frequencySort(String s) {
//        int[] count = new int[128];
//        StringBuilder ans = new StringBuilder();
//
//        // count frequency of each char
//        for (int i = 0; i < s.length(); i++) {
//            count[s.charAt(i)]++;
//        }
//
//        // pick max frequency char again and again
//        for (int i = 0; i < s.length(); i++) {
//            int[] max = findMax(count);
//            int freq = max[0];
//            int idx = max[1];
//
//            // append that char freq times
//            for (int j = 0; j < freq; j++) {
//                ans.append((char)(idx));
//            }
//
//            // mark used
//            if (idx != -1) count[idx] = 0;
//        }
//
//        return ans.toString();
//    }
//
//    // return [maxFrequency, index]
//    int[] findMax(int[] count) {
//        int index = 0;
//        int max = count[0];
//        for (int i = 1; i < count.length; i++) {
//            if (count[i] > max) {
//                max = count[i];
//                index = i;
//            }
//        }
//        return new int[]{max, index};
//    }
//}
