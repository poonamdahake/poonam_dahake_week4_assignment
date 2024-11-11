import java.util.Scanner;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number to divide 100: ");
            int number = scanner.nextInt();

            if (number == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }

            int result = 100 / number;
            System.out.println("Result: " + result);

            String str = null;
            System.out.println("Length of the string: " + str.length());

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: String is null.");
        } catch (Exception e) {
            System.out.println("An unexpected exception occurred: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }

        try {
            validateNumber(-1);
        } catch (CustomException e) {
            System.out.println("CustomException caught: " + e.getMessage());
        }

        scanner.close();
    }

    public static void validateNumber(int number) throws CustomException {
        if (number < 0) {
            throw new CustomException("Number must be non-negative.");
        }
    }
}
