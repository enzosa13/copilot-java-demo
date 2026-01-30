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
            //System.out.println("Square: " + (i * i));         
        }
    }
}
/*
1. Intro: myself + demo
2. Your use of the AI tools, and debugging ops.
3. Make some changes to it and do a few commits with it.
4. 3. show GitHub
*/
