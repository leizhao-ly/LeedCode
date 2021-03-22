package leedcode;

class C {
    C() {
        System.out.print("C");
    }
}

class A {
    C c = new C();

    A() {
        this("A");
        System.out.print("A");
    }

    A(String s) {
        System.out.print(s);
    }
}

class Test4 extends A {
    Test4() {
        super("B");
        System.out.print("B");
    }

    public static void main(String[] args) {
        new Test4();
    }
}
