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

    }
}
