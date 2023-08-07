import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    list.add(nums1[i]);
                }
            }
        }
        Set<Integer> uniqueSet = new HashSet<>();

        for (int num : list) {
            uniqueSet.add(num);
        }

        int[] answer = new int[uniqueSet.size()];
        int i = 0;
        for(int num : uniqueSet){
            answer[i] = num;
            i++;
        }
        return answer;
    }
}
