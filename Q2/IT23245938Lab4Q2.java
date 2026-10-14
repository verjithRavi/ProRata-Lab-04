import java.util.Scanner;

public class IT23245938Lab4Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double examMarks, labMarks;
        double examPercentage, labPercentage;

        System.out.print("Enter exam marks (0 - 100): ");
        examMarks = input.nextDouble();

        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid exam marks!");
            return;
        }

        System.out.print("Enter lab submission marks (0 - 100): ");
        labMarks = input.nextDouble();

        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid lab marks!");
            return;
        }

        System.out.print("Enter percentage for exam marks: ");
        examPercentage = input.nextDouble();

        System.out.print("Enter percentage for lab marks: ");
        labPercentage = input.nextDouble();

        if ((examPercentage + labPercentage) != 100) {
            System.out.println("Invalid percentages! Total must be 100.");
            return;
        }

        double finalMark = (examMarks * examPercentage / 100) +
                           (labMarks * labPercentage / 100);

        System.out.println("Final Mark = " + finalMark);

        input.close();
    }
}