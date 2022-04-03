public class salary {
    public static void main(String[] args) {
        int[] tab = {5, 100, -20, 234, 0};
        int suma = 0;

        System.out.println("Elementy tablicy");
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }

        for (int i = 0; i < tab.length; i++) {
            suma +=tab[i];
        }
        int srednia = suma/tab.length;
        System.out.println("Suma tablicy to " + suma);

        System.out.println("Srednia tablicy to " + srednia);




    }
}
