package exercises;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array {


    public static void main(String[] args) {

        int[] myArray = {1, 1, 2, 3, 5, 8};
        printArray(myArray);
        printOdd(myArray);
        String rhyme = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        printString(rhyme);
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(41);
        myList.add(12);
        myList.add(22);
        myList.add(88);
        myList.add(15);
        myList.add(43);
        myList.add(32);
        myList.add(76);
        myList.add(34);
        myList.add(77);
        System.out.println(addSum(myList));

        ArrayList<String> myString = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is your name:");
        String name = input.nextLine();
        printFiveInput(name);

    }

    public static void printFive( ArrayList<String> myString) {
        for(int i=0; i<myString.size(); i++) {
            if (myString.get(i).length() == 5) {
                System.out.println(myString.get(i));
            }
        }
    }

    public static void printFiveInput(String myString) {
            if (myString.length() == 5) {
                System.out.println(myString);
            } else {
                System.out.println("not 5 letters!");
            }

    }

        public static int addSum(ArrayList<Integer> array) {
        int sum = 0;
        for(int i=0; i<array.size(); i++) {
            sum += array.get(i);
        }
        return sum;
        }


        public static void printString (String rhyme) {
        String[] newRhyme = rhyme.split(" ");
        System.out.println(Arrays.toString(newRhyme));
        String[] newRhyme2 = rhyme.split("\\.");
        System.out.println(Arrays.toString(newRhyme2));
        }

        public static void printArray (int[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);

            }
        }

        public static void printOdd (int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.println(array[i]);
            }
        }



}}
