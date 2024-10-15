public class problem55 {
    public boolean canJump(int[] nums) {
        // Step 1: Initialize the furthest reachable index
        int furthest = 0;
        
        // Step 2: Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current index is greater than the furthest reachable index, we can't reach it
            if (i > furthest) {
                return false;
            }
            
            // Update the furthest index we can reach from this position
            furthest = Math.max(furthest, i + nums[i]);
            
            // Step 3: Check if we can reach or go past the last index
            if (furthest >= nums.length - 1) {
                return true;
            }
        }
        
        // Step 4: If we finish the loop without reaching the last index, return false
        return false;
    }
}
