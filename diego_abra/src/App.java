public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Diego abra");
        int a = 0;
        for (int i = 0; i < 1000; i++) {
            a += i;
            System.out.println("Diego abra " + a);
        }
    }
}
