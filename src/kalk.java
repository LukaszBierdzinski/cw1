public class kalk {
    public static void main(String[] args) {

        System.out.println("Wartość dodawania to " + add(2, 5));
        System.out.println("Wartość odejmowania to " + subtract(10, 2));
        System.out.println("Wartość mnożenia to " + multiply(2, 5));
        System.out.println("Wartość odejmowania to " + divide(10, 2));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }
    
}
