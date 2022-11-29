public class ReplaceLetterBySymbol {
    public static void main(String[] args) {
        String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
                "when an unknown printer took a galley of type and scrambled it to make a type specimen book.";
        int s = 4;
        char symbol = '@';
        System.out.printf("Before: %s%sAfter: %s", text, System.lineSeparator(), replaceLetterBySymbol(text, s, symbol));


    }
    public static String replaceLetterBySymbol(String text, int index, char symbol){
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
