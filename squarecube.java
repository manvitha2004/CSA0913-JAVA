import java.util.Scanner;
class Squarecube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        double number = scanner.nextDouble();
        
        double square = number*number;
        double cube = number*number*number);
        
        System.out.println("Square Number: " + square);
        System.out.println("Cube Number: " + cube);
    }
}