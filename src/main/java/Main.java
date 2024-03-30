import java.util.Scanner;
public class Main {
//    Create a method that accepts one parameter(A  user's input)
//            The method's job is to continuously ask a user "Are we there yet? " until the user's input entered is Yes.
//            If user's input is anything but YES then your method MUST keep asking the user the question: "Are we there yet?"
//            Name the method - myAnooyingLittleBro or Sis

    public static void myAnnoyingLittleSis() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are we there yet?");
        String answer = scanner.nextLine();
        while (!answer.equalsIgnoreCase("Yes")) {
            System.out.println("Are we there yet?");
            answer = scanner.nextLine();
        }
    }

    public static void main(String[] args) {
        myAnnoyingLittleSis();

    }
}
