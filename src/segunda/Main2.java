package segunda;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) throws IOException {

        PriorityQueue<jugador> cola = new PriorityQueue<jugador>(new Comparator<jugador>() {
            @Override
            public int compare(jugador o1, jugador o2) {
                if (o1.getPoint() > o2.getPoint()) {
                    return -1;
                } else if (o1.getPoint() < o2.getPoint()) {
                    return 1;
                } else {
                    String one = o1.getName();
                    String two = o2.getName();
                    return one.compareToIgnoreCase(two);
                }
            }
        });

        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        //1
        int m = 1;
        while (true) {
            String players = s.readLine();
            if(players == null) {
                break;
            }
            int play = Integer.parseInt(players);
            for (int j = 0; j < play; j++) {
                String[] data = s.readLine().split(";");
                String[] points1 = data[1].split(" ");
                String[] points2 = data[2].split(" ");
                String[] points3 = data[3].split(" ");
                String[] points4 = data[4].split(" ");
                String[] points5 = data[5].split(" ");
                int point = 0;
                for (int k = 0; k < 5; k++) {
                    if (k != 4) {
                        if (Integer.parseInt(points1[k]) == 1) {
                            point += 1;
                        }
                        if (Integer.parseInt(points2[k]) == 1) {
                            point += 1;
                        }
                        if (Integer.parseInt(points3[k]) == 1) {
                            point += 1;
                        }
                        if (Integer.parseInt(points4[k]) == 1) {
                            point += 1;
                        }
                        if (Integer.parseInt(points5[k]) == 1) {
                            point += 1;
                        }
                    } else {
                        if (Integer.parseInt(points1[k]) == 1)  {
                            point += 2;
                        }
                        if (Integer.parseInt(points2[k]) == 1) {
                            point += 2;
                        }
                        if (Integer.parseInt(points3[k]) == 1) {
                            point += 2;
                        }
                        if (Integer.parseInt(points4[k]) == 1) {
                            point += 2;
                        }
                        if (Integer.parseInt(points5[k]) == 1) {
                            point += 2;
                        }
                    }
                }
                cola.add(new jugador(data[0], point));
            }

            System.out.println("Case " + m + ":");
            while (!cola.isEmpty()) {
                System.out.println(cola.poll());
            }
            m++;
        }
        s.close();
    }
}

class jugador {
    String name;
    int point;

    public jugador(String name, int point) {
        this.name = name;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return name + " " + point ;
    }
}



