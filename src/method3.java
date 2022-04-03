public class method3 {
    public static void main(String[] args) {
        int[] dividers = {2, 3, 4, 5};
        printIfNumberCanByDividedBy(10, dividers);
        printIfNumberCanByDividedBy(23, dividers);
        printIfNumberCanByDividedBy(8, dividers);
        printIfNumberCanByDividedBy(15, dividers);

    }

    public static void printIfNumberCanByDividedBy(int number, int[] dividers) {
        System.out.println("Sprawdzam liczbę " + number);
        for (int i = 0; i < dividers.length; i++) {
            int sum = dividers[i];
            if (number % sum == 0) {
                System.out.println("Liczba " + number + " jest podzielna przez " + sum);
            } else {
                System.out.println("Liczba " + number + " nie jest podzielna przez " + sum);
            }
        }
    }
}
