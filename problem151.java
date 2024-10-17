import java.util.ArrayList;

public class problem151 {
    public String reverseWords(String s) {
        String word = "";
        ArrayList<String> res = new ArrayList<>();
        boolean word_start = false;
        for(int i = 0; i < s.length(); i++){
            char letter = s.charAt(i);
            if(letter != ' ') {
                word += letter;
                word_start = true;
            } else {
                if(word_start){
                    res.add(word);
                    word = "";
                    word_start = false;
                }
            }
        }
        if(word_start) res.add(word);

        word = "";
        for(int i = res.size() - 1; i > 0; i--){
            word += res.get(i) + " ";
        }
        word += res.get(0);

        System.out.println(res);
        return word;
    }
}
