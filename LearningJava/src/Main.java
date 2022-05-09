import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void announceDeveloperTeaTime() {
        System.out.println("Waiting for developer tea time...");
        System.out.println("Type in a random word and press Enter to start developer tea time.");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's tea time!");
    }

    public static void main(String args[]) {
        //announceDeveloperTeaTime();

        Triangle triangleA = new Triangle(15, 8, 15, 8, 7);
        Triangle triangleB = new Triangle(3, 2.598, 3, 3, 3);
        double triangleArea = triangleA.findArea();
        System.out.println(triangleArea);

        Student student1 = new Student("Justin", "Loos", 2024,
                3.2, "Accounting", "");
        Student student2 = new Student("Sam", "Johnson", 2018,
                3.6, "Computer Science", "Latin");
        student1.delayGraduation();
        System.out.println("Justin, your new expected graduation is " + student1.expectedGraduationYear);
    }

}
