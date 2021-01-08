package exercises;
import java.util.Scanner;

public class MPH {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("how many miles?");
        int miles = input.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("amount of gas used?");
        int gas = input2.nextInt();
        int MPH = miles / gas;
        System.out.println("MPG:" + MPH);

    }
}



