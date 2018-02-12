import java.util.Scanner;

/**
 * Created by teodor donchev on 2/10/2018.
 */
public class Diamond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        if (n == 1) {
            System.out.println("*");
            return;
        } else if (n == 2) {
            System.out.println("**");
            return;
        }

        int leftRight = (n - 1) / 2;

        int mid = 0;

        String topBottomRow = "";

        if (n % 2 == 0) {
            topBottomRow += draw("-", leftRight)
                    + "**"
                    + draw("-", leftRight);
        } else {
            topBottomRow += draw("-", leftRight)
                    + "*"
                    + draw("-", leftRight);
        }

        System.out.println(topBottomRow);

        leftRight--;

        for (int i = 1; i < (n - 1) / 2; i++) {
            mid = n - 2 * leftRight - 2;

            System.out.println(
                    draw("-", leftRight)
                            + "*"
                            + draw("-", mid)
                            + "*"
                            + draw("-", leftRight));

            leftRight--;
        }

        String middleRow = "";

        middleRow += "*"
                + draw("-", n - 2)
                + "*";

        System.out.println(middleRow);

        leftRight++;

        for (int i = 1; i < (n - 1) / 2; i++) {
            mid = n - 2 * leftRight - 2;

            System.out.println(
                    draw("-", leftRight)
                            + "*"
                            + draw("-", mid)
                            + "*"
                            + draw("-", leftRight));

            leftRight++;
        }

        System.out.println(topBottomRow);
    }

    static String draw(String s, int length) {
        String toReturn = "";

        for (int i = 0; i < length; i++) {
            toReturn += s;
        }

        return toReturn;
    }
}
