import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class problem380 {
    class RandomizedSet {               //implement each function O(1)
        HashSet<Integer> set;

        public RandomizedSet() {
            set = new HashSet<>();
        }
        
        public boolean insert(int val) { //Insert val into set if not present. 
                                        //Returns true if the item was not present, false otherwise.
            boolean res = !set.contains(val);
            set.add(val);
            return res;
        }
        
        public boolean remove(int val) {
            boolean res = set.contains(val);
            set.remove(val);
            return res;
        }
        
        public int getRandom() {
            List<Integer> list = new ArrayList<>(set);
            int rand_i = (int)(Math.random() * list.size());
            return list.get(rand_i);
        }
    }

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
}
