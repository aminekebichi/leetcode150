public class problem45 {
    public int jump(int[] nums) {
        int max_i = 0;
        int curr_jump_end = 0;
        int jumps = 0;

        for(int i = 0; i < nums.length - 1; i++){
            max_i = Math.max(max_i, i + nums[i]);
            if(i == curr_jump_end){
                curr_jump_end = max_i;
                jumps++;
            }
        }

        return jumps;
    }
}
