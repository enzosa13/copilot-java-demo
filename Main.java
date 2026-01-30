import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        printNumbers(n);

        sc.close();
    }

    // Prints numbers from 1 to n
    public static void printNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("Number: " + i);
        }
    }
}
