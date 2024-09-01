public class HiddenWord {
    private String hiddenWord;

    public HiddenWord(String word){
        this.hiddenWord = word.toUpperCase();
    }

    public String getHiddenWord() {
        return hiddenWord;
    }

    public String getHint(String guess){

        for (int i = 0; i < guess.length(); i++) {
            if (Character.isLowerCase(guess.charAt(i))) {
                throw new IllegalArgumentException("Your guess ( " + guess + " ) does not contain all uppercase letters. Your guess must contain all uppercase letters!");
            }

        }

        if (guess.length() != hiddenWord.length()) {
            throw new IllegalArgumentException("Your guess ( " + guess + " ) has " + guess.length() + " characters. The hidden word has " + hiddenWord.length() + " characters. Your guess must be a word with " + hiddenWord.length() + " characters!");
        }




        String hint = "";

        for(int i = 0; i < hiddenWord.length(); i++){
            if(guess.charAt(i) == hiddenWord.charAt(i)){
                hint += guess.charAt(i);
            } else if(hiddenWord.contains("" + guess.charAt(i))){
                hint += "+";
            } else hint += "*";
        }

        return hint;

    }
}
