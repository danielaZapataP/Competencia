package WordGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main2{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int test = s.nextInt();
        int p1;
        int p2;
        int p3;
        int numberWords;
        String one;
        String two;
        String three;
        List<String> first;
        List<String> second;
        List<String> third;

        for (int i = 0; i < test; i++) {
            numberWords = s.nextInt();
            p1 = 0;
            p2 = 0;
            p3 = 0;
            s.nextLine();
            one = s.nextLine();
            two = s.nextLine();
            three = s.nextLine();

            first = Arrays.asList(one.split(" "));
            second = Arrays.asList(two.split(" "));
            third = Arrays.asList(three.split(" "));


            for (int j = 0; j < (numberWords / 2) ; j++) {
                if (!second.contains(first.get(j)) && !third.contains(first.get(j))) {
                    p1 += 3;
                } else if (!second.contains(first.get(j))) {
                    p1 += 1;
                } else if (!third.contains(first.get(j))) {
                    p1 += 1;
                }
                if (!second.contains(first.get(numberWords - 1 - j)) && !third.contains(first.get(numberWords - 1 - j))) {
                    p1 += 3;
                } else if (!second.contains(first.get(numberWords - 1 - j))) {
                    p1 += 1;
                } else if (!third.contains(first.get(numberWords - 1 - j))) {
                    p1 += 1;
                }

                if (!first.contains(second.get(j)) && !third.contains(second.get(j))) {
                    p2 += 3;
                } else if (!first.contains(second.get(j))) {
                    p2 += 1;
                } else if (!third.contains(second.get(j))) {
                    p2 += 1;
                }
                if (!first.contains(second.get(numberWords - 1 - j)) && !third.contains(second.get(numberWords - 1 - j))) {
                    p2 += 3;
                } else if (!first.contains(second.get(numberWords - 1 - j))) {
                    p2 += 1;
                } else if (!third.contains(second.get(numberWords - 1 - j))) {
                    p2 += 1;
                }
                if (!first.contains(third.get(j)) && !second.contains(third.get(j))) {
                    p3 += 3;
                } else if (!first.contains(third.get(j))) {
                    p3 += 1;
                } else if (!second.contains(third.get(j))) {
                    p3 += 1;
                }
                if (!first.contains(third.get(numberWords - 1 - j)) && !second.contains(third.get(numberWords - 1 - j))) {
                    p3 += 3;
                } else if (!first.contains(third.get(numberWords - 1 - j))) {
                    p3 += 1;
                } else if (!second.contains(third.get(numberWords - 1 - j))) {
                    p3 += 1;
                }
            }

            System.out.println(p1 + " " + p2 + " " + p3);

        }

    }
}
