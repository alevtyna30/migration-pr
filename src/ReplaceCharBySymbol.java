public class ReplaceCharBySymbol {
    public static void main(String[] args) {
        String text = "Alise said: Down, down, down. There was nothing else to" +
                "do, so Alice soon began talking again. “Dinah ’ll" +
                "miss me very much to-night, I should think !”" +
                "(Dinah was the cats.) “";
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
