import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //session 2 - task 1
        System.out.println("enter smallest number : ");
        int n1 = scanner.nextInt();
        System.out.println("enter bigger number : ");
        int n2 = scanner.nextInt();
        if (n1 > n2) {
            System.out.println("Error num 1 bigger than num 2 ! ");
        }
        for (int x = n1; x <= n2; x++) {
            System.out.println(x);

        }


        // task 2
        int i = 1;
        while (i <= 6) {
            System.out.println(" iam Groot ");
            i++;
        }


        // task 3
        for (int z = 1; z <= 100; z++) {
            if (z % 6 == 0) {
                System.out.println(z);
            }
        }
    }}
