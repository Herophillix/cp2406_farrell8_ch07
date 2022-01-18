import java.util.*;

public class Alphabetize2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input string: ");
        String userInput = scanner.nextLine();

        char charArray[] = userInput.toCharArray();
        Arrays.sort(charArray);
        System.out.println(new String(charArray));
    }
}