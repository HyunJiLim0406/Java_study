public class Exercise9_9 {
    static String delChar(String src, String delCh) {
        StringBuffer str = new StringBuffer(src.length());
        for (int i = 0; i < src.length(); i++) {
            char c = src.charAt(i);
            if (delCh.indexOf(c) == -1)
                str.append(c);
        }
        return String.valueOf(str);
    }

    public static void main(String[] args) {
        System.out.println("(1!2@3^4~5)" + " -> "
                + delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
        System.out.println("(1 2     3   4\t5)" + " -> "
                + delChar("(1 2     3   4\t5)", " \t"));
    }
}