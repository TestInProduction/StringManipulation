/**
 * The StringManipulator Class takes strings and converts them
 * depending on the selected method.
 *
 * @author  Tristen
 * @version 1.0
 * @since   2019-02-10
 */

public class StringManipulator {

    /**
     * This method alternates the characters of the given string, starting with an upper case letter.
     * @param value The string to be manipulated.
     * @return String The manipulated value.
     */

    public String makeSnake(String value) {
        char[] characters = value.toCharArray();
        String finalValue = "";
        boolean valueShouldBeUpperCase = true;

        for (int x = 0; x < characters.length; x++) {
            char currentChar = characters[x];
            boolean charIsALetter = Character.isLetter(currentChar);

            if (charIsALetter && valueShouldBeUpperCase) {
                currentChar = Character.toUpperCase(currentChar);
            }
            else {
                currentChar = Character.toLowerCase(currentChar);
            }

            if(charIsALetter) {
                valueShouldBeUpperCase = !valueShouldBeUpperCase;
            }
            finalValue += currentChar;
        }

        return finalValue;
    }

    /**
     * This method swaps the casing of all characters of the given string.
     * @param value The string to be manipulated.
     * @return String The manipulated value.
     */
    public String swapCase(String value){
        char[] characters = value.toCharArray();
        String finalValue = "";

        for (int x = 0; x < characters.length; x++) {
            char currentChar = characters[x];
            boolean charIsALetter = Character.isLetter(currentChar);

            if(charIsALetter){
                if( Character.isUpperCase(currentChar) ){
                    currentChar = Character.toLowerCase(currentChar);
                } else {
                    currentChar = Character.toUpperCase(currentChar);
                }
            }
            finalValue += currentChar;
        }
        return finalValue;
    }


}
