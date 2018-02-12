import java.util.Scanner;

/**
 * Created by teodor donchev on 2/11/2018.
 */
public class Stop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        String top = draw(".", n + 1);
        top += draw("_", n * 2 + 1);
        top += draw(".", n + 1);

        System.out.println(top);

        int dots = n;
        int underscores = n * 2 - 1;

        for (int i = 0; i < n; i++) {
            String currentRow = "";

            currentRow += draw(".", dots);
            currentRow += "//";
            currentRow += draw("_", underscores);
            currentRow += "\\\\";
            currentRow += draw(".", dots);

            System.out.println(currentRow);

            dots -= 1;
            underscores += 2;
        }

        String middleRow = "//"
                + draw("_", n * 2 - 3)
                + "STOP!"
                + draw("_", n * 2 - 3)
                + "\\\\";

        System.out.println(middleRow);

        for (int i = 0; i < n; i++) {
            String currentRow = "";

            currentRow += draw(".", dots);
            currentRow += "\\\\";
            currentRow += draw("_", underscores);
            currentRow += "//";
            currentRow += draw(".", dots);

            System.out.println(currentRow);

            dots += 1;
            underscores -= 2;
        }

    }

    static String draw(String s, int count){
        String toReturn = "";

        for (int i = 0; i < count; i++) {
            toReturn += s;
        }

        return toReturn;
    }
}
