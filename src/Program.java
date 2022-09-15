import java.util.Scanner;

public class Program {

    public static void main(String[] args){
        Program myProgram = new Program();
        myProgram.start();

    }

    void start()
    {
        String courseName;
        Integer numberOfStudents;
        Double gradeAverage;
        String bestStudent = "";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter course name: ");
        courseName = scanner.nextLine();
        System.out.print("Enter number of students: ");
        numberOfStudents = scanner.nextInt();

        String[] studentNames = new String[numberOfStudents];
        Integer[] studentGrades = new Integer[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++)
        {
            System.out.print("Enter name of student " + (i+1) + ": ");
            studentNames[i] = scanner.next();
        }

        System.out.println("");

        int gradesTotal = 0;
        int bestGrade = 0;
        for (int i = 0; i < numberOfStudents; i++)
        {
            System.out.print("Enter the " + courseName + " grade of student " + studentNames[i] + ": ");
            studentGrades[i] = scanner.nextInt();

            gradesTotal = gradesTotal + studentGrades[i];

            if (studentGrades[i] > bestGrade)
            {
                bestStudent = studentNames[i];
            }
        }

        scanner.close();
        gradeAverage = (double)gradesTotal / numberOfStudents;

        System.out.println("");
        System.out.println("Average grade: " + gradeAverage);
        System.out.println("Best student in the course " + courseName + ": " + bestStudent);
        }
}
