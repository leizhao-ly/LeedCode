package Test;

class Base {
    Base() {
        System.out.print("Base");
    }
}
public class Text3 extends Base {
    public static void main( String[] args ) {
        new Text3();
        //调用父类无参的构造方法
        String a="a";
        String b="b";
        new Base();
    }
}