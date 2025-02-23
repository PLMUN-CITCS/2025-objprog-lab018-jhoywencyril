public class EvenOddChecker {
    public static void main(String[] args) {
        int number = getIntegerInput();
        String result = checkEvenOrOdd(number);
        System.out.println(result);
    }

    public static int getIntegerInput() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int number;

        while (true) {
            System.out.print("Enter an integer: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                break;
            } else {
                System.out.println("Invalid input! Please enter a valid integer.");
                scanner.next();
            }
        }
        scanner.close();
        return number;
    }

    public static String checkEvenOrOdd(int number) {
        return number + (number % 2 == 0 ? " is an Even number." : " is an Odd number.");
    }
}
