import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = input.nextInt();

        int total = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                total += i;
                System.out.println(i);
            }
        }

        if (total == n) {
            System.out.println(n + " is a perfect number");
        } else {
            System.out.println(n + " is not a perfect number");
        }

        input.close();
    }
}
