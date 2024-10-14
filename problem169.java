import java.util.HashMap;

public class problem169 {
        public int majorityElement(int[] nums) {
        if(nums.length < 1) return -1;
        if(nums.length < 2) return nums[0];

        HashMap<Integer, Integer> map = new HashMap<>();
        int res = -1;
        int max_freq = 0;
        for(int num : nums){
            map.put(num, 1 + map.getOrDefault(num, 0));
            if(map.get(num) > max_freq){
                max_freq = map.get(num);
                res = num;
            }
        }

        return res;
    }
}
