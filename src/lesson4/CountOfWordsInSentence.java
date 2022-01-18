package lesson4;

public class CountOfWordsInSentence {

    public static void main(String[] args) {
        String sentence = "When the Soviet Union collapsed in 1991 and Azerbaijan gained its independence," +
                " one of the first laws passed in the new Parliament was the adoption of a new Latin-script alphabet." +
                "Since 1992 (current version of the modern alphabet defined using the Latin script, " +
                "replacing Ää with the historic Əə for better sorting)";

        String[] splittedSentence = sentence.split(" ");
        int length = splittedSentence.length;
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (!splittedSentence[i].matches("\\d.*\\d")) {
                count++;
            }

            /**
             * Checks whether the uppercase and lowercase of the string are equal.
             * If it is than it’s a number or special character.
             */

//            if (splittedSentence[i].toLowerCase() == splittedSentence[i].toUpperCase()) {
//                count++;
//            }
        }

        System.out.println(count);
    }
}
