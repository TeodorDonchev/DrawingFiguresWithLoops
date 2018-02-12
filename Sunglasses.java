import java.util.Scanner;

/**
 * Created by teodor donchev on 2/10/2018.
 */
public class Sunglasses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        System.out.println(draw("*", n * 2) + draw(" ", n) + draw("*", n * 2));

        for (int i = 0; i < n - 2; i++) {
            System.out.print("*" + draw("/", 2 * n - 2) + "*");

            if(i == (n- 1) / 2 - 1){
                System.out.print(draw("|", n));
            }else{
                System.out.print(draw(" ", n));
            }

            System.out.print("*" + draw("/", 2 * n - 2) + "*");

            System.out.println();

        }

        System.out.println(draw("*", n * 2) + draw(" ", n) + draw("*", n * 2));

    }
    public static String draw(String s, int length){
        String toReturn = "";

        for (int i = 0; i < length; i++) {
            toReturn += s;
        }

        return toReturn;
    }
}
