public class StringFunction {
    /**     */
    public StringFunction() {
    }
    /**
     * @param str
     */
    public static void reverseString(final String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb.toString());
    }

    /**
     * @param str
     */
    public static void lengthOfString(final String str) {
        StringBuilder sb = new StringBuilder(str);

        System.out.println(sb.length());
    }
}
