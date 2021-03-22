package leedcode;

public class Text3 {
    public static void main(String[] args) {
        System.out.println("return value of getValue(): " +
                getValue());
    }
    public static int getValue() {
        try {
            return 0;
        } finally {
            return 1;
        }
    }
}