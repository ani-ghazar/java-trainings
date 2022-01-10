package lesson3;

public class VowelsIntoString {

    public static void main(String[] args) {
        char[] arr = {'w', 'x', 'o', 'i','a', 'e', 't', 'u', 'w', 'x', 'o', 'i', 'q', 'y'};

        String str = "";

        for (char ch: arr) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                str+=ch;
            }
        }

        System.out.printf(str);
    }
}
