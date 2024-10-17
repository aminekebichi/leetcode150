public class problem125 {
    public boolean isPalindrome(String s) {
        s = convertAlphanumeric(s).toLowerCase();
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
        }
        return true;
    }

    public String convertAlphanumeric(String s){
        String res = "";
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))) res += s.charAt(i);
        }
        return res;
    }
}
