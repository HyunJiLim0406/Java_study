public class Exercise9_6 {
    public static String fillZero(String src, int length) {
        String str = "";
        if (src == null || src.length() == length)
            return src;
        if (length <= 0)
            return str;
        if(length>src.length()) {
            for (int i = 0; i < length - src.length(); i++)
                str += "0";
            return str + src;
        }
        return src.substring(0, length);
    }

    public static void main(String[] args) {
        String src = "12345";
        System.out.println(fillZero(src, 10));
        System.out.println(fillZero(src, -1));
        System.out.println(fillZero(src, 3));
    }
}