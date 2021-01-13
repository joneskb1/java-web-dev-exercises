package exercises;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashPractice {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
         String newStudent;


        do {

            System.out.print("Student Name: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer newId= input.nextInt();
                students.put(newId, newStudent);

                input.nextLine();
            }

        } while(!newStudent.equals(""));

        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }


    }

}
