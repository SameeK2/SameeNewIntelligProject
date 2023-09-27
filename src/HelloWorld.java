
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("What was the total bill cost? ");
        double bill = scan.nextDouble();
        System.out.print("What is the tip percentage? ");
        int tipPercentage = scan.nextInt();
        System.out.print("What is the number of people? ");
        int peopleNumber = scan.nextInt();

        double totalTip = ((tipPercentage/100.0) * bill);
        double tipperPerson = ((tipPercentage/100.0) * bill) / peopleNumber;
        double totalperPerson = (((tipPercentage/100.0) * bill) / peopleNumber) + (bill / peopleNumber);
        double totalingeneral = totalperPerson * peopleNumber;
        System.out.println("Your tip per person value is: " + tipperPerson);
        System.out.println("Your total per person value is: " + totalperPerson);
        System.out.println("Your totaltip value is: " + totalTip);
        System.out.print("Your total for all individuals is: " + totalingeneral);



    }
}
