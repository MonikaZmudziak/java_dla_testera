import java.util.Locale;

public class MainAppStringAndMethods {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "hello";

        // String comparison

        str1.equals(str2); // boolean
        System.out.println(str1.equals(str2));

        // String comparison with upper and lower case letters ignoring

        System.out.println(str1.equalsIgnoreCase(str2));

        // Change to capital letters
        String s = str1.toUpperCase();
        System.out.println(s);

        System.out.println(str1.toUpperCase());

        // Change to lower letters

        String s1 = str1.toLowerCase();
        System.out.println(s1);

        // if the given string begins / ends with the given letters

        boolean startsWith = str1.startsWith("He");
        System.out.println(startsWith);

        System.out.println(str1.endsWith("lo"));

        // if text contains another text

        System.out.println(str1.contains("ll"));

        // if text is empty

        System.out.println("      ".isBlank()); // ignoring spaces
        System.out.println("      b".isBlank()); // contains b letter
        System.out.println(" ".isEmpty()); // String length + spaces

        //replace text

        String replace = str1.replace("llo", "QWE"); // string
        System.out.println(replace);

        // replace all words in sentence
        String s3 = str2.replaceAll("l", "x");
        System.out.println(s3);

        //extract a smaller text from the text

        String substring = str1.substring(1, 4);// index H=0, e =1 l=2 l=3, o=4
        System.out.println(substring);

        // all characters + white spaces
        String textWithWhiteSpaces = "    to jest jakiś text    ";

        System.out.println(textWithWhiteSpaces.length());

        // removing spaces before and after the text

        String strip = textWithWhiteSpaces.strip();// removing spaces before and after the text
        System.out.println(strip);
        System.out.println(strip.length());

    }
}
