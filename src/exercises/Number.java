package exercises;
import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what is the length?");
        int lengthOfRec = input.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("what is the width?");
        int widthOfRec = input2.nextInt();
        int areaOfRec = widthOfRec * lengthOfRec;
        System.out.println("your area is " + areaOfRec);

    }

}
