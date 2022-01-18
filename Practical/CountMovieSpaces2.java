import java.util.*;

public class CountMovieSpaces2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your favorite movie quote: ");
        String movieQuote = scanner.nextLine();
        int spaceCount = movieQuote.length() - movieQuote.replaceAll(" ", "").length();
        System.out.println("Number of spaces in " + '"' + movieQuote + '"' + ": " + spaceCount);
    }
}