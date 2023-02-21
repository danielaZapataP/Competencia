package DigitCount;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int test = s.nextInt();

        HashMap<Integer,Integer> frecuencia = new HashMap<>();

        int first;
        int second;
        int third;
        int fourth;

        for (int i = 0; i < test; i++) {
            int number = s.nextInt();
            if (number <= 9) {
                for (int j = 1; j <= number; j++) {
                    frecuencia.put(j,0);
                    frecuencia.put(j,frecuencia.get(j) + 1);
                }
            } else {
                for (int j = 1; j <= number; j++) {
                    first = j % 10;
                    second = (j % 100) / 10;
                    third = (j % 1000) /100;
                    fourth = (j / 1000);
                    if (j < 10) {
                        frecuencia.put(j,frecuencia.get(j) + 1);
                    } else if (j < 100) {
                        frecuencia.put(first, frecuencia.get(first) + 1);
                        frecuencia.put(second, frecuencia.get(second) + 1);
                    } else if (j < 1000) {
                        frecuencia.put(first, frecuencia.get(first) + 1);
                        frecuencia.put(second, frecuencia.get(second) + 1);
                        frecuencia.put(third, frecuencia.get(third)  + 1);
                    } else if (j < 10000) {
                        frecuencia.put(first, frecuencia.get(first) + 1);
                        frecuencia.put( second, frecuencia.get(second) + 1);
                        frecuencia.put( third, frecuencia.get(third) + 1);
                        frecuencia.put( fourth, frecuencia.get(fourth) + 1);
                    }
                }
            }
            for (int j = 0; j < 9; j++) {
                System.out.print(frecuencia.get(j) + " ");
            }
            System.out.println(frecuencia.get(9));

        }

    }
}
