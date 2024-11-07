import java.util.HashMap;

public class problem290 {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length() != words.length) return false;

        HashMap<Character, Integer> pattern_indx = new HashMap<>();
        HashMap<String, Integer> s_indx = new HashMap<>();
        for(int i = 0; i < pattern.length(); i++){
            if (!pattern_indx.containsKey(pattern.charAt(i))) {
                pattern_indx.put(pattern.charAt(i), i);
            }
            if (!s_indx.containsKey(words[i])) {
                s_indx.put(words[i], i);
            }
            if (!pattern_indx.get(pattern.charAt(i)).equals(s_indx.get(words[i]))) {
                return false;
            }
        }
        return true;
    }
}
