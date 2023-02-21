package Image;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int test = s.nextInt();
        char arreglo[] = new char[4];
        s.nextLine();

        for (int i = 0; i < test; i++) {
            String first = s.nextLine();
            String second = s.nextLine();
            arreglo[0] = first.charAt(0);
            arreglo[1] = first.charAt(1);
            arreglo[2] = second.charAt(0);
            arreglo[3] = second.charAt(1);

            Arrays.sort(arreglo);
            HashMap<Character, Integer> frecuencia = new HashMap<>();

            int moves = 0;

            for (int j = 0; j < 4; j++) {
                if (frecuencia.containsKey(arreglo[j])) {
                    frecuencia.put(arreglo[j], frecuencia.get(arreglo[j]) + 1);
                } else {
                    frecuencia.put(arreglo[j], 1);
                }
            }

            char max = ' ';
            int count = 0;

            for (char c : frecuencia.keySet() ) {
                if (frecuencia.get(c) > count) {
                    count = frecuencia.get(c);
                    max = c;
                }
            }

            if (count == 4){
                moves = 0;
            } else if ( count == 3) {
                moves = 1;
            } else if (count == 2) {
                if (frecuencia.size() == 3) {
                    moves = 2;
                } else if (frecuencia.size() == 2) {
                    moves = 1;
                }
            } else if (count == 1) {
                moves = 3;
            }
            System.out.println(moves);
        }
    }
}
