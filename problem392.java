public class problem392 {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while(i < s.length()){
            if(j == t.length()) return false;
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            } else j++;

        }

        return true;
    }
}
