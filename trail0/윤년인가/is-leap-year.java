import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int years = sc.nextInt();

        if (years % 4 == 0) {
            if (years % 100 == 0) {
                if (years % 400 == 0) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
            } else {
                System.out.println("true");
            }
        } else {
            System.out.println("false");
        }
    }
}