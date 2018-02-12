import java.util.Scanner;

/**
 * Created by teodor donchev on 2/12/2018.
 */
public class DrawFort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        System.out.println(
                "/"
                        + draw("^", n / 2)
                        + "\\"
                        + draw("_", n * 2 - 4 - 2 * (n / 2))
                        + "/"
                        + draw("^", n / 2)
                        + "\\");

        for (int i = 0; i < n - 2; i++) {
            String row = "|";
            row += draw(" ", n * 2 - 2);
            row += "|";

            if(i == n - 2 - 1){
                row = "|";
                row += draw(" ", (n / 2) + 1);
                row += draw("_", n * 2 - 4 - 2 * (n / 2));
                row += draw(" ", (n / 2) + 1);
                row += "|";
            }

            System.out.println(row);
        }

        System.out.println(
                "\\"
                        + draw("_", n / 2)
                        + "/"
                        + draw(" ", n * 2 - 4 - 2 * (n / 2))
                        + "\\"
                        + draw("_", n / 2)
                        + "/");
    }
    static String draw(String s, int length) {
        String toReturn = "";

        for (int i = 0; i < length; i++) {
            toReturn += s;
        }

        return toReturn;
    }
}
