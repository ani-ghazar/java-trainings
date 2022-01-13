package lesson4;

public class PrintTextWithinTag {

    public static void main(String[] args) {

        String str = "<test> Text and Test and Break </test>";
        int startOfTag = str.indexOf('>');
        int endOfTag = str.indexOf("</");

        if (startOfTag < endOfTag) {
            System.out.println("The text within the tags is: " + str.substring(startOfTag+1, endOfTag));
        } else {
            System.out.println("You have no text within the tags.");
        }

    }
}
