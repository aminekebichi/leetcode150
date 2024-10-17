import java.util.Arrays;

public class problem238 {
    public int[] productExceptSelf(int[] nums) {
        int[] pref = new int[nums.length];
        int[] suff = new int[nums.length];
        int[] answer = new int[nums.length];

        int pref_prod = 1;
        for (int i = 0; i < nums.length; i++){
            pref[i] = pref_prod;
            pref_prod *= nums[i];
        }

        int suff_prod = 1;
        for (int i = 0; i < nums.length; i++){
            suff[nums.length - 1 - i] = suff_prod;
            suff_prod *= nums[nums.length - 1 - i];
        }

        System.out.println(Arrays.toString(pref));
        System.out.println(Arrays.toString(suff));

        for(int i = 0; i < nums.length; i++){
            answer[i] = pref[i] * suff[i];
        }

        return answer;
    }
}
