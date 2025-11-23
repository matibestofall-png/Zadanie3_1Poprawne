import java.util.Scanner;

class Choinka {
    public static void draw(int height, char c) {
        for (int i = 0; i < height; i++) {
            int stars = 2 * i + 1;
            int spaces = height - i - 1;
            for (int s = 0; s < spaces; s++) System.out.print(' ');
            for (int s = 0; s < stars; s++) System.out.print(c);
            System.out.println();
        }
        int trunkWidth = (height >= 3) ? 3 : 1;
        int trunkHeight = Math.max(1, height / 4);
        int trunkPadding = height - 1 - (trunkWidth / 2);
        for (int h = 0; h < trunkHeight; h++) {
            for (int s = 0; s < trunkPadding; s++) System.out.print(' ');
            for (int w = 0; w < trunkWidth; w++) System.out.print(c);
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj wysokość choinki (np. 5): ");
        int height = 0;
        try { height = Integer.parseInt(sc.nextLine().trim()); }
        catch (Exception e) { height = 5; }

        System.out.print("Podaj znak do rysowania (np. *): ");
        String znak = sc.nextLine();
        if (znak.isEmpty()) znak = "*";
        char c = znak.charAt(0);

        Choinka.draw(height, c);
        sc.close();
    }
}

