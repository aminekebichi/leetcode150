import java.util.HashMap;

public class problem205 {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> s_indx = new HashMap<>();
        HashMap<Character, Integer> t_indx = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if (!s_indx.containsKey(s.charAt(i))) {
                s_indx.put(s.charAt(i), i);
            }
            if (!t_indx.containsKey(t.charAt(i))) {
                t_indx.put(t.charAt(i), i);
            }
            if (s_indx.get(s.charAt(i)) != t_indx.get(t.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
