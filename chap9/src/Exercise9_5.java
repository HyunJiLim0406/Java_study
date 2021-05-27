public class Exercise9_5 {
    public static int count(String src, String target) {
        int count = 0;
        int pos = 0;

        while ((pos < src.length()) && (src.indexOf(target, pos) != -1)) {
            count++;
            pos = src.indexOf(target, pos) + target.length();
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(count("12345AB12AB345AB", "AB"));
        System.out.println(count("12345", "AB"));
    }
}
