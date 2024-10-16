import java.util.Arrays;

public class problem274 {
    public int hIndex(int[] citations) { 
        citations = reverseSortArray(citations);
        int h = 0;
        for(int i = 0; i < citations.length; i++){
            if(citations[i] >= i + 1) h = i + 1;
        }
        return h;
    }

    public static int[] reverseSortArray(int[] arr){
        Arrays.sort(arr);

        // Reverse the sorted array
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        return arr;
    }
}
