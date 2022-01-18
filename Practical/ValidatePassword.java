import java.util.*;

public class ValidatePassword {
    static final int UPPERCASE_CHARACTER_MIN = 2;
    static final int LOWERCASE_CHARACTER_MIN = 2;
    static final int DIGIT_MIN = 2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isPasswordValid = false;
        while(!isPasswordValid)
        {
            System.out.println("Input password with " + UPPERCASE_CHARACTER_MIN + " upppercase character(s), "
            + LOWERCASE_CHARACTER_MIN + " lowercase character(s) and " + DIGIT_MIN + " digit(s):");
            String userPassword = scanner.nextLine();
            int uppercaseCount = 0, lowercaseCount = 0, digitCount = 0;
            for(int i = 0; i < userPassword.length(); ++i)
            {
                char character = userPassword.charAt(i);
                if(Character.isUpperCase(character))
                    ++uppercaseCount;
                else if(Character.isLowerCase(character))
                    ++lowercaseCount;
                else if(Character.isDigit(character))
                    ++digitCount;
            }
            if(uppercaseCount < UPPERCASE_CHARACTER_MIN)
                System.out.println("Please put " + UPPERCASE_CHARACTER_MIN + " or more uppercase characters");
            else if(lowercaseCount < LOWERCASE_CHARACTER_MIN)
                System.out.println("Please put " + LOWERCASE_CHARACTER_MIN + " or more lowercase characters");
            else if(digitCount < DIGIT_MIN)
                System.out.println("Please put " + DIGIT_MIN + " or more digits");
            else
            {
                System.out.println("Password successfully created");
                isPasswordValid = true;
            }
        }
    }
}