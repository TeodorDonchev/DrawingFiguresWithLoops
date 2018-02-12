import java.util.Scanner;

/**
 * Created by teodor donchev on 2/10/2018.
 */
public class House {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int stars = 1;

        if(n % 2 == 0){
            stars = 2;
        }


        for (int i = 0; i < (n + 1) / 2; i++) {

            int dashes = (n - stars) / 2;

            System.out.print(draw("-", dashes));
            System.out.print(draw("*", stars));
            System.out.print(draw("-", dashes));

            System.out.println();

            stars += 2;
        }

        for (int i = 0; i < n / 2; i++) {
            System.out.print("|");
            System.out.print(draw("*", n - 2));
            System.out.print("|");
            System.out.println();
        }


    }
    public static String draw(String s, int length){
        String toReturn = "";

        for (int i = 0; i < length; i++) {
            toReturn += s;
        }

        return toReturn;
    }
}
