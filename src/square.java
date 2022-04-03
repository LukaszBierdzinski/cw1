public class square {
    public static void main(String[] args) {
       int[] tab = {12, 2, 6};

       try {
            System.out.println(tab[0]);
       } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Wykryłem wyjątek, tablica ma 3 elementy");
       }
        System.out.println("Koniec programu");
    }
}
