import java.util.Scanner;

public class wartoscBezwzgledna {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Podaj liczbę");

        int number = console.nextInt();

        if (number < 0) {
            number = -number;

        }
        System.out.println("Wartość bezwzględna: " + number);
    }
}