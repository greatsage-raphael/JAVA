//A 90-100
//B 80-89
//C 70-79
//D 60-69
//E 50-59
//F 0-49
//swithes differ from if statements because they use a singular condition and multiple values to decide while if statements can have multiple conditions via else if 
import java.util.Scanner;

public class switchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks: ");
        int marks = scanner.nextInt();

        switch (marks / 10) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            case 5:
                System.out.println("E");
                break;
            case 4:
                System.out.println("Failure");
                break;
            default:
                System.out.println("Fail");
                scanner.close();
        }
    }
}
