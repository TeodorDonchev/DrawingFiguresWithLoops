import java.util.Scanner;

/**
 * Created by teodor donchev on 2/11/2018.
 */
public class Butterfly {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n - 2; i++) {
            String currentRow = "";

            if(i % 2 == 0){
                currentRow += draw("*", n - 2);
                currentRow += "\\" + " /";
                currentRow += draw("*", n - 2);
            }else{
                currentRow += draw("-", n - 2);
                currentRow += "\\" + " /";
                currentRow += draw("-", n - 2);
            }

            System.out.println(currentRow);
        }

        String middleRow = draw(" ", n - 1)
                + "@"
                + draw(" ", n - 1);

        System.out.println(middleRow);

        for (int i = 0; i < n - 2; i++) {
            String currentRow = "";

            if(i % 2 == 0){
                currentRow += draw("*", n - 2);
                currentRow += "/" + " \\";
                currentRow += draw("*", n - 2);
            }else{
                currentRow += draw("-", n - 2);
                currentRow += "/" + " \\";
                currentRow += draw("-", n - 2);
            }

            System.out.println(currentRow);
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
