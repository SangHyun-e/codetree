import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num >= 3000) {
            System.out.println("book");
        } else if (num >= 1000) {
            System.out.println("mask");
        } else {
            System.out.println("no");
        }
    }
}