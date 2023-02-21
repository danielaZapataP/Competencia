package Image;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
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
            char reapeated = arreglo[0];

            int diff = 0;
            int maxCount = 0;
            for (int j = 0; j < arreglo.length; j++) {
                int cuenta = 0;
                for (int k = 0; k < arreglo.length; k++) {
                    if(arreglo[j] == arreglo[k]) {
                        cuenta++;
                    }
                }
                if (cuenta > maxCount) {
                    maxCount = cuenta;
                    reapeated = arreglo[j];
                }
            }

            if (maxCount > 1) {
                if(maxCount != 4) {
                    if (maxCount == 3){
                        diff = 1;
                    } else if (maxCount == 2) {
                        for (int j = 0; j < arreglo.length - 1; j++) {
                            if (j == 0) {
                                if (arreglo[j] != arreglo[j + 1]) {
                                    diff ++;
                                } else {
                                    if (arreglo[j] == reapeated) {
                                        j ++;
                                    } else {
                                        diff ++;
                                    }
                                }
                            } else if (arreglo[j] == arreglo[j + 1]) {
                                if (arreglo[j] != reapeated && j <= arreglo.length - 2) {
                                    diff++;
                                } else if ( arreglo[j] == reapeated && j <=1) {
                                    j+=2;
                                    if (j == arreglo.length - 1) {
                                        if (arreglo[j - 1] != arreglo[j]) {
                                            diff++;
                                        }
                                    }
                                }
                            } else if (arreglo[j] != arreglo[j + 1]) {
                                diff++;
                            }
                        }
                    }
                }

            } else {
                diff = 3;
            }
            System.out.println(diff);
        }
    }
}
