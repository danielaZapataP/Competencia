package mario;

import java.util.Scanner;

public class MarioMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int testCase = s.nextInt();

        for (int j = 0; j < testCase ; j++) {
            int numberColumns = s.nextInt();

            s.nextLine();
            String height = s.nextLine();
            height = height.trim();
            String[] vectorString  = new String[numberColumns];

            vectorString = height.split(" ");

            int[] columnsVector = new int[numberColumns];

            /*for (int i = 0; i < numberColumns; i++) {
                columnsVector[i] = Integer.parseInt(vectorString[i]);
            }*/

            int countLow = 0;
            int countHigh = 0;

            for (int i = 0; i < columnsVector.length - 1; i++) {
                if (Integer.parseInt(vectorString[i + 1]) > Integer.parseInt(vectorString[i])) {
                    countHigh++;
                } else if (Integer.parseInt(vectorString[i + 1]) < Integer.parseInt(vectorString[i])) {
                    countLow++;
                }
            }

            System.out.println("Case " + (j + 1)  + ": " + countHigh + " " + countLow);

        }




    }
}
