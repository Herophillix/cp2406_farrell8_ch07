import java.util.*;

public class CountMovieSpaces {
    public static void main(String[] args) {
        String movieQuote = "Hey! That's pretty good.";
        int spaceCount = movieQuote.length() - movieQuote.replaceAll(" ", "").length();
        System.out.println("Number of spaces in " + '"' + movieQuote + '"' + ": " + spaceCount);
    }
}