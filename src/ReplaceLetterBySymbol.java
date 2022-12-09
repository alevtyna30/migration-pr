public class ReplaceLetterBySymbol {
    public static void main(String[] args) {
        String text = "Down, down, down. There was nothing else to" +
                "do, so Alice soon began talking again. “Dinah ’ll" +
                "miss me very much to-night, I should think !”" +
                "(Dinah was the cat.) “ I hope they’ll remember" +
                "her saucer of milk at tea-time. Dinah, my dear!" +
                "I wish you were down here with me ! There" +
                "are no mice in the air, I’m afraid, but you" +
                "might catch a bat, and that’s very like a mouse,q" +
                "you know. But do cats eat bats, I wonder?”";
        int s = 2;
        char symbol = '!';
        System.out.printf("Before: %s%sAfter: %s", text, System.lineSeparator(), replaceCharBySymbol(text, s, symbol));


    }
    public static String replaceCharBySymbol(String text, int index, char symbol){
        StringBuilder str = new StringBuilder(text);
        for (String word : text.split(" ")) {
           if(word.length()>= index){
                str.append(word.substring(0, index -1)).append(symbol).append(word.substring(index, word.length()));
            } else {
                str.append(word);
            }
            str.append(" ");
        }
        return str.toString();
    }

}
