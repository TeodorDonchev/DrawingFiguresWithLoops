import java.util.Scanner;

/**
 * Created by teodor donchev on 2/10/2018.
 */
public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.print(draw(" ", n - i) + "*");
            System.out.print(draw(" *", i - 1));
            System.out.println();
        }

        for (int i = n - 1; i >= 1 ; i--) {
            System.out.print(draw(" ", n - i) + "*");
            System.out.print(draw(" *", i - 1));
            System.out.println();
        }
    }

    public static String draw(String s, int length) {
        String toReturn = "";

        for (int i = 0; i < length; i++) {
            toReturn += s;
        }
        return toReturn;
    }
}
