public class Main {
    public static void main(String[] args) {

        test();
        int x = test2(2, 10);
        System.out.println(x);

    }

    static void test() {
        System.out.println("String from test method");
    }

    static int test2(int a, int b) {
        int c = a + b;
        return c;
    }
}
