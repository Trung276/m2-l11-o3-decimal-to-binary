import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so muon chuyen:");
        int number = scanner.nextInt();
        int decimalNumber = number;
        Stack<Integer> stack = new Stack<Integer>();
        while (number != 0) {
            int binaryNumber = number % 2;
            stack.push(binaryNumber);
            number = number / 2;
        }
        System.out.println("Dang nhi phan cua so " + decimalNumber + " la: ");
        for(Integer i: stack) {
            System.out.printf(i + " ");
        }
    }
}