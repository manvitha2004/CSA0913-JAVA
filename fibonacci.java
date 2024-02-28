import java.util.Scanner;
class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers to print: ");
        int n = scanner.nextInt();
        int a = 0, b = 1, c;
        System.out.print("The first " + n + " Fibonacci numbers are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        scanner.close();
    }
}
