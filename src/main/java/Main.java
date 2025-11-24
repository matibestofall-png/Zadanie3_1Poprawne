import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj liczbę trójkątów: ");
        int count = Integer.parseInt(sc.nextLine().trim());

        System.out.print("Podaj wysokość trójkąta: ");
        int height = Integer.parseInt(sc.nextLine().trim());

        System.out.print("Podaj znak do rysowania (np. *): ");
        String znak = sc.nextLine();
        if (znak.isEmpty()) znak = "*";
        char c = znak.charAt(0);

        
        for (int t = 1; t <= count; t++) {
            for (int i = 1; i <= height; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(c);
                }
                System.out.println();
            }
            System.out.println(); 
        }

        sc.close();
    }
}
