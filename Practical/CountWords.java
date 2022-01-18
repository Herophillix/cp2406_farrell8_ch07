import java.util.*;

public class CountWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a sentence: ");
        String userInput = scanner.nextLine();
        int wordCount = 0;
        boolean prevCharisPunctuation = true;
        for(int i = 0; i < userInput.length(); ++i)
        {
            char character = userInput.charAt(i);
            if(character == ' ' || character == '.' || character == ',' || character == '?' || character == ';' || character == '!' || character == '-')
            {
                prevCharisPunctuation = true;
            }
            else
            {
                if(prevCharisPunctuation)
                    ++wordCount;
                prevCharisPunctuation = false;
            }
        }
        System.out.println("Word count: " + wordCount);
    }
}