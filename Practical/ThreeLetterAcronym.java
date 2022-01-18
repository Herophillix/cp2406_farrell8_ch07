import java.util.*;

public class ThreeLetterAcronym {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input 3 words to create acronym: ");
        String userInput = scanner.nextLine();
        String[] splitUserInput = userInput.split(" ");
        String acronym = "";
        for(int i = 0; i < Math.min(splitUserInput.length, 3); ++i)
        {
            acronym += Character.toUpperCase(splitUserInput[i].charAt(0));
        }
        System.out.println("Acronym for " + '"' + userInput + '"' + " is " + acronym);
    }
}