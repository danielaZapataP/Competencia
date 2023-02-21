package segunda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner br = new Scanner(System.in);
        int test = Integer.parseInt(br.nextLine());
        String player = "";
        HashMap<String, Integer> tabla = new HashMap<>();
        for (int i = 0; i < test; i++) {
            int number = Integer.parseInt(br.nextLine());
            for (int j = 0; j < number; j++) {
                player = br.nextLine();
                String [] data = player.split(";");
                String[] points1 = data[1].split(" ");
                String[] points2 = data[2].split(" ");
                String[] points3 = data[3].split(" ");
                String[] points4 = data[4].split(" ");
                String[] points5 = data[5].split(" ");
                int point = 0;

                for (int k = 0; k < 5; k++) {
                    if (k != 4) {
                        if (Integer.parseInt(points1[k]) == 1 ) {
                            point += 1;
                        }
                    }  else {
                        if (Integer.parseInt(points1[k]) == 1 ) {
                            point += 2;
                        }
                    }
                }
                for (int k = 0; k < 5; k++) {
                    if (k != 4) {
                        if (Integer.parseInt(points2[k]) == 1 ) {
                            point += 1;
                        }
                    }  else {
                        if (Integer.parseInt(points2[k]) == 1 ) {
                            point += 2;
                        }
                    }
                }
                for (int k = 0; k < 5; k++) {
                    if (k != 4) {
                        if (Integer.parseInt(points3[k]) == 1 ) {
                            point += 1;
                        }
                    }  else {
                        if (Integer.parseInt(points3[k]) == 1 ) {
                            point += 2;
                        }
                    }
                }
                for (int k = 0; k < 5; k++) {
                    if (k != 4) {
                        if (Integer.parseInt(points4[k]) == 1 ) {
                            point += 1;
                        }
                    }  else {
                        if (Integer.parseInt(points4[k]) == 1 ) {
                            point += 2;
                        }
                    }
                }
                for (int k = 0; k < 5; k++) {
                    if (k != 4) {
                        if (Integer.parseInt(points5[k]) == 1 ) {
                            point += 1;
                        }
                    }  else {
                        if (Integer.parseInt(points5[k]) == 1 ) {
                            point += 2;
                        }
                    }
                }
                tabla.put(data[0],point);
            }
            System.out.println("Case "+ (i +1) + ":");
            tabla.entrySet().stream()
                    .sorted((k1, k2) -> -k1.getValue().compareTo(k2.getValue()))
                    .forEach(k -> System.out.println(k.getKey() + ": " + k.getValue()));



        }

    }
}
