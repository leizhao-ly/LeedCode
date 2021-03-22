package leedcode;

public class Text5{
    private static final String MESSAGE="taobao";
    public static void test() {
        int a = 10;
        System.out.println(a++ + a--);
    }
    public static void main(String [] args) {
        String a ="tao"+"bao";
        String b="tao";
        String c="bao";
        System.out.println(a==MESSAGE);
        System.out.println((b+c)==MESSAGE);
        test();
    }
}