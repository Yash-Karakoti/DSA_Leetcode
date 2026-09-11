package revised;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
        public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i<nums.length ; i++){
            int number = target - nums[i];
            if(map.containsKey(number)){
                int index1 = map.get(number);
                int index2 = i;
                int[] result = {index1, index2};
                return result;
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

}
