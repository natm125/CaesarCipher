
public class CaesarCipher {
    private final String key = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


    /**
     * Function responsible for encrypting a string according
     * to the Caesar Shift
     * @param text          the text that shall be encoded
     * @param shift         the shift placement of the text
     * @return              the encrypted string
     */
    public String encryptMessage(String text, int shift) {
        String convertedString = "";
        for (char c: text.toCharArray()) {
            int foundIndex = key.indexOf(c);
            char foundChar = key.charAt((foundIndex + shift) % 26);
            convertedString += foundChar;
        }
        return convertedString;
    }

    /**
     * Function responsible for decrypting a string according
     * to the Caesar Shift
     * @param text          the text that shall be encoded
     * @param shift         the shift placement of the text
     * @return              the decrypted string
     */
    public String decryptMessage(String text, int shift) {
        String decodedString = "";
        for (char c: text.toCharArray()) {
            int foundIndex = key.indexOf(c);
            char foundChar = key.charAt((foundIndex - shift) % 26);
            decodedString += foundChar;
        }
        return decodedString;
    }

    /**
     * Function responsible for finding the shift key
     * in the Caesar Shift
     * @param encoded     the encoded text to be decoded
     * @param answer      the original text
     * @return            the shift key
     */
    public int findShiftKey(String encoded, String answer) {

        int shiftNum = Math.abs(key.indexOf(encoded.charAt(0)) - key.indexOf(answer.charAt(0)));
        return shiftNum;

    }
}
