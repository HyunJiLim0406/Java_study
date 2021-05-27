class Exercise9_10 {
    static String format(String str, int length, int alignment) {
        if (length < str.length())
            return str.substring(0, length);

        char[] strArr = str.toCharArray();
        char[] chArr = new char[length];
        for (int i = 0; i < length; i++)
            chArr[i] = ' ';

        switch (alignment) {
            case 0:
                System.arraycopy(strArr, 0, chArr, 0, strArr.length);
                break;
            case 1:
                System.arraycopy(strArr, 0, chArr, (length - strArr.length) / 2, strArr.length);
                break;
            case 2:
                System.arraycopy(strArr, 0, chArr, length - strArr.length, strArr.length);
                break;
        }
        return new String(chArr);
    }

    public static void main(String[] args) {
        String str = "가나다";
        System.out.println(format(str, 7, 0)); // 왼쪽 정렬
        System.out.println(format(str, 7, 1)); // 가운데 정렬
        System.out.println(format(str, 7, 2)); // 오른쪽 정렬
    }
}