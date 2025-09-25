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
        month = input.nextInt();

        if (month >= 1 && month <= 12)
        {
            System.out.println("You said your birth month is " + month);
        }
        else
        {
            System.out.println("Error! Please enter a valid month");
        }

    }
}