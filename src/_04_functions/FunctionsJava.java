package _04_functions;

public class FunctionsJava {
    public static String trim(final String value, final char prefix) {
        int index;
        for (index = 0; index < value.length(); index++) {
            if (value.charAt(index) != prefix) {
                break;
            }
        }
        String result = value.substring(index);

        for (index = result.length() - 1; index >= 0; index--) {
            if (result.charAt(index) != prefix) {
                break;
            }
        }
        return result.substring(0, index + 1);
    }


    public static String trim(final String value) {
        return trim(value, ' ');
    }



    public static void main(String[] args) {
        System.out.println(trim("   trim me   "));
        System.out.println(trim("__trim me___", '_'));
    }
}

