public class Panagram {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(sentence);
        System.out.println("Is the sentence a pangram? " + isPangram);
    }
    
    public static boolean isPangram(String sentence) {
        boolean[] alphabet = new boolean[26];
        int index;
        
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if ('A' <= ch && ch <= 'Z') {
                index = ch - 'A';
            } else if ('a' <= ch && ch <= 'z') {
                index = ch - 'a';
            } else {
                continue;
            }
            alphabet[index] = true;
        }
        
        for (boolean letter : alphabet) {
            if (!letter) {
                return false;
            }
        }
        
        return true;
}
}