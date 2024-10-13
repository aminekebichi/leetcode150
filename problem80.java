public class problem80 {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 2) return nums.length;
        int counter = 0;
        int i = 0;
        int curr = nums[0];

        for(int num : nums){
            if(curr == num) counter++;
            else{
                for(int j = 0; j < Math.min(counter, 2); j++){
                    nums[i++] = curr;
                }
                curr = num;
                counter = 1;
            }
        }
        if(curr == nums[nums.length-1]){
            for(int j = 0; j < Math.min(counter, 2); j++){
                    nums[i++] = curr;
                }
        }

        return i;
    }
}
