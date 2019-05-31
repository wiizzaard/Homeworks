public class MyInt {
    int x;

    MyInt(int x) {
        this.x = 777;
    }

    public static void main(String[] args) {


        MyInt a1 = new MyInt(3);
        MyInt a2 = a1;
        System.out.println(a1.x + "\n" + a2.x);

        a1.x = 888;
        System.out.println(a1.x + "\n" + a2.x);
        }
}
