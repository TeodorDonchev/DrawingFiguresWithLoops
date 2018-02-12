import java.util.Scanner;

/**
 * Created by teodor donchev on 2/10/2018.
 */
public class SquareFrame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        System.out.println("+ " + draw("- ", n - 2) + "+");

        for (int i = 0; i < n - 2; i++) {
            System.out.println("| " + draw("- ", n - 2) + "|");
        }

        System.out.println("+ " + draw("- ", n - 2) + "+");
    }

    public static String draw(String s, int length) {
        String toReturn = "";

        for (int i = 0; i < length; i++) {
            toReturn += s;
        }
        return toReturn;
    }
}

