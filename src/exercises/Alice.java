package exercises;
import java.util.Locale;
import java.util.Scanner;

public class Alice {

    public static void main(String[] args) {
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("enter a word");
        String quote = sentence.toLowerCase();
        String searchTerm = input.nextLine();
        searchTerm = searchTerm.toLowerCase();
        int indexOfSearch = sentence.indexOf(searchTerm);
        int lengthSearch = searchTerm.length();
        System.out.println(indexOfSearch);
        System.out.println(lengthSearch);
        String newString = quote.replaceFirst(searchTerm, "");
        System.out.println(newString);





    }


}
