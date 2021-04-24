public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverseStr1("Valodik"));
        System.out.println(reverseStr2("Valodik"));
        System.out.println(reverseStr3("Valodik"));
        System.out.println(reverseStr4("Valodik"));
    }

    private static String reverseStr1(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes();
        byte[] reverse = new byte[bytes.length];
        for (int i = 0; i < bytes.length; i++) {
            reverse[i] = bytes[bytes.length - i - 1];
        }
        return new String(reverse);
    }

    private static String reverseStr2(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder reverse = new StringBuilder();
        char[] letters = str.toCharArray();
        for (int i = letters.length - 1; i >= 0; i--) {
            reverse.append(letters[i]);
        }
        return reverse.toString();
    }

    private static String reverseStr3(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder reverse = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse.append(str.charAt(i));
        }
        return reverse.toString();
    }

    private static String reverseStr4(String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }
}
