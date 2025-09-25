import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int month = 0;
        String trash = "";

        System.out.println("Enter your birth month: ");
        if (input.hasNext())
        {
            month = input.nextInt();
            if (month <= 12 && month >= 1)
            {
                System.out.println("Your birth month is: " + month);
            }
            else
            {
                System.out.println("Invalid month");
                System.out.println("\nExiting program. please enter valid month");
                System.exit(0);

            }
        }
    }
}