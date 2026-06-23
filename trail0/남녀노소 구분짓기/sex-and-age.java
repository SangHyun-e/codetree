import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int gender = sc.nextInt();
        int age = sc.nextInt();

        boolean isAdult = age >= 19;
        boolean isFemale = gender == 1;

        if (isAdult && !isFemale) System.out.print("MAN");
        else if (isAdult && isFemale) System.out.print("WOMAN");
        else if (!isAdult && !isFemale) System.out.print("BOY");
        else System.out.print("GIRL");
    }
}