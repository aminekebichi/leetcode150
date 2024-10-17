public class problem134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        for(int i = 0; i < gas.length; i++){
            int curr_i = i; int start_i = i; int my_gas = 0;
            boolean start = true;
            // System.out.println("starting (" + start_i + ")");
            while(my_gas > 0 || start){
                start = false;

                my_gas += gas[curr_i] - cost[curr_i];
                curr_i = (curr_i + 1)%cost.length;
                
                if(curr_i == start_i && my_gas >= 0) return start_i;
                // System.out.println("gas @ " + curr_i + " = " + my_gas);
            }
        }

        return -1;
    }
}
