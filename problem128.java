import java.util.HashSet;

public class problem128 {
    public int longestConsecutive(int[] nums) {
        int counter = 0;
        int max = 0;

        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) set.add(num);

        for(int num : nums) {
            if(!set.contains(num - 1)){
                counter = 0;
                int curr = num;
                while(set.contains(curr)){
                    curr++; counter++;
                    max = Math.max(counter, max);
                }
            }
        }

        return max;
    }
}
