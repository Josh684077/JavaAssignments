import java.util.Scanner;

public class Program {

    public static void main(String[] args)
    {
        Program myProgram = new Program();
        myProgram.start();

    }

    void start()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the size of your group and press [ENTER]");
        Integer numberOfStudents = scanner.nextInt();

        Student[] students = new Student[numberOfStudents];

        for (Integer i = 0; i < numberOfStudents; i++)
        {
            students[i] = new Student();
            System.out.println("Please enter the name of student " + (i + 1) + " and press [ENTER]");
            students[i].name = scanner.next();
            System.out.println("Please enter Y if " + students[i].name + " is present and N if they are not, and press [ENTER]");
            String answer = scanner.next();
            students[i].isPresent = (answer.equalsIgnoreCase("Y"));
        }

        System.out.println("Student name: | Is present:");
        for (Integer i = 0; i < numberOfStudents; i++)
        {
            System.out.println(students[i].name + " | " + students[i].isPresent);
        }

    }
}
