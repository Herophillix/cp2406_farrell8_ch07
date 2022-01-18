import java.util.*;

public class BabyNameComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[3];
        for(int i = 0; i < names.length; ++i)
        {
            System.out.println("Input name " + (i + 1) + ":");
            names[i] = scanner.nextLine();
        }

        System.out.println();
        System.out.println("Available names");
        for(int i = 0; i < names.length; ++i)
        {
            for(int j = 0; j < names.length; ++j)
            {
                if(i == j)
                    continue;
                System.out.println(names[i] + " " + names[j]);
            }
        }
    }
}