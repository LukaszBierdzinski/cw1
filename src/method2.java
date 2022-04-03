public class method2 {


    public static void main(String[] args) {
        System.out.println("dostałem wartość " + getNumber());
        System.out.println("dostałem wartość " + getboolean());
        System.out.println("dostałem wartość " + getString());
    }

    public static int getNumber() {
        System.out.println("będę zawracać wartość 100");
        return 100;
    }

    public static String getString() {
        System.out.println("Będę zwracać wartość HELLO");
        return "HELLO";
    }

    public static boolean getboolean() {
        System.out.println("Będę zwracać false");
        return false;
    }
}
