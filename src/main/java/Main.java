import java.util.Scanner;

class Choinka {
    public static void draw(int height, char c) {
        for (int i = 0; i < height; i++) {
            int stars =  i + 1;
            int spaces = height - i - 1;
            for (int s = 0; s <= height; s++) System.out.print(' ');
            for (int s = 0; s < stars; s++) System.out.print(c);
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj wysokość trójkąta (np. 5): ");
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