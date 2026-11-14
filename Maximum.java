import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        int max, n, a[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array :");
        n = sc.nextInt();
        a = new int[n];
        System.out.println("Enter the Elements of an Array :");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }
        max = a[0];
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "/t");
            if (a[i] > max)
                max = a[i];
        }
        System.out.println("Maximum Element=" + max);
    }
}