package SpellCheck;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int test = s.nextInt();
        int tam;

        String text ;


        for (int i = 0; i < test; i++) {
            tam = s.nextInt();
            s.nextLine();
            char [] a = s.next().toCharArray();
            Arrays.sort(a);
            text = String.valueOf(a);
            if(tam == 5) {
                if (text.length() == 5 && text.equals("Timru")) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }

        }

    }
}
