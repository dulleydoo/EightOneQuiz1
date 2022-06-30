
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        String a = baseValue;
        String b = valueToBeAdded;
        return a + b;
    }
    //return baseValue + ValueToBeAdded;
    //return baseValue.concat(valueToBeAdded);

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        return new StringBuilder(valueToBeReversed).reverse().toString();
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        return word.charAt(word.length()/2);

    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        return value.replaceAll(String.valueOf(charToRemove), "");

    }
    //return value.replaceAll(String.valueOf(charToRemove), "");

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String[] sarr = sentence.split(" ");
        return sarr[sarr.length-1];

        //Arraylist<String> s = new ArrayList<>(sentence.split(" "));
        //return s.get(s.size()-1);
    }
}
